package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class sqf extends a3 implements p3 {
    public static final char[] b = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public sqf(byte[] bArr) {
        this.a = bArr;
    }

    public static sqf p(byte[] bArr) {
        return new sqf(bArr);
    }

    public static void q(StringBuffer stringBuffer, int i) {
        char[] cArr = b;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // defpackage.p3
    public final String f() {
        int i;
        byte[] bArr = this.a;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((g191.L(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            q(stringBuffer, length);
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
                q(stringBuffer, bArr2[i4]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b2 : bArr) {
            q(stringBuffer, b2);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof sqf) {
            return Arrays.equals(this.a, ((sqf) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(28, this.a, z);
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
