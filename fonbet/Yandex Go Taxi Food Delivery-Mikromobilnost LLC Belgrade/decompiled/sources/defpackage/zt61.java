package defpackage;

import ru.CryptoPro.JCP.KeyStore.MutexInterface;

/* loaded from: classes4.dex */
public class zt61 implements MutexInterface {
    public boolean a = false;

    @Override // ru.CryptoPro.JCP.KeyStore.MutexInterface
    public final synchronized void lock() {
        try {
            if (this.a) {
                while (this.a) {
                    wait();
                }
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MutexInterface
    public final synchronized boolean tryLock() {
        if (this.a) {
            return false;
        }
        this.a = true;
        return false;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MutexInterface
    public final synchronized void unlock() {
        this.a = false;
        notifyAll();
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MutexInterface
    public final synchronized void unlockFinally() {
        this.a = false;
        notifyAll();
    }
}
