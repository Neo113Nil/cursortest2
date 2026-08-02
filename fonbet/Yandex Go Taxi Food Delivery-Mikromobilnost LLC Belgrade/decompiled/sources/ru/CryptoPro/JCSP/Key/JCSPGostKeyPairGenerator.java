package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdInterface;

/* loaded from: classes4.dex */
public final class JCSPGostKeyPairGenerator extends GostKeyPairGenerator {
    public JCSPGostKeyPairGenerator() {
        super(JCP.GOST_EL_DEGREE_NAME);
    }

    public JCSPGostKeyPairGenerator(AlgIdInterface algIdInterface) {
        super(algIdInterface, JCP.GOST_EL_DEGREE_NAME);
    }
}
