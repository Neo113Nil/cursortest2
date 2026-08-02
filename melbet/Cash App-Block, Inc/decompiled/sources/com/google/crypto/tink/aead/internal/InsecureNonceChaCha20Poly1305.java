package com.google.crypto.tink.aead.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.time.zzgv;
import com.google.mlkit.vision.text.Text;

/* loaded from: classes4.dex */
public final class InsecureNonceChaCha20Poly1305 extends Text.TextBase {
    public final /* synthetic */ int $r8$classId;

    public InsecureNonceChaCha20Poly1305(byte[] bArr, int i) {
        this.$r8$classId = i;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.zza = newChaCha20Instance(1, bArr);
        this.zzd = newChaCha20Instance(0, bArr);
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final zzgv newChaCha20Instance(int i, byte[] bArr) {
        switch (this.$r8$classId) {
            case 0:
                return new InsecureNonceChaCha20(bArr, i, 0);
            default:
                return new InsecureNonceChaCha20(bArr, i, 1);
        }
    }
}
