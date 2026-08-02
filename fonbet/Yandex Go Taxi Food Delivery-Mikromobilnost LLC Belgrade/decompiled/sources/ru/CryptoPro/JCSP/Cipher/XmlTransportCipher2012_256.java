package ru.CryptoPro.JCSP.Cipher;

import java.security.InvalidKeyException;
import java.security.Key;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class XmlTransportCipher2012_256 extends TransportCipher {
    @Override // ru.CryptoPro.JCSP.Cipher.TransportCipher
    public void a(Key key) throws InvalidKeyException {
        String algorithm = key.getAlgorithm();
        if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EPH_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EPH_DH_2012_256_NAME)) {
            throw new InvalidKeyException(TransportCipher.resource.getString("InvalidKeyType"));
        }
    }

    @Override // ru.CryptoPro.JCSP.Cipher.TransportCipher
    public String a(boolean z) {
        return "PRO12_EXPORT";
    }
}
