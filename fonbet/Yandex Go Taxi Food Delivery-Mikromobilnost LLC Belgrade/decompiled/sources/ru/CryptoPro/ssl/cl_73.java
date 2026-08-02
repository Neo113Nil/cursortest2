package ru.CryptoPro.ssl;

import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qq61;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
final class cl_73 {
    public static final boolean a;

    static {
        boolean z;
        try {
            AccessController.doPrivileged(new cl_74());
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        a = z;
    }

    public static SecretKey a(SecretKeyInterface secretKeyInterface) throws InvalidKeyException {
        try {
            return SecretKeyFactory.getInstance("GOST28147", cpSSLConfig.getDefaultEncryptionSSLProvider()).generateSecret(secretKeyInterface);
        } catch (Exception e) {
            throw new InvalidKeyException("Invalid keySpec: " + secretKeyInterface, e);
        }
    }

    public static ECPoint b(byte[] bArr, EllipticCurve ellipticCurve) {
        String str;
        int i = qq61.b;
        if (bArr.length == 0 || bArr[0] != 4) {
            str = "Only uncompressed point format supported";
        } else {
            int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) >> 3;
            if (bArr.length == (fieldSize * 2) + 1) {
                byte[] bArr2 = new byte[fieldSize];
                byte[] bArr3 = new byte[fieldSize];
                System.arraycopy(bArr, 1, bArr2, 0, fieldSize);
                System.arraycopy(bArr, fieldSize + 1, bArr3, 0, fieldSize);
                return new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3));
            }
            str = "Point does not match field size";
        }
        ny61.v(str);
        return null;
    }

    public static Cipher c(String str) {
        try {
            return Cipher.getInstance(str, cpSSLConfig.getDefaultEncryptionSSLProvider());
        } catch (NoSuchPaddingException e) {
            throw new NoSuchAlgorithmException(e);
        }
    }

    public static byte[] d(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        int i = qq61.b;
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) >> 3;
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        int i2 = 0;
        while (i2 < byteArray.length - 1 && byteArray[i2] == 0) {
            i2++;
        }
        if (i2 != 0) {
            int length = byteArray.length - i2;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, i2, bArr, 0, length);
            byteArray = bArr;
        }
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        int i3 = 0;
        while (i3 < byteArray2.length - 1 && byteArray2[i3] == 0) {
            i3++;
        }
        if (i3 != 0) {
            int length2 = byteArray2.length - i3;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(byteArray2, i3, bArr2, 0, length2);
            byteArray2 = bArr2;
        }
        if (byteArray.length > fieldSize || byteArray2.length > fieldSize) {
            kbs.g("Point coordinates do not match field size");
            return null;
        }
        int i4 = (fieldSize << 1) + 1;
        byte[] bArr3 = new byte[i4];
        bArr3[0] = 4;
        System.arraycopy(byteArray, 0, bArr3, (fieldSize - byteArray.length) + 1, byteArray.length);
        System.arraycopy(byteArray2, 0, bArr3, i4 - byteArray2.length, byteArray2.length);
        return bArr3;
    }

    public static Signature e(String str) {
        return Signature.getInstance(str, cpSSLConfig.getDefaultDigestSignatureSSLProvider());
    }

    public static RSAPublicKeySpec f(PublicKey publicKey) {
        if (publicKey instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        try {
            return (RSAPublicKeySpec) KeyFactory.getInstance("RSA", g("RSA")).getKeySpec(publicKey, RSAPublicKeySpec.class);
        } catch (Exception e) {
            throw ((RuntimeException) new RuntimeException().initCause(e));
        }
    }

    public static String g(String str) {
        return (str.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) || str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_EL_EPH_DEGREE_NAME) || str.equalsIgnoreCase(JCP.GOST_EPH_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_EPH_2012_512_NAME)) ? cpSSLConfig.getDefaultDigestSignatureSSLProvider() : cpSSLConfig.getDefaultEncryptionSSLProvider();
    }

    public static SecureRandom h() {
        try {
            return SecureRandom.getInstance(JCP.CP_RANDOM, cpSSLConfig.getDefaultDigestSignatureSSLProvider());
        } catch (Exception e) {
            throw new KeyManagementException(e);
        }
    }

    public static MessageDigest i(String str) {
        String defaultDigestSignatureSSLProvider = cpSSLConfig.getDefaultDigestSignatureSSLProvider();
        try {
            return MessageDigest.getInstance(str, defaultDigestSignatureSSLProvider);
        } catch (NoSuchAlgorithmException e) {
            ny61.n(oyr.p("Algorithm ", str, " not available"), e);
            return null;
        } catch (NoSuchProviderException e2) {
            ny61.n(oyr.p("Provider ", defaultDigestSignatureSSLProvider, " not available"), e2);
            return null;
        }
    }

    public static int a(PublicKey publicKey) {
        return (publicKey instanceof RSAPublicKey ? ((RSAPublicKey) publicKey).getModulus() : f(publicKey).getModulus()).bitLength();
    }
}
