package com.google.android.gms.internal.mlkit_vision_face;

import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final class zzkl {
    public final Long zza;
    public final zzks zzb;
    public final Boolean zzc;
    public final Boolean zzd;
    public final Boolean zze;

    public /* synthetic */ zzkl(JWECryptoParts jWECryptoParts) {
        this.zza = (Long) jWECryptoParts.header;
        this.zzb = (zzks) jWECryptoParts.encryptedKey;
        this.zzc = (Boolean) jWECryptoParts.iv;
        this.zzd = (Boolean) jWECryptoParts.cipherText;
        this.zze = (Boolean) jWECryptoParts.authenticationTag;
    }
}
