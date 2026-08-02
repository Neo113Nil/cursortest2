package ru.CryptoPro.JCP.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdSpec;

/* loaded from: classes4.dex */
public final class GostEphKeyPairGenerator2012_256 extends GostEphKeyPairGenerator {
    public GostEphKeyPairGenerator2012_256() {
        super(JCP.GOST_EPH_2012_256_NAME, new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_256));
    }
}
