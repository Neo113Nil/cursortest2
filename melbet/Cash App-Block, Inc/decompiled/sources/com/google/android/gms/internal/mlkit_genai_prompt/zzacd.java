package com.google.android.gms.internal.mlkit_genai_prompt;

import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final class zzacd {
    public final zzahn zza;
    public final zzaca zzb;
    public final zzafv zzc;
    public final zzafs zzd;
    public final zzafm zze;

    public /* synthetic */ zzacd(JWECryptoParts jWECryptoParts) {
        this.zza = (zzahn) jWECryptoParts.header;
        this.zzb = (zzaca) jWECryptoParts.encryptedKey;
        this.zzc = (zzafv) jWECryptoParts.iv;
        this.zzd = (zzafs) jWECryptoParts.cipherText;
        this.zze = (zzafm) jWECryptoParts.authenticationTag;
    }
}
