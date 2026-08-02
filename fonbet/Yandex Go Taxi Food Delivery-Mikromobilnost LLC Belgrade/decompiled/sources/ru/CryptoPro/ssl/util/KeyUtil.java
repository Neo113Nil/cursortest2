package ru.CryptoPro.ssl.util;

import defpackage.dy31;
import defpackage.ny61;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.interfaces.DSAKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* loaded from: classes4.dex */
public class KeyUtil {
    public static void a(BigInteger bigInteger, BigInteger bigInteger2) {
        String str;
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger subtract = bigInteger.subtract(bigInteger3);
        if (bigInteger2.compareTo(bigInteger3) <= 0) {
            str = "Diffie-Hellman public key is too small";
        } else if (bigInteger2.compareTo(subtract) >= 0) {
            str = "Diffie-Hellman public key is too large";
        } else if (!bigInteger.remainder(bigInteger2).equals(BigInteger.ZERO)) {
            return;
        } else {
            str = "Invalid Diffie-Hellman parameters";
        }
        dy31.v(str);
    }

    public static byte[] checkTlsPreMasterSecretKey(int i, int i2, SecureRandom secureRandom, byte[] bArr, boolean z) {
        int i3;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        byte[] bArr2 = new byte[48];
        secureRandom.nextBytes(bArr2);
        return (z || bArr == null || bArr.length != 48 || (i != (i3 = ((bArr[0] & 255) << 8) | (bArr[1] & 255)) && (i > 769 || i2 != i3))) ? bArr2 : bArr;
    }

    public static final int getKeySize(Key key) {
        BigInteger p;
        int i = -1;
        if (key instanceof Length) {
            try {
                i = ((Length) key).length();
            } catch (UnsupportedOperationException unused) {
            }
            if (i >= 0) {
                return i;
            }
        }
        if (key instanceof SecretKey) {
            SecretKey secretKey = (SecretKey) key;
            return (!"RAW".equals(secretKey.getFormat()) || secretKey.getEncoded() == null) ? i : secretKey.getEncoded().length * 8;
        }
        if (key instanceof RSAKey) {
            p = ((RSAKey) key).getModulus();
        } else if (key instanceof ECKey) {
            p = ((ECKey) key).getParams().getOrder();
        } else if (key instanceof DSAKey) {
            p = ((DSAKey) key).getParams().getP();
        } else {
            if (!(key instanceof DHKey)) {
                return i;
            }
            p = ((DHKey) key).getParams().getP();
        }
        return p.bitLength();
    }

    public static final boolean isOracleJCEProvider(String str) {
        if (str != null) {
            return str.equals("SunJCE") || str.startsWith("SunPKCS11");
        }
        return false;
    }

    public static byte[] trimZeroes(byte[] bArr) {
        int i = 0;
        while (i < bArr.length - 1 && bArr[i] == 0) {
            i++;
        }
        if (i == 0) {
            return bArr;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    public static final void validate(Key key) throws InvalidKeyException {
        if (key == null) {
            ny61.t("The key to be validated cannot be null");
            return;
        }
        if (key instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            DHParameterSpec params = dHPublicKey.getParams();
            BigInteger p = params.getP();
            params.getG();
            a(p, dHPublicKey.getY());
        }
    }

    public static final void validate(KeySpec keySpec) throws InvalidKeyException {
        if (keySpec == null) {
            ny61.t("The key spec to be validated cannot be null");
        } else if (keySpec instanceof DHPublicKeySpec) {
            DHPublicKeySpec dHPublicKeySpec = (DHPublicKeySpec) keySpec;
            BigInteger p = dHPublicKeySpec.getP();
            dHPublicKeySpec.getG();
            a(p, dHPublicKeySpec.getY());
        }
    }
}
