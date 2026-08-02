package ru.CryptoPro.JCSP.Key.foreign;

import defpackage.ny61;
import java.security.SecureRandom;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public class JCSPDesKeyGenerator extends ForeignKeyGenerator {
    public static final int ALGID_DES = 26113;
    public static final int KEY_LEN_DES = 64;
    public static final int KEY_LEN_DES_SUN = 56;

    public JCSPDesKeyGenerator(OID oid) {
        super(oid);
        this.keyLength = 64;
        this.algId = 26113;
    }

    @Override // ru.CryptoPro.JCSP.Key.foreign.ForeignKeyGenerator, ru.CryptoPro.JCSP.Key.GostKeyGenerator, javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.keyLength = i;
        if (i == 56 || i == 64) {
            this.algId = 26113;
        } else {
            ny61.g("Invalid key size, must be equal to 56 (or 64).");
        }
    }

    public JCSPDesKeyGenerator() {
        this(null);
    }
}
