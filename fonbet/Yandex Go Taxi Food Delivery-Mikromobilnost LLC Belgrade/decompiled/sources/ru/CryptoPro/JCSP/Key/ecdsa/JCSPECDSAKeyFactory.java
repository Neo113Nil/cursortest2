package ru.CryptoPro.JCSP.Key.ecdsa;

import java.security.Key;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.spec.PublicKeyBlobSpec;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.GostKeyFactory;
import ru.CryptoPro.JCSP.Key.GostPublicKey;
import ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;

/* loaded from: classes4.dex */
public class JCSPECDSAKeyFactory extends GostKeyFactory {
    @Override // ru.CryptoPro.JCSP.Key.GostKeyFactory, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        JCSPLogger.enter();
        if (!(keySpec instanceof JCSPPrivateKeyInterface)) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
            JCSPLogger.thrown(invalidKeySpecException);
            throw invalidKeySpecException;
        }
        try {
            ECDSAPrivateKey eCDSAPrivateKey = new ECDSAPrivateKey((JCSPPrivateKeyInterface) keySpec);
            JCSPLogger.exit();
            return eCDSAPrivateKey;
        } catch (InvalidKeySpecException e) {
            JCSPLogger.warning(e);
            throw e;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyFactory, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        KeyInterface spec;
        JCSPLogger.enter();
        boolean z = key instanceof GostPublicKey;
        if (z && PublicKeySpec.class.isAssignableFrom(cls)) {
            spec = ((GostPublicKey) key).getSpec();
        } else {
            if (!(key instanceof ECDSAPrivateKey) || !PrivateKeyInterface.class.isAssignableFrom(cls)) {
                if (z && PublicKeyBlobSpec.class.isAssignableFrom(cls)) {
                    return new PublicKeyBlobSpec(((PublicKeySpec) ((GostPublicKey) key).getSpec()).getBlob());
                }
                InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
                JCSPLogger.thrown(invalidKeySpecException);
                throw invalidKeySpecException;
            }
            spec = ((ECDSAPrivateKey) key).getSpec();
        }
        JCSPLogger.exit();
        return spec;
    }
}
