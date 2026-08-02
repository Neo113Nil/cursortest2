package defpackage;

/* loaded from: classes5.dex */
public final class ji2 extends w0 {
    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.w(49, z, this.a);
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        int i = z ? 4 : 3;
        for (d0 d0Var : this.a) {
            i += d0Var.n().w(true);
        }
        return i;
    }
}
