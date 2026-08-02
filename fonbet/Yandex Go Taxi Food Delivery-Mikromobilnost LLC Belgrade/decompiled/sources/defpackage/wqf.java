package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class wqf extends a3 implements p3 {
    public final byte[] a;

    public wqf(byte[] bArr) {
        this.a = bArr;
    }

    public static wqf p(byte[] bArr) {
        return new wqf(bArr);
    }

    @Override // defpackage.p3
    public final String f() {
        return ruu0.a(this.a);
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof wqf) {
            return Arrays.equals(this.a, ((wqf) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(26, this.a, z);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(this.a.length, z);
    }

    public final String toString() {
        return ruu0.a(this.a);
    }
}
