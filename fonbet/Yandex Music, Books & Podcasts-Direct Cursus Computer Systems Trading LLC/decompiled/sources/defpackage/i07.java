package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class i07 extends s0 implements y0 {
    public final byte[] a;

    public i07(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.y0
    public final String o() {
        return fxf.B(this.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof i07) {
            return Arrays.equals(this.a, ((i07) s0Var).a);
        }
        return false;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(21, z, this.a);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(this.a.length, z);
    }
}
