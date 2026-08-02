package ru.CryptoPro.Crypto.Key;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Key.GostPrivateKey;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.DiversKeyBase;
import ru.CryptoPro.JCP.params.DiversKeyInterface;
import ru.CryptoPro.JCP.params.DiversKeySpec;
import ru.CryptoPro.JCP.params.KdfTreeDiversKeySpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostSecretKeyFactory extends SecretKeyFactorySpi {
    public SecretKeyInterface createSpec(byte[] bArr, CryptParamsSpec cryptParamsSpec) throws KeyManagementException {
        return new SecretKeySpec(bArr, cryptParamsSpec);
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        GostSecretKey gostSecretKey;
        JCPLogger.enter();
        if (!(keySpec instanceof DiversKeySpec) && !(keySpec instanceof KdfTreeDiversKeySpec) && !(keySpec instanceof SecretKeyInterface) && !(keySpec instanceof javax.crypto.spec.SecretKeySpec)) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
            JCPLogger.thrown(invalidKeySpecException);
            throw invalidKeySpecException;
        }
        try {
        } catch (InvalidKeySpecException e) {
            JCPLogger.warning(e);
            throw e;
        }
        if (!(keySpec instanceof SecretKeyInterface)) {
            if (!(keySpec instanceof javax.crypto.spec.SecretKeySpec)) {
                DiversKeyBase diversKeyBase = (DiversKeyBase) keySpec;
                Key key = diversKeyBase.getKey();
                if (!(key instanceof GostPrivateKey) && !(key instanceof GostSecretKey)) {
                    InvalidKeySpecException invalidKeySpecException2 = new InvalidKeySpecException();
                    JCPLogger.thrown(invalidKeySpecException2);
                    throw invalidKeySpecException2;
                }
                KeyInterface spec = ((SpecKey) key).getSpec();
                if (!(spec instanceof DiversKeyInterface)) {
                    InvalidKeySpecException invalidKeySpecException3 = new InvalidKeySpecException();
                    JCPLogger.thrown(invalidKeySpecException3);
                    throw invalidKeySpecException3;
                }
                try {
                    try {
                        return ((DiversKeyInterface) spec.clone()).diversKeyByBlob(getKeyAlgorithm(), diversKeyBase);
                    } catch (CloneNotSupportedException e2) {
                        InvalidKeySpecException invalidKeySpecException4 = new InvalidKeySpecException(e2);
                        JCPLogger.thrown(invalidKeySpecException4);
                        throw invalidKeySpecException4;
                    }
                } catch (InvalidKeyException e3) {
                    InvalidKeySpecException invalidKeySpecException5 = new InvalidKeySpecException(e3);
                    JCPLogger.thrown(invalidKeySpecException5);
                    throw invalidKeySpecException5;
                }
            }
            try {
                byte[] encoded = ((javax.crypto.spec.SecretKeySpec) keySpec).getEncoded();
                try {
                    gostSecretKey = new GostSecretKey(createSpec(encoded, CryptParamsSpec.getInstance()));
                } catch (Exception e4) {
                    JCPLogger.warning("decode error: ", Integer.valueOf(encoded.length));
                    JCPLogger.warning(e4);
                    InvalidKeySpecException invalidKeySpecException6 = new InvalidKeySpecException();
                    invalidKeySpecException6.initCause(e4);
                    throw invalidKeySpecException6;
                }
            } catch (Exception e5) {
                JCPLogger.warning("secretKeySpec.getEncoded() error", (Throwable) e5);
                InvalidKeySpecException invalidKeySpecException7 = new InvalidKeySpecException();
                invalidKeySpecException7.initCause(e5);
                throw invalidKeySpecException7;
            }
            JCPLogger.warning(e);
            throw e;
        }
        gostSecretKey = new GostSecretKey((SecretKeyInterface) keySpec);
        JCPLogger.exit();
        return gostSecretKey;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        JCPLogger.enter();
        if ((secretKey instanceof GostSecretKey) && SecretKeySpec.class.isAssignableFrom(cls)) {
            KeyInterface spec = ((GostSecretKey) secretKey).getSpec();
            JCPLogger.exit();
            return spec;
        }
        InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
        JCPLogger.thrown(invalidKeySpecException);
        throw invalidKeySpecException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    @Override // javax.crypto.SecretKeyFactorySpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        byte[] bArr;
        JCPLogger.enter();
        byte[] bArr2 = 0;
        try {
            try {
                byte[] encoded = secretKey.getEncoded();
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
                bArr2 = secretKey;
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

    public String getKeyAlgorithm() {
        return "GOST28147";
    }
}
