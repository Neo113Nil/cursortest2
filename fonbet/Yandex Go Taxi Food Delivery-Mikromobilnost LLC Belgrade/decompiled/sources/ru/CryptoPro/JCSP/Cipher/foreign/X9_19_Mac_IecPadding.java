package ru.CryptoPro.JCSP.Cipher.foreign;

import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.Cipher.GostMac;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes4.dex */
public final class X9_19_Mac_IecPadding extends GostMac {
    public static final int MAC_SIZE = 8;

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac
    public int a() {
        return HProv.CALG_ANSI_X9_19_MAC;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac
    public void b() throws MSException {
        this.a.setHashParam(35, Array.toByteArray(7));
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac
    public int c() {
        return 32782;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac, javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 8;
    }
}
