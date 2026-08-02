package ru.CryptoPro.JCSP.KeyStore;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class cl_1 {
    private cl_1() {
    }

    public static IOException a(Exception exc) {
        IOException iOException = new IOException(exc.getMessage());
        a(iOException, exc);
        return iOException;
    }

    public static FileNotFoundException b(Exception exc) {
        FileNotFoundException fileNotFoundException = new FileNotFoundException(exc.getMessage());
        a(fileNotFoundException, exc);
        return fileNotFoundException;
    }

    public static NoSuchElementException c(Exception exc) {
        NoSuchElementException noSuchElementException = new NoSuchElementException(exc.getMessage());
        a(noSuchElementException, exc);
        return noSuchElementException;
    }

    public static KeyStoreException d(Exception exc) {
        KeyStoreException keyStoreException = new KeyStoreException(exc.getMessage());
        a(keyStoreException, exc);
        return keyStoreException;
    }

    public static UnrecoverableKeyException e(Exception exc) {
        UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException(exc.getMessage());
        a(unrecoverableKeyException, exc);
        return unrecoverableKeyException;
    }

    private static void a(Exception exc, Exception exc2) {
        try {
            exc.initCause(exc2);
        } catch (Throwable unused) {
        }
    }
}
