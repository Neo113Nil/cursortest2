package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;

/* loaded from: classes4.dex */
public final class JCSPGostExchKeyPairGenerator_2012_256 extends GostExchKeyPairGenerator {
    public JCSPGostExchKeyPairGenerator_2012_256() {
        super(new AlgIdSpec(AlgIdSpec.OID_PARAMS_EXC_2012_256), JCP.GOST_DH_2012_256_NAME);
    }

    public JCSPGostExchKeyPairGenerator_2012_256(AlgIdInterface algIdInterface) {
        super(algIdInterface, JCP.GOST_DH_2012_256_NAME);
    }
}
