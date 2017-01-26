import java.util.Scanner;
public class HitungLuas {
public static void main(String[] args) {
//Luas Persegi Panjang
   int panjang;
   int lebar;
   double luaspersegipanjang;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Persegi Panjang");
   System.out.print("Masukan Panjang: ");
   panjang = scan.nextInt();
   System.out.print("Masukan Lebar: ");
   lebar = scan.nextInt();
  
   luaspersegipanjang = (lebar * panjang);
   System.out.println("Luas Segi Panjang = " +luaspersegipanjang);
<<<<<<< HEAD
//Luas Segitiga
Scanner input =new Scanner(System.in);
System.out.print("Masukkan alas: ");
int alas = input.nextInt();
System.out.print("Masukkan tinggi: ");
int tinggi = input.nextInt();
double luas = (double)(alas*tinggi)/2;
System.out.print("Luas Segitiga adalah :" +luas);
}
=======
//Luas Lingkaran
Scanner input =new Scanner(System.in);
    double phi=3.14;
    double jari,luaslingkaran;
    System.out.print("Berapa Jari-jari lingkaran:");
    jari=input.nextDouble();
    
    luaslingkaran = phi*jari*jari;
    
    System.out.println("Luas Lingkaran = " + (double)luaslingkaran);
    }
>>>>>>> LuasLingkaran
}