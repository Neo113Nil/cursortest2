package ru.CryptoPro.XAdES;

import defpackage.ix61;
import defpackage.nw61;
import defpackage.zw61;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class cl_64 implements zw61 {
    public static final cl_64 A;
    public static final cl_64 B;
    public static final cl_64 C;
    public static final cl_64 D;
    public static final cl_64 E;
    public static final cl_64 F;
    public static final cl_64 G;
    public static final cl_64 H;
    public static final cl_64 I;
    public static final cl_64 J;
    public static final cl_64 K;
    public static final cl_64 L;
    public static final cl_64 M;
    public static final cl_64 N;
    private static final /* synthetic */ cl_64[] T;
    public static final cl_64 a;
    public static final cl_64 b;
    public static final cl_64 c;
    public static final cl_64 d;
    public static final cl_64 e;
    public static final cl_64 f;
    public static final cl_64 g;
    public static final cl_64 h;
    public static final cl_64 i;
    public static final cl_64 j;
    public static final cl_64 k;
    public static final cl_64 l;
    public static final cl_64 m;
    public static final cl_64 n;
    public static final cl_64 o;
    public static final cl_64 p;
    public static final cl_64 q;
    public static final cl_64 r;
    public static final cl_64 s;
    public static final cl_64 t;
    public static final cl_64 u;
    public static final cl_64 v;
    public static final cl_64 w;
    public static final cl_64 x;
    public static final cl_64 y;
    public static final cl_64 z;
    private cl_63 O;
    private nw61 P;
    private String Q;
    private ix61 R;
    private zw61 S;

    static {
        cl_64 cl_64Var = new cl_64("OBJECT", 0, null, cl_63.e);
        a = cl_64Var;
        cl_64 cl_64Var2 = new cl_64("QUALIFYING_PROPERTIES", 1, cl_64Var, cl_63.f);
        b = cl_64Var2;
        cl_64 cl_64Var3 = new cl_64("SIGNED_PROPERTIES", 2, cl_64Var2, cl_63.g);
        c = cl_64Var3;
        cl_64 cl_64Var4 = new cl_64("SIGNED_SIGNATURE_PROPERTIES", 3, cl_64Var3, cl_63.h);
        d = cl_64Var4;
        cl_63 cl_63Var = cl_63.a;
        ix61 ix61Var = ix61.x;
        cl_64 cl_64Var5 = new cl_64("SIGNING_TIME", 4, cl_63Var, cl_64Var4, cl_63.i, ix61Var);
        e = cl_64Var5;
        cl_64 cl_64Var6 = new cl_64("SIGNING_CERTIFICATE", 5, cl_63Var, cl_64Var4, cl_63.j, ix61Var);
        f = cl_64Var6;
        cl_64 cl_64Var7 = new cl_64("SIGNING_CERTIFICATEV2", 6, cl_63Var, cl_64Var4, cl_63.k, ix61Var);
        g = cl_64Var7;
        cl_64 cl_64Var8 = new cl_64("SIGNATURE_PRODUCTION_PLACE", 7, cl_63Var, cl_64Var4, cl_63.l, ix61Var);
        h = cl_64Var8;
        cl_64 cl_64Var9 = new cl_64("SIGNER_ROLE", 8, cl_63Var, cl_64Var4, cl_63.m, ix61Var);
        i = cl_64Var9;
        ix61 ix61Var2 = ix61.z;
        cl_64 cl_64Var10 = new cl_64("CLAIMED_ROLES", 9, cl_63Var, cl_64Var9, cl_63.n, ix61Var2);
        j = cl_64Var10;
        cl_64 cl_64Var11 = new cl_64("CERTIFIED_ROLES", 10, cl_63Var, cl_64Var9, cl_63.o, ix61Var2);
        k = cl_64Var11;
        cl_64 cl_64Var12 = new cl_64("SIGNER", 11, cl_63Var, cl_64Var4, cl_63.p, ix61Var);
        l = cl_64Var12;
        cl_64 cl_64Var13 = new cl_64("SIGNER_DETAILS", 12, cl_63Var, cl_64Var4, cl_63.q, ix61Var);
        m = cl_64Var13;
        cl_64 cl_64Var14 = new cl_64("SIGNED_DATA_OBJECT_PROPERTIES", 13, cl_64Var3, cl_63.r);
        n = cl_64Var14;
        cl_64 cl_64Var15 = new cl_64("DATA_OBJECT_FORMAT", 14, cl_63Var, cl_64Var14, cl_63.s, ix61Var2);
        o = cl_64Var15;
        cl_64 cl_64Var16 = new cl_64("DESCRIPTION", 15, cl_63Var, cl_64Var15, cl_63.t, ix61Var);
        p = cl_64Var16;
        cl_64 cl_64Var17 = new cl_64("OBJECT_IDENTIFIER", 16, cl_63Var, cl_64Var15, cl_63.u, ix61Var);
        q = cl_64Var17;
        cl_64 cl_64Var18 = new cl_64("MIME_TYPE", 17, cl_63Var, cl_64Var15, cl_63.v, ix61Var);
        r = cl_64Var18;
        cl_64 cl_64Var19 = new cl_64("ENCODING", 18, cl_63Var, cl_64Var15, cl_63.w, ix61Var);
        s = cl_64Var19;
        cl_64 cl_64Var20 = new cl_64("COMMITMENT_TYPE_INDICATIONS", 19, cl_63Var, cl_64Var14, cl_63.x, ix61Var2);
        t = cl_64Var20;
        cl_64 cl_64Var21 = new cl_64("ALL_DATA_OBJECTS_TIMESTAMPS", 20, cl_63Var, cl_64Var14, cl_63.y, ix61Var2);
        u = cl_64Var21;
        cl_64 cl_64Var22 = new cl_64("INDIVIDUAL_DATA_OBJECTS_TIMESTAMPS", 21, cl_63Var, cl_64Var14, cl_63.z, ix61Var2);
        v = cl_64Var22;
        cl_64 cl_64Var23 = new cl_64("UNSIGNED_PROPERTIES", 22, cl_64Var2, cl_63.A);
        w = cl_64Var23;
        cl_64 cl_64Var24 = new cl_64("UNSIGNED_SIGNATURE_PROPERTIES", 23, cl_64Var23, cl_63.B);
        x = cl_64Var24;
        cl_64 cl_64Var25 = new cl_64("COUNTER_SIGNATURES", 24, cl_63Var, cl_64Var24, cl_63.C, ix61Var2);
        y = cl_64Var25;
        cl_63 cl_63Var2 = cl_63.b;
        ix61 ix61Var3 = ix61.y;
        cl_64 cl_64Var26 = new cl_64("SIGNATURE_TIME_STAMP", 25, cl_63Var2, cl_64Var24, cl_63.D, ix61Var3);
        z = cl_64Var26;
        cl_63 cl_63Var3 = cl_63.c;
        ix61 ix61Var4 = ix61.w;
        cl_64 cl_64Var27 = new cl_64("COMPLETE_CERTIFICATE_REFS", 26, cl_63Var3, cl_64Var24, cl_63.E, ix61Var4);
        A = cl_64Var27;
        cl_64 cl_64Var28 = new cl_64("COMPLETE_CERTIFICATE_REFSV2", 27, cl_63Var3, cl_64Var24, cl_63.F, ix61Var4);
        B = cl_64Var28;
        cl_64 cl_64Var29 = new cl_64("COMPLETE_REVOCATION_REFS", 28, cl_63Var3, cl_64Var24, cl_63.G, ix61Var4);
        C = cl_64Var29;
        cl_64 cl_64Var30 = new cl_64("COMPLETE_REVOCATION_REFSV2", 29, cl_63Var3, cl_64Var24, cl_63.H, ix61Var4);
        D = cl_64Var30;
        cl_64 cl_64Var31 = new cl_64("ATTRIBUTE_CERTIFICATE_REFS", 30, cl_63Var3, cl_64Var24, cl_63.I, ix61Var);
        E = cl_64Var31;
        cl_64 cl_64Var32 = new cl_64("ATTRIBUTE_REVOCATION_REFS", 31, cl_63Var3, cl_64Var24, cl_63.J, ix61Var);
        F = cl_64Var32;
        cl_63 cl_63Var4 = cl_63.d;
        cl_64 cl_64Var33 = new cl_64("CERTIFICATE_VALUES", 32, cl_63Var4, cl_64Var24, cl_63.K, ix61Var4);
        G = cl_64Var33;
        cl_64 cl_64Var34 = new cl_64("REVOCATION_VALUES", 33, cl_63Var4, cl_64Var24, cl_63.L, ix61Var4);
        H = cl_64Var34;
        cl_64 cl_64Var35 = new cl_64("ATTRIBUTE_CERTIFICATE_VALUES", 34, cl_63Var4, cl_64Var24, cl_63.M, ix61Var4);
        I = cl_64Var35;
        cl_64 cl_64Var36 = new cl_64("ATTRIBUTE_REVOCATION_VALUES", 35, cl_63Var4, cl_64Var24, cl_63.N, ix61Var4);
        J = cl_64Var36;
        cl_64 cl_64Var37 = new cl_64("SIG_AND_REFS_TIME_STAMP", 36, cl_63Var4, cl_64Var24, cl_63.O, ix61Var3);
        K = cl_64Var37;
        cl_64 cl_64Var38 = new cl_64("SIG_AND_REFS_TIME_STAMPV2", 37, cl_63Var4, cl_64Var24, cl_63.P, ix61Var3);
        L = cl_64Var38;
        cl_64 cl_64Var39 = new cl_64("QUALIFYING_PROPERTIES_REFERENCE", 38, cl_64Var, cl_63.Q);
        M = cl_64Var39;
        cl_64 cl_64Var40 = new cl_64("ENHANCED_SIGNATURE_TIME_STAMP", 39, cl_63Var4, cl_64Var24, cl_63.R, ix61Var3);
        N = cl_64Var40;
        T = new cl_64[]{cl_64Var, cl_64Var2, cl_64Var3, cl_64Var4, cl_64Var5, cl_64Var6, cl_64Var7, cl_64Var8, cl_64Var9, cl_64Var10, cl_64Var11, cl_64Var12, cl_64Var13, cl_64Var14, cl_64Var15, cl_64Var16, cl_64Var17, cl_64Var18, cl_64Var19, cl_64Var20, cl_64Var21, cl_64Var22, cl_64Var23, cl_64Var24, cl_64Var25, cl_64Var26, cl_64Var27, cl_64Var28, cl_64Var29, cl_64Var30, cl_64Var31, cl_64Var32, cl_64Var33, cl_64Var34, cl_64Var35, cl_64Var36, cl_64Var37, cl_64Var38, cl_64Var39, cl_64Var40};
    }

    public cl_64(String str, int i2, cl_63 cl_63Var, zw61 zw61Var, String str2, ix61 ix61Var) {
        this.O = cl_63Var;
        this.S = zw61Var;
        this.Q = str2;
        this.R = ix61Var;
    }

    public static cl_64[] values() {
        return (cl_64[]) T.clone();
    }

    public final nw61 a() {
        int[] iArr;
        if (this.P == null) {
            zw61 zw61Var = this.S;
            if (zw61Var != null) {
                int[] iArr2 = (int[]) ((cl_64) zw61Var).a().a.clone();
                int length = iArr2.length;
                iArr = new int[length + 1];
                System.arraycopy(iArr2, 0, iArr, 0, length);
                iArr[length] = ordinal() + 1;
            } else {
                iArr = new int[]{0, ordinal() + 1};
            }
            this.P = new nw61(iArr);
        }
        return this.P;
    }

    public final String b() {
        return this.Q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "[" + a() + "] " + this.Q;
    }

    public cl_64(String str, int i2, cl_64 cl_64Var, String str2) {
        this(str, i2, null, cl_64Var, str2, ix61.w);
    }
}
