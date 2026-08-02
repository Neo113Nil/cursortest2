package defpackage;

/* loaded from: classes4.dex */
public final class j3j extends mw3 {
    public String h;
    public boolean i;
    public lgk j;
    public final voi k;
    public final voi l;
    public final voi m;
    public k5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3j(g0c g0cVar) {
        super(g0cVar);
        g0cVar.getClass();
        g0cVar.getClass();
        this.k = new voi();
        this.l = new voi();
        this.m = new voi();
    }

    @Override // defpackage.mw3
    public final void f() {
        sx3 sx3Var = (sx3) this.f;
        if (sx3Var != null) {
            sx3Var.a(ox3.a);
        }
        mv3 mv3Var = (mv3) this.d;
        if (mv3Var != null) {
            mv3Var.j(kv3.a);
        }
        lgk lgkVar = this.j;
        if (lgkVar != null) {
            lgkVar.b(new oxa(19, this));
        }
    }

    @Override // defpackage.mw3
    public final lv3 j(jw3 jw3Var) {
        jw3Var.getClass();
        boolean z = this.i;
        return (!z && this.h == null && (jw3Var == jw3.a || jw3Var == jw3.b)) ? new iv3(yv3.a) : (!z && this.h == null && (jw3Var == jw3.c || jw3Var == jw3.d)) ? new iv3(yv3.b) : super.j(jw3Var);
    }
}
