package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class rzn implements ve1 {
    public final gg1 a;
    public final m200 b;
    public final int c;

    public rzn(gg1 gg1Var, m200 m200Var, int i) {
        this.a = gg1Var;
        this.b = m200Var;
        this.c = i;
    }

    @Override // defpackage.ve1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        gg1 gg1Var = this.a;
        gg1Var.getClass();
        int length = bArr.length;
        int i = gg1Var.b;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(oyr.i(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] a = i6i0.a(i);
        System.arraycopy(a, 0, bArr3, 0, i);
        gg1Var.a(bArr, bArr3, a, 0, bArr.length, gg1Var.b, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return ffx.x(bArr3, this.b.b(ffx.x(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // defpackage.ve1
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            kbs.v("ciphertext too short");
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(copyOfRange2, ffx.x(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        gg1 gg1Var = this.a;
        gg1Var.getClass();
        int length2 = copyOfRange.length;
        int i2 = gg1Var.b;
        if (length2 < i2) {
            kbs.v("ciphertext too short");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(copyOfRange, 0, bArr3, 0, i2);
        int length3 = copyOfRange.length;
        int i3 = gg1Var.b;
        byte[] bArr4 = new byte[length3 - i3];
        gg1Var.a(copyOfRange, bArr4, bArr3, i3, copyOfRange.length - i3, 0, false);
        return bArr4;
    }
}
