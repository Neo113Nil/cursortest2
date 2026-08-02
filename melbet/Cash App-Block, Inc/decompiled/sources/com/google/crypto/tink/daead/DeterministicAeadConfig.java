package com.google.crypto.tink.daead;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.daead.internal.AesSivProtoSerialization;
import com.google.crypto.tink.internal.KeyManagerRegistry;
import com.google.crypto.tink.internal.MutableKeyCreationRegistry;
import com.google.crypto.tink.internal.MutableKeyDerivationRegistry;
import com.google.crypto.tink.internal.MutableParametersRegistry;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class DeterministicAeadConfig {
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
        mutablePrimitiveRegistry.registerPrimitiveWrapper(DeterministicAeadWrapper.WRAPPER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(DeterministicAeadWrapper.LEGACY_FULL_DAEAD_PRIMITIVE_CONSTRUCTOR);
        if (TinkFipsUtil.useOnlyFips()) {
            return;
        }
        PrimitiveConstructor$1 primitiveConstructor$1 = AesSivKeyManager.AES_SIV_PRIMITIVE_CONSTRUCTOR;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Registering AES SIV is not supported in FIPS mode");
            return;
        }
        ParametersSerializer$1 parametersSerializer$1 = AesSivProtoSerialization.PARAMETERS_SERIALIZER;
        MutableSerializationRegistry mutableSerializationRegistry = MutableSerializationRegistry.GLOBAL_INSTANCE;
        mutableSerializationRegistry.registerParametersSerializer(AesSivProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(AesSivProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(AesSivProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(AesSivProtoSerialization.KEY_PARSER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(AesSivKeyManager.AES_SIV_PRIMITIVE_CONSTRUCTOR);
        MutableParametersRegistry mutableParametersRegistry = MutableParametersRegistry.globalInstance;
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", PredefinedDeterministicAeadParameters.AES256_SIV);
        KeysetHandle builder = AesSivParameters.builder();
        builder.setKeySizeBytes(64);
        builder.annotationsMap = AesSivParameters.Variant.NO_PREFIX;
        hashMap.put("AES256_SIV_RAW", builder.m2033build());
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap));
        MutableKeyDerivationRegistry.globalInstance.add(AesSivKeyManager.KEY_DERIVER, AesSivParameters.class);
        MutableKeyCreationRegistry.globalInstance.add(AesSivKeyManager.KEY_CREATOR, AesSivParameters.class);
        KeyManagerRegistry.GLOBAL_INSTANCE.registerKeyManager(AesSivKeyManager.legacyKeyManager, true);
    }
}
