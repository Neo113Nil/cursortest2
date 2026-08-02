package com.google.crypto.tink.aead;

import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AesEaxParameters;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AesGcmSivParameters extends AeadParameters {
    public final int keySizeBytes;
    public final AesEaxParameters.Variant variant;

    public AesGcmSivParameters(int i, AesEaxParameters.Variant variant) {
        this.keySizeBytes = i;
        this.variant = variant;
    }

    public static KeysetHandle builder() {
        KeysetHandle keysetHandle = new KeysetHandle(4, false);
        keysetHandle.entries = null;
        keysetHandle.annotationsMap = AesEaxParameters.Variant.NO_PREFIX$3;
        return keysetHandle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AesGcmSivParameters)) {
            return false;
        }
        AesGcmSivParameters aesGcmSivParameters = (AesGcmSivParameters) obj;
        return aesGcmSivParameters.keySizeBytes == this.keySizeBytes && aesGcmSivParameters.variant == this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != AesEaxParameters.Variant.NO_PREFIX$3;
    }

    public final int hashCode() {
        return Objects.hash(AesGcmSivParameters.class, Integer.valueOf(this.keySizeBytes), this.variant);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keySizeBytes, "-byte key)", sb);
    }
}
