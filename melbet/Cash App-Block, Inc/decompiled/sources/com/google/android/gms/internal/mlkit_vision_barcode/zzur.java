package com.google.android.gms.internal.mlkit_vision_barcode;

import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final class zzur {
    public final Float zza;
    public final Float zzb;
    public final Float zzc;
    public final Float zzd;
    public final Float zze;

    public /* synthetic */ zzur(JWECryptoParts jWECryptoParts) {
        this.zza = (Float) jWECryptoParts.header;
        this.zzb = (Float) jWECryptoParts.encryptedKey;
        this.zzc = (Float) jWECryptoParts.iv;
        this.zzd = (Float) jWECryptoParts.cipherText;
        this.zze = (Float) jWECryptoParts.authenticationTag;
    }
}
