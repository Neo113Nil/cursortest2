package ru.CryptoPro.JCP.KeyStore;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface ReaderInterface {
    void load() throws IOException;

    MediaInterface lock() throws IOException;
}
