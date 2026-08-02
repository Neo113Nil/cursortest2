package com.google.crypto.tink.aead.internal;

import com.google.android.gms.internal.time.zzgv;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class InsecureNonceChaCha20 extends zzgv {
    public final /* synthetic */ int $r8$classId;

    public InsecureNonceChaCha20(byte[] bArr, int i, int i2) {
        this.$r8$classId = i2;
        if (bArr.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("The key length in bytes must be 32.");
            throw null;
        }
        this.zzb = ChaCha20Util.toIntArray(bArr);
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.time.zzgv
    public final int[] createInitialState(int i, int[] iArr) {
        switch (this.$r8$classId) {
            case 0:
                if (iArr.length != 3) {
                    JWK$$ExternalSyntheticBUOutline0.m("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                    break;
                } else {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = (int[]) this.zzb;
                    int[] iArr4 = ChaCha20Util.sigma;
                    System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                    System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                    iArr2[12] = i;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    break;
                }
            default:
                if (iArr.length != 6) {
                    JWK$$ExternalSyntheticBUOutline0.m("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                    break;
                } else {
                    int[] iArr5 = new int[16];
                    int[] hChaCha20 = ChaCha20Util.hChaCha20((int[]) this.zzb, iArr);
                    int[] iArr6 = ChaCha20Util.sigma;
                    System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                    System.arraycopy(hChaCha20, 0, iArr5, iArr6.length, 8);
                    iArr5[12] = i;
                    iArr5[13] = 0;
                    iArr5[14] = iArr[4];
                    iArr5[15] = iArr[5];
                    break;
                }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.time.zzgv
    public final int nonceSizeInBytes() {
        switch (this.$r8$classId) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
