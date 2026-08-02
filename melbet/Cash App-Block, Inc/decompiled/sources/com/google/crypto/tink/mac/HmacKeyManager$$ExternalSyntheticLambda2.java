package com.google.crypto.tink.mac;

import androidx.emoji2.text.MetadataRepo;
import androidx.room.TransactorKt;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.daead.AesSivKeyManager;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.internal.KeyManagerRegistry;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.LegacyProtoParameters;
import com.google.crypto.tink.internal.MutableKeyCreationRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import com.google.crypto.tink.subtle.Hex;
import com.google.crypto.tink.subtle.X25519;
import com.google.crypto.tink.util.Bytes;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.db.WireAdapter;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* loaded from: classes.dex */
public final /* synthetic */ class HmacKeyManager$$ExternalSyntheticLambda2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HmacKeyManager$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    public final TransactorKt createKey(Parameters parameters, Integer num) {
        ECParameterSpec eCParameterSpec;
        Bytes bytes;
        WireAdapter wireAdapter;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                HmacParameters hmacParameters = (HmacParameters) parameters;
                n nVar = new n(11, z);
                nVar.setParameters(hmacParameters);
                nVar.setKeyBytes(WireAdapter.randomBytes(hmacParameters.keySizeBytes));
                nVar.setIdRequirement(num);
                break;
            case 1:
                AesCtrHmacAeadParameters aesCtrHmacAeadParameters = (AesCtrHmacAeadParameters) parameters;
                int i = aesCtrHmacAeadParameters.aesKeySizeBytes;
                if (i != 16 && i != 32) {
                    a$$ExternalSyntheticBUOutline0.m$6("AES key size must be 16 or 32 bytes");
                    break;
                } else {
                    MetadataRepo metadataRepo = new MetadataRepo(16);
                    metadataRepo.setParameters(aesCtrHmacAeadParameters);
                    metadataRepo.setIdRequirement(num);
                    metadataRepo.setAesKeyBytes(WireAdapter.randomBytes(i));
                    metadataRepo.setHmacKeyBytes(WireAdapter.randomBytes(aesCtrHmacAeadParameters.hmacKeySizeBytes));
                    break;
                }
            case 2:
                AesEaxParameters aesEaxParameters = (AesEaxParameters) parameters;
                int i2 = aesEaxParameters.keySizeBytes;
                if (i2 == 24) {
                    a$$ExternalSyntheticBUOutline0.m$6("192 bit AES EAX Parameters are not valid");
                    break;
                } else {
                    n nVar2 = new n(6, z);
                    nVar2.setParameters(aesEaxParameters);
                    nVar2.setIdRequirement(num);
                    nVar2.setKeyBytes(WireAdapter.randomBytes(i2));
                    break;
                }
            case 3:
                AesGcmParameters aesGcmParameters = (AesGcmParameters) parameters;
                int i3 = aesGcmParameters.keySizeBytes;
                if (i3 == 24) {
                    a$$ExternalSyntheticBUOutline0.m$6("192 bit AES GCM Parameters are not valid");
                    break;
                } else {
                    n nVar3 = new n(7, z);
                    nVar3.setParameters(aesGcmParameters);
                    nVar3.setIdRequirement(num);
                    nVar3.setKeyBytes(WireAdapter.randomBytes(i3));
                    break;
                }
            case 4:
                AesGcmSivParameters aesGcmSivParameters = (AesGcmSivParameters) parameters;
                n nVar4 = new n(8, z);
                nVar4.setParameters(aesGcmSivParameters);
                nVar4.setIdRequirement(num);
                nVar4.setKeyBytes(WireAdapter.randomBytes(aesGcmSivParameters.keySizeBytes));
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                AesSivParameters aesSivParameters = (AesSivParameters) parameters;
                AesSivKeyManager.validateParameters(aesSivParameters);
                n nVar5 = new n(9, z);
                nVar5.setParameters(aesSivParameters);
                nVar5.setIdRequirement(num);
                nVar5.setKeyBytes(WireAdapter.randomBytes(aesSivParameters.keySizeBytes));
                break;
            case 11:
                EciesParameters eciesParameters = (EciesParameters) parameters;
                EciesParameters.CurveType curveType = eciesParameters.curveType;
                if (curveType != EciesParameters.CurveType.NIST_P256) {
                    if (curveType != EciesParameters.CurveType.NIST_P384) {
                        if (curveType != EciesParameters.CurveType.NIST_P521) {
                            MacWrapper$$ExternalSyntheticLambda0.m(curveType, "Unsupported curve type: ");
                            break;
                        } else {
                            eCParameterSpec = EllipticCurvesUtil.NIST_P521_PARAMS;
                        }
                    } else {
                        eCParameterSpec = EllipticCurvesUtil.NIST_P384_PARAMS;
                    }
                } else {
                    eCParameterSpec = EllipticCurvesUtil.NIST_P256_PARAMS;
                }
                KeyPair generateKeyPair = Hex.generateKeyPair(eCParameterSpec);
                break;
            case 12:
                HpkeParameters hpkeParameters = (HpkeParameters) parameters;
                HpkeParameters.KemId kemId = hpkeParameters.kem;
                if (!kemId.equals(HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256)) {
                    if (kemId != HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256 && kemId != HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384 && kemId != HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
                        a$$ExternalSyntheticBUOutline0.m$6("Unknown KEM ID");
                        break;
                    } else {
                        EllipticCurves$CurveType nistHpkeKemToCurve = HpkeUtil.nistHpkeKemToCurve(kemId);
                        KeyPair generateKeyPair2 = Hex.generateKeyPair(Hex.getCurveSpec(nistHpkeKemToCurve));
                        Bytes copyFrom = Bytes.copyFrom(Hex.pointEncode(Hex.getCurveSpec(nistHpkeKemToCurve).getCurve(), EllipticCurves$PointFormatType.UNCOMPRESSED, ((ECPublicKey) generateKeyPair2.getPublic()).getW()));
                        WireAdapter wireAdapter2 = new WireAdapter(Bytes.copyFrom(ConscryptUtil.toBigEndianBytesOfFixedLength(HpkeUtil.getEncodedPrivateKeyLength(kemId), ((ECPrivateKey) generateKeyPair2.getPrivate()).getS())));
                        bytes = copyFrom;
                        wireAdapter = wireAdapter2;
                    }
                } else {
                    byte[] generatePrivateKey = X25519.generatePrivateKey();
                    wireAdapter = new WireAdapter(Bytes.copyFrom(generatePrivateKey));
                    bytes = Bytes.copyFrom(X25519.publicFromPrivate(generatePrivateKey));
                }
                break;
            case 13:
                KeyTemplate keyTemplate = (KeyTemplate) ((LegacyProtoParameters) parameters).serialization.workTaskExecutor;
                KeyManagerRegistry keyManagerRegistry = KeyManagerRegistry.GLOBAL_INSTANCE;
                LegacyKeyManagerImpl keyManagerOrThrow = keyManagerRegistry.getKeyManagerOrThrow(keyTemplate.getTypeUrl());
                if (!((Boolean) keyManagerRegistry.newKeyAllowedMap.get(keyTemplate.getTypeUrl())).booleanValue()) {
                    a$$ExternalSyntheticBUOutline0.m$6("Creating new keys is not allowed.");
                    break;
                } else {
                    ByteString value = keyTemplate.getValue();
                    keyManagerOrThrow.getClass();
                    KeyTemplate.Builder newBuilder = KeyTemplate.newBuilder();
                    newBuilder.setTypeUrl$1(keyManagerOrThrow.typeUrl);
                    newBuilder.setValue$1(value);
                    newBuilder.setOutputPrefixType(OutputPrefixType.RAW);
                    KeyTemplate keyTemplate2 = (KeyTemplate) newBuilder.build();
                    WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(keyTemplate2, Util.checkedToBytesFromPrintableAscii(keyTemplate2.getTypeUrl()));
                    MutableSerializationRegistry mutableSerializationRegistry = MutableSerializationRegistry.GLOBAL_INSTANCE;
                    ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) mutableSerializationRegistry.serializeKey(MutableKeyCreationRegistry.globalInstance.createKey(mutableSerializationRegistry.parseParameters(workLauncherImpl), null));
                    KeyData.Builder newBuilder2 = KeyData.newBuilder();
                    String str = protoKeySerialization.typeUrl;
                    newBuilder2.copyOnWrite();
                    KeyData.access$100((KeyData) newBuilder2.instance, str);
                    ByteString byteString = protoKeySerialization.value;
                    newBuilder2.copyOnWrite();
                    KeyData.access$400((KeyData) newBuilder2.instance, byteString);
                    KeyData.KeyMaterialType keyMaterialType = protoKeySerialization.keyMaterialType;
                    newBuilder2.copyOnWrite();
                    KeyData.access$700((KeyData) newBuilder2.instance, keyMaterialType);
                    KeyData keyData = (KeyData) newBuilder2.build();
                    break;
                }
            default:
                AesCmacParameters aesCmacParameters = (AesCmacParameters) parameters;
                int i4 = aesCmacParameters.keySizeBytes;
                if (i4 != 32) {
                    a$$ExternalSyntheticBUOutline0.m$6("AesCmacKey size wrong, must be 32 bytes");
                    break;
                } else {
                    n nVar6 = new n(10, z);
                    nVar6.setParameters(aesCmacParameters);
                    nVar6.setAesKeyBytes(WireAdapter.randomBytes(i4));
                    nVar6.setIdRequirement(num);
                    break;
                }
        }
        return null;
    }
}
