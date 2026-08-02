package com.google.crypto.tink.daead;

import androidx.datastore.core.SimpleActor;
import androidx.room.TransactorKt;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.aead.ChaCha20Poly1305Parameters;
import com.google.crypto.tink.aead.XAesGcmParameters;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
import com.google.crypto.tink.aead.internal.AesGcmSivProtoSerialization;
import com.google.crypto.tink.aead.internal.ChaCha20Poly1305ProtoSerialization;
import com.google.crypto.tink.aead.internal.XAesGcmProtoSerialization;
import com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.daead.internal.AesSivProtoSerialization;
import com.google.crypto.tink.daead.internal.LegacyFullDeterministicAead;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.hybrid.EciesPrivateKey;
import com.google.crypto.tink.hybrid.EciesPublicKey;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.hybrid.HpkePrivateKey;
import com.google.crypto.tink.hybrid.HpkeProtoSerialization;
import com.google.crypto.tink.hybrid.internal.EciesDemHelper;
import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.internal.KeyParser$KeyParsingFunction;
import com.google.crypto.tink.internal.KeySerializer$KeySerializationFunction;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.ParametersParser$ParametersParsingFunction;
import com.google.crypto.tink.internal.ParametersSerializer$ParametersSerializationFunction;
import com.google.crypto.tink.internal.PrimitiveConstructor$PrimitiveConstructionFunction;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.AesGcmSivKey;
import com.google.crypto.tink.proto.AesGcmSivKeyFormat;
import com.google.crypto.tink.proto.AesSivKey;
import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.ChaCha20Poly1305Key;
import com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.proto.HpkeKeyFormat;
import com.google.crypto.tink.proto.HpkePrivateKey;
import com.google.crypto.tink.proto.HpkePublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.XAesGcmKey;
import com.google.crypto.tink.proto.XAesGcmKeyFormat;
import com.google.crypto.tink.proto.XAesGcmParams;
import com.google.crypto.tink.proto.XChaCha20Poly1305Key;
import com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.AesSiv;
import com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt;
import com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Hex;
import com.google.crypto.tink.util.Bytes;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.db.WireAdapter;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Collections;
import java.util.HashSet;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final /* synthetic */ class AesSivKeyManager$$ExternalSyntheticLambda0 implements ParametersSerializer$ParametersSerializationFunction, ParametersParser$ParametersParsingFunction, KeySerializer$KeySerializationFunction, KeyParser$KeyParsingFunction, PrimitiveConstructor$PrimitiveConstructionFunction {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AesSivKeyManager$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor$PrimitiveConstructionFunction
    public Object constructPrimitive(TransactorKt transactorKt) {
        switch (this.$r8$classId) {
            case 0:
                AesSivKey aesSivKey = (AesSivKey) transactorKt;
                AesSivKeyManager.validateParameters(aesSivKey.parameters);
                return AesSiv.create(aesSivKey);
            case 17:
                return LegacyFullDeterministicAead.create((LegacyProtoKey) transactorKt);
            case 22:
                return EciesAeadHkdfHybridDecrypt.create((EciesPrivateKey) transactorKt);
            default:
                EciesPublicKey eciesPublicKey = (EciesPublicKey) transactorKt;
                EllipticCurves$CurveType ellipticCurves$CurveType = (EllipticCurves$CurveType) EciesAeadHkdfHybridEncrypt.CURVE_TYPE_CONVERTER.toProtoEnum(eciesPublicKey.parameters.curveType);
                ECPoint eCPoint = eciesPublicKey.nistPublicPoint;
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
                ECParameterSpec curveSpec = Hex.getCurveSpec(ellipticCurves$CurveType);
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                EllipticCurvesUtil.checkPointOnCurve(eCPoint2, curveSpec.getCurve());
                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) EngineFactory.KEY_FACTORY.policy.getInstance("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, curveSpec));
                byte[] bArr = new byte[0];
                EciesParameters eciesParameters = eciesPublicKey.parameters;
                Bytes bytes = eciesParameters.salt;
                if (bytes != null) {
                    bArr = bytes.toByteArray();
                }
                return new EciesAeadHkdfHybridEncrypt(eCPublicKey, bArr, EciesAeadHkdfHybridEncrypt.toHmacAlgo(eciesParameters.hashType), (EllipticCurves$PointFormatType) EciesAeadHkdfHybridEncrypt.POINT_FORMAT_TYPE_CONVERTER.toProtoEnum(eciesParameters.nistCurvePointFormat), EciesDemHelper.getDem(eciesParameters), eciesPublicKey.outputPrefix.toByteArray());
        }
    }

    public Object get() {
        HashSet hashSet = new HashSet();
        SimpleActor builder = AesGcmParameters.builder();
        builder.setIvSizeBytes();
        builder.setKeySizeBytes(16);
        builder.setTagSizeBytes();
        AesEaxParameters.Variant variant = AesEaxParameters.Variant.NO_PREFIX$2;
        builder.remainingMessages = variant;
        hashSet.add(builder.m1111build());
        SimpleActor builder2 = AesGcmParameters.builder();
        builder2.setIvSizeBytes();
        builder2.setKeySizeBytes(32);
        builder2.setTagSizeBytes();
        builder2.remainingMessages = variant;
        hashSet.add(builder2.m1111build());
        zzlj builder3 = AesCtrHmacAeadParameters.builder();
        builder3.setAesKeySizeBytes(16);
        builder3.setHmacKeySizeBytes(32);
        builder3.setTagSizeBytes(16);
        builder3.setIvSizeBytes(16);
        AesEaxParameters.Variant variant2 = AesEaxParameters.Variant.SHA256;
        builder3.zzd = variant2;
        AesEaxParameters.Variant variant3 = AesEaxParameters.Variant.NO_PREFIX$1;
        builder3.zzf = variant3;
        hashSet.add(builder3.build());
        zzlj builder4 = AesCtrHmacAeadParameters.builder();
        builder4.setAesKeySizeBytes(32);
        builder4.setHmacKeySizeBytes(32);
        builder4.setTagSizeBytes(32);
        builder4.setIvSizeBytes(16);
        builder4.zzd = variant2;
        builder4.zzf = variant3;
        hashSet.add(builder4.build());
        hashSet.add(new XChaCha20Poly1305Parameters(AesEaxParameters.Variant.NO_PREFIX$6));
        KeysetHandle builder5 = AesSivParameters.builder();
        builder5.setKeySizeBytes(64);
        builder5.annotationsMap = AesSivParameters.Variant.NO_PREFIX;
        hashSet.add(builder5.m2033build());
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // com.google.crypto.tink.internal.KeyParser$KeyParsingFunction
    public TransactorKt parseKey(Serialization serialization) {
        boolean z = false;
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        switch (this.$r8$classId) {
            case 4:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                    return null;
                }
                try {
                    AesGcmSivKey parseFrom = AesGcmSivKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    KeysetHandle builder = AesGcmSivParameters.builder();
                    builder.setKeySizeBytes(parseFrom.getKeyValue().size());
                    builder.annotationsMap = AesGcmSivProtoSerialization.toVariant(protoKeySerialization.outputPrefixType);
                    AesGcmSivParameters build = builder.build();
                    n nVar = new n(8, z);
                    nVar.setParameters(build);
                    nVar.setKeyBytes(new WireAdapter(Bytes.copyFrom(parseFrom.getKeyValue().toByteArray())));
                    nVar.setIdRequirement(protoKeySerialization.idRequirement);
                    return nVar.m2160build();
                } catch (InvalidProtocolBufferException unused) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing AesGcmSivKey failed");
                    return null;
                }
            case 8:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    ChaCha20Poly1305Key parseFrom2 = ChaCha20Poly1305Key.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom2.getVersion() == 0) {
                        return com.google.crypto.tink.aead.ChaCha20Poly1305Key.create(ChaCha20Poly1305ProtoSerialization.toVariant(protoKeySerialization.outputPrefixType), new WireAdapter(Bytes.copyFrom(parseFrom2.getKeyValue().toByteArray())), protoKeySerialization.idRequirement);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused2) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing ChaCha20Poly1305Key failed");
                    return null;
                }
            case 12:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    XAesGcmKey parseFrom3 = XAesGcmKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom3.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (parseFrom3.getKeyValue().size() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    return com.google.crypto.tink.aead.XAesGcmKey.create(XAesGcmParameters.create(parseFrom3.getParams().getSaltSize(), XAesGcmProtoSerialization.toVariant(protoKeySerialization.outputPrefixType)), new WireAdapter(Bytes.copyFrom(parseFrom3.getKeyValue().toByteArray())), protoKeySerialization.idRequirement);
                } catch (InvalidProtocolBufferException unused3) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing XAesGcmKey failed");
                    return null;
                }
            case 16:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    XChaCha20Poly1305Key parseFrom4 = XChaCha20Poly1305Key.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom4.getVersion() == 0) {
                        return com.google.crypto.tink.aead.XChaCha20Poly1305Key.create(XChaCha20Poly1305ProtoSerialization.toVariant(protoKeySerialization.outputPrefixType), new WireAdapter(Bytes.copyFrom(parseFrom4.getKeyValue().toByteArray())), protoKeySerialization.idRequirement);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused4) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing XChaCha20Poly1305Key failed");
                    return null;
                }
            case 21:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    a$$ExternalSyntheticBUOutline0.m$3("Wrong type URL in call to AesSivParameters.parseParameters");
                    return null;
                }
                try {
                    com.google.crypto.tink.proto.AesSivKey parseFrom5 = com.google.crypto.tink.proto.AesSivKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom5.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    KeysetHandle builder2 = AesSivParameters.builder();
                    builder2.setKeySizeBytes(parseFrom5.getKeyValue().size());
                    builder2.annotationsMap = AesSivProtoSerialization.toVariant(protoKeySerialization.outputPrefixType);
                    AesSivParameters m2033build = builder2.m2033build();
                    n nVar2 = new n(9, z);
                    nVar2.setParameters(m2033build);
                    nVar2.setKeyBytes(new WireAdapter(Bytes.copyFrom(parseFrom5.getKeyValue().toByteArray())));
                    nVar2.setIdRequirement(protoKeySerialization.idRequirement);
                    return nVar2.m2161build();
                } catch (InvalidProtocolBufferException unused5) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing AesSivKey failed");
                    return null;
                }
            default:
                if (!protoKeySerialization.typeUrl.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(protoKeySerialization.typeUrl, "Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ");
                    return null;
                }
                try {
                    HpkePublicKey parseFrom6 = HpkePublicKey.parseFrom(protoKeySerialization.value, ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom6.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    HpkeParameters fromProtoParameters = HpkeProtoSerialization.fromProtoParameters(protoKeySerialization.outputPrefixType, parseFrom6.getParams());
                    HpkeParameters.KemId kemId = fromProtoParameters.kem;
                    return com.google.crypto.tink.hybrid.HpkePublicKey.create(fromProtoParameters, Bytes.copyFrom(ConscryptUtil.toBigEndianBytesOfFixedLength(HpkeUtil.getEncodedPublicKeyLength(kemId), ConscryptUtil.fromUnsignedBigEndianBytes(parseFrom6.getPublicKey().toByteArray()))), protoKeySerialization.idRequirement);
                } catch (InvalidProtocolBufferException unused6) {
                    a$$ExternalSyntheticBUOutline0.m$6("Parsing HpkePublicKey failed");
                    return null;
                }
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersParser$ParametersParsingFunction
    public Parameters parseParameters(WorkLauncherImpl workLauncherImpl) {
        switch (this.$r8$classId) {
            case 2:
                KeyTemplate keyTemplate = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate.getTypeUrl(), "Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    AesGcmSivKeyFormat parseFrom = AesGcmSivKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom.getVersion() != 0) {
                        a$$ExternalSyntheticBUOutline0.m$6("Only version 0 parameters are accepted");
                        return null;
                    }
                    KeysetHandle builder = AesGcmSivParameters.builder();
                    builder.setKeySizeBytes(parseFrom.getKeySize());
                    builder.annotationsMap = AesGcmSivProtoSerialization.toVariant(keyTemplate.getOutputPrefixType());
                    return builder.build();
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
                }
            case 6:
                KeyTemplate keyTemplate2 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate2.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate2.getTypeUrl(), "Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    ChaCha20Poly1305KeyFormat.parseFrom(keyTemplate2.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    return new ChaCha20Poly1305Parameters(ChaCha20Poly1305ProtoSerialization.toVariant(keyTemplate2.getOutputPrefixType()));
                } catch (InvalidProtocolBufferException e2) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
                }
            case 10:
                KeyTemplate keyTemplate3 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate3.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate3.getTypeUrl(), "Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    XAesGcmKeyFormat parseFrom2 = XAesGcmKeyFormat.parseFrom(keyTemplate3.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom2.getVersion() == 0) {
                        return XAesGcmParameters.create(parseFrom2.getParams().getSaltSize(), XAesGcmProtoSerialization.toVariant(keyTemplate3.getOutputPrefixType()));
                    }
                    a$$ExternalSyntheticBUOutline0.m$6("Only version 0 parameters are accepted");
                    return null;
                } catch (InvalidProtocolBufferException e3) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e3);
                }
            case 14:
                KeyTemplate keyTemplate4 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate4.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate4.getTypeUrl(), "Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    if (XChaCha20Poly1305KeyFormat.parseFrom(keyTemplate4.getValue(), ExtensionRegistryLite.getEmptyRegistry()).getVersion() == 0) {
                        return new XChaCha20Poly1305Parameters(XChaCha20Poly1305ProtoSerialization.toVariant(keyTemplate4.getOutputPrefixType()));
                    }
                    a$$ExternalSyntheticBUOutline0.m$6("Only version 0 parameters are accepted");
                    return null;
                } catch (InvalidProtocolBufferException e4) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e4);
                }
            case 19:
                KeyTemplate keyTemplate5 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate5.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate5.getTypeUrl(), "Wrong type URL in call to AesSivParameters.parseParameters: ");
                    return null;
                }
                try {
                    AesSivKeyFormat parseFrom3 = AesSivKeyFormat.parseFrom(keyTemplate5.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                    if (parseFrom3.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    KeysetHandle builder2 = AesSivParameters.builder();
                    builder2.setKeySizeBytes(parseFrom3.getKeySize());
                    builder2.annotationsMap = AesSivProtoSerialization.toVariant(keyTemplate5.getOutputPrefixType());
                    return builder2.m2033build();
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e5);
                }
            default:
                KeyTemplate keyTemplate6 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
                if (!keyTemplate6.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    Path$$ExternalSyntheticBUOutline0.m(keyTemplate6.getTypeUrl(), "Wrong type URL in call to HpkeProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    return HpkeProtoSerialization.fromProtoParameters(keyTemplate6.getOutputPrefixType(), HpkeKeyFormat.parseFrom(keyTemplate6.getValue(), ExtensionRegistryLite.getEmptyRegistry()).getParams());
                } catch (InvalidProtocolBufferException e6) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e6);
                }
        }
    }

    @Override // com.google.crypto.tink.internal.KeySerializer$KeySerializationFunction
    public ProtoKeySerialization serializeKey(TransactorKt transactorKt) {
        int i = this.$r8$classId;
        KeyData.KeyMaterialType keyMaterialType = KeyData.KeyMaterialType.SYMMETRIC;
        switch (i) {
            case 3:
                com.google.crypto.tink.aead.AesGcmSivKey aesGcmSivKey = (com.google.crypto.tink.aead.AesGcmSivKey) transactorKt;
                AesGcmSivKey.Builder newBuilder = AesGcmSivKey.newBuilder();
                byte[] byteArray = ((Bytes) aesGcmSivKey.keyBytes.adapter).toByteArray();
                newBuilder.setKeyValue$4(ByteString.copyFrom(0, byteArray.length, byteArray));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((AesGcmSivKey) newBuilder.build()).toByteString(), keyMaterialType, AesGcmSivProtoSerialization.toProtoOutputPrefixType(aesGcmSivKey.parameters.variant), aesGcmSivKey.idRequirement);
            case 7:
                com.google.crypto.tink.aead.ChaCha20Poly1305Key chaCha20Poly1305Key = (com.google.crypto.tink.aead.ChaCha20Poly1305Key) transactorKt;
                ChaCha20Poly1305Key.Builder newBuilder2 = ChaCha20Poly1305Key.newBuilder();
                byte[] byteArray2 = ((Bytes) chaCha20Poly1305Key.keyBytes.adapter).toByteArray();
                newBuilder2.setKeyValue$6(ByteString.copyFrom(0, byteArray2.length, byteArray2));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((ChaCha20Poly1305Key) newBuilder2.build()).toByteString(), keyMaterialType, ChaCha20Poly1305ProtoSerialization.toProtoOutputPrefixType(chaCha20Poly1305Key.parameters.variant), chaCha20Poly1305Key.idRequirement);
            case 11:
                com.google.crypto.tink.aead.XAesGcmKey xAesGcmKey = (com.google.crypto.tink.aead.XAesGcmKey) transactorKt;
                XAesGcmKey.Builder newBuilder3 = XAesGcmKey.newBuilder();
                byte[] byteArray3 = ((Bytes) xAesGcmKey.keyBytes.adapter).toByteArray();
                newBuilder3.setKeyValue$9(ByteString.copyFrom(0, byteArray3.length, byteArray3));
                XAesGcmParams.Builder newBuilder4 = XAesGcmParams.newBuilder();
                XAesGcmParameters xAesGcmParameters = xAesGcmKey.parameters;
                newBuilder4.setSaltSize(xAesGcmParameters.saltSizeBytes);
                newBuilder3.setParams((XAesGcmParams) newBuilder4.build());
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((XAesGcmKey) newBuilder3.build()).toByteString(), keyMaterialType, XAesGcmProtoSerialization.toProtoOutputPrefixType(xAesGcmParameters.variant), xAesGcmKey.idRequirement);
            case 15:
                com.google.crypto.tink.aead.XChaCha20Poly1305Key xChaCha20Poly1305Key = (com.google.crypto.tink.aead.XChaCha20Poly1305Key) transactorKt;
                XChaCha20Poly1305Key.Builder newBuilder5 = XChaCha20Poly1305Key.newBuilder();
                byte[] byteArray4 = ((Bytes) xChaCha20Poly1305Key.keyBytes.adapter).toByteArray();
                newBuilder5.setKeyValue$10(ByteString.copyFrom(0, byteArray4.length, byteArray4));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((XChaCha20Poly1305Key) newBuilder5.build()).toByteString(), keyMaterialType, XChaCha20Poly1305ProtoSerialization.toProtoOutputPrefixType(xChaCha20Poly1305Key.parameters.variant), xChaCha20Poly1305Key.idRequirement);
            case 20:
                AesSivKey aesSivKey = (AesSivKey) transactorKt;
                AesSivKey.Builder newBuilder6 = com.google.crypto.tink.proto.AesSivKey.newBuilder();
                byte[] byteArray5 = ((Bytes) aesSivKey.keyBytes.adapter).toByteArray();
                newBuilder6.setKeyValue$5(ByteString.copyFrom(0, byteArray5.length, byteArray5));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesSivKey", ((com.google.crypto.tink.proto.AesSivKey) newBuilder6.build()).toByteString(), keyMaterialType, AesSivProtoSerialization.toProtoOutputPrefixType(aesSivKey.parameters.variant), aesSivKey.idRequirement);
            case 27:
                com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey = (com.google.crypto.tink.hybrid.HpkePublicKey) transactorKt;
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.HpkePublicKey", HpkeProtoSerialization.toProtoPublicKey(hpkePublicKey).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, (OutputPrefixType) HpkeProtoSerialization.VARIANT_TYPE_CONVERTER.toProtoEnum(hpkePublicKey.parameters.variant), hpkePublicKey.idRequirement);
            default:
                HpkePrivateKey hpkePrivateKey = (HpkePrivateKey) transactorKt;
                HpkePrivateKey.Builder newBuilder7 = com.google.crypto.tink.proto.HpkePrivateKey.newBuilder();
                newBuilder7.setVersion$1();
                newBuilder7.setPublicKey(HpkeProtoSerialization.toProtoPublicKey(hpkePrivateKey.publicKey));
                byte[] byteArray6 = ((Bytes) hpkePrivateKey.privateKeyBytes.adapter).toByteArray();
                newBuilder7.setPrivateKey(ByteString.copyFrom(0, byteArray6.length, byteArray6));
                return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((com.google.crypto.tink.proto.HpkePrivateKey) newBuilder7.build()).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, (OutputPrefixType) HpkeProtoSerialization.VARIANT_TYPE_CONVERTER.toProtoEnum(hpkePrivateKey.publicKey.parameters.variant), hpkePrivateKey.getIdRequirementOrNull());
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer$ParametersSerializationFunction
    public WorkLauncherImpl serializeParameters(Parameters parameters) {
        switch (this.$r8$classId) {
            case 1:
                AesGcmSivParameters aesGcmSivParameters = (AesGcmSivParameters) parameters;
                KeyTemplate.Builder newBuilder = KeyTemplate.newBuilder();
                newBuilder.setTypeUrl$1("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                AesGcmSivKeyFormat.Builder newBuilder2 = AesGcmSivKeyFormat.newBuilder();
                newBuilder2.setKeySize$3(aesGcmSivParameters.keySizeBytes);
                newBuilder.setValue$1(((AesGcmSivKeyFormat) newBuilder2.build()).toByteString());
                newBuilder.setOutputPrefixType(AesGcmSivProtoSerialization.toProtoOutputPrefixType(aesGcmSivParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder.build());
            case 5:
                KeyTemplate.Builder newBuilder3 = KeyTemplate.newBuilder();
                newBuilder3.setTypeUrl$1("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                newBuilder3.setValue$1(ChaCha20Poly1305KeyFormat.getDefaultInstance().toByteString());
                newBuilder3.setOutputPrefixType(ChaCha20Poly1305ProtoSerialization.toProtoOutputPrefixType(((ChaCha20Poly1305Parameters) parameters).variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder3.build());
            case 9:
                XAesGcmParameters xAesGcmParameters = (XAesGcmParameters) parameters;
                KeyTemplate.Builder newBuilder4 = KeyTemplate.newBuilder();
                newBuilder4.setTypeUrl$1("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                XAesGcmKeyFormat.Builder newBuilder5 = XAesGcmKeyFormat.newBuilder();
                XAesGcmParams.Builder newBuilder6 = XAesGcmParams.newBuilder();
                newBuilder6.setSaltSize(xAesGcmParameters.saltSizeBytes);
                newBuilder5.setParams$1((XAesGcmParams) newBuilder6.build());
                newBuilder4.setValue$1(((XAesGcmKeyFormat) newBuilder5.build()).toByteString());
                newBuilder4.setOutputPrefixType(XAesGcmProtoSerialization.toProtoOutputPrefixType(xAesGcmParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder4.build());
            case 13:
                KeyTemplate.Builder newBuilder7 = KeyTemplate.newBuilder();
                newBuilder7.setTypeUrl$1("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                newBuilder7.setValue$1(XChaCha20Poly1305KeyFormat.getDefaultInstance().toByteString());
                newBuilder7.setOutputPrefixType(XChaCha20Poly1305ProtoSerialization.toProtoOutputPrefixType(((XChaCha20Poly1305Parameters) parameters).variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder7.build());
            case 18:
                AesSivParameters aesSivParameters = (AesSivParameters) parameters;
                KeyTemplate.Builder newBuilder8 = KeyTemplate.newBuilder();
                newBuilder8.setTypeUrl$1("type.googleapis.com/google.crypto.tink.AesSivKey");
                AesSivKeyFormat.Builder newBuilder9 = AesSivKeyFormat.newBuilder();
                newBuilder9.setKeySize$4(aesSivParameters.keySizeBytes);
                newBuilder8.setValue$1(((AesSivKeyFormat) newBuilder9.build()).toByteString());
                newBuilder8.setOutputPrefixType(AesSivProtoSerialization.toProtoOutputPrefixType(aesSivParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder8.build());
            default:
                HpkeParameters hpkeParameters = (HpkeParameters) parameters;
                KeyTemplate.Builder newBuilder10 = KeyTemplate.newBuilder();
                newBuilder10.setTypeUrl$1("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
                HpkeKeyFormat.Builder newBuilder11 = HpkeKeyFormat.newBuilder();
                newBuilder11.setParams(HpkeProtoSerialization.toProtoParameters(hpkeParameters));
                newBuilder10.setValue$1(((HpkeKeyFormat) newBuilder11.build()).toByteString());
                newBuilder10.setOutputPrefixType((OutputPrefixType) HpkeProtoSerialization.VARIANT_TYPE_CONVERTER.toProtoEnum(hpkeParameters.variant));
                return WorkLauncherImpl.create((KeyTemplate) newBuilder10.build());
        }
    }
}
