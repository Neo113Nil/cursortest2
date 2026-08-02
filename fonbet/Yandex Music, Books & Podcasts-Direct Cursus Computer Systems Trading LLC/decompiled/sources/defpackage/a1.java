package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class a1 extends s0 {
    public final byte[] a;

    public a1(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            xq0.x("UTCTime string too short");
            throw null;
        }
        this.a = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            xq0.x("illegal characters in UTCTime string");
            throw null;
        }
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (!(s0Var instanceof a1)) {
            return false;
        }
        return Arrays.equals(this.a, ((a1) s0Var).a);
    }

    public final String toString() {
        return fxf.B(this.a);
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(23, z, this.a);
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
