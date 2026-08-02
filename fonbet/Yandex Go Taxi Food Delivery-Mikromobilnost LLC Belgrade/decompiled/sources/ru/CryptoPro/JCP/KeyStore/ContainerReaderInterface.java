package ru.CryptoPro.JCP.KeyStore;

import java.io.IOException;
import java.security.UnrecoverableKeyException;
import java.util.Date;

/* loaded from: classes4.dex */
public interface ContainerReaderInterface {
    void close();

    int fileSize(int i) throws IOException;

    String folder();

    Date getCreationDate() throws IOException;

    MediaInterface getMedia();

    boolean login(char[] cArr) throws IOException, UnrecoverableKeyException;

    byte[] readFile(int i, int i2, int i3) throws IOException;

    void removeFile(int i) throws IOException;

    void removeFolder() throws IOException;

    void storeFile(int i, byte[] bArr, boolean z) throws IOException;
}
