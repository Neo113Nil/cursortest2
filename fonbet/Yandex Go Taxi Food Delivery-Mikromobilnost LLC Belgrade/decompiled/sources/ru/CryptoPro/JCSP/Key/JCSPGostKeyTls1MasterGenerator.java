package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class JCSPGostKeyTls1MasterGenerator extends GostKeyGenerator {
    public JCSPGostKeyTls1MasterGenerator() {
        this.algId = HProv.CALG_TLS1_MASTER;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyGenerator
    public boolean isTlsMasterKey() {
        return true;
    }
}
