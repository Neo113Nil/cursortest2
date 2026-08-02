package com.google.crypto.tink.mac;

import androidx.datastore.core.SimpleActor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.internal.zaaa;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyManagerRegistry;
import com.google.crypto.tink.internal.MutableKeyCreationRegistry;
import com.google.crypto.tink.internal.MutableKeyDerivationRegistry;
import com.google.crypto.tink.internal.MutableParametersRegistry;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.mac.internal.AesCmacProtoSerialization;
import com.google.crypto.tink.mac.internal.HmacProtoSerialization;
import com.google.crypto.tink.proto.RegistryConfig;
import com.squareup.wire.GrpcMethod;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class MacConfig {
    static {
        int i = RegistryConfig.CONFIG_NAME_FIELD_NUMBER;
        try {
            register();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void register() {
        MutablePrimitiveRegistry mutablePrimitiveRegistry = MutablePrimitiveRegistry.globalInstance;
        mutablePrimitiveRegistry.registerPrimitiveWrapper(MacWrapper.WRAPPER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(MacWrapper.LEGACY_FULL_MAC_PRIMITIVE_CONSTRUCTOR);
        mutablePrimitiveRegistry.registerPrimitiveWrapper(MacWrapper.WRAPPER$1);
        int i = HmacKeyManager.FIPS;
        if (!re$$ExternalSyntheticOutline0._isCompatible$1(i)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        zaaa zaaaVar = HmacProtoSerialization.OUTPUT_PREFIX_TYPE_CONVERTER;
        MutableSerializationRegistry mutableSerializationRegistry = MutableSerializationRegistry.GLOBAL_INSTANCE;
        mutableSerializationRegistry.registerParametersSerializer(HmacProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(HmacProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(HmacProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(HmacProtoSerialization.KEY_PARSER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(HmacKeyManager.CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(HmacKeyManager.MAC_PRIMITIVE_CONSTRUCTOR);
        MutableParametersRegistry mutableParametersRegistry = MutableParametersRegistry.globalInstance;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", PredefinedMacParameters.HMAC_SHA256_128BITTAG);
        SimpleActor builder = HmacParameters.builder();
        builder.scope = 32;
        builder.consumeMessage = 16;
        HmacParameters.Variant variant = HmacParameters.Variant.NO_PREFIX;
        builder.remainingMessages = variant;
        HmacParameters.HashType hashType = HmacParameters.HashType.SHA256;
        builder.messageQueue = hashType;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", builder.m1113build());
        SimpleActor builder2 = HmacParameters.builder();
        builder2.scope = 32;
        builder2.consumeMessage = 32;
        HmacParameters.Variant variant2 = HmacParameters.Variant.TINK;
        builder2.remainingMessages = variant2;
        builder2.messageQueue = hashType;
        hashMap.put("HMAC_SHA256_256BITTAG", builder2.m1113build());
        SimpleActor builder3 = HmacParameters.builder();
        builder3.scope = 32;
        builder3.consumeMessage = 32;
        builder3.remainingMessages = variant;
        builder3.messageQueue = hashType;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", builder3.m1113build());
        SimpleActor builder4 = HmacParameters.builder();
        builder4.scope = 64;
        builder4.consumeMessage = 16;
        builder4.remainingMessages = variant2;
        HmacParameters.HashType hashType2 = HmacParameters.HashType.SHA512;
        builder4.messageQueue = hashType2;
        hashMap.put("HMAC_SHA512_128BITTAG", builder4.m1113build());
        SimpleActor builder5 = HmacParameters.builder();
        builder5.scope = 64;
        builder5.consumeMessage = 16;
        builder5.remainingMessages = variant;
        builder5.messageQueue = hashType2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", builder5.m1113build());
        SimpleActor builder6 = HmacParameters.builder();
        builder6.scope = 64;
        builder6.consumeMessage = 32;
        builder6.remainingMessages = variant2;
        builder6.messageQueue = hashType2;
        hashMap.put("HMAC_SHA512_256BITTAG", builder6.m1113build());
        SimpleActor builder7 = HmacParameters.builder();
        builder7.scope = 64;
        builder7.consumeMessage = 32;
        builder7.remainingMessages = variant;
        builder7.messageQueue = hashType2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", builder7.m1113build());
        hashMap.put("HMAC_SHA512_512BITTAG", PredefinedMacParameters.HMAC_SHA512_512BITTAG);
        SimpleActor builder8 = HmacParameters.builder();
        builder8.scope = 64;
        builder8.consumeMessage = 64;
        builder8.remainingMessages = variant;
        builder8.messageQueue = hashType2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", builder8.m1113build());
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap));
        MutableKeyCreationRegistry mutableKeyCreationRegistry = MutableKeyCreationRegistry.globalInstance;
        mutableKeyCreationRegistry.add(HmacKeyManager.KEY_CREATOR, HmacParameters.class);
        MutableKeyDerivationRegistry.globalInstance.add(HmacKeyManager.KEY_DERIVER, HmacParameters.class);
        KeyManagerRegistry keyManagerRegistry = KeyManagerRegistry.GLOBAL_INSTANCE;
        keyManagerRegistry.registerKeyManagerWithFipsCompatibility(HmacKeyManager.legacyKeyManager, i, true);
        if (TinkFipsUtil.useOnlyFips()) {
            return;
        }
        HmacKeyManager$$ExternalSyntheticLambda2 hmacKeyManager$$ExternalSyntheticLambda2 = AesCmacKeyManager.KEY_CREATOR;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        mutableSerializationRegistry.registerParametersSerializer(AesCmacProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(AesCmacProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(AesCmacProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(AesCmacProtoSerialization.KEY_PARSER);
        mutableKeyCreationRegistry.add(AesCmacKeyManager.KEY_CREATOR, AesCmacParameters.class);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(AesCmacKeyManager.CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(AesCmacKeyManager.MAC_PRIMITIVE_CONSTRUCTOR);
        HashMap hashMap2 = new HashMap();
        AesCmacParameters aesCmacParameters = PredefinedMacParameters.AES_CMAC;
        hashMap2.put("AES_CMAC", aesCmacParameters);
        hashMap2.put("AES256_CMAC", aesCmacParameters);
        GrpcMethod builder9 = AesCmacParameters.builder();
        builder9.setKeySizeBytes(32);
        builder9.setTagSizeBytes(16);
        builder9.responseAdapter = AesCmacParameters.Variant.NO_PREFIX;
        hashMap2.put("AES256_CMAC_RAW", builder9.m4001build());
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap2));
        keyManagerRegistry.registerKeyManager(AesCmacKeyManager.legacyKeyManager, true);
    }
}
