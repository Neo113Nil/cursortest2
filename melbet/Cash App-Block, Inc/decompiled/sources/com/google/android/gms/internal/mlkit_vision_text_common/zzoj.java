package com.google.android.gms.internal.mlkit_vision_text_common;

import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final class zzoj {
    public final Long zza;
    public final zzou zzb;
    public final Boolean zzc;
    public final Boolean zzd;
    public final Boolean zze;

    public /* synthetic */ zzoj(JWECryptoParts jWECryptoParts) {
        this.zza = (Long) jWECryptoParts.header;
        this.zzb = (zzou) jWECryptoParts.encryptedKey;
        this.zzc = (Boolean) jWECryptoParts.iv;
        this.zzd = (Boolean) jWECryptoParts.cipherText;
        this.zze = (Boolean) jWECryptoParts.authenticationTag;
    }
}
