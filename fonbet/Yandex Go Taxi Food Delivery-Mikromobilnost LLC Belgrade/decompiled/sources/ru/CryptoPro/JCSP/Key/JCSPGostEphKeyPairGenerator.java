package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class JCSPGostEphKeyPairGenerator extends cl_1 {
    public JCSPGostEphKeyPairGenerator() {
        super(JCP.GOST_EL_EPH_DEGREE_NAME);
    }

    @Override // ru.CryptoPro.JCSP.Key.cl_1, ru.CryptoPro.JCSP.JCSPProvider2012Interface
    public int getAlgorithmIdentifier() {
        return HProv.CALG_DH_EL_EPHEM;
    }
}
