package ru.CryptoPro.Crypto.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdSpec;

/* loaded from: classes4.dex */
public final class GostExchKeyPairGenerator2012_256 extends GostExchKeyPairGenerator {
    public GostExchKeyPairGenerator2012_256() {
        super(JCP.GOST_DH_2012_256_NAME, new AlgIdSpec(AlgIdSpec.OID_PARAMS_EXC_2012_256));
    }
}
