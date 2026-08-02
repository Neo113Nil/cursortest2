package defpackage;

/* loaded from: classes3.dex */
public final class vaj implements taj {
    public final oq a;
    public final wpd b;
    public final fkn c;

    public vaj(oq oqVar, z3g z3gVar, mm6 mm6Var, wpd wpdVar) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = wpdVar;
        this.c = lg3.u0(new njf(zsd.b0(z3gVar.a()), this, 19), mm6Var, c(false));
    }

    @Override // defpackage.taj
    public final void a() {
        this.b.J(this.a);
    }

    @Override // defpackage.taj
    public final vdr b() {
        return this.c;
    }

    public final w3g c(boolean z) {
        String w;
        String str;
        oq oqVar = this.a;
        oqVar.getClass();
        int i = oqVar.q;
        if (i >= 0) {
            int i2 = i + (z ? 1 : 0);
            str = y3g.a(i2);
            w = dag.A(i2, z);
        } else {
            String w2 = etn.w(oqVar);
            w = etn.w(oqVar);
            str = w2;
        }
        return new w3g(str, w, z);
    }

    @Override // defpackage.taj
    public final void d() {
        this.b.D(this.a);
    }
}
