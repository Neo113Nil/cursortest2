package ru.CryptoPro.Crypto.Cipher;

import java.security.InvalidKeyException;
import java.security.Key;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class XmlTransportCipher2012_512 extends TransportCipher {
    @Override // ru.CryptoPro.Crypto.Cipher.TransportCipher
    public final String a() {
        return "PRO12_EXPORT";
    }

    @Override // ru.CryptoPro.Crypto.Cipher.TransportCipher
    public final void b(Key key) {
        String algorithm = key.getAlgorithm();
        if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EPH_2012_512_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EPH_DH_2012_512_NAME)) {
            throw new InvalidKeyException(TransportCipher.resource.getString("InvalidKeyType"));
        }
    }
}
