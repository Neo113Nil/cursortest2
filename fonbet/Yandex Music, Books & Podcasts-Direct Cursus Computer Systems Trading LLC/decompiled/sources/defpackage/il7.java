package defpackage;

/* loaded from: classes.dex */
public final class il7 extends xci implements ipa {
    public final uoi o;
    public boolean p;
    public boolean q;
    public boolean r;

    public il7(uoi uoiVar) {
        this.o = uoiVar;
    }

    @Override // defpackage.xci
    public final void K0() {
        x97.y(G0(), null, null, new ja4(this, null, 25), 3);
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        opfVar.a();
        ou3 ou3Var = opfVar.a;
        if (this.p) {
            jpa.B(opfVar, d85.b(d85.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0L, ou3Var.e(), 0.0f, null, 0, 122);
        } else if (this.q || this.r) {
            jpa.B(opfVar, d85.b(d85.b, 0.1f, 0.0f, 0.0f, 0.0f, 14), 0L, ou3Var.e(), 0.0f, null, 0, 122);
        }
    }
}
