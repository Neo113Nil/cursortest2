package com.google.crypto.tink.daead;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import com.google.crypto.tink.proto.KeyData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public abstract class AesSivKeyManager {
    public static final PrimitiveConstructor$1 AES_SIV_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(AesSivKey.class, DeterministicAead.class, new AesSivKeyManager$$ExternalSyntheticLambda0(0));
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR;
    public static final AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1 KEY_DERIVER;
    public static final LegacyKeyManagerImpl legacyKeyManager;

    static {
        com.google.crypto.tink.proto.AesSivKey.parser();
        legacyKeyManager = new LegacyKeyManagerImpl("type.googleapis.com/google.crypto.tink.AesSivKey", DeterministicAead.class, KeyData.KeyMaterialType.SYMMETRIC);
        KEY_DERIVER = new AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1();
        KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(10);
    }

    public static void validateParameters(AesSivParameters aesSivParameters) {
        if (aesSivParameters.keySizeBytes == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(aesSivParameters.keySizeBytes, ". Valid keys must have 64 bytes.", new StringBuilder("invalid key size: ")));
    }
}
