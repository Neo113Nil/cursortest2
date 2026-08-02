package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class JCSPGostEphKeyPairGenerator_2012_512 extends cl_1 {
    public JCSPGostEphKeyPairGenerator_2012_512() {
        super(new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_512), JCP.GOST_EPH_2012_512_NAME);
    }

    @Override // ru.CryptoPro.JCSP.Key.cl_1, ru.CryptoPro.JCSP.JCSPProvider2012Interface
    public int getAlgorithmIdentifier() {
        return HProv.CALG_DH_GR3410_12_512_EPHEM;
    }

    public JCSPGostEphKeyPairGenerator_2012_512(AlgIdInterface algIdInterface) {
        super(algIdInterface, JCP.GOST_EPH_2012_512_NAME);
    }
}
