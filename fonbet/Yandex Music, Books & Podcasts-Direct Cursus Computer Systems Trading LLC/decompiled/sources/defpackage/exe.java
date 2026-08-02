package defpackage;

/* loaded from: classes.dex */
public final class exe extends ixe {
    public hxe p;
    public boolean q;

    @Override // defpackage.ixe, defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        return this.p == hxe.a ? ffhVar.z(i) : ffhVar.a(i);
    }

    @Override // defpackage.ixe
    public final long S0(ffh ffhVar, long j) {
        int z = this.p == hxe.a ? ffhVar.z(ga6.i(j)) : ffhVar.a(ga6.i(j));
        if (z < 0) {
            z = 0;
        }
        if (z < 0) {
            ume.a("height must be >= 0");
        }
        return ia6.h(0, Integer.MAX_VALUE, z, z);
    }

    @Override // defpackage.ixe
    public final boolean T0() {
        return this.q;
    }

    @Override // defpackage.ixe, defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        return this.p == hxe.a ? ffhVar.z(i) : ffhVar.a(i);
    }
}
