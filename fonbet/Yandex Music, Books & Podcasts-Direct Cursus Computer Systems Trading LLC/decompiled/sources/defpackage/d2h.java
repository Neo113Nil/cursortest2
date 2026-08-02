package defpackage;

/* loaded from: classes4.dex */
public abstract class d2h {
    public static final float a;
    public static final float b;

    static {
        float f = 300;
        a = f;
        b = f;
    }

    public static final b2h a(gvb gvbVar, oq5 oq5Var, int i) {
        gvbVar.getClass();
        boolean z = (((i & 14) ^ 6) > 4 && oq5Var.f(gvbVar)) || (i & 6) == 4;
        Object K = oq5Var.K();
        if (z || K == gq5.a) {
            K = new b2h(y7g.y(gvbVar.b(), gvbVar.b()), new zd5(gvbVar.b(), 0));
            oq5Var.k0(K);
        }
        return (b2h) K;
    }

    public static final b2h b(gvb gvbVar, float f, oq5 oq5Var) {
        gvbVar.getClass();
        boolean f2 = oq5Var.f(gvbVar) | oq5Var.c(f);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            float a2 = gvbVar.a();
            float f3 = ivb.a;
            if (a2 > f3) {
                a2 = f3;
            }
            float f4 = gvbVar instanceof fvb ? h6h.b : 0;
            b2h b2hVar = new b2h(y7g.y(a2, (gvbVar.d() - f) - f4), new zd5(a2, f4));
            oq5Var.k0(b2hVar);
            K = b2hVar;
        }
        return (b2h) K;
    }
}
