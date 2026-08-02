package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;

/* loaded from: classes4.dex */
public interface JCSPSpecKey extends SpecKey {
    @Override // ru.CryptoPro.JCP.Key.SpecKey
    /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    /* synthetic */ String getAlgorithm();

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    /* synthetic */ byte[] getEncoded();

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    /* synthetic */ String getFormat();

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    /* synthetic */ int getKeySize();

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    /* synthetic */ KeyInterface getSpec();

    boolean isFromPfx();

    void setFromPfx();
}
