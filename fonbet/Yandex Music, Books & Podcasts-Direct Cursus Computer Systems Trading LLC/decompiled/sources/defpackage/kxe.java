package defpackage;

/* loaded from: classes.dex */
public final class kxe extends ixe {
    public hxe p;
    public boolean q;

    @Override // defpackage.ixe, defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        return this.p == hxe.a ? ffhVar.G(i) : ffhVar.J(i);
    }

    @Override // defpackage.ixe
    public final long S0(ffh ffhVar, long j) {
        int G = this.p == hxe.a ? ffhVar.G(ga6.h(j)) : ffhVar.J(ga6.h(j));
        if (G < 0) {
            G = 0;
        }
        if (G < 0) {
            ume.a("width must be >= 0");
        }
        return ia6.h(G, G, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.ixe
    public final boolean T0() {
        return this.q;
    }

    @Override // defpackage.ixe, defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        return this.p == hxe.a ? ffhVar.G(i) : ffhVar.J(i);
    }
}
