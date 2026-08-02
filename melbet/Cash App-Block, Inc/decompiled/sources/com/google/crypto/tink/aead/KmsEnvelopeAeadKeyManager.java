package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKey;

/* loaded from: classes.dex */
public abstract class KmsEnvelopeAeadKeyManager {
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR;
    public static final PrimitiveConstructor$1 LEGACY_KMS_ENVELOPE_AEAD_PRIMITIVE_CONSTRUCTOR;
    public static final LegacyKeyManagerImpl legacyKeyManager;

    static {
        KmsEnvelopeAeadKey.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", Aead.class, KeyData.KeyMaterialType.SYMMETRIC);
        KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(7);
        LEGACY_KMS_ENVELOPE_AEAD_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(LegacyKmsEnvelopeAeadKey.class, Aead.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(7));
    }
}
