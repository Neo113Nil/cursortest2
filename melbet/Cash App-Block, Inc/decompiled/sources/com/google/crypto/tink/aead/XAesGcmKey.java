package com.google.crypto.tink.aead;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.db.WireAdapter;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class XAesGcmKey extends AeadKey {
    public final Integer idRequirement;
    public final WireAdapter keyBytes;
    public final Bytes outputPrefix;
    public final XAesGcmParameters parameters;

    public XAesGcmKey(XAesGcmParameters xAesGcmParameters, WireAdapter wireAdapter, Bytes bytes, Integer num) {
        this.parameters = xAesGcmParameters;
        this.keyBytes = wireAdapter;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static XAesGcmKey create(XAesGcmParameters xAesGcmParameters, WireAdapter wireAdapter, Integer num) {
        Bytes tinkOutputPrefix;
        Bytes bytes = (Bytes) wireAdapter.adapter;
        AesEaxParameters.Variant variant = xAesGcmParameters.variant;
        AesEaxParameters.Variant variant2 = AesEaxParameters.Variant.NO_PREFIX$5;
        if (variant != variant2 && num == null) {
            XAesGcmKey$$ExternalSyntheticBUOutline0.m("For given Variant ", variant, " the value of idRequirement must be non-null");
            return null;
        }
        if (variant == variant2 && num != null) {
            a$$ExternalSyntheticBUOutline0.m$6("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bytes.data.length != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + bytes.data.length);
        }
        if (variant == variant2) {
            tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
        } else {
            if (variant != AesEaxParameters.Variant.TINK$5) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(variant, "Unknown Variant: ");
                return null;
            }
            tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        return new XAesGcmKey(xAesGcmParameters, wireAdapter, tinkOutputPrefix, num);
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
