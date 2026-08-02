package com.google.crypto.tink.hybrid;

import androidx.datastore.core.SimpleActor;
import com.google.android.gms.common.api.internal.zaaa;
import com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda0;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.PrimitiveRegistry;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.HpkeAead;
import com.google.crypto.tink.proto.HpkeKdf;
import com.google.crypto.tink.proto.HpkeKem;
import com.google.crypto.tink.proto.HpkeParams;
import com.google.crypto.tink.proto.HpkePublicKey;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public abstract class HpkeProtoSerialization {
    public static final zaaa AEAD_TYPE_CONVERTER;
    public static final zaaa KDF_TYPE_CONVERTER;
    public static final zaaa KEM_TYPE_CONVERTER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;
    public static final KeyParser$1 PRIVATE_KEY_PARSER;
    public static final KeySerializer$1 PRIVATE_KEY_SERIALIZER;
    public static final KeyParser$1 PUBLIC_KEY_PARSER;
    public static final KeySerializer$1 PUBLIC_KEY_SERIALIZER;
    public static final zaaa VARIANT_TYPE_CONVERTER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        Bytes bytesFromPrintableAscii2 = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(HpkeParameters.class, new AesSivKeyManager$$ExternalSyntheticLambda0(25));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(26));
        PUBLIC_KEY_SERIALIZER = new KeySerializer$1(HpkePublicKey.class, new AesSivKeyManager$$ExternalSyntheticLambda0(27));
        PUBLIC_KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii2, new AesSivKeyManager$$ExternalSyntheticLambda0(28));
        PRIVATE_KEY_SERIALIZER = new KeySerializer$1(HpkePrivateKey.class, new AesSivKeyManager$$ExternalSyntheticLambda0(29));
        PRIVATE_KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new MacWrapper$$ExternalSyntheticLambda0(1));
        PrimitiveRegistry.Builder builder = zaaa.builder();
        builder.add(OutputPrefixType.RAW, HpkeParameters.Variant.NO_PREFIX);
        builder.add(OutputPrefixType.TINK, HpkeParameters.Variant.TINK);
        OutputPrefixType outputPrefixType = OutputPrefixType.LEGACY;
        HpkeParameters.Variant variant = HpkeParameters.Variant.CRUNCHY;
        builder.add(outputPrefixType, variant);
        builder.add(OutputPrefixType.CRUNCHY, variant);
        VARIANT_TYPE_CONVERTER = builder.build();
        PrimitiveRegistry.Builder builder2 = zaaa.builder();
        builder2.add(HpkeKem.DHKEM_P256_HKDF_SHA256, HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256);
        builder2.add(HpkeKem.DHKEM_P384_HKDF_SHA384, HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384);
        builder2.add(HpkeKem.DHKEM_P521_HKDF_SHA512, HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512);
        builder2.add(HpkeKem.DHKEM_X25519_HKDF_SHA256, HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256);
        KEM_TYPE_CONVERTER = builder2.build();
        PrimitiveRegistry.Builder builder3 = zaaa.builder();
        builder3.add(HpkeKdf.HKDF_SHA256, HpkeParameters.KdfId.HKDF_SHA256);
        builder3.add(HpkeKdf.HKDF_SHA384, HpkeParameters.KdfId.HKDF_SHA384);
        builder3.add(HpkeKdf.HKDF_SHA512, HpkeParameters.KdfId.HKDF_SHA512);
        KDF_TYPE_CONVERTER = builder3.build();
        PrimitiveRegistry.Builder builder4 = zaaa.builder();
        builder4.add(HpkeAead.AES_128_GCM, HpkeParameters.AeadId.AES_128_GCM);
        builder4.add(HpkeAead.AES_256_GCM, HpkeParameters.AeadId.AES_256_GCM);
        builder4.add(HpkeAead.CHACHA20_POLY1305, HpkeParameters.AeadId.CHACHA20_POLY1305);
        AEAD_TYPE_CONVERTER = builder4.build();
    }

    public static HpkeParameters fromProtoParameters(OutputPrefixType outputPrefixType, HpkeParams hpkeParams) {
        SimpleActor builder = HpkeParameters.builder();
        builder.remainingMessages = (HpkeParameters.Variant) VARIANT_TYPE_CONVERTER.fromProtoEnum(outputPrefixType);
        builder.scope = (HpkeParameters.KemId) KEM_TYPE_CONVERTER.fromProtoEnum(hpkeParams.getKem());
        builder.consumeMessage = (HpkeParameters.KdfId) KDF_TYPE_CONVERTER.fromProtoEnum(hpkeParams.getKdf());
        builder.messageQueue = (HpkeParameters.AeadId) AEAD_TYPE_CONVERTER.fromProtoEnum(hpkeParams.getAead());
        return builder.m1112build();
    }

    public static HpkeParams toProtoParameters(HpkeParameters hpkeParameters) {
        HpkeParams.Builder newBuilder = HpkeParams.newBuilder();
        newBuilder.setKem((HpkeKem) KEM_TYPE_CONVERTER.toProtoEnum(hpkeParameters.kem));
        newBuilder.setKdf((HpkeKdf) KDF_TYPE_CONVERTER.toProtoEnum(hpkeParameters.kdf));
        newBuilder.setAead((HpkeAead) AEAD_TYPE_CONVERTER.toProtoEnum(hpkeParameters.aead));
        return (HpkeParams) newBuilder.build();
    }

    public static com.google.crypto.tink.proto.HpkePublicKey toProtoPublicKey(HpkePublicKey hpkePublicKey) {
        HpkePublicKey.Builder newBuilder = com.google.crypto.tink.proto.HpkePublicKey.newBuilder();
        newBuilder.setVersion$2();
        newBuilder.setParams$1(toProtoParameters(hpkePublicKey.parameters));
        byte[] byteArray = hpkePublicKey.publicKeyBytes.toByteArray();
        newBuilder.setPublicKey(ByteString.copyFrom(0, byteArray.length, byteArray));
        return (com.google.crypto.tink.proto.HpkePublicKey) newBuilder.build();
    }
}
