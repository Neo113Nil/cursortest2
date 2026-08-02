package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class wz6 extends s0 implements y0 {
    public final byte[] a;

    static {
        new y(2, wz6.class);
    }

    public wz6(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
        } else {
            jj4.j("'contents' cannot be null");
            throw null;
        }
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
        if (s0Var instanceof wz6) {
            return Arrays.equals(this.a, ((wz6) s0Var).a);
        }
        return false;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(25, z, this.a);
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
