package com.google.android.gms.internal.fido;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzgr extends zzgu {
    public final int zzc;
    public final int zzd;

    public zzgr(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgu.zzj(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final byte zza(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
        }
        if (i < 0) {
            JWK$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Index < 0: "));
            return (byte) 0;
        }
        JWK$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index > length: ", i, i2, ", "));
        return (byte) 0;
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final void zze(int i, byte[] bArr) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i);
    }
}
