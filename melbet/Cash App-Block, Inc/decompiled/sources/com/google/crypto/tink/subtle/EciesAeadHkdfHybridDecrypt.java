package com.google.crypto.tink.subtle;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.hybrid.EciesPrivateKey;
import com.google.crypto.tink.hybrid.internal.EciesDemHelper;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.Util;
import com.squareup.scannerview.SizeMap;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class EciesAeadHkdfHybridDecrypt implements HybridDecrypt {
    public final EciesDemHelper.Dem dem;
    public final EllipticCurves$PointFormatType ecPointFormat;
    public final String hkdfHmacAlgo;
    public final byte[] hkdfSalt;
    public final byte[] outputPrefix;
    public final SizeMap recipientKem;
    public final ECPrivateKey recipientPrivateKey;

    public EciesAeadHkdfHybridDecrypt(ECPrivateKey eCPrivateKey, byte[] bArr, String str, EllipticCurves$PointFormatType ellipticCurves$PointFormatType, EciesDemHelper.Dem dem, byte[] bArr2) {
        this.recipientPrivateKey = eCPrivateKey;
        SizeMap sizeMap = new SizeMap(5, false);
        sizeMap.mRatios = eCPrivateKey;
        this.recipientKem = sizeMap;
        this.hkdfSalt = bArr;
        this.hkdfHmacAlgo = str;
        this.ecPointFormat = ellipticCurves$PointFormatType;
        this.dem = dem;
        this.outputPrefix = bArr2;
    }

    public static EciesAeadHkdfHybridDecrypt create(EciesPrivateKey eciesPrivateKey) {
        EllipticCurves$CurveType ellipticCurves$CurveType = (EllipticCurves$CurveType) EciesAeadHkdfHybridEncrypt.CURVE_TYPE_CONVERTER.toProtoEnum(eciesPrivateKey.publicKey.parameters.curveType);
        byte[] bigEndianBytes = ConscryptUtil.toBigEndianBytes((BigInteger) eciesPrivateKey.nistPrivateKeyValue.delegate);
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) EngineFactory.KEY_FACTORY.policy.getInstance("EC")).generatePrivate(new ECPrivateKeySpec(ConscryptUtil.fromUnsignedBigEndianBytes(bigEndianBytes), Hex.getCurveSpec(ellipticCurves$CurveType)));
        byte[] bArr = new byte[0];
        EciesParameters eciesParameters = eciesPrivateKey.publicKey.parameters;
        com.google.crypto.tink.util.Bytes bytes = eciesParameters.salt;
        if (bytes != null) {
            bArr = bytes.toByteArray();
        }
        return new EciesAeadHkdfHybridDecrypt(eCPrivateKey, bArr, EciesAeadHkdfHybridEncrypt.toHmacAlgo(eciesParameters.hashType), (EllipticCurves$PointFormatType) EciesAeadHkdfHybridEncrypt.POINT_FORMAT_TYPE_CONVERTER.toProtoEnum(eciesParameters.nistCurvePointFormat), EciesDemHelper.getDem(eciesParameters), eciesPrivateKey.mo2034getPublicKey().getOutputPrefix().toByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    @Override // com.google.crypto.tink.HybridDecrypt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        byte[] bArr3 = this.outputPrefix;
        if (!Util.isPrefix(bArr3, bArr)) {
            a$$ExternalSyntheticBUOutline0.m$6("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        int length = bArr3.length;
        int fieldSizeInBytes = Hex.fieldSizeInBytes(this.recipientPrivateKey.getParams().getCurve());
        EllipticCurves$PointFormatType ellipticCurves$PointFormatType = this.ecPointFormat;
        int ordinal = ellipticCurves$PointFormatType.ordinal();
        if (ordinal == 0) {
            fieldSizeInBytes *= 2;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                a$$ExternalSyntheticBUOutline0.m$6("unknown EC point format");
                return null;
            }
            i = fieldSizeInBytes * 2;
            i2 = i + length;
            if (bArr.length >= i2) {
                a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, length, i2);
            EciesDemHelper.Dem dem = this.dem;
            int symmetricKeySizeInBytes = dem.getSymmetricKeySizeInBytes();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) this.recipientKem.mRatios;
            ECParameterSpec params = eCPrivateKey.getParams();
            return dem.decrypt(Hkdf.computeEciesHkdfSymmetricKey(copyOfRange, Hex.computeSharedSecret(eCPrivateKey, (ECPublicKey) ((KeyFactory) EngineFactory.KEY_FACTORY.policy.getInstance("EC")).generatePublic(new ECPublicKeySpec(Hex.pointDecode(params.getCurve(), ellipticCurves$PointFormatType, copyOfRange), params))), this.hkdfHmacAlgo, this.hkdfSalt, bArr2, symmetricKeySizeInBytes), bArr, i2);
        }
        i = fieldSizeInBytes + 1;
        i2 = i + length;
        if (bArr.length >= i2) {
        }
    }
}
