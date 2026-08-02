package ru.CryptoPro.Crypto.Key;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.KeyManagementException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class CryptoKeyFactory extends KeyFactorySpi {
    public static final String NOTSUPP = "NotSupp";
    public static final String NOT_SUPPORTED = InternalGostPrivateKey.resource.getString("NotSupp");

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(NOT_SUPPORTED);
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(NOT_SUPPORTED);
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(NOT_SUPPORTED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    @Override // java.security.KeyFactorySpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        byte[] bArr;
        JCPLogger.enter();
        byte[] bArr2 = 0;
        try {
            try {
                byte[] encoded = key.getEncoded();
                try {
                    GostDigest gostDigest = new GostDigest();
                    gostDigest.engineUpdate(encoded, 0, encoded.length);
                    byte[] engineDigest = gostDigest.engineDigest();
                    GostSecretKey gostSecretKey = new GostSecretKey(new SecretKeySpec(engineDigest, CryptParamsSpec.getInstance()));
                    Array.clear(encoded);
                    if (engineDigest != null) {
                        Array.clear(engineDigest);
                    }
                    JCPLogger.exit();
                    return gostSecretKey;
                } catch (KeyManagementException e) {
                    e = e;
                    InvalidKeyException invalidKeyException = new InvalidKeyException(e.toString());
                    invalidKeyException.initCause(e);
                    JCPLogger.thrown(invalidKeyException);
                    throw invalidKeyException;
                }
            } catch (Throwable th) {
                th = th;
                bArr = null;
                bArr2 = key;
                if (bArr2 != 0) {
                    Array.clear(bArr2);
                }
                if (bArr != null) {
                    Array.clear(bArr);
                }
                throw th;
            }
        } catch (KeyManagementException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
            if (bArr2 != 0) {
            }
            if (bArr != null) {
            }
            throw th;
        }
    }
}
