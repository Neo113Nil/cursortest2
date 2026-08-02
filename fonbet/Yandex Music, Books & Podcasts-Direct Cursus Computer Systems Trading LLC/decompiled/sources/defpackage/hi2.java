package defpackage;

/* loaded from: classes5.dex */
public final class hi2 extends v0 {
    @Override // defpackage.v0
    public final z H() {
        return new ci2(B());
    }

    @Override // defpackage.v0
    public final o0 K() {
        o0[] D = D();
        return new fi2(fi2.D(D), D);
    }

    @Override // defpackage.v0
    public final w0 L() {
        return new ji2(false, this.a);
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.w(48, z, this.a);
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        int i = z ? 4 : 3;
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.a[i2].n().w(true);
        }
        return i;
    }
}
