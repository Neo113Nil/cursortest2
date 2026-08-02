package ru.CryptoPro.JCP.Key;

import java.security.Key;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class GostExchKeyFactory extends GostKeyFactory {
    @Override // ru.CryptoPro.JCP.Key.GostKeyFactory, java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        JCPLogger.enter();
        if (!(keySpec instanceof PrivateKeyInterface)) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
            JCPLogger.thrown(invalidKeySpecException);
            throw invalidKeySpecException;
        }
        try {
            GostExchPrivateKey gostExchPrivateKey = new GostExchPrivateKey((PrivateKeyInterface) keySpec);
            JCPLogger.exit();
            return gostExchPrivateKey;
        } catch (InvalidKeySpecException e) {
            JCPLogger.warning(e);
            throw e;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.GostKeyFactory, java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        KeyInterface spec;
        JCPLogger.enter();
        if ((key instanceof GostPublicKey) && PublicKeySpec.class.isAssignableFrom(cls)) {
            spec = ((GostPublicKey) key).getSpec();
        } else {
            if (!(key instanceof GostExchPrivateKey) || !PrivateKeyInterface.class.isAssignableFrom(cls)) {
                InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
                JCPLogger.thrown(invalidKeySpecException);
                throw invalidKeySpecException;
            }
            spec = ((GostExchPrivateKey) key).getSpec();
        }
        JCPLogger.exit();
        return spec;
    }
}
