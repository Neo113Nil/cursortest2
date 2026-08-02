package ru.CryptoPro.JCP.Key;

import java.security.InvalidParameterException;
import java.security.SecureRandom;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class GostEphKeyPairGenerator2012_512 extends GostEphKeyPairGenerator {
    public GostEphKeyPairGenerator2012_512() {
        super(JCP.GOST_EPH_2012_512_NAME, new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_512));
    }

    @Override // ru.CryptoPro.JCP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        JCPLogger.enter();
        if (i != 1024) {
            JCPLogger.warning(new InvalidParameterException(InternalGostPrivateKey.resource.getString("InvalidKeyLen") + 128));
        }
        JCPLogger.exit();
    }
}
