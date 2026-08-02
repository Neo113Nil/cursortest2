package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class JCSPSymmetric512KeyGenerator extends GostKeyGenerator {
    public JCSPSymmetric512KeyGenerator() {
        this.algId = HProv.CALG_SYMMETRIC_512;
    }
}
