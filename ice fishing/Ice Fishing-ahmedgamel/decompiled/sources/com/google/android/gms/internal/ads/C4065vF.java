package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4065vF extends AbstractC4119wF {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4065vF(byte[] bArr, int i, int i4) {
        super(bArr, i);
        this.f35442c = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4119wF
    public final int[] a(int[] iArr, int i) {
        switch (this.f35442c) {
            case 0:
                int length = iArr.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f35586b;
                int[] iArr4 = AbstractC4011uF.f35283a;
                int length2 = iArr4.length;
                System.arraycopy(iArr4, 0, iArr2, 0, length2);
                System.arraycopy(iArr3, 0, iArr2, length2, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, 3);
                return iArr2;
            default:
                int length3 = iArr.length;
                if (length3 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length3 * 32)));
                }
                int[] iArr5 = new int[16];
                int[] d9 = AbstractC4011uF.d((int[]) this.f35586b, iArr);
                int[] iArr6 = AbstractC4011uF.f35283a;
                int length4 = iArr6.length;
                System.arraycopy(iArr6, 0, iArr5, 0, length4);
                System.arraycopy(d9, 0, iArr5, length4, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4119wF
    public final int b() {
        switch (this.f35442c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
