package ru.CryptoPro.JCP.KeyStore;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public interface MediaInterface {
    Enumeration enumExisting(String str) throws IOException;

    Enumeration enumNew(String str) throws IOException;

    void lockMutex() throws MutexException;

    String mediaUnique() throws IOException;

    ContainerReaderInterface open(String str, boolean z) throws IOException;

    String toString();

    void unlock();

    void unlockMutex();
}
