package ru.CryptoPro.JCSP.Key.foreign;

import java.security.SecureRandom;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.Key.GostKeyGenerator;

/* loaded from: classes4.dex */
public abstract class ForeignKeyGenerator extends GostKeyGenerator {
    public ForeignKeyGenerator(OID oid) {
        this.allParams = new AlgIdSpecForeign(oid);
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyGenerator, javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException();
    }

    public ForeignKeyGenerator() {
        this(null);
    }
}
