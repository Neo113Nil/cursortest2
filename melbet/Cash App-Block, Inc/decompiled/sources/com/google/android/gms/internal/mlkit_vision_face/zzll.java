package com.google.android.gms.internal.mlkit_vision_face;

import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final class zzll {
    public final zzkl zza;
    public final zzkh zzb;
    public final zzkd zzc;
    public final Integer zzd;
    public final Integer zze;

    public /* synthetic */ zzll(JWECryptoParts jWECryptoParts) {
        this.zza = (zzkl) jWECryptoParts.header;
        this.zzb = (zzkh) jWECryptoParts.encryptedKey;
        this.zzc = (zzkd) jWECryptoParts.iv;
        this.zzd = (Integer) jWECryptoParts.cipherText;
        this.zze = (Integer) jWECryptoParts.authenticationTag;
    }
}
