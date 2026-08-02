package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class rqf extends b3 implements q3 {
    public static final p1 b = new p1(21, rqf.class);
    public final byte[] a;

    public rqf(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.q3
    public final String f() {
        String str = quu0.a;
        byte[] bArr = this.a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = vr11.a;
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length2) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 < 0) {
                short s = vr11.a[b2 & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b3 = (byte) s;
                while (true) {
                    if (b3 >= 0) {
                        if (i3 >= length2) {
                            break loop0;
                        }
                        int i5 = i3 + 1;
                        byte b4 = bArr[i3];
                        i4 = (i4 << 6) | (b4 & 63);
                        b3 = vr11.b[b3 + ((b4 & 255) >>> 4)];
                        i3 = i5;
                    } else if (b3 != -2) {
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
            cArr[i2] = (char) b2;
            i = i3;
            i2++;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        ny61.g("Invalid UTF-8 input");
        return null;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return rza1.e(this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof rqf) {
            return Arrays.equals(this.a, ((rqf) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.I(12, this.a, z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(this.a.length, z);
    }

    public final String toString() {
        return f();
    }
}
