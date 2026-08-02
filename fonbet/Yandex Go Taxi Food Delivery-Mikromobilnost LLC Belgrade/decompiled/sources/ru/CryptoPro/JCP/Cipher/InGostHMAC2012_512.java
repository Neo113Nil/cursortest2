package ru.CryptoPro.JCP.Cipher;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class InGostHMAC2012_512 extends InGostHMAC2012_256 {
    public static final int HMAC_SIZE = 64;
    public static final int[] INTS_OID = {1, 2, 643, 7, 1, 1, 4, 2};
    public static final String STR_NAME = "HMAC_GOSTR3411_2012_512";
    public static final String STR_OID = "1.2.643.7.1.1.4.2";

    public InGostHMAC2012_512() {
        super(JCP.GOST_DIGEST_2012_512_NAME);
    }

    @Override // ru.CryptoPro.JCP.Cipher.InGostHMAC, javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 64;
    }
}
