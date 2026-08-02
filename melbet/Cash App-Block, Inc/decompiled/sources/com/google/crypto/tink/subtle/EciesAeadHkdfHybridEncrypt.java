package com.google.crypto.tink.subtle;

import com.google.android.gms.common.api.internal.zaaa;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.hybrid.internal.EciesDemHelper;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.internal.PrimitiveRegistry;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.zxing.Result;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class EciesAeadHkdfHybridEncrypt implements HybridEncrypt {
    public static final zaaa CURVE_TYPE_CONVERTER;
    public static final zaaa POINT_FORMAT_TYPE_CONVERTER;
    public final EciesDemHelper.Dem dem;
    public final EllipticCurves$PointFormatType ecPointFormat;
    public final String hkdfHmacAlgo;
    public final byte[] hkdfSalt;
    public final byte[] outputPrefix;
    public final ConnectionPool senderKem;

    static {
        PrimitiveRegistry.Builder builder = zaaa.builder();
        builder.add(EllipticCurves$CurveType.NIST_P256, EciesParameters.CurveType.NIST_P256);
        builder.add(EllipticCurves$CurveType.NIST_P384, EciesParameters.CurveType.NIST_P384);
        builder.add(EllipticCurves$CurveType.NIST_P521, EciesParameters.CurveType.NIST_P521);
        CURVE_TYPE_CONVERTER = builder.build();
        PrimitiveRegistry.Builder builder2 = zaaa.builder();
        builder2.add(EllipticCurves$PointFormatType.UNCOMPRESSED, EciesParameters.PointFormat.UNCOMPRESSED);
        builder2.add(EllipticCurves$PointFormatType.COMPRESSED, EciesParameters.PointFormat.COMPRESSED);
        builder2.add(EllipticCurves$PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, EciesParameters.PointFormat.LEGACY_UNCOMPRESSED);
        POINT_FORMAT_TYPE_CONVERTER = builder2.build();
    }

    public EciesAeadHkdfHybridEncrypt(ECPublicKey eCPublicKey, byte[] bArr, String str, EllipticCurves$PointFormatType ellipticCurves$PointFormatType, EciesDemHelper.Dem dem, byte[] bArr2) {
        EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.senderKem = new ConnectionPool(eCPublicKey);
        this.hkdfSalt = bArr;
        this.hkdfHmacAlgo = str;
        this.ecPointFormat = ellipticCurves$PointFormatType;
        this.dem = dem;
        this.outputPrefix = bArr2;
    }

    public static final String toHmacAlgo(EciesParameters.HashType hashType) {
        if (hashType.equals(EciesParameters.HashType.SHA1)) {
            return "HmacSha1";
        }
        if (hashType == EciesParameters.HashType.SHA224) {
            return "HmacSha224";
        }
        if (hashType == EciesParameters.HashType.SHA256) {
            return "HmacSha256";
        }
        if (hashType == EciesParameters.HashType.SHA384) {
            return "HmacSha384";
        }
        if (hashType == EciesParameters.HashType.SHA512) {
            return "HmacSha512";
        }
        MacWrapper$$ExternalSyntheticLambda0.m(hashType, "hash unsupported for EciesAeadHkdf: ");
        return null;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public final byte[] encrypt(byte[] bArr) {
        EciesDemHelper.Dem dem = this.dem;
        int symmetricKeySizeInBytes = dem.getSymmetricKeySizeInBytes();
        ECPublicKey eCPublicKey = (ECPublicKey) this.senderKem.delegate;
        KeyPair generateKeyPair = Hex.generateKeyPair(eCPublicKey.getParams());
        ECPublicKey eCPublicKey2 = (ECPublicKey) generateKeyPair.getPublic();
        byte[] computeSharedSecret = Hex.computeSharedSecret((ECPrivateKey) generateKeyPair.getPrivate(), eCPublicKey);
        byte[] pointEncode = Hex.pointEncode(eCPublicKey2.getParams().getCurve(), this.ecPointFormat, eCPublicKey2.getW());
        Result result = new Result(pointEncode, Hkdf.computeEciesHkdfSymmetricKey(pointEncode, computeSharedSecret, this.hkdfHmacAlgo, this.hkdfSalt, null, symmetricKeySizeInBytes));
        return dem.encrypt(result.getSymmetricKey(), this.outputPrefix, result.getKemBytes(), bArr);
    }
}
