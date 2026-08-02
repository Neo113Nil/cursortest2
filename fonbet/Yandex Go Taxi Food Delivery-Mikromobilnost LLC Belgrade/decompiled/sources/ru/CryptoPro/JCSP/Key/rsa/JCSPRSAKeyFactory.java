package ru.CryptoPro.JCSP.Key.rsa;

import java.security.Key;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.spec.PublicKeyBlobSpec;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.ExchPrivateKeySpec;
import ru.CryptoPro.JCSP.Key.GostKeyFactory;
import ru.CryptoPro.JCSP.Key.GostPublicKey;
import ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface;
import ru.CryptoPro.JCSP.Key.PrivateKeySpec;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class JCSPRSAKeyFactory extends GostKeyFactory {
    @Override // ru.CryptoPro.JCSP.Key.GostKeyFactory, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        JCSPLogger.enter();
        if (!(keySpec instanceof JCSPPrivateKeyInterface) && !(keySpec instanceof PKCS8EncodedKeySpec)) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
            JCSPLogger.thrown(invalidKeySpecException);
            throw invalidKeySpecException;
        }
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            try {
                PrivateKey rSAExchPrivateKey = keySpec instanceof ExchPrivateKeySpec ? new RSAExchPrivateKey((JCSPPrivateKeyInterface) keySpec) : new RSAPrivateKey((JCSPPrivateKeyInterface) keySpec);
                JCSPLogger.exit();
                return rSAExchPrivateKey;
            } catch (InvalidKeySpecException e) {
                JCSPLogger.warning(e);
                throw e;
            }
        }
        AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup = AlgorithmGroups.KeyAlgorithmGroup.RSA;
        byte[] encoded = ((PKCS8EncodedKeySpec) keySpec).getEncoded();
        HProv d = AlgorithmGroups.d(keyAlgorithmGroup);
        try {
            d.createWithoutContainer();
            HKey copyPrivateForeignKeyFromPKCS8 = HKey.copyPrivateForeignKeyFromPKCS8((HKey) null, keyAlgorithmGroup, true, encoded, d, true);
            return new RSAPrivateKey(copyPrivateForeignKeyFromPKCS8.getKeyAlg() == 9216 ? new PrivateKeySpec(copyPrivateForeignKeyFromPKCS8, (String) null) : new ExchPrivateKeySpec(copyPrivateForeignKeyFromPKCS8, (String) null));
        } catch (UnrecoverableKeyException e2) {
            throw new InvalidKeySpecException(e2);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyFactory, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        InternalGostPrivateKey internalGostPrivateKey;
        KeyInterface spec;
        JCSPLogger.enter();
        boolean z = key instanceof GostPublicKey;
        if (z && PublicKeySpec.class.isAssignableFrom(cls)) {
            spec = ((GostPublicKey) key).getSpec();
        } else {
            if ((key instanceof RSAExchPrivateKey) && PrivateKeyInterface.class.isAssignableFrom(cls)) {
                internalGostPrivateKey = (RSAExchPrivateKey) key;
            } else {
                if (!(key instanceof RSAPrivateKey) || !PrivateKeyInterface.class.isAssignableFrom(cls)) {
                    if (z && PublicKeyBlobSpec.class.isAssignableFrom(cls)) {
                        return new PublicKeyBlobSpec(((PublicKeySpec) ((GostPublicKey) key).getSpec()).getBlob());
                    }
                    InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
                    JCSPLogger.thrown(invalidKeySpecException);
                    throw invalidKeySpecException;
                }
                internalGostPrivateKey = (RSAPrivateKey) key;
            }
            spec = internalGostPrivateKey.getSpec();
        }
        JCSPLogger.exit();
        return spec;
    }
}
