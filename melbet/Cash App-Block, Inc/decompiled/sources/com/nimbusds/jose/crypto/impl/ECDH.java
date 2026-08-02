package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.crypto.opts.CipherMode;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECParameterTable;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.StandardCharset;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.OneOf;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Collection;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import kotlin.reflect.TypesJVMKt;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public abstract class ECDH {
    public static final byte[] ONE_BYTES = {0, 0, 0, 1};
    public static final byte[] ZERO_BYTES = {0, 0, 0, 0};
    public static final byte[] ENCRYPTION_BYTES = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};
    public static final byte[] INTEGRITY_BYTES = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static byte[] compute(String str, SecretKey secretKey, byte[] bArr, Provider provider) {
        try {
            Mac mac = provider != null ? Mac.getInstance(str, provider) : Mac.getInstance(str);
            mac.init(secretKey);
            mac.update(bArr);
            return mac.doFinal();
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid HMAC key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e2.getMessage(), e2);
        }
    }

    public static Cipher createAESCBCCipher(SecretKeySpec secretKeySpec, boolean z, byte[] bArr, Provider provider) {
        try {
            Cipher cipher = provider == null ? Cipher.getInstance("AES/CBC/PKCS5Padding") : Cipher.getInstance("AES/CBC/PKCS5Padding", provider);
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(secretKeySpec.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z) {
                cipher.init(1, secretKeySpec2, ivParameterSpec);
                return cipher;
            }
            cipher.init(2, secretKeySpec2, ivParameterSpec);
            return cipher;
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static SecretKeySpec deriveSharedSecret(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            try {
                keyAgreement.init(eCPrivateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
            } catch (InvalidKeyException e) {
                throw new JOSEException("Invalid key for ECDH key agreement: " + e.getMessage(), e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new JOSEException("Couldn't get an ECDH key agreement instance: " + e2.getMessage(), e2);
        }
    }

    public static byte[] encryptCEK(RSAPublicKey rSAPublicKey, SecretKey secretKey, int i, CipherMode cipherMode, Provider provider) {
        MGF1ParameterSpec mGF1ParameterSpec;
        String str;
        String str2;
        if (256 == i) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            str = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            str2 = "SHA-256";
        } else if (384 == i) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            str = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
            str2 = McElieceCCA2KeyGenParameterSpec.SHA384;
        } else {
            if (512 != i) {
                throw new JOSEException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported SHA-2 bit size: "));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            str = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
            str2 = "SHA-512";
        }
        try {
            AlgorithmParameters algorithmParameters = provider == null ? AlgorithmParameters.getInstance("OAEP") : AlgorithmParameters.getInstance("OAEP", provider);
            algorithmParameters.init(new OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Cipher cipher = provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            cipher.init(cipherMode.modeForEncryption, rSAPublicKey, algorithmParameters);
            return cipherMode == CipherMode.WRAP_UNWRAP ? cipher.wrap(secretKey) : cipher.doFinal(secretKey.getEncoded());
        } catch (InvalidKeyException e) {
            throw new JOSEException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Encryption failed due to invalid RSA key for SHA-", ": The RSA key may be too short, use a longer key"), e);
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    public static void ensureLegalSignature(byte[] bArr, JWSAlgorithm jWSAlgorithm) {
        for (byte b : bArr) {
            if (b != 0) {
                Set forJWSAlgorithm = Curve.forJWSAlgorithm(jWSAlgorithm);
                if (forJWSAlgorithm == null || forJWSAlgorithm.size() > 1) {
                    JWK$$ExternalSyntheticBUOutline0.m$2(jWSAlgorithm, "Unsupported JWS algorithm: ");
                    return;
                }
                Curve curve = (Curve) forJWSAlgorithm.iterator().next();
                ECParameterSpec eCParameterSpec = ECParameterTable.get(curve);
                if (eCParameterSpec == null) {
                    JWK$$ExternalSyntheticBUOutline0.m$2(curve, "Unsupported curve: ");
                    return;
                }
                int signatureByteArrayLength = getSignatureByteArrayLength(jWSAlgorithm);
                if (getSignatureByteArrayLength(jWSAlgorithm) != bArr.length) {
                    throw new JOSEException("Illegal signature length");
                }
                int i = signatureByteArrayLength / 2;
                BigInteger bigInteger = new BigInteger(1, OneOf.subArray(bArr, 0, i));
                BigInteger bigInteger2 = new BigInteger(1, OneOf.subArray(bArr, i, i));
                BigInteger bigInteger3 = BigInteger.ZERO;
                if (bigInteger2.equals(bigInteger3) || bigInteger.equals(bigInteger3)) {
                    throw new JOSEException("S and R must not be 0");
                }
                BigInteger order = eCParameterSpec.getOrder();
                if (order.compareTo(bigInteger) < 1 || order.compareTo(bigInteger2) < 1) {
                    throw new JOSEException("S and R must not exceed N");
                }
                if (bigInteger.mod(order).equals(bigInteger3) || bigInteger2.mod(order).equals(bigInteger3)) {
                    throw new JOSEException("R or S mod N != 0 check failed");
                }
                return;
            }
        }
        throw new JOSEException("Blank signature");
    }

    public static SecretKeySpec generateCIK(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(ONE_BYTES);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(TypesJVMKt.toBytes(length));
            byteArrayOutputStream.write(encryptionMethod.name.getBytes(StandardCharset.UTF_8));
            byte[] bArr3 = ZERO_BYTES;
            if (bArr != null) {
                byteArrayOutputStream.write(TypesJVMKt.toBytes(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(TypesJVMKt.toBytes(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            byteArrayOutputStream.write(INTEGRITY_BYTES);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), JsonLogicResult$Success$$ExternalSyntheticOutline0.m(length, "HMACSHA"));
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    public static int getSignatureByteArrayLength(JWSAlgorithm jWSAlgorithm) {
        if (jWSAlgorithm.equals(JWSAlgorithm.ES256) || jWSAlgorithm.equals(JWSAlgorithm.ES256K)) {
            return 64;
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
            return 96;
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
            return EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE;
        }
        throw new JOSEException(unsupportedJWSAlgorithm(jWSAlgorithm, ECDSAProvider.SUPPORTED_ALGORITHMS));
    }

    public static Signature getSignerAndVerifier(String str, Provider provider, PSSParameterSpec pSSParameterSpec) {
        try {
            Signature signature = provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
            if (pSSParameterSpec == null) {
                return signature;
            }
            try {
                signature.setParameter(pSSParameterSpec);
                return signature;
            } catch (InvalidAlgorithmParameterException e) {
                throw new JOSEException("Invalid RSASSA-PSS salt length parameter: " + e.getMessage(), e);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String itemize(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Object[] array2 = collection.toArray();
        for (int i = 0; i < array2.length; i++) {
            if (i != 0) {
                if (i < array2.length - 1) {
                    sb.append(", ");
                } else if (i == array2.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array2[i].toString());
        }
        return sb.toString();
    }

    public static byte[] transcodeSignatureToDER(byte[] bArr) {
        byte[] bArr2;
        try {
            int length = bArr.length / 2;
            int i = length;
            while (i > 0 && bArr[length - i] == 0) {
                i--;
            }
            int i2 = length - i;
            int i3 = bArr[i2] < 0 ? i + 1 : i;
            int i4 = length;
            while (i4 > 0 && bArr[(length * 2) - i4] == 0) {
                i4--;
            }
            int i5 = (length * 2) - i4;
            int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
            int i7 = i3 + 4 + i6;
            if (i7 > 255) {
                throw new JOSEException("Invalid ECDSA signature format");
            }
            int i8 = 1;
            if (i7 < 128) {
                bArr2 = new byte[i3 + 6 + i6];
            } else {
                bArr2 = new byte[i3 + 7 + i6];
                bArr2[1] = -127;
                i8 = 2;
            }
            bArr2[0] = 48;
            bArr2[i8] = (byte) i7;
            bArr2[i8 + 1] = 2;
            bArr2[i8 + 2] = (byte) i3;
            int i9 = i8 + 3 + i3;
            System.arraycopy(bArr, i2, bArr2, i9 - i, i);
            bArr2[i9] = 2;
            bArr2[i9 + 1] = (byte) i6;
            System.arraycopy(bArr, i5, bArr2, ((i9 + 2) + i6) - i4, i4);
            return bArr2;
        } catch (Exception e) {
            if (e instanceof JOSEException) {
                throw e;
            }
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static String unsupportedEncryptionMethod(EncryptionMethod encryptionMethod, Collection collection) {
        return "Unsupported JWE encryption method " + encryptionMethod + ", must be " + itemize(collection);
    }

    public static String unsupportedJWEAlgorithm(JWEAlgorithm jWEAlgorithm, Collection collection) {
        return "Unsupported JWE algorithm " + jWEAlgorithm + ", must be " + itemize(collection);
    }

    public static String unsupportedJWSAlgorithm(JWSAlgorithm jWSAlgorithm, Collection collection) {
        return "Unsupported JWS algorithm " + jWSAlgorithm + ", must be " + itemize(collection);
    }
}
