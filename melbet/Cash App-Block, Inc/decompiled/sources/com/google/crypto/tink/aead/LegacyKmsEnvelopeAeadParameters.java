package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.LegacyKmsAeadParameters;
import java.util.Objects;

/* loaded from: classes.dex */
public final class LegacyKmsEnvelopeAeadParameters extends AeadParameters {
    public final AeadParameters dekParametersForNewKeys;
    public final LegacyKmsAeadParameters.Variant dekParsingStrategy;
    public final String kekUri;
    public final LegacyKmsAeadParameters.Variant variant;

    public LegacyKmsEnvelopeAeadParameters(LegacyKmsAeadParameters.Variant variant, String str, LegacyKmsAeadParameters.Variant variant2, AeadParameters aeadParameters) {
        this.variant = variant;
        this.kekUri = str;
        this.dekParsingStrategy = variant2;
        this.dekParametersForNewKeys = aeadParameters;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LegacyKmsEnvelopeAeadParameters)) {
            return false;
        }
        LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters = (LegacyKmsEnvelopeAeadParameters) obj;
        return legacyKmsEnvelopeAeadParameters.dekParsingStrategy.equals(this.dekParsingStrategy) && legacyKmsEnvelopeAeadParameters.dekParametersForNewKeys.equals(this.dekParametersForNewKeys) && legacyKmsEnvelopeAeadParameters.kekUri.equals(this.kekUri) && legacyKmsEnvelopeAeadParameters.variant.equals(this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != LegacyKmsAeadParameters.Variant.NO_PREFIX$1;
    }

    public final int hashCode() {
        return Objects.hash(LegacyKmsEnvelopeAeadParameters.class, this.kekUri, this.dekParsingStrategy, this.dekParametersForNewKeys, this.variant);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.kekUri + ", dekParsingStrategy: " + this.dekParsingStrategy + ", dekParametersForNewKeys: " + this.dekParametersForNewKeys + ", variant: " + this.variant + ")";
    }
}
