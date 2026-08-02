package ru.CryptoPro.JCSP.Key.ecdsa;

import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface;

/* loaded from: classes4.dex */
public class ECDHPrivateKey extends ECDSAPrivateKey {
    public ECDHPrivateKey(JCSPPrivateKeyInterface jCSPPrivateKeyInterface) throws InvalidKeySpecException {
        super(jCSPPrivateKeyInterface);
    }

    @Override // ru.CryptoPro.JCSP.Key.ecdsa.ECDSAPrivateKey, ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public void resolveAlgorithm(PrivateKeyInterface privateKeyInterface) {
        this.keyAlgorithm = JCP.ECDH_NAME;
    }

    @Override // ru.CryptoPro.JCSP.Key.ecdsa.ECDSAPrivateKey, ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public void verifySpec(PrivateKeyInterface privateKeyInterface) throws InvalidKeySpecException {
        if (privateKeyInterface == null) {
            throw new InvalidKeySpecException(ECDSAPrivateKey.resource.getString(InternalGostPrivateKey.NULL_PARAM));
        }
        if (!privateKeyInterface.getParams().getOID().equals(AlgIdSpecForeign.OID_ECDH)) {
            throw new InvalidKeySpecException(ECDSAPrivateKey.resource.getString("NotECDSAParam"));
        }
    }
}
