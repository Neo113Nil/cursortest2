package com.google.android.gms.internal.mlkit_vision_barcode;

import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final class zzrr {
    public final zzqq zza;
    public final zzvz zzb;
    public final zzdk zzc;
    public final zzdk zzd;
    public final zzqk zze;

    public /* synthetic */ zzrr(JWECryptoParts jWECryptoParts) {
        this.zza = (zzqq) jWECryptoParts.header;
        this.zzb = (zzvz) jWECryptoParts.encryptedKey;
        this.zzc = (zzdk) jWECryptoParts.iv;
        this.zzd = (zzdk) jWECryptoParts.cipherText;
        this.zze = (zzqk) jWECryptoParts.authenticationTag;
    }
}
