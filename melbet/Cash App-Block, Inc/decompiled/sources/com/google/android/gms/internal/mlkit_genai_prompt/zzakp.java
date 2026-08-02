package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzakp extends zzaks {
    public final int zzc;

    public zzakp(byte[] bArr, int i) {
        super(bArr);
        zzaks.zzg(0, i, bArr.length);
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzaks
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            JWK$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Index < 0: "));
            return (byte) 0;
        }
        JWK$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index > length: ", i, i2, ", "));
        return (byte) 0;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzaks
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzaks
    public final int zzd() {
        return this.zzc;
    }
}
