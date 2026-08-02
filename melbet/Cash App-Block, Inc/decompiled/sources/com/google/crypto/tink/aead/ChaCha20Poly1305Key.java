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
public final class ChaCha20Poly1305Key extends AeadKey {
    public final Integer idRequirement;
    public final WireAdapter keyBytes;
    public final Bytes outputPrefix;
    public final ChaCha20Poly1305Parameters parameters;

    public ChaCha20Poly1305Key(ChaCha20Poly1305Parameters chaCha20Poly1305Parameters, WireAdapter wireAdapter, Bytes bytes, Integer num) {
        this.parameters = chaCha20Poly1305Parameters;
        this.keyBytes = wireAdapter;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static ChaCha20Poly1305Key create(AesEaxParameters.Variant variant, WireAdapter wireAdapter, Integer num) {
        Bytes tinkOutputPrefix;
        Bytes bytes = (Bytes) wireAdapter.adapter;
        AesEaxParameters.Variant variant2 = AesEaxParameters.Variant.NO_PREFIX$4;
        if (variant != variant2 && num == null) {
            XAesGcmKey$$ExternalSyntheticBUOutline0.m("For given Variant ", variant, " the value of idRequirement must be non-null");
            return null;
        }
        if (variant == variant2 && num != null) {
            a$$ExternalSyntheticBUOutline0.m$6("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bytes.data.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bytes.data.length);
        }
        ChaCha20Poly1305Parameters chaCha20Poly1305Parameters = new ChaCha20Poly1305Parameters(variant);
        if (variant == variant2) {
            tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
        } else if (variant == AesEaxParameters.Variant.CRUNCHY$4) {
            tinkOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(num.intValue());
        } else {
            if (variant != AesEaxParameters.Variant.TINK$4) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(variant, "Unknown Variant: ");
                return null;
            }
            tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        return new ChaCha20Poly1305Key(chaCha20Poly1305Parameters, wireAdapter, tinkOutputPrefix, num);
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
