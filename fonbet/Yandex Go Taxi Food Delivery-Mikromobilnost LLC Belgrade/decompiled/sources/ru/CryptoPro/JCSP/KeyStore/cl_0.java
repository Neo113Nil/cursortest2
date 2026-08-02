package ru.CryptoPro.JCSP.KeyStore;

import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public class cl_0 {
    private final String a;
    private final String b;
    private final String c;
    private final byte[] d;

    public cl_0(String str, String str2, String str3, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (bArr == null) {
            this.d = null;
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.d = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public static String[] a(String str) {
        String[] strArr = new String[2];
        int indexOf = str.indexOf("\\\\.\\");
        if (indexOf < 0) {
            strArr[0] = "";
            strArr[1] = str;
            return strArr;
        }
        String substring = str.substring(indexOf + 4);
        int indexOf2 = substring.indexOf("\\");
        if (indexOf2 >= 0) {
            strArr[0] = substring.substring(0, indexOf2);
            strArr[1] = substring.substring(indexOf2 + 1);
        }
        return strArr;
    }

    public static String[] b(String str) {
        String[] strArr = new String[2];
        int indexOf = str.indexOf("\\\\");
        if (indexOf >= 0) {
            strArr[0] = str.substring(0, indexOf);
            strArr[1] = str.substring(indexOf + 2);
            return strArr;
        }
        strArr[0] = "";
        strArr[1] = str;
        return strArr;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        if (DefaultCSPProvider.getNameType() != 1 && this.b != null) {
            return "\\\\.\\" + this.b + "\\" + this.c;
        }
        return this.c;
    }

    public byte[] e() {
        return this.d;
    }

    public String b() {
        return this.b;
    }

    public static cl_0 a(String str, String str2, byte[] bArr) {
        String[] a = a(str2);
        if (a[0].isEmpty()) {
            a = b(str2);
        }
        boolean z = DefaultCSPProvider.getNameType() == 1;
        String str3 = a[0];
        if (!z) {
            str2 = a[1];
        }
        return new cl_0(str, str3, str2, bArr);
    }

    public String a() {
        return this.a;
    }
}
