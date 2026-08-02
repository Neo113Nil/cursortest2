package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KmsAeadKey;

/* loaded from: classes.dex */
public abstract class KmsAeadKeyManager {
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR;
    public static final PrimitiveConstructor$1 LEGACY_KMS_AEAD_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(LegacyKmsAeadKey.class, Aead.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(6));
    public static final LegacyKeyManagerImpl legacyKeyManager;

    static {
        KmsAeadKey.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.KmsAeadKey", Aead.class, KeyData.KeyMaterialType.REMOTE);
        KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(6);
    }
}
