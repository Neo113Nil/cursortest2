package ru.CryptoPro.JCP.params;

import defpackage.oyr;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.EllipticCurve;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class ECDSAParams {
    public static final int DEFAULT_KEYLEN_BUTS = 512;

    public static AlgIdInterface getAlgIdSpec(int i, EllipticCurve ellipticCurve) throws InvalidAlgorithmParameterException {
        if (i == 192) {
            return new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA, ECDSAParamsSpec.OID_ECDSA_P192);
        }
        if (i == 224) {
            return new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA, ECDSAParamsSpec.OID_ECDSA_P224);
        }
        if (i == 256) {
            byte[] byteArrayFromBigInteger = Array.getByteArrayFromBigInteger(ellipticCurve.getB(), getBitsFromKeyLength(i) / 16);
            Array.invByteOrder(byteArrayFromBigInteger);
            return Array.compare(Array.toIntArray(byteArrayFromBigInteger), ECDSAConsts.ECC_P_256_b) ? new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA, ECDSAParamsSpec.OID_ECDSA_P256) : new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA, ECDSAParamsSpec.OID_ECDSA_SECP256K1);
        }
        if (i == 384) {
            return new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA, ECDSAParamsSpec.OID_ECDSA_P384);
        }
        if (i == 521) {
            return new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA, ECDSAParamsSpec.OID_ECDSA_P521);
        }
        throw new InvalidAlgorithmParameterException(oyr.i(i, "Invalid key length: "));
    }

    public static int getBitsFromKeyLength(int i) throws InvalidAlgorithmParameterException {
        if (i == 192) {
            return 384;
        }
        if (i == 224) {
            return 448;
        }
        if (i == 256) {
            return 512;
        }
        if (i == 384) {
            return 768;
        }
        if (i == 521) {
            return 1056;
        }
        throw new InvalidAlgorithmParameterException(oyr.i(i, "Invalid key length: "));
    }

    public static int getBitsLenFromName(String str) throws InvalidAlgorithmParameterException {
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P192_NAME)) {
            return 384;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P224_NAME)) {
            return 448;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P256_NAME) || str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_SECP256K1_NAME)) {
            return 512;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P384_NAME)) {
            return 768;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P521_NAME)) {
            return 1056;
        }
        throw new InvalidAlgorithmParameterException("Invalid name: ".concat(str));
    }

    public static int getBitsLenFromOID(OID oid) throws InvalidAlgorithmParameterException {
        if (oid.equals(ECDSAParamsSpec.OID_ECDSA_P192)) {
            return 384;
        }
        if (oid.equals(ECDSAParamsSpec.OID_ECDSA_P224)) {
            return 448;
        }
        if (oid.equals(ECDSAParamsSpec.OID_ECDSA_P256) || oid.equals(ECDSAParamsSpec.OID_ECDSA_SECP256K1)) {
            return 512;
        }
        if (oid.equals(ECDSAParamsSpec.OID_ECDSA_P384)) {
            return 768;
        }
        if (oid.equals(ECDSAParamsSpec.OID_ECDSA_P521)) {
            return 1056;
        }
        throw new InvalidAlgorithmParameterException("Invalid oid: " + oid.toString());
    }

    public static int getKeyLenFromBits(int i) throws InvalidAlgorithmParameterException {
        if (i == 384) {
            return 192;
        }
        if (i == 448) {
            return 224;
        }
        if (i == 512) {
            return 256;
        }
        if (i == 768) {
            return 384;
        }
        if (i == 1056) {
            return 521;
        }
        throw new InvalidAlgorithmParameterException(oyr.i(i, "Invalid bits length: "));
    }

    public static OID getOIDFromBitsLen(int i) throws InvalidAlgorithmParameterException {
        if (i == 384) {
            return ECDSAParamsSpec.OID_ECDSA_P192;
        }
        if (i == 448) {
            return ECDSAParamsSpec.OID_ECDSA_P224;
        }
        if (i == 512) {
            return ECDSAParamsSpec.OID_ECDSA_P256;
        }
        if (i == 768) {
            return ECDSAParamsSpec.OID_ECDSA_P384;
        }
        if (i == 1056) {
            return ECDSAParamsSpec.OID_ECDSA_P521;
        }
        throw new InvalidAlgorithmParameterException(oyr.i(i, "Invalid bits length: "));
    }

    public static OID getOIDFromName(String str) throws InvalidAlgorithmParameterException {
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P192_NAME)) {
            return ECDSAParamsSpec.OID_ECDSA_P192;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P224_NAME)) {
            return ECDSAParamsSpec.OID_ECDSA_P224;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P256_NAME)) {
            return ECDSAParamsSpec.OID_ECDSA_P256;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_SECP256K1_NAME)) {
            return ECDSAParamsSpec.OID_ECDSA_SECP256K1;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P384_NAME)) {
            return ECDSAParamsSpec.OID_ECDSA_P384;
        }
        if (str.equalsIgnoreCase(ECDSAParamsSpec.ECDSA_P521_NAME)) {
            return ECDSAParamsSpec.OID_ECDSA_P521;
        }
        throw new InvalidAlgorithmParameterException("Invalid name: ".concat(str));
    }
}
