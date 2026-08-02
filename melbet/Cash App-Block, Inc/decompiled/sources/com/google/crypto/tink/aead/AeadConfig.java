package com.google.crypto.tink.aead;

import androidx.datastore.core.SimpleActor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization;
import com.google.crypto.tink.aead.internal.AesEaxProtoSerialization;
import com.google.crypto.tink.aead.internal.AesGcmProtoSerialization;
import com.google.crypto.tink.aead.internal.AesGcmSivProtoSerialization;
import com.google.crypto.tink.aead.internal.ChaCha20Poly1305ProtoSerialization;
import com.google.crypto.tink.aead.internal.XAesGcmProtoSerialization;
import com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyManagerRegistry;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.MutableKeyCreationRegistry;
import com.google.crypto.tink.internal.MutableKeyDerivationRegistry;
import com.google.crypto.tink.internal.MutableParametersRegistry;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.MacConfig;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class AeadConfig {
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
        mutablePrimitiveRegistry.registerPrimitiveWrapper(AeadWrapper.WRAPPER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(AeadWrapper.LEGACY_FULL_AEAD_PRIMITIVE_CONSTRUCTOR);
        MacConfig.register();
        int i = AesCtrHmacAeadKeyManager.FIPS;
        if (!re$$ExternalSyntheticOutline0._isCompatible$1(i)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        ParametersSerializer$1 parametersSerializer$1 = AesCtrHmacAeadProtoSerialization.PARAMETERS_SERIALIZER;
        MutableSerializationRegistry mutableSerializationRegistry = MutableSerializationRegistry.GLOBAL_INSTANCE;
        mutableSerializationRegistry.registerParametersSerializer(AesCtrHmacAeadProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(AesCtrHmacAeadProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(AesCtrHmacAeadProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(AesCtrHmacAeadProtoSerialization.KEY_PARSER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(AesCtrHmacAeadKeyManager.AES_CTR_HMAC_AEAD_PRIMITIVE_CONSTRUCTOR);
        MutableParametersRegistry mutableParametersRegistry = MutableParametersRegistry.globalInstance;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", PredefinedAeadParameters.AES128_CTR_HMAC_SHA256);
        zzlj builder = AesCtrHmacAeadParameters.builder();
        builder.setAesKeySizeBytes(16);
        builder.setHmacKeySizeBytes(32);
        builder.setTagSizeBytes(16);
        builder.setIvSizeBytes(16);
        AesEaxParameters.Variant variant = AesEaxParameters.Variant.SHA256;
        builder.zzd = variant;
        AesEaxParameters.Variant variant2 = AesEaxParameters.Variant.NO_PREFIX$1;
        builder.zzf = variant2;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", builder.build());
        hashMap.put("AES256_CTR_HMAC_SHA256", PredefinedAeadParameters.AES256_CTR_HMAC_SHA256);
        zzlj builder2 = AesCtrHmacAeadParameters.builder();
        builder2.setAesKeySizeBytes(32);
        builder2.setHmacKeySizeBytes(32);
        builder2.setTagSizeBytes(32);
        builder2.setIvSizeBytes(16);
        builder2.zzd = variant;
        builder2.zzf = variant2;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", builder2.build());
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap));
        MutableKeyDerivationRegistry mutableKeyDerivationRegistry = MutableKeyDerivationRegistry.globalInstance;
        mutableKeyDerivationRegistry.add(AesCtrHmacAeadKeyManager.KEY_DERIVER, AesCtrHmacAeadParameters.class);
        MutableKeyCreationRegistry mutableKeyCreationRegistry = MutableKeyCreationRegistry.globalInstance;
        mutableKeyCreationRegistry.add(AesCtrHmacAeadKeyManager.KEY_CREATOR, AesCtrHmacAeadParameters.class);
        KeyManagerRegistry keyManagerRegistry = KeyManagerRegistry.GLOBAL_INSTANCE;
        keyManagerRegistry.registerKeyManagerWithFipsCompatibility(AesCtrHmacAeadKeyManager.legacyKeyManager, i, true);
        int i2 = AesGcmKeyManager.FIPS;
        if (!re$$ExternalSyntheticOutline0._isCompatible$1(i2)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        mutableSerializationRegistry.registerParametersSerializer(AesGcmProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(AesGcmProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(AesGcmProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(AesGcmProtoSerialization.KEY_PARSER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(AesGcmKeyManager.AES_GCM_PRIMITIVE_CONSTRUCTOR);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", PredefinedAeadParameters.AES128_GCM);
        SimpleActor builder3 = AesGcmParameters.builder();
        builder3.setIvSizeBytes();
        builder3.setKeySizeBytes(16);
        builder3.setTagSizeBytes();
        AesEaxParameters.Variant variant3 = AesEaxParameters.Variant.NO_PREFIX$2;
        builder3.remainingMessages = variant3;
        hashMap2.put("AES128_GCM_RAW", builder3.m1111build());
        hashMap2.put("AES256_GCM", PredefinedAeadParameters.AES256_GCM);
        SimpleActor builder4 = AesGcmParameters.builder();
        builder4.setIvSizeBytes();
        builder4.setKeySizeBytes(32);
        builder4.setTagSizeBytes();
        builder4.remainingMessages = variant3;
        hashMap2.put("AES256_GCM_RAW", builder4.m1111build());
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap2));
        mutableKeyDerivationRegistry.add(AesGcmKeyManager.KEY_DERIVER, AesGcmParameters.class);
        mutableKeyCreationRegistry.add(AesGcmKeyManager.KEY_CREATOR, AesGcmParameters.class);
        keyManagerRegistry.registerKeyManagerWithFipsCompatibility(AesGcmKeyManager.legacyKeyManager, i2, true);
        if (TinkFipsUtil.useOnlyFips()) {
            return;
        }
        PrimitiveConstructor$1 primitiveConstructor$1 = AesEaxKeyManager.AES_EAX_PRIMITIVE_CONSTRUCTOR;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Registering AES EAX is not supported in FIPS mode");
            return;
        }
        mutableSerializationRegistry.registerParametersSerializer(AesEaxProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(AesEaxProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(AesEaxProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(AesEaxProtoSerialization.KEY_PARSER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(AesEaxKeyManager.AES_EAX_PRIMITIVE_CONSTRUCTOR);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", PredefinedAeadParameters.AES128_EAX);
        SimpleActor builder5 = AesEaxParameters.builder();
        builder5.setIvSizeBytes(16);
        builder5.setKeySizeBytes(16);
        builder5.setTagSizeBytes();
        AesEaxParameters.Variant variant4 = AesEaxParameters.Variant.NO_PREFIX;
        builder5.remainingMessages = variant4;
        hashMap3.put("AES128_EAX_RAW", builder5.build());
        hashMap3.put("AES256_EAX", PredefinedAeadParameters.AES256_EAX);
        SimpleActor builder6 = AesEaxParameters.builder();
        builder6.setIvSizeBytes(16);
        builder6.setKeySizeBytes(32);
        builder6.setTagSizeBytes();
        builder6.remainingMessages = variant4;
        hashMap3.put("AES256_EAX_RAW", builder6.build());
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap3));
        mutableKeyCreationRegistry.add(AesEaxKeyManager.KEY_CREATOR, AesEaxParameters.class);
        keyManagerRegistry.registerKeyManager(AesEaxKeyManager.legacyKeyManager, true);
        PrimitiveConstructor$1 primitiveConstructor$12 = AesGcmSivKeyManager.AES_GCM_SIV_PRIMITIVE_CONSTRUCTOR;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        mutableSerializationRegistry.registerParametersSerializer(AesGcmSivProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(AesGcmSivProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(AesGcmSivProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(AesGcmSivProtoSerialization.KEY_PARSER);
        HashMap hashMap4 = new HashMap();
        KeysetHandle builder7 = AesGcmSivParameters.builder();
        builder7.setKeySizeBytes(16);
        AesEaxParameters.Variant variant5 = AesEaxParameters.Variant.TINK$3;
        builder7.annotationsMap = variant5;
        hashMap4.put("AES128_GCM_SIV", builder7.build());
        KeysetHandle builder8 = AesGcmSivParameters.builder();
        builder8.setKeySizeBytes(16);
        AesEaxParameters.Variant variant6 = AesEaxParameters.Variant.NO_PREFIX$3;
        builder8.annotationsMap = variant6;
        hashMap4.put("AES128_GCM_SIV_RAW", builder8.build());
        KeysetHandle builder9 = AesGcmSivParameters.builder();
        builder9.setKeySizeBytes(32);
        builder9.annotationsMap = variant5;
        hashMap4.put("AES256_GCM_SIV", builder9.build());
        KeysetHandle builder10 = AesGcmSivParameters.builder();
        builder10.setKeySizeBytes(32);
        builder10.annotationsMap = variant6;
        hashMap4.put("AES256_GCM_SIV_RAW", builder10.build());
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap4));
        mutableKeyDerivationRegistry.add(AesGcmSivKeyManager.KEY_DERIVER, AesGcmSivParameters.class);
        mutableKeyCreationRegistry.add(AesGcmSivKeyManager.KEY_CREATOR, AesGcmSivParameters.class);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(AesGcmSivKeyManager.AES_GCM_SIV_PRIMITIVE_CONSTRUCTOR);
        keyManagerRegistry.registerKeyManager(AesGcmSivKeyManager.legacyKeyManager, true);
        PrimitiveConstructor$1 primitiveConstructor$13 = ChaCha20Poly1305KeyManager.CHA_CHA_20_POLY_1305_PRIMITIVE_CONSTRUCTOR;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Registering ChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        mutableSerializationRegistry.registerParametersSerializer(ChaCha20Poly1305ProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(ChaCha20Poly1305ProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(ChaCha20Poly1305ProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(ChaCha20Poly1305ProtoSerialization.KEY_PARSER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(ChaCha20Poly1305KeyManager.CHA_CHA_20_POLY_1305_PRIMITIVE_CONSTRUCTOR);
        mutableKeyCreationRegistry.add(ChaCha20Poly1305KeyManager.KEY_CREATOR, ChaCha20Poly1305Parameters.class);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new ChaCha20Poly1305Parameters(AesEaxParameters.Variant.TINK$4));
        hashMap5.put("CHACHA20_POLY1305_RAW", new ChaCha20Poly1305Parameters(AesEaxParameters.Variant.NO_PREFIX$4));
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap5));
        keyManagerRegistry.registerKeyManager(ChaCha20Poly1305KeyManager.legacyKeyManager, true);
        PrimitiveConstructor$1 primitiveConstructor$14 = KmsAeadKeyManager.LEGACY_KMS_AEAD_PRIMITIVE_CONSTRUCTOR;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Registering KMS AEAD is not supported in FIPS mode");
            return;
        }
        mutableSerializationRegistry.registerParametersSerializer(LegacyKmsAeadProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(LegacyKmsAeadProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(LegacyKmsAeadProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(LegacyKmsAeadProtoSerialization.KEY_PARSER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(KmsAeadKeyManager.LEGACY_KMS_AEAD_PRIMITIVE_CONSTRUCTOR);
        mutableKeyCreationRegistry.add(KmsAeadKeyManager.KEY_CREATOR, LegacyKmsAeadParameters.class);
        keyManagerRegistry.registerKeyManager(KmsAeadKeyManager.legacyKeyManager, true);
        LegacyKeyManagerImpl legacyKeyManagerImpl = KmsEnvelopeAeadKeyManager.legacyKeyManager;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Registering KMS Envelope AEAD is not supported in FIPS mode");
            return;
        }
        mutableSerializationRegistry.registerParametersSerializer(LegacyKmsEnvelopeAeadProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(LegacyKmsEnvelopeAeadProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(LegacyKmsEnvelopeAeadProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(LegacyKmsEnvelopeAeadProtoSerialization.KEY_PARSER);
        mutableKeyCreationRegistry.add(KmsEnvelopeAeadKeyManager.KEY_CREATOR, LegacyKmsEnvelopeAeadParameters.class);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(KmsEnvelopeAeadKeyManager.LEGACY_KMS_ENVELOPE_AEAD_PRIMITIVE_CONSTRUCTOR);
        keyManagerRegistry.registerKeyManager(KmsEnvelopeAeadKeyManager.legacyKeyManager, true);
        PrimitiveConstructor$1 primitiveConstructor$15 = XChaCha20Poly1305KeyManager.X_CHA_CHA_20_POLY_1305_PRIMITIVE_CONSTRUCTOR;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Registering XChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        mutableSerializationRegistry.registerParametersSerializer(XChaCha20Poly1305ProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(XChaCha20Poly1305ProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(XChaCha20Poly1305ProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(XChaCha20Poly1305ProtoSerialization.KEY_PARSER);
        mutablePrimitiveRegistry.registerPrimitiveConstructor(XChaCha20Poly1305KeyManager.X_CHA_CHA_20_POLY_1305_PRIMITIVE_CONSTRUCTOR);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new XChaCha20Poly1305Parameters(AesEaxParameters.Variant.TINK$6));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new XChaCha20Poly1305Parameters(AesEaxParameters.Variant.NO_PREFIX$6));
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap6));
        mutableKeyCreationRegistry.add(XChaCha20Poly1305KeyManager.KEY_CREATOR, XChaCha20Poly1305Parameters.class);
        mutableKeyDerivationRegistry.add(XChaCha20Poly1305KeyManager.KEY_DERIVER, XChaCha20Poly1305Parameters.class);
        keyManagerRegistry.registerKeyManager(XChaCha20Poly1305KeyManager.legacyKeyManager, true);
        mutableSerializationRegistry.registerParametersSerializer(XAesGcmProtoSerialization.PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(XAesGcmProtoSerialization.PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(XAesGcmProtoSerialization.KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(XAesGcmProtoSerialization.KEY_PARSER);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", PredefinedAeadParameters.XAES_256_GCM_192_BIT_NONCE);
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", PredefinedAeadParameters.XAES_256_GCM_192_BIT_NONCE_NO_PREFIX);
        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", PredefinedAeadParameters.XAES_256_GCM_160_BIT_NONCE_NO_PREFIX);
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", PredefinedAeadParameters.X_AES_GCM_8_BYTE_SALT_NO_PREFIX);
        mutableParametersRegistry.putAll(Collections.unmodifiableMap(hashMap7));
        mutablePrimitiveRegistry.registerPrimitiveConstructor(XAesGcmKeyManager.X_AES_GCM_PRIMITVE_CONSTRUCTOR);
        mutableKeyCreationRegistry.add(XAesGcmKeyManager.KEY_CREATOR, XAesGcmParameters.class);
    }
}
