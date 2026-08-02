package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class JCSPGostEphExchKeyPairGenerator extends GostEphExchKeyPairGenerator {
    public JCSPGostEphExchKeyPairGenerator() {
        super("GOST3410DHELEPH");
    }

    @Override // ru.CryptoPro.JCSP.Key.GostEphExchKeyPairGenerator, ru.CryptoPro.JCSP.JCSPProvider2012Interface
    public int getAlgorithmIdentifier() {
        return HProv.CALG_DH_EL_EPHEM;
    }
}
