package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class JCSPGostEphExchKeyPairGenerator_2012_256 extends GostEphExchKeyPairGenerator {
    public JCSPGostEphExchKeyPairGenerator_2012_256() {
        super(new AlgIdSpec(AlgIdSpec.OID_PARAMS_EXC_2012_256), JCP.GOST_EPH_DH_2012_256_NAME);
    }

    @Override // ru.CryptoPro.JCSP.Key.GostEphExchKeyPairGenerator, ru.CryptoPro.JCSP.JCSPProvider2012Interface
    public int getAlgorithmIdentifier() {
        return HProv.CALG_DH_GR3410_12_256_EPHEM;
    }

    public JCSPGostEphExchKeyPairGenerator_2012_256(AlgIdInterface algIdInterface) {
        super(algIdInterface, JCP.GOST_EPH_DH_2012_256_NAME);
    }
}
