package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.proto.KeyData;

/* loaded from: classes.dex */
public abstract class ChaCha20Poly1305KeyManager {
    public static final PrimitiveConstructor$1 CHA_CHA_20_POLY_1305_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(ChaCha20Poly1305Key.class, Aead.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(5));
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(5);
    public static final LegacyKeyManagerImpl legacyKeyManager;

    static {
        com.google.crypto.tink.proto.ChaCha20Poly1305Key.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", Aead.class, KeyData.KeyMaterialType.SYMMETRIC);
    }
}
