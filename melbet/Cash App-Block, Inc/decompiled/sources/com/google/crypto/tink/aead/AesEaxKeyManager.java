package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.proto.KeyData;

/* loaded from: classes.dex */
public abstract class AesEaxKeyManager {
    public static final PrimitiveConstructor$1 AES_EAX_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(AesEaxKey.class, Aead.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(2));
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR;
    public static final LegacyKeyManagerImpl legacyKeyManager;

    static {
        com.google.crypto.tink.proto.AesEaxKey.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.AesEaxKey", Aead.class, KeyData.KeyMaterialType.SYMMETRIC);
        KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(2);
    }
}
