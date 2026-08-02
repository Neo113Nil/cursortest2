package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;

/* loaded from: classes4.dex */
public final class JCSPGostKeyPairGenerator_2012_256 extends GostKeyPairGenerator {
    public JCSPGostKeyPairGenerator_2012_256() {
        super(new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_256), JCP.GOST_EL_2012_256_NAME);
    }

    public JCSPGostKeyPairGenerator_2012_256(AlgIdInterface algIdInterface) {
        super(algIdInterface, JCP.GOST_EL_2012_256_NAME);
    }
}
