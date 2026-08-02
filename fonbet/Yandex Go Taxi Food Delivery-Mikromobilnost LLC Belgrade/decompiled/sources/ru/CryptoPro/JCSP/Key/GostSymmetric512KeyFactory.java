package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class GostSymmetric512KeyFactory extends GostSecretKeyFactory {
    @Override // ru.CryptoPro.JCSP.Key.GostSecretKeyFactory
    public int a() {
        return HProv.CALG_SYMMETRIC_512;
    }
}
