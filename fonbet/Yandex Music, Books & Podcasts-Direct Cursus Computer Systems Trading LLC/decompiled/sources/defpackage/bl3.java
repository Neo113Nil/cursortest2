package defpackage;

/* loaded from: classes.dex */
public abstract class bl3 {
    public static final q0k a;
    public static final float b = 64;
    public static final float c = 36;
    public static final q0k d;

    static {
        float f = 16;
        float f2 = 8;
        a = new q0k(f, f2, f, f2);
        d = new q0k(f2, f2, f2, f2);
    }

    public static kk7 a(long j, long j2, long j3, long j4, hq5 hq5Var, int i, int i2) {
        long j5;
        long j6;
        long d2 = (i2 & 1) != 0 ? ((ma5) ((oq5) hq5Var).j(pa5.a)).d() : j;
        long b2 = (i2 & 2) != 0 ? pa5.b(d2, hq5Var) : j2;
        if ((i2 & 4) != 0) {
            agr agrVar = pa5.a;
            oq5 oq5Var = (oq5) hq5Var;
            j5 = c3x.D(d85.b(((ma5) oq5Var.j(agrVar)).c(), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((ma5) oq5Var.j(agrVar)).f());
        } else {
            j5 = j3;
        }
        if ((i2 & 8) != 0) {
            agr agrVar2 = pa5.a;
            oq5 oq5Var2 = (oq5) hq5Var;
            long c2 = ((ma5) oq5Var2.j(agrVar2)).c();
            long j7 = ((d85) oq5Var2.j(sb6.a)).a;
            if (((ma5) oq5Var2.j(agrVar2)).g()) {
                c3x.N(j7);
            } else {
                c3x.N(j7);
            }
            j6 = d85.b(c2, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j6 = j4;
        }
        return new kk7(d2, b2, j5, j6);
    }

    public static lk7 b(float f, float f2, float f3, float f4, float f5, hq5 hq5Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = 2;
        }
        if ((i2 & 2) != 0) {
            f2 = 8;
        }
        if ((i2 & 4) != 0) {
            f3 = 0;
        }
        if ((i2 & 8) != 0) {
            f4 = 4;
        }
        if ((i2 & 16) != 0) {
            f5 = 4;
        }
        boolean z = ((((i & 14) ^ 6) > 4 && ((oq5) hq5Var).c(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((oq5) hq5Var).c(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && ((oq5) hq5Var).c(f3)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && ((oq5) hq5Var).c(f4)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && ((oq5) hq5Var).c(f5)) || (i & 24576) == 16384);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (z || K == gq5.a) {
            float f6 = f5;
            lk7 lk7Var = new lk7(f, f2, f3, f4, f6);
            oq5Var.k0(lk7Var);
            K = lk7Var;
        }
        return (lk7) K;
    }

    public static kk7 c(long j, hq5 hq5Var, int i) {
        long j2 = d85.m;
        if ((i & 2) != 0) {
            j = ((ma5) ((oq5) hq5Var).j(pa5.a)).d();
        }
        long j3 = j;
        agr agrVar = pa5.a;
        oq5 oq5Var = (oq5) hq5Var;
        long c2 = ((ma5) oq5Var.j(agrVar)).c();
        long j4 = ((d85) oq5Var.j(sb6.a)).a;
        if (((ma5) oq5Var.j(agrVar)).g()) {
            c3x.N(j4);
        } else {
            c3x.N(j4);
        }
        return new kk7(j2, j3, j2, d85.b(c2, 0.38f, 0.0f, 0.0f, 0.0f, 14));
    }
}
