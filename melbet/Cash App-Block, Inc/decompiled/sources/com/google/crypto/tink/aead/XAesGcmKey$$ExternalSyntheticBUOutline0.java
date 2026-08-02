package com.google.crypto.tink.aead;

import androidx.datastore.core.SimpleActor;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.TransactorKt;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.KmsClients;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization;
import com.google.crypto.tink.aead.internal.AesEaxProtoSerialization;
import com.google.crypto.tink.aead.internal.AesGcmProtoSerialization;
import com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce;
import com.google.crypto.tink.aead.subtle.AesGcmSiv;
import com.google.crypto.tink.internal.KeyParser$KeyParsingFunction;
import com.google.crypto.tink.internal.KeySerializer$KeySerializationFunction;
import com.google.crypto.tink.internal.ParametersParser$ParametersParsingFunction;
import com.google.crypto.tink.internal.ParametersSerializer$ParametersSerializationFunction;
import com.google.crypto.tink.internal.PrimitiveConstructor$PrimitiveConstructionFunction;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.AesCtrHmacAeadKey;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesCtrKeyFormat;
import com.google.crypto.tink.proto.AesCtrParams;
import com.google.crypto.tink.proto.AesEaxKey;
import com.google.crypto.tink.proto.AesEaxKeyFormat;
import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.KmsAeadKey;
import com.google.crypto.tink.proto.KmsAeadKeyFormat;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKey;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.AesEaxJce;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.crypto.tink.subtle.EncryptThenAuthenticate;
import com.google.crypto.tink.subtle.XChaCha20Poly1305;
import com.google.crypto.tink.util.Bytes;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.db.WireAdapter;
import java.security.GeneralSecurityException;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final /* synthetic */ class XAesGcmKey$$ExternalSyntheticBUOutline0 implements PrimitiveConstructor$PrimitiveConstructionFunction, ParametersSerializer$ParametersSerializationFunction, ParametersParser$ParametersParsingFunction, KeySerializer$KeySerializationFunction, KeyParser$KeyParsingFunction {
    public final /* synthetic */ int $r8$classId;

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor$PrimitiveConstructionFunction
    public Object constructPrimitive(TransactorKt transactorKt) {
        switch (this.$r8$classId) {
            case 1:
                return EncryptThenAuthenticate.create((AesCtrHmacAeadKey) transactorKt);
            case 2:
                return AesEaxJce.create((AesEaxKey) transactorKt);
            case 3:
                return AesGcmJce.create((AesGcmKey) transactorKt);
            case 4:
                return AesGcmSiv.create((AesGcmSivKey) transactorKt);
            case 5:
                ChaCha20Poly1305Key chaCha20Poly1305Key = (ChaCha20Poly1305Key) transactorKt;
                return ChaCha20Poly1305Jce.isSupported() ? ChaCha20Poly1305Jce.create(chaCha20Poly1305Key) : AesGcmJce.create(chaCha20Poly1305Key);
            case 6:
                KmsClients.get(((LegacyKmsAeadKey) transactorKt).parameters.keyUri);
                throw null;
            case 7:
                KmsClients.get(((LegacyKmsEnvelopeAeadKey) transactorKt).parameters.kekUri);
                throw null;
            case 16:
                return AesGcmJce.create((XAesGcmKey) transactorKt);
            default:
                XChaCha20Poly1305Key xChaCha20Poly1305Key = (XChaCha20Poly1305Key) transactorKt;
                return AesGcmJce.isSupported() ? AesGcmJce.create(xChaCha20Poly1305Key) : XChaCha20Poly1305.create(xChaCha20Poly1305Key);
        }
    }

    @Override // com.google.crypto.tink.internal.KeyParser$KeyParsingFunction
    public TransactorKt parseKey(Serialization serialization) {
        boolean z = false;
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        switch (this.$r8$classId) {
            case 11:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    KmsAeadKey parseFrom = KmsAeadKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom.getVersion() == 0) {
                        return LegacyKmsAeadKey.create(new LegacyKmsAeadParameters(parseFrom.getParams().getKeyUri(), LegacyKmsAeadProtoSerialization.toVariant(protoKeySerialization.outputPrefixType)), protoKeySerialization.idRequirement);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + parseFrom);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            case 15:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    KmsEnvelopeAeadKey parseFrom2 = KmsEnvelopeAeadKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom2.getVersion() == 0) {
                        return LegacyKmsEnvelopeAeadKey.create(LegacyKmsEnvelopeAeadProtoSerialization.parseParameters(parseFrom2.getParams(), protoKeySerialization.outputPrefixType), protoKeySerialization.idRequirement);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + parseFrom2);
                } catch (InvalidProtocolBufferException e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            case 21:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    com.google.crypto.tink.proto.AesCtrHmacAeadKey parseFrom3 = com.google.crypto.tink.proto.AesCtrHmacAeadKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom3.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (parseFrom3.getAesCtrKey().getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (parseFrom3.getHmacKey().getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    zzlj builder = AesCtrHmacAeadParameters.builder();
                    builder.setAesKeySizeBytes(parseFrom3.getAesCtrKey().getKeyValue().size());
                    builder.setHmacKeySizeBytes(parseFrom3.getHmacKey().getKeyValue().size());
                    builder.setIvSizeBytes(parseFrom3.getAesCtrKey().getParams().getIvSize());
                    builder.setTagSizeBytes(parseFrom3.getHmacKey().getParams().getTagSize());
                    builder.zzd = AesCtrHmacAeadProtoSerialization.toHashType(parseFrom3.getHmacKey().getParams().getHash());
                    builder.zzf = AesCtrHmacAeadProtoSerialization.toVariant(protoKeySerialization.outputPrefixType);
                    AesCtrHmacAeadParameters build = builder.build();
                    MetadataRepo metadataRepo = new MetadataRepo(16);
                    metadataRepo.setParameters(build);
                    metadataRepo.setAesKeyBytes(new WireAdapter(Bytes.copyFrom(parseFrom3.getAesCtrKey().getKeyValue().toByteArray())));
                    metadataRepo.setHmacKeyBytes(new WireAdapter(Bytes.copyFrom(parseFrom3.getHmacKey().getKeyValue().toByteArray())));
                    metadataRepo.setIdRequirement(protoKeySerialization.idRequirement);
                    return metadataRepo.m1114build();
                } catch (InvalidProtocolBufferException unused) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing AesCtrHmacAeadKey failed");
                    return null;
                }
            case 25:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                    return null;
                }
                try {
                    com.google.crypto.tink.proto.AesEaxKey parseFrom4 = com.google.crypto.tink.proto.AesEaxKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom4.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    SimpleActor builder2 = AesEaxParameters.builder();
                    builder2.setKeySizeBytes(parseFrom4.getKeyValue().size());
                    builder2.setIvSizeBytes(parseFrom4.getParams().getIvSize());
                    builder2.setTagSizeBytes();
                    builder2.remainingMessages = AesEaxProtoSerialization.toVariant(protoKeySerialization.outputPrefixType);
                    AesEaxParameters build2 = builder2.build();
                    n nVar = new n(6, z);
                    nVar.setParameters(build2);
                    nVar.setKeyBytes(new WireAdapter(Bytes.copyFrom(parseFrom4.getKeyValue().toByteArray())));
                    nVar.setIdRequirement(protoKeySerialization.idRequirement);
                    return nVar.build();
                } catch (InvalidProtocolBufferException unused2) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing AesEaxKey failed");
                    return null;
                }
            default:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    com.google.crypto.tink.proto.AesGcmKey parseFrom5 = com.google.crypto.tink.proto.AesGcmKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom5.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    SimpleActor builder3 = AesGcmParameters.builder();
                    builder3.setKeySizeBytes(parseFrom5.getKeyValue().size());
                    builder3.setIvSizeBytes();
                    builder3.setTagSizeBytes();
                    builder3.remainingMessages = AesGcmProtoSerialization.toVariant(protoKeySerialization.outputPrefixType);
                    AesGcmParameters m1111build = builder3.m1111build();
                    n nVar2 = new n(7, z);
                    nVar2.setParameters(m1111build);
                    nVar2.setKeyBytes(new WireAdapter(Bytes.copyFrom(parseFrom5.getKeyValue().toByteArray())));
                    nVar2.setIdRequirement(protoKeySerialization.idRequirement);
                    return nVar2.m2159build();
                } catch (InvalidProtocolBufferException unused3) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing AesGcmKey failed");
                    return null;
                }
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersParser$ParametersParsingFunction
    public Parameters parseParameters(WorkLauncherImpl workLauncherImpl) {
        switch (this.$r8$classId) {
            case 9:
                KeyTemplate keyTemplate = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate.getTypeUrl(), "Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    return new LegacyKmsAeadParameters(KmsAeadKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry()).getKeyUri(), LegacyKmsAeadProtoSerialization.toVariant(keyTemplate.getOutputPrefixType()));
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            case 13:
                KeyTemplate keyTemplate2 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate2.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate2.getTypeUrl(), "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    return LegacyKmsEnvelopeAeadProtoSerialization.parseParameters(KmsEnvelopeAeadKeyFormat.parseFrom(keyTemplate2.getValue(), ExtensionRegistryLite.getEmptyRegistry()), keyTemplate2.getOutputPrefixType());
                } catch (InvalidProtocolBufferException e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            case 19:
                KeyTemplate keyTemplate3 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate3.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate3.getTypeUrl(), "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    AesCtrHmacAeadKeyFormat parseFrom = AesCtrHmacAeadKeyFormat.parseFrom(keyTemplate3.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom.getHmacKeyFormat().getVersion() != 0) {
                        a$$ExternalSyntheticBUOutline0.m$6("Only version 0 keys are accepted");
                        return null;
                    }
                    zzlj builder = AesCtrHmacAeadParameters.builder();
                    builder.setAesKeySizeBytes(parseFrom.getAesCtrKeyFormat().getKeySize());
                    builder.setHmacKeySizeBytes(parseFrom.getHmacKeyFormat().getKeySize());
                    builder.setIvSizeBytes(parseFrom.getAesCtrKeyFormat().getParams().getIvSize());
                    builder.setTagSizeBytes(parseFrom.getHmacKeyFormat().getParams().getTagSize());
                    builder.zzd = AesCtrHmacAeadProtoSerialization.toHashType(parseFrom.getHmacKeyFormat().getParams().getHash());
                    builder.zzf = AesCtrHmacAeadProtoSerialization.toVariant(keyTemplate3.getOutputPrefixType());
                    return builder.build();
                } catch (InvalidProtocolBufferException e3) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e3);
                }
            case 23:
                KeyTemplate keyTemplate4 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate4.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate4.getTypeUrl(), "Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    AesEaxKeyFormat parseFrom2 = AesEaxKeyFormat.parseFrom(keyTemplate4.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    SimpleActor builder2 = AesEaxParameters.builder();
                    builder2.setKeySizeBytes(parseFrom2.getKeySize());
                    builder2.setIvSizeBytes(parseFrom2.getParams().getIvSize());
                    builder2.setTagSizeBytes();
                    builder2.remainingMessages = AesEaxProtoSerialization.toVariant(keyTemplate4.getOutputPrefixType());
                    return builder2.build();
                } catch (InvalidProtocolBufferException e4) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
                }
            default:
                KeyTemplate keyTemplate5 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate5.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate5.getTypeUrl(), "Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    AesGcmKeyFormat parseFrom3 = AesGcmKeyFormat.parseFrom(keyTemplate5.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom3.getVersion() != 0) {
                        a$$ExternalSyntheticBUOutline0.m$6("Only version 0 parameters are accepted");
                        return null;
                    }
                    SimpleActor builder3 = AesGcmParameters.builder();
                    builder3.setKeySizeBytes(parseFrom3.getKeySize());
                    builder3.setIvSizeBytes();
                    builder3.setTagSizeBytes();
                    builder3.remainingMessages = AesGcmProtoSerialization.toVariant(keyTemplate5.getOutputPrefixType());
                    return builder3.m1111build();
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
                }
        }
    }

    @Override // com.google.crypto.tink.internal.KeySerializer$KeySerializationFunction
    public ProtoKeySerialization serializeKey(TransactorKt transactorKt) {
        int i = this.$r8$classId;
        KeyData.KeyMaterialType keyMaterialType = KeyData.KeyMaterialType.REMOTE;
        KeyData.KeyMaterialType keyMaterialType2 = KeyData.KeyMaterialType.SYMMETRIC;
        switch (i) {
            case 10:
                LegacyKmsAeadKey legacyKmsAeadKey = (LegacyKmsAeadKey) transactorKt;
                KmsAeadKey.Builder newBuilder = KmsAeadKey.newBuilder();
                KmsAeadKeyFormat.Builder newBuilder2 = KmsAeadKeyFormat.newBuilder();
                newBuilder2.setKeyUri(legacyKmsAeadKey.parameters.keyUri);
                newBuilder.setParams((KmsAeadKeyFormat) newBuilder2.build());
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((KmsAeadKey) newBuilder.build()).toByteString(), keyMaterialType, LegacyKmsAeadProtoSerialization.toProtoOutputPrefixType(legacyKmsAeadKey.parameters.variant), legacyKmsAeadKey.idRequirement);
            case 14:
                LegacyKmsEnvelopeAeadKey legacyKmsEnvelopeAeadKey = (LegacyKmsEnvelopeAeadKey) transactorKt;
                KmsEnvelopeAeadKey.Builder newBuilder3 = KmsEnvelopeAeadKey.newBuilder();
                newBuilder3.setParams(LegacyKmsEnvelopeAeadProtoSerialization.serializeParametersToKmsEnvelopeAeadKeyFormat(legacyKmsEnvelopeAeadKey.parameters));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((KmsEnvelopeAeadKey) newBuilder3.build()).toByteString(), keyMaterialType, LegacyKmsEnvelopeAeadProtoSerialization.toProtoOutputPrefixType(legacyKmsEnvelopeAeadKey.parameters.variant), legacyKmsEnvelopeAeadKey.idRequirement);
            case 20:
                AesCtrHmacAeadKey aesCtrHmacAeadKey = (AesCtrHmacAeadKey) transactorKt;
                AesCtrHmacAeadKey.Builder newBuilder4 = com.google.crypto.tink.proto.AesCtrHmacAeadKey.newBuilder();
                AesCtrKey.Builder newBuilder5 = AesCtrKey.newBuilder();
                AesCtrParams.Builder newBuilder6 = AesCtrParams.newBuilder();
                newBuilder6.setIvSize(aesCtrHmacAeadKey.parameters.ivSizeBytes);
                newBuilder5.setParams((AesCtrParams) newBuilder6.build());
                byte[] byteArray = ((Bytes) aesCtrHmacAeadKey.aesKeyBytes.adapter).toByteArray();
                newBuilder5.setKeyValue$1(ByteString.copyFrom(0, byteArray.length, byteArray));
                newBuilder4.setAesCtrKey((AesCtrKey) newBuilder5.build());
                HmacKey.Builder newBuilder7 = HmacKey.newBuilder();
                AesCtrHmacAeadParameters aesCtrHmacAeadParameters = aesCtrHmacAeadKey.parameters;
                newBuilder7.setParams(AesCtrHmacAeadProtoSerialization.getHmacProtoParams(aesCtrHmacAeadParameters));
                byte[] byteArray2 = ((Bytes) aesCtrHmacAeadKey.hmacKeyBytes.adapter).toByteArray();
                newBuilder7.setKeyValue$8(ByteString.copyFrom(0, byteArray2.length, byteArray2));
                newBuilder4.setHmacKey((HmacKey) newBuilder7.build());
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((com.google.crypto.tink.proto.AesCtrHmacAeadKey) newBuilder4.build()).toByteString(), keyMaterialType2, AesCtrHmacAeadProtoSerialization.toProtoOutputPrefixType(aesCtrHmacAeadParameters.variant), aesCtrHmacAeadKey.idRequirement);
            case 24:
                AesEaxKey aesEaxKey = (AesEaxKey) transactorKt;
                AesEaxKey.Builder newBuilder8 = com.google.crypto.tink.proto.AesEaxKey.newBuilder();
                newBuilder8.setParams(AesEaxProtoSerialization.getProtoParams(aesEaxKey.parameters));
                byte[] byteArray3 = ((Bytes) aesEaxKey.keyBytes.adapter).toByteArray();
                newBuilder8.setKeyValue$2(ByteString.copyFrom(0, byteArray3.length, byteArray3));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesEaxKey", ((com.google.crypto.tink.proto.AesEaxKey) newBuilder8.build()).toByteString(), keyMaterialType2, AesEaxProtoSerialization.toProtoOutputPrefixType(aesEaxKey.parameters.variant), aesEaxKey.idRequirement);
            default:
                AesGcmKey aesGcmKey = (AesGcmKey) transactorKt;
                AesGcmProtoSerialization.validateParameters(aesGcmKey.parameters);
                AesGcmKey.Builder newBuilder9 = com.google.crypto.tink.proto.AesGcmKey.newBuilder();
                byte[] byteArray4 = ((Bytes) aesGcmKey.keyBytes.adapter).toByteArray();
                newBuilder9.setKeyValue$3(ByteString.copyFrom(0, byteArray4.length, byteArray4));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesGcmKey", ((com.google.crypto.tink.proto.AesGcmKey) newBuilder9.build()).toByteString(), keyMaterialType2, AesGcmProtoSerialization.toProtoOutputPrefixType(aesGcmKey.parameters.variant), aesGcmKey.idRequirement);
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer$ParametersSerializationFunction
    public WorkLauncherImpl serializeParameters(Parameters parameters) {
        switch (this.$r8$classId) {
            case 8:
                LegacyKmsAeadParameters legacyKmsAeadParameters = (LegacyKmsAeadParameters) parameters;
                KeyTemplate.Builder newBuilder = KeyTemplate.newBuilder();
                newBuilder.setTypeUrl$1("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                KmsAeadKeyFormat.Builder newBuilder2 = KmsAeadKeyFormat.newBuilder();
                newBuilder2.setKeyUri(legacyKmsAeadParameters.keyUri);
                newBuilder.setValue$1(((KmsAeadKeyFormat) newBuilder2.build()).toByteString());
                newBuilder.setOutputPrefixType(LegacyKmsAeadProtoSerialization.toProtoOutputPrefixType(legacyKmsAeadParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder.build());
            case 12:
                LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters = (LegacyKmsEnvelopeAeadParameters) parameters;
                KeyTemplate.Builder newBuilder3 = KeyTemplate.newBuilder();
                newBuilder3.setTypeUrl$1("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                newBuilder3.setValue$1(LegacyKmsEnvelopeAeadProtoSerialization.serializeParametersToKmsEnvelopeAeadKeyFormat(legacyKmsEnvelopeAeadParameters).toByteString());
                newBuilder3.setOutputPrefixType(LegacyKmsEnvelopeAeadProtoSerialization.toProtoOutputPrefixType(legacyKmsEnvelopeAeadParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder3.build());
            case 18:
                AesCtrHmacAeadParameters aesCtrHmacAeadParameters = (AesCtrHmacAeadParameters) parameters;
                KeyTemplate.Builder newBuilder4 = KeyTemplate.newBuilder();
                newBuilder4.setTypeUrl$1("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                AesCtrHmacAeadKeyFormat.Builder newBuilder5 = AesCtrHmacAeadKeyFormat.newBuilder();
                AesCtrKeyFormat.Builder newBuilder6 = AesCtrKeyFormat.newBuilder();
                AesCtrParams.Builder newBuilder7 = AesCtrParams.newBuilder();
                newBuilder7.setIvSize(aesCtrHmacAeadParameters.ivSizeBytes);
                newBuilder6.setParams$1((AesCtrParams) newBuilder7.build());
                newBuilder6.setKeySize$1(aesCtrHmacAeadParameters.aesKeySizeBytes);
                newBuilder5.setAesCtrKeyFormat((AesCtrKeyFormat) newBuilder6.build());
                HmacKeyFormat.Builder newBuilder8 = HmacKeyFormat.newBuilder();
                newBuilder8.setParams$1(AesCtrHmacAeadProtoSerialization.getHmacProtoParams(aesCtrHmacAeadParameters));
                newBuilder8.setKeySize$5(aesCtrHmacAeadParameters.hmacKeySizeBytes);
                newBuilder5.setHmacKeyFormat((HmacKeyFormat) newBuilder8.build());
                newBuilder4.setValue$1(((AesCtrHmacAeadKeyFormat) newBuilder5.build()).toByteString());
                newBuilder4.setOutputPrefixType(AesCtrHmacAeadProtoSerialization.toProtoOutputPrefixType(aesCtrHmacAeadParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder4.build());
            case 22:
                AesEaxParameters aesEaxParameters = (AesEaxParameters) parameters;
                KeyTemplate.Builder newBuilder9 = KeyTemplate.newBuilder();
                newBuilder9.setTypeUrl$1("type.googleapis.com/google.crypto.tink.AesEaxKey");
                AesEaxKeyFormat.Builder newBuilder10 = AesEaxKeyFormat.newBuilder();
                newBuilder10.setParams$1(AesEaxProtoSerialization.getProtoParams(aesEaxParameters));
                newBuilder10.setKeySize$2(aesEaxParameters.keySizeBytes);
                newBuilder9.setValue$1(((AesEaxKeyFormat) newBuilder10.build()).toByteString());
                newBuilder9.setOutputPrefixType(AesEaxProtoSerialization.toProtoOutputPrefixType(aesEaxParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder9.build());
            default:
                AesGcmParameters aesGcmParameters = (AesGcmParameters) parameters;
                AesGcmProtoSerialization.validateParameters(aesGcmParameters);
                KeyTemplate.Builder newBuilder11 = KeyTemplate.newBuilder();
                newBuilder11.setTypeUrl$1("type.googleapis.com/google.crypto.tink.AesGcmKey");
                AesGcmKeyFormat.Builder newBuilder12 = AesGcmKeyFormat.newBuilder();
                int i = aesGcmParameters.keySizeBytes;
                newBuilder12.copyOnWrite();
                ((AesGcmKeyFormat) newBuilder12.instance).keySize_ = i;
                newBuilder11.setValue$1(((AesGcmKeyFormat) newBuilder12.build()).toByteString());
                newBuilder11.setOutputPrefixType(AesGcmProtoSerialization.toProtoOutputPrefixType(aesGcmParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder11.build());
        }
    }
}
