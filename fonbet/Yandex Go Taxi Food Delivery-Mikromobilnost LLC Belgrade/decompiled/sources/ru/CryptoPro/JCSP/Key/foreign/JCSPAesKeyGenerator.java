package ru.CryptoPro.JCSP.Key.foreign;

import defpackage.w511;
import java.security.SecureRandom;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public class JCSPAesKeyGenerator extends ForeignKeyGenerator {
    public static final int ALGID_AES_128 = 26126;
    public static final int ALGID_AES_192 = 26127;
    public static final int ALGID_AES_256 = 26128;
    public static final int KEY_LEN_AES_128 = 128;
    public static final int KEY_LEN_AES_192 = 192;
    public static final int KEY_LEN_AES_256 = 256;

    public JCSPAesKeyGenerator(OID oid) {
        super(oid);
        this.keyLength = 128;
        this.algId = 26126;
    }

    @Override // ru.CryptoPro.JCSP.Key.foreign.ForeignKeyGenerator, ru.CryptoPro.JCSP.Key.GostKeyGenerator, javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        int i2;
        this.keyLength = i;
        if (i == 128) {
            i2 = 26126;
        } else if (i == 192) {
            i2 = 26127;
        } else {
            if (i != 256) {
                w511.q();
                return;
            }
            i2 = 26128;
        }
        this.algId = i2;
    }

    public JCSPAesKeyGenerator() {
        this(null);
    }
}
