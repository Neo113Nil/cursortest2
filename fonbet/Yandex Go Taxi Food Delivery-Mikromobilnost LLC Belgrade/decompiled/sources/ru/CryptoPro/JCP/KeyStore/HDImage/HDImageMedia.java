package ru.CryptoPro.JCP.KeyStore.HDImage;

import defpackage.hq61;
import defpackage.ir61;
import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Enumeration;
import ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface;
import ru.CryptoPro.JCP.KeyStore.MediaInterface;
import ru.CryptoPro.JCP.KeyStore.MutexException;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.LocalMutex;

/* loaded from: classes4.dex */
public final class HDImageMedia implements MediaInterface {
    public static final LocalMutex c;
    public final String a;
    public final String b;

    static {
        LocalMutex localMutex;
        try {
            localMutex = new LocalMutex(".create_lock_HDIMAGE");
        } catch (Exception e) {
            JCPLogger.thrown("Cannot create global .create_lock_HDIMAGE lock.", e);
            localMutex = null;
        }
        c = localMutex;
    }

    public HDImageMedia(String str, String str2) {
        this.a = str2;
        this.b = str;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MediaInterface
    public Enumeration enumExisting(String str) {
        return new FatFolderEnumerator(new File(this.a));
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MediaInterface
    public Enumeration enumNew(String str) {
        return new NewFatFolderEnumerator(str);
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MediaInterface
    public void lockMutex() throws MutexException {
        if (c != null) {
            try {
                AccessController.doPrivileged(new ir61(0));
            } catch (PrivilegedActionException e) {
                throw ((MutexException) e.getException());
            }
        }
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MediaInterface
    public String mediaUnique() {
        return null;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MediaInterface
    public ContainerReaderInterface open(String str, boolean z) {
        return new hq61(this, new File(this.a, str).getAbsolutePath(), z);
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MediaInterface
    public String toString() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MediaInterface
    public void unlock() {
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MediaInterface
    public void unlockMutex() {
        LocalMutex localMutex = c;
        if (localMutex != null) {
            localMutex.unlockFinally();
        }
    }
}
