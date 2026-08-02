package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.zzae;
import com.nimbusds.jose.JWECryptoParts;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzft {
    public final zzrb zza;
    public final Boolean zzc;
    public final zzvz zze;
    public final zzdk zzf;
    public final zzdk zzg;

    public /* synthetic */ zzft(JWECryptoParts jWECryptoParts) {
        this.zza = (zzrb) jWECryptoParts.header;
        this.zzc = (Boolean) jWECryptoParts.encryptedKey;
        this.zze = (zzvz) jWECryptoParts.iv;
        this.zzf = (zzdk) jWECryptoParts.cipherText;
        this.zzg = (zzdk) jWECryptoParts.authenticationTag;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        return zzae.equal(this.zza, zzftVar.zza) && zzae.equal(null, null) && zzae.equal(this.zzc, zzftVar.zzc) && zzae.equal(null, null) && zzae.equal(this.zze, zzftVar.zze) && zzae.equal(this.zzf, zzftVar.zzf) && zzae.equal(this.zzg, zzftVar.zzg);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg});
    }
}
