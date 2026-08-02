package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class r1w extends erm {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1w(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.c = i2;
    }

    @Override // defpackage.erm
    public final int[] b(int i, int[] iArr) {
        int i2 = this.c;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (iArr.length != 3) {
                    kbs.o("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                    break;
                } else {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = d89.a;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                    System.arraycopy((int[]) obj, 0, iArr2, iArr3.length, 8);
                    iArr2[12] = i;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    break;
                }
            default:
                if (iArr.length != 6) {
                    kbs.o("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                    break;
                } else {
                    int[] iArr4 = new int[16];
                    int[] iArr5 = new int[16];
                    int[] iArr6 = d89.a;
                    System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                    System.arraycopy((int[]) obj, 0, iArr5, iArr6.length, 8);
                    iArr5[12] = iArr[0];
                    iArr5[13] = iArr[1];
                    iArr5[14] = iArr[2];
                    iArr5[15] = iArr[3];
                    d89.b(iArr5);
                    iArr5[4] = iArr5[12];
                    iArr5[5] = iArr5[13];
                    iArr5[6] = iArr5[14];
                    iArr5[7] = iArr5[15];
                    int[] copyOf = Arrays.copyOf(iArr5, 8);
                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                    System.arraycopy(copyOf, 0, iArr4, iArr6.length, 8);
                    iArr4[12] = i;
                    iArr4[13] = 0;
                    iArr4[14] = iArr[4];
                    iArr4[15] = iArr[5];
                    break;
                }
        }
        return null;
    }

    @Override // defpackage.erm
    public final int c() {
        switch (this.c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
