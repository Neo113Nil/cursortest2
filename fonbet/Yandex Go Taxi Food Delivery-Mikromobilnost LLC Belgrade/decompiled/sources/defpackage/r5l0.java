package defpackage;

/* loaded from: classes12.dex */
public abstract class r5l0 {
    public static final long a;
    public static final float b;

    static {
        long f = rzo.f(4291874766L);
        int i = up2.c;
        a = f;
        b = 4.0f;
    }

    public static final void a(p5l0 p5l0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-345625088);
        int i2 = (btsVar.k(p5l0Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            long n = tje.n(p5l0Var.a(), btsVar);
            float f = yrl.c;
            c530 c530Var = c530.a;
            f530 n2 = ljs0.n(c530Var, f, 8.0f);
            boolean d = btsVar.d(n);
            Object Q = btsVar.Q();
            if (d || Q == did.a) {
                Q = new vh10(n, 27);
                btsVar.o0(Q);
            }
            oeb1.c(btsVar, bb1.g(n2, (tls) Q));
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o990(p5l0Var, f530Var, i, 28);
        }
    }

    public static final void b(ibp0 ibp0Var, p5l0 p5l0Var, fid fidVar, int i) {
        int i2;
        p5l0 p5l0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2104115024);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(p5l0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            long n = tje.n(p5l0Var.a(), btsVar);
            q5l0 b2 = p5l0Var.b();
            ldc ldcVar = null;
            wp2 wp2Var = b2 != null ? b2.b : null;
            if (wp2Var == null) {
                btsVar.e0(1357156138);
                btsVar.t(false);
            } else {
                btsVar.e0(875063223);
                long n2 = tje.n(wp2Var, btsVar);
                btsVar.t(false);
                ldcVar = new ldc(n2);
            }
            ldc ldcVar2 = ldcVar;
            f530 n3 = ljs0.n(c530.a, yrl.c, ibp0Var.c().getSize());
            boolean d = btsVar.d(n) | ((i2 & 112) == 32) | btsVar.k(ldcVar2);
            Object Q = btsVar.Q();
            if (d || Q == did.a) {
                p5l0Var2 = p5l0Var;
                ec1 ec1Var = new ec1(p5l0Var2, n, ldcVar2, 10);
                btsVar.o0(ec1Var);
                Q = ec1Var;
            } else {
                p5l0Var2 = p5l0Var;
            }
            oeb1.c(btsVar, bb1.g(n3, (tls) Q));
        } else {
            p5l0Var2 = p5l0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(ibp0Var, p5l0Var2, i, 21);
        }
    }
}
