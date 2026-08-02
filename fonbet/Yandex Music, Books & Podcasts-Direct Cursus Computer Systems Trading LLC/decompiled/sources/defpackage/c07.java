package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class c07 extends s0 implements y0 {
    public final byte[] a;

    public c07(String str) {
        this.a = fxf.Z(str);
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
        if (s0Var instanceof c07) {
            return Arrays.equals(this.a, ((c07) s0Var).a);
        }
        return false;
    }

    public final String toString() {
        return fxf.B(this.a);
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(19, z, this.a);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(this.a.length, z);
    }

    public c07(byte[] bArr) {
        this.a = bArr;
    }
}
