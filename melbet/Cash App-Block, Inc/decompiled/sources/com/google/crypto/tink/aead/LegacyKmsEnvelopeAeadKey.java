package com.google.crypto.tink.aead;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.LegacyKmsAeadParameters;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public final class LegacyKmsEnvelopeAeadKey extends AeadKey {
    public final Integer idRequirement;
    public final Bytes outputPrefix;
    public final LegacyKmsEnvelopeAeadParameters parameters;

    public LegacyKmsEnvelopeAeadKey(LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters, Bytes bytes, Integer num) {
        this.parameters = legacyKmsEnvelopeAeadParameters;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static LegacyKmsEnvelopeAeadKey create(LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters, Integer num) {
        Bytes tinkOutputPrefix;
        LegacyKmsAeadParameters.Variant variant = legacyKmsEnvelopeAeadParameters.variant;
        if (variant == LegacyKmsAeadParameters.Variant.NO_PREFIX$1) {
            if (num != null) {
                a$$ExternalSyntheticBUOutline0.m$6("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
        } else {
            if (variant != LegacyKmsAeadParameters.Variant.TINK$1) {
                MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unknown Variant: ");
                return null;
            }
            if (num == null) {
                a$$ExternalSyntheticBUOutline0.m$6("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        return new LegacyKmsEnvelopeAeadKey(legacyKmsEnvelopeAeadParameters, tinkOutputPrefix, num);
    }

    @Override // androidx.room.TransactorKt
    public final Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        return this.parameters;
    }
}
