package defpackage;

/* loaded from: classes8.dex */
public final class raa0 {
    public final e2t a;

    public raa0(e2t e2tVar) {
        this.a = e2tVar;
    }

    public static qaa0 b(g2t g2tVar) {
        rtx0 rtx0Var;
        rtx0 rtx0Var2;
        zzs zzsVar = g2tVar.b.a;
        v6r v6rVar = g2tVar.a;
        sxq0 sxq0Var = v6rVar.a.d;
        boolean l = (sxq0Var == null || (rtx0Var2 = sxq0Var.a) == null) ? false : jl40.l(rtx0Var2.a, Boolean.TRUE);
        sxq0 sxq0Var2 = v6rVar.a.d;
        return new qaa0(l, zzsVar, (sxq0Var2 == null || (rtx0Var = sxq0Var2.a) == null) ? null : rtx0Var.b);
    }

    public final qaa0 a() {
        g2t a = ((f2t) this.a).a();
        if (a != null) {
            return b(a);
        }
        return null;
    }
}
