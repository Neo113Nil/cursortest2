package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.proto.KeyData;

/* loaded from: classes.dex */
public abstract class XChaCha20Poly1305KeyManager {
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR;
    public static final AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1 KEY_DERIVER;
    public static final PrimitiveConstructor$1 X_CHA_CHA_20_POLY_1305_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(XChaCha20Poly1305Key.class, Aead.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(17));
    public static final LegacyKeyManagerImpl legacyKeyManager;

    static {
        com.google.crypto.tink.proto.XChaCha20Poly1305Key.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", Aead.class, KeyData.KeyMaterialType.SYMMETRIC);
        KEY_DERIVER = new AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1();
        KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(9);
    }
}
