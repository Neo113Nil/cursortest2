package ru.CryptoPro.JCSP.Cipher;

import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes4.dex */
public final class TransportMCipher extends TransportKCipher {
    public TransportMCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        this.g = "GOST3412_2015_M";
        this.h = "GOST3412_2015_M";
        this.j = 8;
    }
}
