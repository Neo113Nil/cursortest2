package ru.CryptoPro.JCSP.Key;

import defpackage.qir;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import ru.CryptoPro.JCP.spec.GostMasterSpec;

/* loaded from: classes4.dex */
public class GostMasterSecretKeyFactory extends SecretKeyFactorySpi {
    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof GostMasterSpec)) {
            qir.m(keySpec);
            return null;
        }
        GostMasterSpec gostMasterSpec = (GostMasterSpec) keySpec;
        try {
            return new MasterSecret(gostMasterSpec.getSecretKey(), gostMasterSpec.getClnRnd(), gostMasterSpec.getSrvRnd(), gostMasterSpec.getPrfAlg(), gostMasterSpec.getCipherAlg(), gostMasterSpec.getKEIvLen(), gostMasterSpec.isOldSuite());
        } catch (InvalidKeyException e) {
            throw new InvalidKeySpecException(e);
        } catch (KeyManagementException e2) {
            throw new InvalidKeySpecException(e2);
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("Unsupported engineGetKeySpec");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported engineTranslateKey");
    }
}
