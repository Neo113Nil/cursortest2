package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class u3 extends a3 {
    public final byte[] a;

    public u3(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            ny61.g("UTCTime string too short");
            throw null;
        }
        this.a = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            ny61.g("illegal characters in UTCTime string");
            throw null;
        }
    }

    public static u3 p(byte[] bArr) {
        return new u3(bArr);
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (!(a3Var instanceof u3)) {
            return false;
        }
        return Arrays.equals(this.a, ((u3) a3Var).a);
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(23, this.a, z);
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
