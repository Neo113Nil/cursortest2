package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class qqf extends a3 implements p3 {
    public final byte[] a;

    public qqf(byte[] bArr) {
        this.a = bArr;
    }

    public static qqf p(byte[] bArr) {
        return new qqf(bArr);
    }

    @Override // defpackage.p3
    public final String f() {
        byte[] bArr = this.a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = ur11.a;
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = ur11.a[b & Byte.MAX_VALUE];
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
                        b2 = ur11.b[b2 + ((b3 & 255) >>> 4)];
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
        ny61.g("Invalid UTF-8 input");
        return null;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof qqf) {
            return Arrays.equals(this.a, ((qqf) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(12, this.a, z);
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
        return f();
    }
}
