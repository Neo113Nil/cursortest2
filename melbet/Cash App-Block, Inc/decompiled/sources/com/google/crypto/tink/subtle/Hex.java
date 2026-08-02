package com.google.crypto.tink.subtle;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public abstract class Hex {
    public static final int[] decode = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (!EllipticCurvesUtil.isSameEcParameterSpec(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            EllipticCurvesUtil.checkPointOnCurve(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = ((KeyFactory) EngineFactory.KEY_FACTORY.policy.getInstance("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) EngineFactory.KEY_AGREEMENT.policy.getInstance("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(generatePublic, true);
                byte[] generateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, generateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(EllipticCurvesUtil.getModulus(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                computeY(bigInteger, true, curve);
                return generateSecret;
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static BigInteger computeY(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger modulus = EllipticCurvesUtil.getModulus(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(modulus);
        if (modulus.signum() != 1) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("p must be positive");
            return null;
        }
        BigInteger mod2 = mod.mod(modulus);
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (!mod2.equals(bigInteger2)) {
            if (modulus.testBit(0) && modulus.testBit(1)) {
                bigInteger2 = mod2.modPow(modulus.add(BigInteger.ONE).shiftRight(2), modulus);
            } else if (!modulus.testBit(0) || modulus.testBit(1)) {
                bigInteger2 = null;
            } else {
                bigInteger2 = BigInteger.ONE;
                BigInteger shiftRight = modulus.subtract(bigInteger2).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(modulus);
                    if (mod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger modPow = mod3.modPow(shiftRight, modulus);
                    BigInteger bigInteger3 = BigInteger.ONE;
                    if (modPow.add(bigInteger3).equals(modulus)) {
                        BigInteger shiftRight2 = modulus.add(bigInteger3).shiftRight(1);
                        BigInteger bigInteger4 = bigInteger2;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger4.multiply(bigInteger3);
                            bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(modulus).multiply(mod3)).mod(modulus);
                            BigInteger mod4 = multiply.add(multiply).mod(modulus);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod5 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(modulus);
                                bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(modulus);
                                bigInteger4 = mod5;
                            } else {
                                bigInteger3 = mod4;
                            }
                        }
                        bigInteger2 = bigInteger4;
                    } else {
                        if (!modPow.equals(bigInteger3)) {
                            AesGcmSiv$$ExternalSyntheticLambda0.m$1("p is not prime");
                            return null;
                        }
                        bigInteger2 = bigInteger2.add(bigInteger3);
                        i++;
                        if (i == 128 && !modulus.isProbablePrime(80)) {
                            AesGcmSiv$$ExternalSyntheticLambda0.m$1("p is not prime");
                            return null;
                        }
                    }
                }
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(modulus).compareTo(mod2) != 0) {
                a$$ExternalSyntheticBUOutline0.m$6("Could not find a modular square root");
                return null;
            }
        }
        return z != bigInteger2.testBit(0) ? modulus.subtract(bigInteger2).mod(modulus) : bigInteger2;
    }

    public static byte[] decode(String str) {
        if (str.length() % 2 != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                a$$ExternalSyntheticBUOutline0.m$3("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static int fieldSizeInBytes(EllipticCurve ellipticCurve) {
        return (EllipticCurvesUtil.getModulus(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair generateKeyPair(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) EngineFactory.KEY_PAIR_GENERATOR.policy.getInstance("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECParameterSpec getCurveSpec(EllipticCurves$CurveType ellipticCurves$CurveType) {
        int ordinal = ellipticCurves$CurveType.ordinal();
        if (ordinal == 0) {
            return EllipticCurvesUtil.NIST_P256_PARAMS;
        }
        if (ordinal == 1) {
            return EllipticCurvesUtil.NIST_P384_PARAMS;
        }
        if (ordinal == 2) {
            return EllipticCurvesUtil.NIST_P521_PARAMS;
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + ellipticCurves$CurveType);
    }

    public static ECPoint pointDecode(EllipticCurve ellipticCurve, EllipticCurves$PointFormatType ellipticCurves$PointFormatType, byte[] bArr) {
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int ordinal = ellipticCurves$PointFormatType.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            if (bArr.length != (fieldSizeInBytes * 2) + 1) {
                a$$ExternalSyntheticBUOutline0.m$6("invalid point size");
                return null;
            }
            if (bArr[0] != 4) {
                a$$ExternalSyntheticBUOutline0.m$6("invalid point format");
                return null;
            }
            int i = fieldSizeInBytes + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
            EllipticCurvesUtil.checkPointOnCurve(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                MacWrapper$$ExternalSyntheticLambda0.m(ellipticCurves$PointFormatType, "invalid format:");
                return null;
            }
            if (bArr.length != fieldSizeInBytes * 2) {
                a$$ExternalSyntheticBUOutline0.m$6("invalid point size");
                return null;
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, fieldSizeInBytes)), new BigInteger(1, Arrays.copyOfRange(bArr, fieldSizeInBytes, bArr.length)));
            EllipticCurvesUtil.checkPointOnCurve(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        BigInteger modulus = EllipticCurvesUtil.getModulus(ellipticCurve);
        if (bArr.length != fieldSizeInBytes + 1) {
            a$$ExternalSyntheticBUOutline0.m$6("compressed point has wrong length");
            return null;
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                a$$ExternalSyntheticBUOutline0.m$6("invalid format");
                return null;
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() != -1 && bigInteger.compareTo(modulus) < 0) {
            return new ECPoint(bigInteger, computeY(bigInteger, z, ellipticCurve));
        }
        a$$ExternalSyntheticBUOutline0.m$6("x is out of range");
        return null;
    }

    public static byte[] pointEncode(EllipticCurve ellipticCurve, EllipticCurves$PointFormatType ellipticCurves$PointFormatType, ECPoint eCPoint) {
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, ellipticCurve);
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int ordinal = ellipticCurves$PointFormatType.ordinal();
        if (ordinal == 0) {
            int i = (fieldSizeInBytes * 2) + 1;
            byte[] bArr = new byte[i];
            byte[] bigEndianBytes = ConscryptUtil.toBigEndianBytes(eCPoint.getAffineX());
            byte[] bigEndianBytes2 = ConscryptUtil.toBigEndianBytes(eCPoint.getAffineY());
            System.arraycopy(bigEndianBytes2, 0, bArr, i - bigEndianBytes2.length, bigEndianBytes2.length);
            System.arraycopy(bigEndianBytes, 0, bArr, (fieldSizeInBytes + 1) - bigEndianBytes.length, bigEndianBytes.length);
            bArr[0] = 4;
            return bArr;
        }
        if (ordinal == 1) {
            int i2 = fieldSizeInBytes + 1;
            byte[] bArr2 = new byte[i2];
            byte[] bigEndianBytes3 = ConscryptUtil.toBigEndianBytes(eCPoint.getAffineX());
            System.arraycopy(bigEndianBytes3, 0, bArr2, i2 - bigEndianBytes3.length, bigEndianBytes3.length);
            bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        if (ordinal != 2) {
            MacWrapper$$ExternalSyntheticLambda0.m(ellipticCurves$PointFormatType, "invalid format:");
            return null;
        }
        int i3 = fieldSizeInBytes * 2;
        byte[] bArr3 = new byte[i3];
        byte[] bigEndianBytes4 = ConscryptUtil.toBigEndianBytes(eCPoint.getAffineX());
        if (bigEndianBytes4.length > fieldSizeInBytes) {
            bigEndianBytes4 = Arrays.copyOfRange(bigEndianBytes4, bigEndianBytes4.length - fieldSizeInBytes, bigEndianBytes4.length);
        }
        byte[] bigEndianBytes5 = ConscryptUtil.toBigEndianBytes(eCPoint.getAffineY());
        if (bigEndianBytes5.length > fieldSizeInBytes) {
            bigEndianBytes5 = Arrays.copyOfRange(bigEndianBytes5, bigEndianBytes5.length - fieldSizeInBytes, bigEndianBytes5.length);
        }
        System.arraycopy(bigEndianBytes5, 0, bArr3, i3 - bigEndianBytes5.length, bigEndianBytes5.length);
        System.arraycopy(bigEndianBytes4, 0, bArr3, fieldSizeInBytes - bigEndianBytes4.length, bigEndianBytes4.length);
        return bArr3;
    }
}
