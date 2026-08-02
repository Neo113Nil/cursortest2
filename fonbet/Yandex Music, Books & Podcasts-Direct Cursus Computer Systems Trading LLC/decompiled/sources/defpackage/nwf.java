package defpackage;

/* loaded from: classes.dex */
public final class nwf extends xci implements yr5, amd {
    public ch0 o;
    public axf p;
    public qbs q;
    public final x6k r = szf.g0(null);

    public nwf(ch0 ch0Var, axf axfVar, qbs qbsVar) {
        this.o = ch0Var;
        this.p = axfVar;
        this.q = qbsVar;
    }

    @Override // defpackage.amd
    public final void G(f8j f8jVar) {
        this.r.setValue(f8jVar);
    }

    @Override // defpackage.xci
    public final void K0() {
        ch0 ch0Var = this.o;
        if (ch0Var.a != null) {
            vme.c("Expected textInputModifierNode to be null");
        }
        ch0Var.a = this;
    }

    @Override // defpackage.xci
    public final void L0() {
        this.o.k(this);
    }
}
