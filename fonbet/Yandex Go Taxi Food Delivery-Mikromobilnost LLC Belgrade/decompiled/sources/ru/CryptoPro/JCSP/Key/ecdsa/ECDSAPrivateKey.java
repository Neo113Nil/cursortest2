package ru.CryptoPro.JCSP.Key.ecdsa;

import defpackage.oyr;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.ECDSAParams;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.GostPrivateKey;
import ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface;

/* loaded from: classes4.dex */
public class ECDSAPrivateKey extends GostPrivateKey {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCSP.Key.resources.key";
    public static final String NOT_ECDSA = "NotECDSAParam";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCSP.Key.resources.key", Locale.getDefault());

    public ECDSAPrivateKey(JCSPPrivateKeyInterface jCSPPrivateKeyInterface) throws InvalidKeySpecException {
        super(jCSPPrivateKeyInterface);
        calculateKeySize();
    }

    public void calculateKeySize() {
        if (this.keyAlgorithm.equalsIgnoreCase(JCP.ECDSA_NAME) || this.keyAlgorithm.equalsIgnoreCase(JCP.CP_ECDSA_NAME) || this.keyAlgorithm.equalsIgnoreCase(JCP.ECDH_NAME) || this.keyAlgorithm.equalsIgnoreCase(JCP.CP_ECDH_NAME)) {
            try {
                this.keySize = ECDSAParams.getKeyLenFromBits(((AbstractKeySpec) this.spec).getKeyLength());
            } catch (InvalidAlgorithmParameterException unused) {
                this.keySize = 0;
            }
        }
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public void resolveAlgorithm(PrivateKeyInterface privateKeyInterface) {
        this.keyAlgorithm = JCP.ECDSA_NAME;
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public String toString() {
        StringBuilder sb = new StringBuilder("CryptoPro ECDSA PrivateKey (");
        sb.append(this.keyAlgorithm);
        sb.append("), ");
        return oyr.m(this.keySize, " size", sb);
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public void verifySpec(PrivateKeyInterface privateKeyInterface) throws InvalidKeySpecException {
        if (privateKeyInterface == null) {
            throw new InvalidKeySpecException(resource.getString(InternalGostPrivateKey.NULL_PARAM));
        }
        if (!privateKeyInterface.getParams().getOID().equals(AlgIdSpecForeign.OID_ECDSA)) {
            throw new InvalidKeySpecException(resource.getString("NotECDSAParam"));
        }
    }
}
