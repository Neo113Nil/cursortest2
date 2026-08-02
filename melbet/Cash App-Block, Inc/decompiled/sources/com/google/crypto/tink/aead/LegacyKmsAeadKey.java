package com.google.crypto.tink.aead;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.LegacyKmsAeadParameters;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.util.Bytes;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class LegacyKmsAeadKey extends AeadKey {
    public final Integer idRequirement;
    public final Bytes outputPrefix;
    public final LegacyKmsAeadParameters parameters;

    public LegacyKmsAeadKey(LegacyKmsAeadParameters legacyKmsAeadParameters, Bytes bytes, Integer num) {
        this.parameters = legacyKmsAeadParameters;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static LegacyKmsAeadKey create(LegacyKmsAeadParameters legacyKmsAeadParameters, Integer num) {
        Bytes copyFrom;
        LegacyKmsAeadParameters.Variant variant = legacyKmsAeadParameters.variant;
        if (variant == LegacyKmsAeadParameters.Variant.TINK) {
            if (num == null) {
                a$$ExternalSyntheticBUOutline0.m$6("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            copyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (variant != LegacyKmsAeadParameters.Variant.NO_PREFIX) {
                MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unknown Variant: ");
                return null;
            }
            if (num != null) {
                a$$ExternalSyntheticBUOutline0.m$6("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            copyFrom = Bytes.copyFrom(new byte[0]);
        }
        return new LegacyKmsAeadKey(legacyKmsAeadParameters, copyFrom, num);
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
