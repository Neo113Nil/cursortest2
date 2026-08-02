package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class g07 extends s0 implements y0 {
    public final byte[] a;

    public g07(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.y0
    public final String o() {
        byte[] bArr = this.a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = aft.a;
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = aft.a[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i3 >= bArr.length) {
                            break loop0;
                        }
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        i4 = (i4 << 6) | (b3 & 63);
                        b2 = aft.b[b2 + ((b3 & 255) >>> 4)];
                        i3 = i5;
                    } else if (b2 != -2) {
                        if (i4 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i4;
                                i2++;
                                i = i3;
                            }
                        } else if (i2 < length - 1) {
                            int i6 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 += 2;
                            cArr[i6] = (char) ((i4 & 1023) | 56320);
                            i = i3;
                        }
                    }
                }
                i2 = -1;
                break;
            }
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            cArr[i2] = (char) b;
            i = i3;
            i2++;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        xq0.x("Invalid UTF-8 input");
        return null;
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof g07) {
            return Arrays.equals(this.a, ((g07) s0Var).a);
        }
        return false;
    }

    public final String toString() {
        return o();
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(12, z, this.a);
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
