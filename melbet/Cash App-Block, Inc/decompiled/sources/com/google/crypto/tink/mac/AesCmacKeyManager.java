package com.google.crypto.tink.mac;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.proto.KeyData;

/* loaded from: classes.dex */
public abstract class AesCmacKeyManager {
    public static final LegacyKeyManagerImpl legacyKeyManager;
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(14);
    public static final PrimitiveConstructor$1 CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(AesCmacKey.class, ChunkedMac.class, new MacWrapper$$ExternalSyntheticLambda0(14));
    public static final PrimitiveConstructor$1 MAC_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(AesCmacKey.class, Mac.class, new MacWrapper$$ExternalSyntheticLambda0(15));

    static {
        com.google.crypto.tink.proto.AesCmacKey.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.AesCmacKey", Mac.class, KeyData.KeyMaterialType.SYMMETRIC);
    }
}
