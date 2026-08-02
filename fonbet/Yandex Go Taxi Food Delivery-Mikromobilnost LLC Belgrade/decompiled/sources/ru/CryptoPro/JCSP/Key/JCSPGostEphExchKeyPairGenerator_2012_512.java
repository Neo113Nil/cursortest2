package ru.CryptoPro.JCSP.Key;

import java.security.InvalidParameterException;
import java.security.SecureRandom;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class JCSPGostEphExchKeyPairGenerator_2012_512 extends GostEphExchKeyPairGenerator {
    public JCSPGostEphExchKeyPairGenerator_2012_512() {
        super(new AlgIdSpec(AlgIdSpec.OID_PARAMS_EXC_2012_512), JCP.GOST_EPH_DH_2012_512_NAME);
    }

    @Override // ru.CryptoPro.JCSP.Key.GostEphExchKeyPairGenerator, ru.CryptoPro.JCSP.JCSPProvider2012Interface
    public int getAlgorithmIdentifier() {
        return HProv.CALG_DH_GR3410_12_512_EPHEM;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        JCSPLogger.enter();
        if (i != 1024) {
            JCSPLogger.warning(new InvalidParameterException(InternalGostPrivateKey.resource.getString("InvalidKeyLen") + 128));
        }
        JCSPLogger.exit();
    }

    public JCSPGostEphExchKeyPairGenerator_2012_512(AlgIdInterface algIdInterface) {
        super(algIdInterface, JCP.GOST_EPH_DH_2012_512_NAME);
    }
}
