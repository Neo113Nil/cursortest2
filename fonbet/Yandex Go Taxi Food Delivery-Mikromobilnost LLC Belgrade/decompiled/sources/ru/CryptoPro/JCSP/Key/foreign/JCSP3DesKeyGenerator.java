package ru.CryptoPro.JCSP.Key.foreign;

import defpackage.ny61;
import java.security.SecureRandom;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public class JCSP3DesKeyGenerator extends ForeignKeyGenerator {
    public static final int ALGID_3DES = 26115;
    public static final int ALGID_3DES_112 = 26121;
    public static final int KEY_LEN_3DES = 192;
    public static final int KEY_LEN_3DES_112 = 128;
    public static final int KEY_LEN_3DES_112_SUN = 112;
    public static final int KEY_LEN_3DES_SUN = 168;

    public JCSP3DesKeyGenerator(OID oid) {
        super(oid);
        this.keyLength = 192;
        this.algId = 26115;
    }

    @Override // ru.CryptoPro.JCSP.Key.foreign.ForeignKeyGenerator, ru.CryptoPro.JCSP.Key.GostKeyGenerator, javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.keyLength = i;
        if (i == 112 || i == 128) {
            this.algId = 26121;
        } else if (i == 168 || i == 192) {
            this.algId = 26115;
        } else {
            ny61.g("Invalid key size, must be equal to 112 (or 128) or 168 (or 192).");
        }
    }

    public JCSP3DesKeyGenerator() {
        this(null);
    }
}
