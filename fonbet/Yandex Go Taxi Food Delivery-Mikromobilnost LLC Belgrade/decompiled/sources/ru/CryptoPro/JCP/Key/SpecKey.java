package ru.CryptoPro.JCP.Key;

import java.security.Key;
import javax.security.auth.Destroyable;

/* loaded from: classes4.dex */
public interface SpecKey extends Key, Destroyable {
    void clear();

    String getAlgorithm();

    byte[] getEncoded();

    String getFormat();

    int getKeySize();

    KeyInterface getSpec();
}
