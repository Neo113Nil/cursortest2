package com.google.crypto.tink.mac;

import androidx.datastore.core.SimpleActor;
import androidx.room.TransactorKt;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.hybrid.EciesPrivateKey;
import com.google.crypto.tink.hybrid.EciesPublicKey;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.hybrid.HpkePrivateKey;
import com.google.crypto.tink.hybrid.HpkeProtoSerialization;
import com.google.crypto.tink.hybrid.HpkePublicKey;
import com.google.crypto.tink.hybrid.internal.EciesProtoSerialization;
import com.google.crypto.tink.hybrid.internal.HpkeDecrypt;
import com.google.crypto.tink.hybrid.internal.HpkeEncrypt;
import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.crypto.tink.hybrid.internal.LegacyFullHybridDecrypt;
import com.google.crypto.tink.hybrid.internal.LegacyFullHybridEncrypt;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.KeyParser$KeyParsingFunction;
import com.google.crypto.tink.internal.KeySerializer$KeySerializationFunction;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.ParametersParser$ParametersParsingFunction;
import com.google.crypto.tink.internal.ParametersSerializer$ParametersSerializationFunction;
import com.google.crypto.tink.internal.PrimitiveConstructor$PrimitiveConstructionFunction;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.mac.internal.AesCmacProtoSerialization;
import com.google.crypto.tink.mac.internal.ChunkedHmacImpl;
import com.google.crypto.tink.mac.internal.HmacProtoSerialization;
import com.google.crypto.tink.mac.internal.LegacyFullMac;
import com.google.crypto.tink.proto.AesCmacKey;
import com.google.crypto.tink.proto.AesCmacKeyFormat;
import com.google.crypto.tink.proto.AesCmacParams;
import com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.PrfMac;
import com.google.crypto.tink.util.Bytes;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.db.WireAdapter;
import com.squareup.wire.GrpcMethod;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import okhttp3.ConnectionPool;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final /* synthetic */ class MacWrapper$$ExternalSyntheticLambda0 implements KeyParser$KeyParsingFunction, PrimitiveConstructor$PrimitiveConstructionFunction, ParametersSerializer$ParametersSerializationFunction, ParametersParser$ParametersParsingFunction, KeySerializer$KeySerializationFunction {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MacWrapper$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new GeneralSecurityException(str + obj);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor$PrimitiveConstructionFunction
    public Object constructPrimitive(TransactorKt transactorKt) {
        switch (this.$r8$classId) {
            case 0:
                return LegacyFullMac.create((LegacyProtoKey) transactorKt);
            case 3:
                return LegacyFullHybridDecrypt.create((LegacyProtoKey) transactorKt);
            case 4:
                return LegacyFullHybridEncrypt.create((LegacyProtoKey) transactorKt);
            case 11:
                return HpkeDecrypt.create((HpkePrivateKey) transactorKt);
            case 12:
                return HpkeEncrypt.create((HpkePublicKey) transactorKt);
            case 14:
                AesCmacKey aesCmacKey = (AesCmacKey) transactorKt;
                if (aesCmacKey.parameters.keySizeBytes == 32) {
                    return ChunkedHmacImpl.create(aesCmacKey);
                }
                a$$ExternalSyntheticBUOutline0.m$6("AesCmacKey size wrong, must be 32 bytes");
                return null;
            case 15:
                AesCmacKey aesCmacKey2 = (AesCmacKey) transactorKt;
                if (aesCmacKey2.parameters.keySizeBytes == 32) {
                    return PrfMac.create(aesCmacKey2);
                }
                a$$ExternalSyntheticBUOutline0.m$6("AesCmacKey size wrong, must be 32 bytes");
                return null;
            case 16:
                return new ChunkedHmacImpl();
            default:
                return PrfMac.create((HmacKey) transactorKt);
        }
    }

    @Override // com.google.crypto.tink.internal.KeyParser$KeyParsingFunction
    public TransactorKt parseKey(Serialization serialization) {
        int i = this.$r8$classId;
        EciesParameters.CurveType curveType = EciesParameters.CurveType.X25519;
        boolean z = false;
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        switch (i) {
            case 1:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(protoKeySerialization.typeUrl, "Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ");
                    return null;
                }
                try {
                    com.google.crypto.tink.proto.HpkePrivateKey parseFrom = com.google.crypto.tink.proto.HpkePrivateKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    com.google.crypto.tink.proto.HpkePublicKey publicKey = parseFrom.getPublicKey();
                    if (publicKey.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    HpkeParameters fromProtoParameters = HpkeProtoSerialization.fromProtoParameters(protoKeySerialization.outputPrefixType, publicKey.getParams());
                    HpkeParameters.KemId kemId = fromProtoParameters.kem;
                    return HpkePrivateKey.create(HpkePublicKey.create(fromProtoParameters, Bytes.copyFrom(ConscryptUtil.toBigEndianBytesOfFixedLength(HpkeUtil.getEncodedPublicKeyLength(kemId), ConscryptUtil.fromUnsignedBigEndianBytes(publicKey.getPublicKey().toByteArray()))), protoKeySerialization.idRequirement), new WireAdapter(Bytes.copyFrom(ConscryptUtil.toBigEndianBytesOfFixedLength(HpkeUtil.getEncodedPrivateKeyLength(kemId), ConscryptUtil.fromUnsignedBigEndianBytes(parseFrom.getPrivateKey().toByteArray())))));
                } catch (InvalidProtocolBufferException unused) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing HpkePrivateKey failed");
                    return null;
                }
            case 8:
                String str = protoKeySerialization.typeUrl;
                Integer num = protoKeySerialization.idRequirement;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(protoKeySerialization.typeUrl, "Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ");
                    return null;
                }
                try {
                    EciesAeadHkdfPublicKey parseFrom2 = EciesAeadHkdfPublicKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom2.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EciesParameters fromProtoParameters2 = EciesProtoSerialization.fromProtoParameters(protoKeySerialization.outputPrefixType, parseFrom2.getParams());
                    if (!fromProtoParameters2.curveType.equals(curveType)) {
                        return EciesPublicKey.createForNistCurve(fromProtoParameters2, new ECPoint(ConscryptUtil.fromUnsignedBigEndianBytes(parseFrom2.getX().toByteArray()), ConscryptUtil.fromUnsignedBigEndianBytes(parseFrom2.getY().toByteArray())), num);
                    }
                    if (parseFrom2.getY().size() == 0) {
                        return EciesPublicKey.createForCurveX25519(fromProtoParameters2, Bytes.copyFrom(parseFrom2.getX().toByteArray()), num);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused2) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing EcdsaPublicKey failed");
                    return null;
                }
            case 10:
                String str2 = protoKeySerialization.typeUrl;
                Integer num2 = protoKeySerialization.idRequirement;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(protoKeySerialization.typeUrl, "Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ");
                    return null;
                }
                try {
                    EciesAeadHkdfPrivateKey parseFrom3 = EciesAeadHkdfPrivateKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom3.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EciesAeadHkdfPublicKey publicKey2 = parseFrom3.getPublicKey();
                    if (publicKey2.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EciesParameters fromProtoParameters3 = EciesProtoSerialization.fromProtoParameters(protoKeySerialization.outputPrefixType, publicKey2.getParams());
                    return fromProtoParameters3.curveType.equals(curveType) ? EciesPrivateKey.createForCurveX25519(EciesPublicKey.createForCurveX25519(fromProtoParameters3, Bytes.copyFrom(publicKey2.getX().toByteArray()), num2), new WireAdapter(Bytes.copyFrom(parseFrom3.getKeyValue().toByteArray()))) : EciesPrivateKey.createForNistCurve(EciesPublicKey.createForNistCurve(fromProtoParameters3, new ECPoint(ConscryptUtil.fromUnsignedBigEndianBytes(publicKey2.getX().toByteArray()), ConscryptUtil.fromUnsignedBigEndianBytes(publicKey2.getY().toByteArray())), num2), new ConnectionPool(ConscryptUtil.fromUnsignedBigEndianBytes(parseFrom3.getKeyValue().toByteArray())));
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused3) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing EcdsaPrivateKey failed");
                    return null;
                }
            case 21:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    com.google.crypto.tink.proto.AesCmacKey parseFrom4 = com.google.crypto.tink.proto.AesCmacKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom4.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    GrpcMethod builder = AesCmacParameters.builder();
                    builder.setKeySizeBytes(parseFrom4.getKeyValue().size());
                    builder.setTagSizeBytes(parseFrom4.getParams().getTagSize());
                    builder.responseAdapter = AesCmacProtoSerialization.toVariant(protoKeySerialization.outputPrefixType);
                    AesCmacParameters m4001build = builder.m4001build();
                    n nVar = new n(10, z);
                    nVar.setParameters(m4001build);
                    nVar.setAesKeyBytes(new WireAdapter(Bytes.copyFrom(parseFrom4.getKeyValue().toByteArray())));
                    nVar.setIdRequirement(protoKeySerialization.idRequirement);
                    return nVar.m2162build();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused4) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing AesCmacKey failed");
                    return null;
                }
            default:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to HmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    com.google.crypto.tink.proto.HmacKey parseFrom5 = com.google.crypto.tink.proto.HmacKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom5.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    SimpleActor builder2 = HmacParameters.builder();
                    builder2.scope = Integer.valueOf(parseFrom5.getKeyValue().size());
                    builder2.consumeMessage = Integer.valueOf(parseFrom5.getParams().getTagSize());
                    builder2.messageQueue = (HmacParameters.HashType) HmacProtoSerialization.HASH_TYPE_CONVERTER.fromProtoEnum(parseFrom5.getParams().getHash());
                    builder2.remainingMessages = (HmacParameters.Variant) HmacProtoSerialization.OUTPUT_PREFIX_TYPE_CONVERTER.fromProtoEnum(protoKeySerialization.outputPrefixType);
                    HmacParameters m1113build = builder2.m1113build();
                    n nVar2 = new n(11, z);
                    nVar2.setParameters(m1113build);
                    nVar2.setKeyBytes(new WireAdapter(Bytes.copyFrom(parseFrom5.getKeyValue().toByteArray())));
                    nVar2.setIdRequirement(protoKeySerialization.idRequirement);
                    return nVar2.m2163build();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused5) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing HmacKey failed");
                    return null;
                }
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersParser$ParametersParsingFunction
    public Parameters parseParameters(WorkLauncherImpl workLauncherImpl) {
        switch (this.$r8$classId) {
            case 6:
                KeyTemplate keyTemplate = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate.getTypeUrl(), "Wrong type URL in call to EciesProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    return EciesProtoSerialization.fromProtoParameters(keyTemplate.getOutputPrefixType(), EciesAeadHkdfKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry()).getParams());
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
                }
            case 19:
                KeyTemplate keyTemplate2 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate2.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate2.getTypeUrl(), "Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    AesCmacKeyFormat parseFrom = AesCmacKeyFormat.parseFrom(keyTemplate2.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    GrpcMethod builder = AesCmacParameters.builder();
                    builder.setKeySizeBytes(parseFrom.getKeySize());
                    builder.setTagSizeBytes(parseFrom.getParams().getTagSize());
                    builder.responseAdapter = AesCmacProtoSerialization.toVariant(keyTemplate2.getOutputPrefixType());
                    return builder.m4001build();
                } catch (InvalidProtocolBufferException e2) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
                }
            default:
                KeyTemplate keyTemplate3 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate3.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate3.getTypeUrl(), "Wrong type URL in call to HmacProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    HmacKeyFormat parseFrom2 = HmacKeyFormat.parseFrom(keyTemplate3.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom2.getVersion() != 0) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + parseFrom2.getVersion());
                    }
                    SimpleActor builder2 = HmacParameters.builder();
                    builder2.scope = Integer.valueOf(parseFrom2.getKeySize());
                    builder2.consumeMessage = Integer.valueOf(parseFrom2.getParams().getTagSize());
                    builder2.messageQueue = (HmacParameters.HashType) HmacProtoSerialization.HASH_TYPE_CONVERTER.fromProtoEnum(parseFrom2.getParams().getHash());
                    builder2.remainingMessages = (HmacParameters.Variant) HmacProtoSerialization.OUTPUT_PREFIX_TYPE_CONVERTER.fromProtoEnum(keyTemplate3.getOutputPrefixType());
                    return builder2.m1113build();
                } catch (InvalidProtocolBufferException e3) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e3);
                }
        }
    }

    @Override // com.google.crypto.tink.internal.KeySerializer$KeySerializationFunction
    public ProtoKeySerialization serializeKey(TransactorKt transactorKt) {
        int i = this.$r8$classId;
        KeyData.KeyMaterialType keyMaterialType = KeyData.KeyMaterialType.SYMMETRIC;
        switch (i) {
            case 7:
                EciesPublicKey eciesPublicKey = (EciesPublicKey) transactorKt;
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", EciesProtoSerialization.toProtoPublicKey(eciesPublicKey).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, (OutputPrefixType) EciesProtoSerialization.VARIANT_CONVERTER.toProtoEnum(eciesPublicKey.parameters.variant), eciesPublicKey.idRequirement);
            case 9:
                EciesPrivateKey eciesPrivateKey = (EciesPrivateKey) transactorKt;
                EciesAeadHkdfPrivateKey.Builder newBuilder = EciesAeadHkdfPrivateKey.newBuilder();
                newBuilder.copyOnWrite();
                ((EciesAeadHkdfPrivateKey) newBuilder.instance).version_ = 0;
                EciesAeadHkdfPublicKey protoPublicKey = EciesProtoSerialization.toProtoPublicKey(eciesPrivateKey.publicKey);
                newBuilder.copyOnWrite();
                EciesAeadHkdfPrivateKey.access$300((EciesAeadHkdfPrivateKey) newBuilder.instance, protoPublicKey);
                EciesParameters eciesParameters = eciesPrivateKey.publicKey.parameters;
                EciesParameters.CurveType curveType = eciesParameters.curveType;
                if (curveType.equals(EciesParameters.CurveType.X25519)) {
                    byte[] byteArray = ((Bytes) eciesPrivateKey.x25519PrivateKeyBytes.adapter).toByteArray();
                    ByteString.LiteralByteString copyFrom = ByteString.copyFrom(0, byteArray.length, byteArray);
                    newBuilder.copyOnWrite();
                    EciesAeadHkdfPrivateKey.access$600((EciesAeadHkdfPrivateKey) newBuilder.instance, copyFrom);
                } else {
                    byte[] bigEndianBytesOfFixedLength = ConscryptUtil.toBigEndianBytesOfFixedLength(EciesProtoSerialization.getEncodingLength(curveType), (BigInteger) eciesPrivateKey.nistPrivateKeyValue.delegate);
                    ByteString.LiteralByteString copyFrom2 = ByteString.copyFrom(0, bigEndianBytesOfFixedLength.length, bigEndianBytesOfFixedLength);
                    newBuilder.copyOnWrite();
                    EciesAeadHkdfPrivateKey.access$600((EciesAeadHkdfPrivateKey) newBuilder.instance, copyFrom2);
                }
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((EciesAeadHkdfPrivateKey) newBuilder.build()).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, (OutputPrefixType) EciesProtoSerialization.VARIANT_CONVERTER.toProtoEnum(eciesParameters.variant), eciesPrivateKey.getIdRequirementOrNull());
            case 13:
                ProtoKeySerialization protoKeySerialization = ((LegacyProtoKey) transactorKt).serialization;
                LegacyProtoKey.throwIfMissingAccess(protoKeySerialization);
                return protoKeySerialization;
            case 20:
                AesCmacKey aesCmacKey = (AesCmacKey) transactorKt;
                AesCmacKey.Builder newBuilder2 = com.google.crypto.tink.proto.AesCmacKey.newBuilder();
                AesCmacParameters aesCmacParameters = aesCmacKey.parameters;
                AesCmacParams.Builder newBuilder3 = AesCmacParams.newBuilder();
                newBuilder3.setTagSize(aesCmacParameters.tagSizeBytes);
                newBuilder2.setParams((AesCmacParams) newBuilder3.build());
                byte[] byteArray2 = ((Bytes) aesCmacKey.aesKeyBytes.adapter).toByteArray();
                newBuilder2.setKeyValue(ByteString.copyFrom(0, byteArray2.length, byteArray2));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesCmacKey", ((com.google.crypto.tink.proto.AesCmacKey) newBuilder2.build()).toByteString(), keyMaterialType, AesCmacProtoSerialization.toOutputPrefixType(aesCmacKey.parameters.variant), aesCmacKey.idRequirement);
            default:
                HmacKey hmacKey = (HmacKey) transactorKt;
                HmacKey.Builder newBuilder4 = com.google.crypto.tink.proto.HmacKey.newBuilder();
                HmacParameters hmacParameters = hmacKey.parameters;
                HmacParams.Builder newBuilder5 = HmacParams.newBuilder();
                newBuilder5.setTagSize$1(hmacParameters.tagSizeBytes);
                newBuilder5.setHash((HashType) HmacProtoSerialization.HASH_TYPE_CONVERTER.toProtoEnum(hmacParameters.hashType));
                newBuilder4.setParams((HmacParams) newBuilder5.build());
                byte[] byteArray3 = ((Bytes) hmacKey.keyBytes.adapter).toByteArray();
                newBuilder4.setKeyValue$8(ByteString.copyFrom(0, byteArray3.length, byteArray3));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.HmacKey", ((com.google.crypto.tink.proto.HmacKey) newBuilder4.build()).toByteString(), keyMaterialType, (OutputPrefixType) HmacProtoSerialization.OUTPUT_PREFIX_TYPE_CONVERTER.toProtoEnum(hmacKey.parameters.variant), hmacKey.idRequirement);
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer$ParametersSerializationFunction
    public WorkLauncherImpl serializeParameters(Parameters parameters) {
        switch (this.$r8$classId) {
            case 5:
                EciesParameters eciesParameters = (EciesParameters) parameters;
                KeyTemplate.Builder newBuilder = KeyTemplate.newBuilder();
                newBuilder.setTypeUrl$1("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                EciesAeadHkdfKeyFormat.Builder newBuilder2 = EciesAeadHkdfKeyFormat.newBuilder();
                newBuilder2.setParams(EciesProtoSerialization.toProtoParameters(eciesParameters));
                newBuilder.setValue$1(((EciesAeadHkdfKeyFormat) newBuilder2.build()).toByteString());
                newBuilder.setOutputPrefixType((OutputPrefixType) EciesProtoSerialization.VARIANT_CONVERTER.toProtoEnum(eciesParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder.build());
            case 18:
                AesCmacParameters aesCmacParameters = (AesCmacParameters) parameters;
                KeyTemplate.Builder newBuilder3 = KeyTemplate.newBuilder();
                newBuilder3.setTypeUrl$1("type.googleapis.com/google.crypto.tink.AesCmacKey");
                AesCmacKeyFormat.Builder newBuilder4 = AesCmacKeyFormat.newBuilder();
                AesCmacParams.Builder newBuilder5 = AesCmacParams.newBuilder();
                newBuilder5.setTagSize(aesCmacParameters.tagSizeBytes);
                newBuilder4.setParams$1((AesCmacParams) newBuilder5.build());
                newBuilder4.setKeySize(aesCmacParameters.keySizeBytes);
                newBuilder3.setValue$1(((AesCmacKeyFormat) newBuilder4.build()).toByteString());
                newBuilder3.setOutputPrefixType(AesCmacProtoSerialization.toOutputPrefixType(aesCmacParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder3.build());
            default:
                HmacParameters hmacParameters = (HmacParameters) parameters;
                KeyTemplate.Builder newBuilder6 = KeyTemplate.newBuilder();
                newBuilder6.setTypeUrl$1("type.googleapis.com/google.crypto.tink.HmacKey");
                HmacKeyFormat.Builder newBuilder7 = HmacKeyFormat.newBuilder();
                HmacParams.Builder newBuilder8 = HmacParams.newBuilder();
                newBuilder8.setTagSize$1(hmacParameters.tagSizeBytes);
                newBuilder8.setHash((HashType) HmacProtoSerialization.HASH_TYPE_CONVERTER.toProtoEnum(hmacParameters.hashType));
                newBuilder7.setParams$1((HmacParams) newBuilder8.build());
                newBuilder7.setKeySize$5(hmacParameters.keySizeBytes);
                newBuilder6.setValue$1(((HmacKeyFormat) newBuilder7.build()).toByteString());
                newBuilder6.setOutputPrefixType((OutputPrefixType) HmacProtoSerialization.OUTPUT_PREFIX_TYPE_CONVERTER.toProtoEnum(hmacParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder6.build());
        }
    }
}
