package defpackage;

/* loaded from: classes3.dex */
public final class gwa extends fwa {
    public yva k;
    public pu0 l;
    public awa m;
    public final x0q n = y0q.b(0, 0, null, 7);

    @Override // defpackage.fwa
    public final void G() {
        this.l = null;
        this.k = null;
    }

    @Override // defpackage.fwa
    public final pu0 H() {
        return this.l;
    }

    @Override // defpackage.fwa
    public final awa J() {
        return this.m;
    }

    @Override // defpackage.fwa
    public final x0q K() {
        return this.n;
    }

    @Override // defpackage.fwa
    public final boolean L() {
        return (this.l == null || this.m == null) ? false : true;
    }

    @Override // defpackage.fwa
    public final void M(String str) {
        str.getClass();
        yva yvaVar = this.k;
        if (yvaVar != null) {
            yvaVar.b(str);
        }
    }

    @Override // defpackage.fwa
    public final void N() {
        yva yvaVar = this.k;
        if (yvaVar != null) {
            yvaVar.g();
        }
    }

    @Override // defpackage.fwa
    public final void O() {
        yva yvaVar = this.k;
        if (yvaVar != null) {
            yvaVar.h();
        }
    }

    @Override // defpackage.fwa
    public final void P(awa awaVar) {
        this.m = awaVar;
    }

    @Override // defpackage.fwa
    public final void R(yva yvaVar) {
        this.k = yvaVar;
    }

    @Override // defpackage.fwa
    public final void S(pu0 pu0Var) {
        this.l = pu0Var;
    }
}
