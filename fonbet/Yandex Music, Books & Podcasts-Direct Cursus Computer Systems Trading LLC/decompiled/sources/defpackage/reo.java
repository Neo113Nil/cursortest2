package defpackage;

/* loaded from: classes.dex */
public final class reo extends ssr {
    public final /* synthetic */ v97 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reo(v97 v97Var, int i) {
        super(i);
        this.b = v97Var;
    }

    @Override // defpackage.ssr
    public final void d(rsr rsrVar) {
        rsrVar.getClass();
        this.b.o(new qsr(rsrVar));
    }

    @Override // defpackage.ssr
    public final void e(rsr rsrVar, int i, int i2) {
        rsrVar.getClass();
        g(rsrVar, i, i2);
    }

    @Override // defpackage.ssr
    public final void f(rsr rsrVar) {
        rsrVar.getClass();
        qsr qsrVar = new qsr(rsrVar);
        v97 v97Var = this.b;
        v97Var.r(qsrVar);
        v97Var.i = rsrVar;
    }

    @Override // defpackage.ssr
    public final void g(rsr rsrVar, int i, int i2) {
        rsrVar.getClass();
        this.b.p(new qsr(rsrVar), i, i2);
    }
}
