package ru.CryptoPro.JCSP.Key.context;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.GostSecretKey;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeySpec;
import ru.CryptoPro.JCSP.Key.foreign.ForeignSymmetricKey;
import ru.CryptoPro.JCSP.MSCAPI.HKey;

/* loaded from: classes4.dex */
public class SecretKeyContextFactory extends SecretKeyFactorySpi {
    public static final String NOT_SUPP = "NotSupp";
    public static final String NOT_SUPPORTED = InternalGostPrivateKey.resource.getString("NotSupp");

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(NOT_SUPPORTED);
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(NOT_SUPPORTED);
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        JCSPLogger.enter();
        if (secretKey instanceof GostSecretKey) {
            GostSecretKey gostSecretKey = (GostSecretKey) secretKey;
            if (gostSecretKey.getSpec() instanceof AbstractKeySpec) {
                HKey translateKeyToLocalContext = ((AbstractKeySpec) gostSecretKey.getSpec()).getKey().translateKeyToLocalContext(true, true);
                int keyAlg = translateKeyToLocalContext.getKeyAlg();
                JCSPSecretKeySpec jCSPSecretKeySpec = JCSPSecretKeySpec.getInstance(translateKeyToLocalContext, keyAlg);
                boolean isForeignKey = HKey.isForeignKey(keyAlg);
                JCSPLogger.exit();
                return isForeignKey ? new ForeignSymmetricKey(jCSPSecretKeySpec) : new GostSecretKey(jCSPSecretKeySpec);
            }
        }
        InvalidKeyException invalidKeyException = new InvalidKeyException(NOT_SUPPORTED);
        JCSPLogger.thrown(invalidKeyException);
        throw invalidKeyException;
    }
}
