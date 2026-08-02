package ru.CryptoPro.JCP.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdSpec;

/* loaded from: classes4.dex */
public final class GostKeyPairGenerator2012_256 extends GostKeyPairGenerator {
    public GostKeyPairGenerator2012_256() {
        super(JCP.GOST_EL_2012_256_NAME, new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_256));
    }
}
