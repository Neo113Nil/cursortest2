package defpackage;

/* loaded from: classes4.dex */
public final class z07 extends bfu {
    public b6j A;
    public Boolean B;
    public final voi C;
    public final voi D;
    public final voi E;
    public boolean F;
    public boolean G;
    public final qc9 H;
    public final x0q I;
    public final gs4 k;
    public final g0c l;
    public final sdk m;
    public final jyr n;
    public final jyr o;
    public boolean p;
    public final voi q;
    public final voi r;
    public final voi s;
    public final voi t;
    public rfk u;
    public ix3 v;
    public jw3 w;
    public uif x;
    public s07 y;
    public s07 z;

    public z07(gs4 gs4Var, g0c g0cVar, sdk sdkVar) {
        gs4Var.getClass();
        sdkVar.getClass();
        this.k = gs4Var;
        this.l = g0cVar;
        this.m = sdkVar;
        this.n = btf.b(new w07(this, 0));
        this.o = btf.b(new w07(this, 1));
        Boolean bool = Boolean.TRUE;
        this.q = new voi(bool);
        this.r = new voi();
        this.s = new voi();
        this.t = new voi(bool);
        this.v = ix3.m;
        this.w = jw3.a;
        this.C = new voi();
        this.D = new voi();
        this.E = new voi();
        this.H = new qc9(new v07(0, this));
        this.I = y0q.b(1, 1, null, 4);
    }

    public final z03 G() {
        return (z03) this.n.getValue();
    }

    public final j3j H() {
        return (j3j) this.o.getValue();
    }

    public final void J(boolean z, boolean z2, boolean z3, boolean z4) {
        x97.y(ot0.F(this), null, null, new y07(this, z2, z3, z4, z, null), 3);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        gld.L(G().i, null);
        super.onCleared();
    }
}
