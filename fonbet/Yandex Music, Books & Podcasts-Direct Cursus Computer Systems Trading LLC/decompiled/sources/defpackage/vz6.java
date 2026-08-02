package defpackage;

/* loaded from: classes5.dex */
public final class vz6 extends h0 {
    public final byte[] N() {
        byte[] bArr = this.a;
        if (bArr[bArr.length - 1] == 90) {
            if (!H()) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                System.arraycopy(fxf.Z("0000Z"), 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!K()) {
                byte[] bArr3 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length - 1);
                System.arraycopy(fxf.Z("00Z"), 0, bArr3, bArr.length - 1, 3);
                return bArr3;
            }
            if (G()) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr4 = new byte[length + 1];
                    System.arraycopy(bArr, 0, bArr4, 0, length);
                    bArr4[length] = 90;
                    return bArr4;
                }
                byte[] bArr5 = new byte[length + 2];
                int i = length + 1;
                System.arraycopy(bArr, 0, bArr5, 0, i);
                bArr5[i] = 90;
                return bArr5;
            }
        }
        return bArr;
    }

    @Override // defpackage.h0, defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(24, z, N());
    }

    @Override // defpackage.h0, defpackage.s0
    public final int w(boolean z) {
        return qxp.n(N().length, z);
    }

    @Override // defpackage.s0
    public final s0 A() {
        return this;
    }

    @Override // defpackage.h0, defpackage.s0
    public final s0 z() {
        return this;
    }
}
