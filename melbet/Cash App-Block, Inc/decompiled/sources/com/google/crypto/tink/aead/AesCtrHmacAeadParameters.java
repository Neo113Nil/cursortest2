package com.google.crypto.tink.aead;

import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.aead.AesEaxParameters;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AesCtrHmacAeadParameters extends AeadParameters {
    public final int aesKeySizeBytes;
    public final AesEaxParameters.Variant hashType;
    public final int hmacKeySizeBytes;
    public final int ivSizeBytes;
    public final int tagSizeBytes;
    public final AesEaxParameters.Variant variant;

    public AesCtrHmacAeadParameters(int i, int i2, int i3, int i4, AesEaxParameters.Variant variant, AesEaxParameters.Variant variant2) {
        this.aesKeySizeBytes = i;
        this.hmacKeySizeBytes = i2;
        this.ivSizeBytes = i3;
        this.tagSizeBytes = i4;
        this.variant = variant;
        this.hashType = variant2;
    }

    public static zzlj builder() {
        zzlj zzljVar = new zzlj();
        zzljVar.zza = null;
        zzljVar.zzb = null;
        zzljVar.zzc = null;
        zzljVar.zze = null;
        zzljVar.zzd = null;
        zzljVar.zzf = AesEaxParameters.Variant.NO_PREFIX$1;
        return zzljVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AesCtrHmacAeadParameters)) {
            return false;
        }
        AesCtrHmacAeadParameters aesCtrHmacAeadParameters = (AesCtrHmacAeadParameters) obj;
        return aesCtrHmacAeadParameters.aesKeySizeBytes == this.aesKeySizeBytes && aesCtrHmacAeadParameters.hmacKeySizeBytes == this.hmacKeySizeBytes && aesCtrHmacAeadParameters.ivSizeBytes == this.ivSizeBytes && aesCtrHmacAeadParameters.tagSizeBytes == this.tagSizeBytes && aesCtrHmacAeadParameters.variant == this.variant && aesCtrHmacAeadParameters.hashType == this.hashType;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != AesEaxParameters.Variant.NO_PREFIX$1;
    }

    public final int hashCode() {
        return Objects.hash(AesCtrHmacAeadParameters.class, Integer.valueOf(this.aesKeySizeBytes), Integer.valueOf(this.hmacKeySizeBytes), Integer.valueOf(this.ivSizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant, this.hashType);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", hashType: ");
        sb.append(this.hashType);
        sb.append(", ");
        sb.append(this.ivSizeBytes);
        sb.append("-byte IV, and ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tags, and ");
        sb.append(this.aesKeySizeBytes);
        sb.append("-byte AES key, and ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.hmacKeySizeBytes, "-byte HMAC key)", sb);
    }
}
