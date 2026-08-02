package ru.CryptoPro.JCSP.Key;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.PBEKeySpec;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.DiversKeyBase;
import ru.CryptoPro.JCP.params.DiversKeyInterface;
import ru.CryptoPro.JCP.params.DiversKeySpec;
import ru.CryptoPro.JCP.params.KdfTreeDiversKeySpec;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
public class GostSecretKeyFactory extends SecretKeyFactorySpi {
    public static final String NOT_SUPP = "NotSupp";
    public static final String NOT_SUPPORTED = InternalGostPrivateKey.resource.getString("NotSupp");

    public int a() {
        return 26142;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof DiversKeySpec) && !(keySpec instanceof KdfTreeDiversKeySpec) && !(keySpec instanceof JCSPSecretKeyInterface) && !(keySpec instanceof PBEKeySpec)) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
            JCSPLogger.thrown(invalidKeySpecException);
            throw invalidKeySpecException;
        }
        if (keySpec instanceof JCSPSecretKeyInterface) {
            return new GostSecretKey((JCSPSecretKeyInterface) keySpec);
        }
        if (keySpec instanceof PBEKeySpec) {
            return new GostSecretKey(SecretKeyImpl.derivePBKDF2((PBEKeySpec) keySpec, a()));
        }
        DiversKeyBase diversKeyBase = (DiversKeyBase) keySpec;
        Key key = diversKeyBase.getKey();
        if (!(key instanceof GostPrivateKey) && !(key instanceof GostSecretKey)) {
            InvalidKeySpecException invalidKeySpecException2 = new InvalidKeySpecException();
            JCSPLogger.thrown(invalidKeySpecException2);
            throw invalidKeySpecException2;
        }
        KeyInterface spec = ((SpecKey) key).getSpec();
        if (!(spec instanceof DiversKeyInterface)) {
            InvalidKeySpecException invalidKeySpecException3 = new InvalidKeySpecException();
            JCSPLogger.thrown(invalidKeySpecException3);
            throw invalidKeySpecException3;
        }
        try {
            return ((DiversKeyInterface) spec.clone()).diversKeyByBlob(a(), diversKeyBase);
        } catch (CloneNotSupportedException e) {
            InvalidKeySpecException invalidKeySpecException4 = new InvalidKeySpecException(e);
            JCSPLogger.thrown(invalidKeySpecException4);
            throw invalidKeySpecException4;
        } catch (InvalidKeyException e2) {
            InvalidKeySpecException invalidKeySpecException5 = new InvalidKeySpecException(e2);
            JCSPLogger.thrown(invalidKeySpecException5);
            throw invalidKeySpecException5;
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        JCSPLogger.enter();
        if ((secretKey instanceof GostSecretKey) && SecretKeyImpl.class.isAssignableFrom(cls)) {
            KeyInterface spec = ((GostSecretKey) secretKey).getSpec();
            JCSPLogger.exit();
            return spec;
        }
        InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException(NOT_SUPPORTED);
        JCSPLogger.thrown(invalidKeySpecException);
        throw invalidKeySpecException;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        throw new InvalidKeyException(NOT_SUPPORTED);
    }
}
