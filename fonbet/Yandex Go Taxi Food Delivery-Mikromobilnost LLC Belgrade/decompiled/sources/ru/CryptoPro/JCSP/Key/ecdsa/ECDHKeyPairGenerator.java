package ru.CryptoPro.JCSP.Key.ecdsa;

import ru.CryptoPro.JCP.params.AlgIdSpecForeign;

/* loaded from: classes4.dex */
public class ECDHKeyPairGenerator extends ECDSAKeyPairGenerator {
    public ECDHKeyPairGenerator(String str) {
        super(str);
        this.params = new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDH);
        this.exchange = true;
    }
}
