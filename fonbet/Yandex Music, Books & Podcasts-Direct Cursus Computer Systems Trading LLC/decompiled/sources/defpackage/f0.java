package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class f0 extends s0 {
    public static final f0[] b = new f0[12];
    public final byte[] a;

    public f0(byte[] bArr, boolean z) {
        if (j0.D(bArr)) {
            xq0.x("malformed enumerated");
            throw null;
        }
        int i = 0;
        if ((bArr[0] & 128) != 0) {
            xq0.x("enumerated must be non-negative");
            throw null;
        }
        this.a = z ? j66.N(bArr) : bArr;
        int length = bArr.length - 1;
        while (i < length) {
            byte b2 = bArr[i];
            i++;
            if (b2 != (bArr[i] >> 7)) {
                return;
            }
        }
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof f0) {
            return Arrays.equals(this.a, ((f0) s0Var).a);
        }
        return false;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(10, z, this.a);
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
