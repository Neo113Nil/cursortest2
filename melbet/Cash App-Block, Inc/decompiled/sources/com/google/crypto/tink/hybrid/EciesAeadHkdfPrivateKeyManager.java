package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.KeyData;

/* loaded from: classes.dex */
public abstract class EciesAeadHkdfPrivateKeyManager {
    public static final PrimitiveConstructor$1 HYBRID_DECRYPT_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(EciesPrivateKey.class, HybridDecrypt.class, new AesSivKeyManager$$ExternalSyntheticLambda0(22));
    public static final PrimitiveConstructor$1 HYBRID_ENCRYPT_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(EciesPublicKey.class, HybridEncrypt.class, new AesSivKeyManager$$ExternalSyntheticLambda0(23));
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR;
    public static final LegacyKeyManagerImpl.LegacyPrivateKeyManagerImpl legacyPrivateKeyManager;
    public static final LegacyKeyManagerImpl legacyPublicKeyManager;

    static {
        EciesAeadHkdfPrivateKey.parser();
        legacyPrivateKeyManager = new LegacyKeyManagerImpl.LegacyPrivateKeyManagerImpl("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", HybridDecrypt.class, KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE);
        EciesAeadHkdfPublicKey.parser();
        legacyPublicKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", HybridEncrypt.class, KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC);
        KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(11);
    }
}
