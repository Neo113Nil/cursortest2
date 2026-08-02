package ru.CryptoPro.JCSP.Key;

import java.security.Key;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.spec.PublicKeyBlobSpec;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
public class JCSPGostExchKeyFactory extends JCSPGostKeyFactory {
    @Override // ru.CryptoPro.JCSP.Key.GostKeyFactory, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        JCSPLogger.enter();
        if (!(keySpec instanceof JCSPPrivateKeyInterface)) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
            JCSPLogger.thrown(invalidKeySpecException);
            throw invalidKeySpecException;
        }
        try {
            GostExchPrivateKey gostExchPrivateKey = new GostExchPrivateKey((JCSPPrivateKeyInterface) keySpec);
            JCSPLogger.exit();
            return gostExchPrivateKey;
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
            if (!(key instanceof GostExchPrivateKey) || !PrivateKeyInterface.class.isAssignableFrom(cls)) {
                if (z && PublicKeyBlobSpec.class.isAssignableFrom(cls)) {
                    PublicKeySpec publicKeySpec = (PublicKeySpec) ((GostPublicKey) key).getSpec();
                    return new PublicKeyBlobSpec(publicKeySpec.getBlob(), publicKeySpec.isStrictExport());
                }
                InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
                JCSPLogger.thrown(invalidKeySpecException);
                throw invalidKeySpecException;
            }
            spec = ((GostExchPrivateKey) key).getSpec();
        }
        JCSPLogger.exit();
        return spec;
    }
}
