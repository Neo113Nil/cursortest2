package com.google.crypto.tink.aead;

import androidx.datastore.core.SimpleActor;
import com.google.crypto.tink.aead.AesEaxParameters;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AesGcmParameters extends AeadParameters {
    public final int ivSizeBytes;
    public final int keySizeBytes;
    public final int tagSizeBytes;
    public final AesEaxParameters.Variant variant;

    public AesGcmParameters(int i, int i2, int i3, AesEaxParameters.Variant variant) {
        this.keySizeBytes = i;
        this.ivSizeBytes = i2;
        this.tagSizeBytes = i3;
        this.variant = variant;
    }

    public static SimpleActor builder() {
        SimpleActor simpleActor = new SimpleActor(13, false);
        simpleActor.scope = null;
        simpleActor.consumeMessage = null;
        simpleActor.messageQueue = null;
        simpleActor.remainingMessages = AesEaxParameters.Variant.NO_PREFIX$2;
        return simpleActor;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AesGcmParameters)) {
            return false;
        }
        AesGcmParameters aesGcmParameters = (AesGcmParameters) obj;
        return aesGcmParameters.keySizeBytes == this.keySizeBytes && aesGcmParameters.ivSizeBytes == this.ivSizeBytes && aesGcmParameters.tagSizeBytes == this.tagSizeBytes && aesGcmParameters.variant == this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != AesEaxParameters.Variant.NO_PREFIX$2;
    }

    public final int hashCode() {
        return Objects.hash(AesGcmParameters.class, Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.ivSizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        sb.append(this.ivSizeBytes);
        sb.append("-byte IV, ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tag, and ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keySizeBytes, "-byte key)", sb);
    }
}
