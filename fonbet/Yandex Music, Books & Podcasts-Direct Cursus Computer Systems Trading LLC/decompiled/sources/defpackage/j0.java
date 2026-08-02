package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class j0 extends s0 {
    public static final y c = new y(4, j0.class);
    public final byte[] a;
    public final int b;

    public j0(byte[] bArr) {
        if (D(bArr)) {
            xq0.x("malformed integer");
            throw null;
        }
        this.a = bArr;
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.b = i;
    }

    public static boolean D(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || uxm.b("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    public final boolean B(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i2 = this.b;
        if (length - i2 > 4) {
            return false;
        }
        int length2 = bArr.length;
        int max = Math.max(i2, length2 - 4);
        int i3 = bArr[max];
        while (true) {
            max++;
            if (max >= length2) {
                break;
            }
            i3 = (i3 << 8) | (bArr[max] & 255);
        }
        return i3 == i;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof j0) {
            return Arrays.equals(this.a, ((j0) s0Var).a);
        }
        return false;
    }

    public final String toString() {
        return new BigInteger(this.a).toString();
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(2, z, this.a);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(this.a.length, z);
    }

    public j0(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
        this.b = 0;
    }
}
