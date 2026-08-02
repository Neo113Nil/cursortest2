package ru.CryptoPro.JCSP.Key.eddsa;

import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCSP.Key.GostPrivateKey;
import ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface;

/* loaded from: classes4.dex */
public class EDDSAPrivateKey extends GostPrivateKey {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCSP.Key.resources.key";
    public static final String NOT_EDDSA = "NotEDDSAParam";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCSP.Key.resources.key", Locale.getDefault());

    public EDDSAPrivateKey(JCSPPrivateKeyInterface jCSPPrivateKeyInterface) throws InvalidKeySpecException {
        super(jCSPPrivateKeyInterface);
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public void resolveAlgorithm(PrivateKeyInterface privateKeyInterface) {
        this.keyAlgorithm = "Ed25519";
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public String toString() {
        return "CryptoPro EdDSA PrivateKey";
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public void verifySpec(PrivateKeyInterface privateKeyInterface) throws InvalidKeySpecException {
        if (privateKeyInterface == null) {
            throw new InvalidKeySpecException(resource.getString(InternalGostPrivateKey.NULL_PARAM));
        }
        if (!privateKeyInterface.getParams().getOID().equals(AlgIdSpecForeign.OID_EDDSA)) {
            throw new InvalidKeySpecException(resource.getString("NotEDDSAParam"));
        }
    }
}
