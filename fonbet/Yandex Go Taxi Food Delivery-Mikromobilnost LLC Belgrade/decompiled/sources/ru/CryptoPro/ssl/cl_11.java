package ru.CryptoPro.ssl;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.OID;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
final class cl_11 {
    private static final /* synthetic */ cl_11[] K;
    public static final cl_11 a;
    public static final cl_11 b;
    public static final cl_11 c;
    public static final cl_11 d;
    public static final cl_11 e;
    public static final cl_11 f;
    public static final cl_11 g;
    public static final cl_11 h;
    public static final cl_11 i;
    public static final cl_11 j;
    public static final cl_11 k;
    public static final cl_11 l;
    public static final cl_11 m;
    public static final cl_11 n;
    public static final cl_11 o;
    public static final cl_11 p;
    public static final cl_11 q;
    public static final cl_11 r;
    public static final cl_11 s;
    public static final cl_11 t;
    public static final cl_11 u;
    private int A;
    private int B;
    private int C;
    private int D;
    private CryptParamsSpec E;
    private byte[] F;
    private byte[] G;
    private boolean H;
    private boolean I;
    private int J;
    final String v;
    final boolean w;
    private final boolean x;
    private String y;
    private String z;

    static {
        cl_11 cl_11Var = new cl_11("K_NULL", 0, "NULL", false);
        a = cl_11Var;
        cl_11 cl_11Var2 = new cl_11("K_RSA", 1, "RSA", true);
        b = cl_11Var2;
        cl_11 cl_11Var3 = new cl_11("K_RSA_EXPORT", 2, "RSA_EXPORT", true);
        c = cl_11Var3;
        cl_11 cl_11Var4 = new cl_11("K_DH_RSA", 3, "DH_RSA", false);
        d = cl_11Var4;
        cl_11 cl_11Var5 = new cl_11("K_DH_DSS", 4, "DH_DSS", false);
        e = cl_11Var5;
        cl_11 cl_11Var6 = new cl_11("K_DHE_DSS", 5, "DHE_DSS", true);
        f = cl_11Var6;
        cl_11 cl_11Var7 = new cl_11("K_DHE_RSA", 6, "DHE_RSA", true);
        g = cl_11Var7;
        cl_11 cl_11Var8 = new cl_11("K_DH_ANON", 7, "DH_anon", true);
        h = cl_11Var8;
        boolean z = cl_8.E;
        cl_11 cl_11Var9 = new cl_11("K_ECDH_ECDSA", 8, "ECDH_ECDSA", z);
        i = cl_11Var9;
        cl_11 cl_11Var10 = new cl_11("K_ECDH_RSA", 9, "ECDH_RSA", z);
        j = cl_11Var10;
        cl_11 cl_11Var11 = new cl_11("K_ECDHE_ECDSA", 10, "ECDHE_ECDSA", z);
        k = cl_11Var11;
        cl_11 cl_11Var12 = new cl_11("K_ECDHE_RSA", 11, "ECDHE_RSA", z);
        l = cl_11Var12;
        cl_11 cl_11Var13 = new cl_11("K_ECDH_ANON", 12, "ECDH_anon", z);
        m = cl_11Var13;
        cl_11 cl_11Var14 = new cl_11("K_KRB5", 13, "KRB5", true);
        n = cl_11Var14;
        cl_11 cl_11Var15 = new cl_11("K_KRB5_EXPORT", 14, "KRB5_EXPORT", true);
        o = cl_11Var15;
        cl_11 cl_11Var16 = new cl_11("K_SCSV", 15, "SCSV", true);
        p = cl_11Var16;
        cl_11 cl_11Var17 = new cl_11("K_GR3410", 16, "GR3410", JCP.GOST_DIGEST_NAME, 32800, 32778, CryptParamsSpec.OID_Crypt_VerbaO, cl_49.D, false);
        q = cl_11Var17;
        OID oid = CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet;
        byte[] bArr = cl_49.E;
        cl_11 cl_11Var18 = new cl_11("K_GR3410_2012_256", 17, "GR3410_2012_256", JCP.GOST_DIGEST_2012_256_NAME, 32822, 32817, oid, bArr, true);
        r = cl_11Var18;
        byte[] bArr2 = cl_49.F;
        cl_11 cl_11Var19 = new cl_11("K_GR3410_2012_256_IANA", 18, "GR3410_2012_256", JCP.GOST_DIGEST_2012_256_NAME, 19458, "GOST28147", 26142, 32799, 32817, oid, bArr, bArr2, true, false, 8);
        s = cl_11Var19;
        cl_11 cl_11Var20 = new cl_11("K_GR3410_2012_256_KUZN", 19, "GR3410_2012_256_KUZN", JCP.GOST_DIGEST_2012_256_NAME, 19458, "GOST3412_2015_K", 26161, 32829, 32817, null, bArr, bArr2, true, false, 32);
        t = cl_11Var20;
        cl_11 cl_11Var21 = new cl_11("K_GR3410_2012_256_MAGMA", 20, "GR3410_2012_256_MAGMA", JCP.GOST_DIGEST_2012_256_NAME, 19458, "GOST3412_2015_M", 26160, 32828, 32817, null, bArr, bArr2, true, false, 32);
        u = cl_11Var21;
        K = new cl_11[]{cl_11Var, cl_11Var2, cl_11Var3, cl_11Var4, cl_11Var5, cl_11Var6, cl_11Var7, cl_11Var8, cl_11Var9, cl_11Var10, cl_11Var11, cl_11Var12, cl_11Var13, cl_11Var14, cl_11Var15, cl_11Var16, cl_11Var17, cl_11Var18, cl_11Var19, cl_11Var20, cl_11Var21};
    }

    public cl_11(String str, int i2, String str2, String str3, int i3, String str4, int i4, int i5, int i6, OID oid, byte[] bArr, byte[] bArr2, boolean z, boolean z2, int i7) {
        this(str, i2, str2, true);
        this.y = str3;
        this.A = i3;
        this.z = str4;
        this.B = i5;
        this.D = i4;
        this.C = i6;
        this.E = oid == null ? null : CryptParamsSpec.getInstance(oid);
        if (bArr != null) {
            byte[] bArr3 = new byte[bArr.length];
            this.F = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        }
        if (bArr2 != null) {
            byte[] bArr4 = new byte[bArr2.length];
            this.G = bArr4;
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        }
        this.H = z;
        this.I = z2;
        this.J = i7;
    }

    public static cl_11 a(String str) {
        return (cl_11) Enum.valueOf(cl_11.class, str);
    }

    public final boolean c() {
        if (this.x) {
            return true;
        }
        if (!this.v.startsWith("EC")) {
            boolean startsWith = this.v.startsWith("KRB");
            boolean z = this.w;
            if (!startsWith) {
                return z;
            }
            if (z && cl_73.a) {
                return true;
            }
        } else if (this.w) {
            boolean z2 = cl_73.a;
            synchronized (cl_73.class) {
            }
            return false;
        }
        return false;
    }

    public final String g() {
        return this.y;
    }

    public final String h() {
        return this.z;
    }

    public final int i() {
        return this.A;
    }

    public final int j() {
        return this.D;
    }

    public final int k() {
        return this.B;
    }

    public final int l() {
        return this.C;
    }

    public final CryptParamsSpec m() {
        return this.E;
    }

    public final byte[] n() {
        return this.F;
    }

    public final byte[] p() {
        return this.G;
    }

    public final boolean q() {
        return this.H;
    }

    public final boolean r() {
        return this.I;
    }

    public final int s() {
        return this.J;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.v;
    }

    public static cl_11[] a() {
        return (cl_11[]) K.clone();
    }

    public cl_11(String str, int i2, String str2, String str3, int i3, int i4, OID oid, byte[] bArr, boolean z) {
        this(str, i2, str2, str3, i3, "GOST28147", 26142, 32799, i4, oid, bArr, null, z, true, 8);
    }

    public cl_11(String str, int i2, String str2, boolean z) {
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = null;
        this.F = null;
        this.G = null;
        boolean z2 = false;
        this.H = false;
        this.I = true;
        this.J = 8;
        this.v = str2;
        this.w = z;
        if (z && !str2.startsWith("EC") && !str2.startsWith("KRB")) {
            z2 = true;
        }
        this.x = z2;
    }
}
