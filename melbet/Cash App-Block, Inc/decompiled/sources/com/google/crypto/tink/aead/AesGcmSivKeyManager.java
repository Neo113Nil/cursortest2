package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.proto.KeyData;

/* loaded from: classes.dex */
public abstract class AesGcmSivKeyManager {
    public static final PrimitiveConstructor$1 AES_GCM_SIV_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(AesGcmSivKey.class, Aead.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(4));
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(4);
    public static final AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1 KEY_DERIVER = new AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1();
    public static final LegacyKeyManagerImpl legacyKeyManager;

    static {
        com.google.crypto.tink.proto.AesGcmSivKey.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.AesGcmSivKey", Aead.class, KeyData.KeyMaterialType.SYMMETRIC);
    }
}
