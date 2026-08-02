package defpackage;

/* loaded from: classes5.dex */
public final class b8h extends bfg {
    public final a8h a;
    public final ngg b;
    public final /* synthetic */ j8h c;

    public b8h(j8h j8hVar, a8h a8hVar, xco xcoVar) {
        this.c = j8hVar;
        this.a = a8hVar;
        o2g.O(xcoVar, "resolver");
        this.b = xcoVar;
    }

    @Override // defpackage.bfg
    public final void A(mwi mwiVar) {
        this.c.m.execute(new pv7(29, this, mwiVar));
    }

    @Override // defpackage.bfg
    public final void z(sgr sgrVar) {
        o2g.J("the error status must not be OK", !sgrVar.g());
        this.c.m.execute(new pv7(28, this, sgrVar));
    }
}
