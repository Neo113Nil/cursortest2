package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class h07 extends s0 implements y0 {
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public h07(byte[] bArr) {
        this.a = bArr;
    }

    public static void B(StringBuffer stringBuffer, int i) {
        char[] cArr = b;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.y0
    public final String o() {
        int i;
        byte[] bArr = this.a;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((qxp.l(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            B(stringBuffer, length);
        } else {
            byte[] bArr2 = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr2[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr2[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                B(stringBuffer, bArr2[i4]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b2 : bArr) {
            B(stringBuffer, b2);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof h07) {
            return Arrays.equals(this.a, ((h07) s0Var).a);
        }
        return false;
    }

    public final String toString() {
        return o();
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(28, z, this.a);
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
