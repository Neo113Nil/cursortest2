package ru.CryptoPro.JCSP.Cipher.foreign;

import ru.CryptoPro.JCSP.Cipher.GostMac;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class AESMac extends GostMac {
    public static final int MAC_SIZE = 16;

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac
    public int a() {
        return HProv.CALG_CMAC;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac
    public int c() {
        return 32782;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac, javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 16;
    }
}
