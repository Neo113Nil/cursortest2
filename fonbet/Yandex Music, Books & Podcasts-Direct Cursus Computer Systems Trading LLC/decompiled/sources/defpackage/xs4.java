package defpackage;

/* loaded from: classes4.dex */
public final class xs4 implements ws4 {
    public final c1t a;
    public final by7 b;

    public xs4(int i, sfm sfmVar, qwq qwqVar, ns4 ns4Var) {
        sfmVar.getClass();
        c1t c1tVar = new c1t(i, sfmVar, ns4Var, qwqVar.H());
        this.a = c1tVar;
        this.b = (by7) c1tVar.f;
    }

    @Override // defpackage.ws4
    public final vdr a() {
        return this.b;
    }

    @Override // defpackage.ws4
    public final void b(int i) {
        c1t c1tVar = this.a;
        ((sfm) c1tVar.c).P(c1tVar.b, ern.a(mtq.class), new mtq(ys4.a((ys4) ((by7) c1tVar.f).b.invoke(), i, null, 2), ((mtq) ((vdr) c1tVar.e).getValue()).b));
    }
}
