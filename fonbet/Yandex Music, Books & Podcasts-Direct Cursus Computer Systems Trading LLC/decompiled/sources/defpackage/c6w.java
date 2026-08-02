package defpackage;

/* loaded from: classes.dex */
public abstract class c6w extends fr5 {
    public final wvh k;

    public c6w(wvh wvhVar) {
        this.k = wvhVar;
    }

    @Override // defpackage.fr5
    public final uvh A(Object obj, uvh uvhVar) {
        return F(uvhVar);
    }

    @Override // defpackage.fr5
    public final long B(long j, Object obj) {
        return j;
    }

    @Override // defpackage.fr5
    public final int C(int i, Object obj) {
        return i;
    }

    @Override // defpackage.fr5
    public final void D(Object obj, wvh wvhVar, sis sisVar) {
        G(sisVar);
    }

    public abstract void G(sis sisVar);

    public void H() {
        E(null, this.k);
    }

    @Override // defpackage.wvh
    public final onh f() {
        return this.k.f();
    }

    @Override // defpackage.wvh
    public void i(onh onhVar) {
        this.k.i(onhVar);
    }

    @Override // defpackage.wvh
    public final boolean q() {
        return this.k.q();
    }

    @Override // defpackage.wvh
    public final sis r() {
        return this.k.r();
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        this.j = t6tVar;
        this.i = dvt.p(null);
        H();
    }

    public uvh F(uvh uvhVar) {
        return uvhVar;
    }
}
