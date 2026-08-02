package ru.CryptoPro.JCSP.Key;

import java.security.KeyPair;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.JCSPProvider2012Interface;

/* loaded from: classes4.dex */
public abstract class GostEphExchKeyPairGenerator extends GostExchKeyPairGenerator implements JCSPProvider2012Interface {
    public GostEphExchKeyPairGenerator(String str) {
        super(str);
        this.exportable = false;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        JCSPLogger.enter();
        KeyPair a = cl_1.a(this.exchange, this.params, getAlgorithmIdentifier(), this.exportable, true);
        JCSPLogger.exit();
        return a;
    }

    @Override // ru.CryptoPro.JCSP.JCSPProvider2012Interface
    public abstract /* synthetic */ int getAlgorithmIdentifier();

    public GostEphExchKeyPairGenerator(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
        this.exportable = false;
    }
}
