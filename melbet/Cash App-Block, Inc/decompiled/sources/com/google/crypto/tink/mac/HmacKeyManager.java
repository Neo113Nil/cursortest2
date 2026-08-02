package com.google.crypto.tink.mac;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.proto.KeyData;

/* loaded from: classes.dex */
public abstract class HmacKeyManager {
    public static final int FIPS;
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR;
    public static final AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1 KEY_DERIVER;
    public static final LegacyKeyManagerImpl legacyKeyManager;
    public static final PrimitiveConstructor$1 CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(HmacKey.class, ChunkedMac.class, new MacWrapper$$ExternalSyntheticLambda0(16));
    public static final PrimitiveConstructor$1 MAC_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(HmacKey.class, Mac.class, new MacWrapper$$ExternalSyntheticLambda0(17));

    static {
        com.google.crypto.tink.proto.HmacKey.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.HmacKey", Mac.class, KeyData.KeyMaterialType.SYMMETRIC);
        KEY_DERIVER = new AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1();
        KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(0);
        FIPS = 2;
    }
}
