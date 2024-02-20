import java.util.Scanner;

public class MainClass {

	static double hesapPara = 0;
	static Scanner girdi = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\t---Mobil Bankaciliga Hosgeldiniz---");

		int secenek;
		kullaniciBilgieri();

		do {
			menuGoster();
			secenek = secenekAl();
			secenekKontrol(secenek);
			if (secenek == 4) {
				break;
			}

			menuYonlendir();
		} while (secenek != 4);

	}

	public static void kullaniciBilgieri() {

		System.out.println();
		System.out.print("Lutfen isminizi giriniz : ");
		String isim = girdi.next();
		System.out.print("Lutfen soyisminizi giriniz : ");
		String soyİsim = girdi.next();
		System.out.println();
		System.out.println("--- Hosgeldiniz sayin " + isim + " " + soyİsim + " ---");
	}

	public static void menuGoster() {

		System.out.println();
		System.out.println("**MENU**");
		System.out.println("1-) Para Yatir");
		System.out.println("2-) Para Cek");
		System.out.println("3-) Bakiye Ogren");
		System.out.println("4-) Cikis Yap");

	}

	public static void paraYatir() {

		double yatanPara;
		System.out.println("**Bakiyeniz : " + hesapPara);

		do {
			System.out.print("Yatirmak istediginiz miktari giriniz : ");

			yatanPara = girdi.nextDouble();
			if (yatanPara < 0) {
				System.out.println("!! Hatali miktar, Lutfen tekrar deneyiniz !!");

			}

		} while (yatanPara < 0);

		hesapPara += yatanPara;
		System.out.println("--- Islem basariyla gerceklesti, Guncel bakiyeniz : " + hesapPara + " ---");

	}

	public static void paraCek() {

		double cekilenPara;

		System.out.println("**Bakiyeniz : " + hesapPara);

		do {
			System.out.print("Cekmek istediginiz miktari giriniz : ");
			cekilenPara = girdi.nextDouble();

			if (cekilenPara > hesapPara) {

				System.out.println("!! Yetersiz bakiye, Lutfen tekrar deneyiniz !!");

			}

		} while (cekilenPara > hesapPara);

		hesapPara -= cekilenPara;
		System.out.println("--- Islem basariyla gerceklesti, Guncel bakiyeniz : " + hesapPara + " ---");

	}

	public static void bakiyeOgren() {

		System.out.println("--- Guncel Bakiyeniz : " + hesapPara);

	}

	public static void cikisIslem() {

		System.out.println("---Sistemden cikiliyor, iyi gunler dileriz...");

	}

	public static void menuYonlendir() {
		System.out.println("\nMenuye yonlendiriliyorsunuz...\n");
		System.out.println("---------------------");

	}

	public static int secenekAl() {

		System.out.println();
		System.out.print("-- Lutfen bir secenek giriniz : ");
		int secenek = girdi.nextInt();
		System.out.println();
		return secenek;

	}

	public static void secenekKontrol(int secenek) {
		if (secenek == 1) {
			paraYatir();

		} else if (secenek == 2) {
			paraCek();

		} else if (secenek == 3) {
			bakiyeOgren();

		} else if (secenek == 4) {
			cikisIslem();
		} else {
			System.out.println("!! Hatali tuslama, Lutfen tekrar deneyiniz !!");
		}

	}
}
