package ru.CryptoPro.JCP.KeyStore;

import java.io.IOException;
import java.security.UnrecoverableKeyException;
import java.util.Date;

/* loaded from: classes4.dex */
public interface ContainerChangePassword extends ContainerReaderInterface {
    void changePassword(char[] cArr, char[] cArr2) throws IOException, UnrecoverableKeyException;

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ void close();

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ int fileSize(int i) throws IOException;

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ String folder();

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ Date getCreationDate() throws IOException;

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ MediaInterface getMedia();

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ boolean login(char[] cArr) throws IOException, UnrecoverableKeyException;

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ byte[] readFile(int i, int i2, int i3) throws IOException;

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ void removeFile(int i) throws IOException;

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ void removeFolder() throws IOException;

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /* synthetic */ void storeFile(int i, byte[] bArr, boolean z) throws IOException;
}
