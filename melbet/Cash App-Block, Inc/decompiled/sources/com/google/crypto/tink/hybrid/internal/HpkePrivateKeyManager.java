package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.hybrid.HpkePrivateKey;
import com.google.crypto.tink.hybrid.HpkePublicKey;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.KeyData;

/* loaded from: classes.dex */
public abstract class HpkePrivateKeyManager {
    public static final PrimitiveConstructor$1 HYBRID_DECRYPT_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(HpkePrivateKey.class, HybridDecrypt.class, new MacWrapper$$ExternalSyntheticLambda0(11));
    public static final PrimitiveConstructor$1 HYBRID_ENCRYPT_PRIMITIVE_CONSTRUCTOR;
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR;
    public static final LegacyKeyManagerImpl.LegacyPrivateKeyManagerImpl legacyPrivateKeyManager;
    public static final LegacyKeyManagerImpl legacyPublicKeyManager;

    static {
        int i = 12;
        HYBRID_ENCRYPT_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(HpkePublicKey.class, HybridEncrypt.class, new MacWrapper$$ExternalSyntheticLambda0(i));
        com.google.crypto.tink.proto.HpkePrivateKey.parser();
        legacyPrivateKeyManager = new LegacyKeyManagerImpl.LegacyPrivateKeyManagerImpl("type.googleapis.com/google.crypto.tink.HpkePrivateKey", HybridDecrypt.class, KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE);
        com.google.crypto.tink.proto.HpkePublicKey.parser();
        legacyPublicKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.HpkePublicKey", HybridEncrypt.class, KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC);
        KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(i);
    }
}
