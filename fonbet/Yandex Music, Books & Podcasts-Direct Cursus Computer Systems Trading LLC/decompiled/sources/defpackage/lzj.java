package defpackage;

/* loaded from: classes.dex */
public abstract class lzj {
    public static final qs5 a = new qs5(kzj.s);

    public static final qg0 a(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(282942128);
        rg0 rg0Var = (rg0) oq5Var.j(a);
        if (rg0Var == null) {
            oq5Var.p(false);
            return null;
        }
        boolean f = oq5Var.f(rg0Var);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            qg0 qg0Var = new qg0(rg0Var.a, rg0Var.b, rg0Var.c, rg0Var.d);
            oq5Var.k0(qg0Var);
            K = qg0Var;
        }
        qg0 qg0Var2 = (qg0) K;
        oq5Var.p(false);
        return qg0Var2;
    }
}
