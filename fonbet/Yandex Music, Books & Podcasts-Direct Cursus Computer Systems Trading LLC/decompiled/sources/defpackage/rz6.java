package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class rz6 extends s0 implements y0 {
    public final char[] a;

    public rz6(char[] cArr) {
        this.a = cArr;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        char[] cArr = this.a;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // defpackage.y0
    public final String o() {
        return new String(this.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof rz6) {
            return Arrays.equals(this.a, ((rz6) s0Var).a);
        }
        return false;
    }

    public final String toString() {
        return o();
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        char[] cArr = this.a;
        int length = cArr.length;
        qxpVar.A(30, z);
        qxpVar.t(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            qxpVar.s(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            qxpVar.s(bArr, 0, i3);
        }
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(this.a.length * 2, z);
    }
}
