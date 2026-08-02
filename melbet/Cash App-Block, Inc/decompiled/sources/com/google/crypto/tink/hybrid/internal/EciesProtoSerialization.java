package com.google.crypto.tink.hybrid.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.internal.zaaa;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.hybrid.EciesPrivateKey;
import com.google.crypto.tink.hybrid.EciesPublicKey;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.PrimitiveRegistry;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.EcPointFormat;
import com.google.crypto.tink.proto.EciesAeadDemParams;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public abstract class EciesProtoSerialization {
    public static final zaaa CURVE_TYPE_CONVERTER;
    public static final zaaa HASH_TYPE_CONVERTER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;
    public static final zaaa POINT_FORMAT_CONVERTER;
    public static final KeyParser$1 PRIVATE_KEY_PARSER;
    public static final KeySerializer$1 PRIVATE_KEY_SERIALIZER;
    public static final KeyParser$1 PUBLIC_KEY_PARSER;
    public static final KeySerializer$1 PUBLIC_KEY_SERIALIZER;
    public static final zaaa VARIANT_CONVERTER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        Bytes bytesFromPrintableAscii2 = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(EciesParameters.class, new MacWrapper$$ExternalSyntheticLambda0(5));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new MacWrapper$$ExternalSyntheticLambda0(6));
        PUBLIC_KEY_SERIALIZER = new KeySerializer$1(EciesPublicKey.class, new MacWrapper$$ExternalSyntheticLambda0(7));
        PUBLIC_KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii2, new MacWrapper$$ExternalSyntheticLambda0(8));
        PRIVATE_KEY_SERIALIZER = new KeySerializer$1(EciesPrivateKey.class, new MacWrapper$$ExternalSyntheticLambda0(9));
        PRIVATE_KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new MacWrapper$$ExternalSyntheticLambda0(10));
        PrimitiveRegistry.Builder builder = zaaa.builder();
        builder.add(OutputPrefixType.RAW, EciesParameters.Variant.NO_PREFIX);
        builder.add(OutputPrefixType.TINK, EciesParameters.Variant.TINK);
        OutputPrefixType outputPrefixType = OutputPrefixType.LEGACY;
        EciesParameters.Variant variant = EciesParameters.Variant.CRUNCHY;
        builder.add(outputPrefixType, variant);
        builder.add(OutputPrefixType.CRUNCHY, variant);
        VARIANT_CONVERTER = builder.build();
        PrimitiveRegistry.Builder builder2 = zaaa.builder();
        builder2.add(HashType.SHA1, EciesParameters.HashType.SHA1);
        builder2.add(HashType.SHA224, EciesParameters.HashType.SHA224);
        builder2.add(HashType.SHA256, EciesParameters.HashType.SHA256);
        builder2.add(HashType.SHA384, EciesParameters.HashType.SHA384);
        builder2.add(HashType.SHA512, EciesParameters.HashType.SHA512);
        HASH_TYPE_CONVERTER = builder2.build();
        PrimitiveRegistry.Builder builder3 = zaaa.builder();
        builder3.add(EllipticCurveType.NIST_P256, EciesParameters.CurveType.NIST_P256);
        builder3.add(EllipticCurveType.NIST_P384, EciesParameters.CurveType.NIST_P384);
        builder3.add(EllipticCurveType.NIST_P521, EciesParameters.CurveType.NIST_P521);
        builder3.add(EllipticCurveType.CURVE25519, EciesParameters.CurveType.X25519);
        CURVE_TYPE_CONVERTER = builder3.build();
        PrimitiveRegistry.Builder builder4 = zaaa.builder();
        builder4.add(EcPointFormat.UNCOMPRESSED, EciesParameters.PointFormat.UNCOMPRESSED);
        builder4.add(EcPointFormat.COMPRESSED, EciesParameters.PointFormat.COMPRESSED);
        builder4.add(EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, EciesParameters.PointFormat.LEGACY_UNCOMPRESSED);
        POINT_FORMAT_CONVERTER = builder4.build();
    }

    public static EciesParameters fromProtoParameters(OutputPrefixType outputPrefixType, EciesAeadHkdfParams eciesAeadHkdfParams) {
        KeyTemplate.Builder newBuilder = KeyTemplate.newBuilder();
        newBuilder.setTypeUrl$1(eciesAeadHkdfParams.getDemParams().getAeadDem().getTypeUrl());
        newBuilder.setOutputPrefixType(OutputPrefixType.RAW);
        newBuilder.setValue$1(eciesAeadHkdfParams.getDemParams().getAeadDem().getValue());
        KeyTemplate keyTemplate = (KeyTemplate) newBuilder.build();
        zzlj builder = EciesParameters.builder();
        builder.zzd = (EciesParameters.Variant) VARIANT_CONVERTER.fromProtoEnum(outputPrefixType);
        builder.zza = (EciesParameters.CurveType) CURVE_TYPE_CONVERTER.fromProtoEnum(eciesAeadHkdfParams.getKemParams().getCurveType());
        builder.zzb = (EciesParameters.HashType) HASH_TYPE_CONVERTER.fromProtoEnum(eciesAeadHkdfParams.getKemParams().getHkdfHashType());
        builder.setDemParameters(Trace.parse(keyTemplate.toByteArray()));
        Bytes copyFrom = Bytes.copyFrom(eciesAeadHkdfParams.getKemParams().getHkdfSalt().toByteArray());
        if (copyFrom.data.length == 0) {
            builder.zzf = null;
        } else {
            builder.zzf = copyFrom;
        }
        if (!eciesAeadHkdfParams.getKemParams().getCurveType().equals(EllipticCurveType.CURVE25519)) {
            builder.zzc = (EciesParameters.PointFormat) POINT_FORMAT_CONVERTER.fromProtoEnum(eciesAeadHkdfParams.getEcPointFormat());
        } else if (!eciesAeadHkdfParams.getEcPointFormat().equals(EcPointFormat.COMPRESSED)) {
            a$$ExternalSyntheticBUOutline0.m$6("For CURVE25519 EcPointFormat must be compressed");
            return null;
        }
        return builder.m2008build();
    }

    public static int getEncodingLength(EciesParameters.CurveType curveType) {
        if (EciesParameters.CurveType.NIST_P256 == curveType) {
            return 33;
        }
        if (EciesParameters.CurveType.NIST_P384 == curveType) {
            return 49;
        }
        if (EciesParameters.CurveType.NIST_P521 == curveType) {
            return 67;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(curveType, "Unable to serialize CurveType ");
        return 0;
    }

    public static EciesAeadHkdfParams toProtoParameters(EciesParameters eciesParameters) {
        EciesHkdfKemParams.Builder newBuilder = EciesHkdfKemParams.newBuilder();
        EllipticCurveType ellipticCurveType = (EllipticCurveType) CURVE_TYPE_CONVERTER.toProtoEnum(eciesParameters.curveType);
        newBuilder.copyOnWrite();
        EciesHkdfKemParams.access$200((EciesHkdfKemParams) newBuilder.instance, ellipticCurveType);
        HashType hashType = (HashType) HASH_TYPE_CONVERTER.toProtoEnum(eciesParameters.hashType);
        newBuilder.copyOnWrite();
        EciesHkdfKemParams.access$500((EciesHkdfKemParams) newBuilder.instance, hashType);
        Bytes bytes = eciesParameters.salt;
        if (bytes != null && bytes.data.length > 0) {
            byte[] byteArray = bytes.toByteArray();
            ByteString.LiteralByteString copyFrom = ByteString.copyFrom(0, byteArray.length, byteArray);
            newBuilder.copyOnWrite();
            EciesHkdfKemParams.access$700((EciesHkdfKemParams) newBuilder.instance, copyFrom);
        }
        EciesHkdfKemParams eciesHkdfKemParams = (EciesHkdfKemParams) newBuilder.build();
        try {
            KeyTemplate parseFrom = KeyTemplate.parseFrom(Trace.serialize(eciesParameters.demParameters), ExtensionRegistryLite.getEmptyRegistry());
            EciesAeadDemParams.Builder newBuilder2 = EciesAeadDemParams.newBuilder();
            KeyTemplate.Builder newBuilder3 = KeyTemplate.newBuilder();
            newBuilder3.setTypeUrl$1(parseFrom.getTypeUrl());
            newBuilder3.setOutputPrefixType(OutputPrefixType.TINK);
            newBuilder3.setValue$1(parseFrom.getValue());
            KeyTemplate keyTemplate = (KeyTemplate) newBuilder3.build();
            newBuilder2.copyOnWrite();
            EciesAeadDemParams.access$100((EciesAeadDemParams) newBuilder2.instance, keyTemplate);
            EciesAeadDemParams eciesAeadDemParams = (EciesAeadDemParams) newBuilder2.build();
            EciesParameters.PointFormat pointFormat = eciesParameters.nistCurvePointFormat;
            if (pointFormat == null) {
                pointFormat = EciesParameters.PointFormat.COMPRESSED;
            }
            EciesAeadHkdfParams.Builder newBuilder4 = EciesAeadHkdfParams.newBuilder();
            newBuilder4.copyOnWrite();
            EciesAeadHkdfParams.access$100((EciesAeadHkdfParams) newBuilder4.instance, eciesHkdfKemParams);
            newBuilder4.copyOnWrite();
            EciesAeadHkdfParams.access$400((EciesAeadHkdfParams) newBuilder4.instance, eciesAeadDemParams);
            EcPointFormat ecPointFormat = (EcPointFormat) POINT_FORMAT_CONVERTER.toProtoEnum(pointFormat);
            newBuilder4.copyOnWrite();
            EciesAeadHkdfParams.access$800((EciesAeadHkdfParams) newBuilder4.instance, ecPointFormat);
            return (EciesAeadHkdfParams) newBuilder4.build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    public static EciesAeadHkdfPublicKey toProtoPublicKey(EciesPublicKey eciesPublicKey) {
        EciesParameters eciesParameters = eciesPublicKey.parameters;
        if (eciesParameters.curveType.equals(EciesParameters.CurveType.X25519)) {
            EciesAeadHkdfPublicKey.Builder newBuilder = EciesAeadHkdfPublicKey.newBuilder();
            newBuilder.copyOnWrite();
            ((EciesAeadHkdfPublicKey) newBuilder.instance).version_ = 0;
            EciesAeadHkdfParams protoParameters = toProtoParameters(eciesParameters);
            newBuilder.copyOnWrite();
            EciesAeadHkdfPublicKey.access$300((EciesAeadHkdfPublicKey) newBuilder.instance, protoParameters);
            byte[] byteArray = eciesPublicKey.x25519PublicPointBytes.toByteArray();
            ByteString.LiteralByteString copyFrom = ByteString.copyFrom(0, byteArray.length, byteArray);
            newBuilder.copyOnWrite();
            EciesAeadHkdfPublicKey.access$600((EciesAeadHkdfPublicKey) newBuilder.instance, copyFrom);
            ByteString.LiteralByteString literalByteString = ByteString.EMPTY;
            newBuilder.copyOnWrite();
            EciesAeadHkdfPublicKey.access$800((EciesAeadHkdfPublicKey) newBuilder.instance, literalByteString);
            return (EciesAeadHkdfPublicKey) newBuilder.build();
        }
        int encodingLength = getEncodingLength(eciesParameters.curveType);
        ECPoint eCPoint = eciesPublicKey.nistPublicPoint;
        if (eCPoint == null) {
            a$$ExternalSyntheticBUOutline0.m$6("NistCurvePoint was null for NIST curve");
            return null;
        }
        EciesAeadHkdfPublicKey.Builder newBuilder2 = EciesAeadHkdfPublicKey.newBuilder();
        newBuilder2.copyOnWrite();
        ((EciesAeadHkdfPublicKey) newBuilder2.instance).version_ = 0;
        EciesAeadHkdfParams protoParameters2 = toProtoParameters(eciesParameters);
        newBuilder2.copyOnWrite();
        EciesAeadHkdfPublicKey.access$300((EciesAeadHkdfPublicKey) newBuilder2.instance, protoParameters2);
        byte[] bigEndianBytesOfFixedLength = ConscryptUtil.toBigEndianBytesOfFixedLength(encodingLength, eCPoint.getAffineX());
        ByteString.LiteralByteString copyFrom2 = ByteString.copyFrom(0, bigEndianBytesOfFixedLength.length, bigEndianBytesOfFixedLength);
        newBuilder2.copyOnWrite();
        EciesAeadHkdfPublicKey.access$600((EciesAeadHkdfPublicKey) newBuilder2.instance, copyFrom2);
        byte[] bigEndianBytesOfFixedLength2 = ConscryptUtil.toBigEndianBytesOfFixedLength(encodingLength, eCPoint.getAffineY());
        ByteString.LiteralByteString copyFrom3 = ByteString.copyFrom(0, bigEndianBytesOfFixedLength2.length, bigEndianBytesOfFixedLength2);
        newBuilder2.copyOnWrite();
        EciesAeadHkdfPublicKey.access$800((EciesAeadHkdfPublicKey) newBuilder2.instance, copyFrom3);
        return (EciesAeadHkdfPublicKey) newBuilder2.build();
    }
}
