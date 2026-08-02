package ru.CryptoPro.JCP.KeyStore;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class VoidInputStream extends InputStream {
    @Override // java.io.InputStream
    public int read() throws IOException {
        return -1;
    }
}
