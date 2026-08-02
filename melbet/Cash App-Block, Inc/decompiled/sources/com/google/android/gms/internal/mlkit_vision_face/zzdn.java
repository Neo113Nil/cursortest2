package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.zzae;
import com.nimbusds.jose.JWECryptoParts;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzdn {
    public final zzks zza;
    public final Boolean zzb;
    public final zzkd zzd;
    public final Integer zze;
    public final Integer zzf;

    public /* synthetic */ zzdn(JWECryptoParts jWECryptoParts) {
        this.zza = (zzks) jWECryptoParts.header;
        this.zzb = (Boolean) jWECryptoParts.encryptedKey;
        this.zzd = (zzkd) jWECryptoParts.iv;
        this.zze = (Integer) jWECryptoParts.cipherText;
        this.zzf = (Integer) jWECryptoParts.authenticationTag;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        return zzae.equal(this.zza, zzdnVar.zza) && zzae.equal(this.zzb, zzdnVar.zzb) && zzae.equal(null, null) && zzae.equal(this.zzd, zzdnVar.zzd) && zzae.equal(this.zze, zzdnVar.zze) && zzae.equal(this.zzf, zzdnVar.zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, this.zzd, this.zze, this.zzf});
    }
}
