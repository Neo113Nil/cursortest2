package com.google.android.gms.internal.mlkit_vision_barcode;

import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final class zzqq {
    public final Long zza;
    public final zzrb zzb;
    public final Boolean zzc;
    public final Boolean zzd;
    public final Boolean zze;

    public /* synthetic */ zzqq(JWECryptoParts jWECryptoParts) {
        this.zza = (Long) jWECryptoParts.header;
        this.zzb = (zzrb) jWECryptoParts.encryptedKey;
        this.zzc = (Boolean) jWECryptoParts.iv;
        this.zzd = (Boolean) jWECryptoParts.cipherText;
        this.zze = (Boolean) jWECryptoParts.authenticationTag;
    }
}
