package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class jt1 extends Thread {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ jt1(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ReentrantLock reentrantLock;
        mt1 K;
        switch (this.a) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 2:
            default:
                super.run();
                return;
            case 3:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = mt1.h;
                reentrantLock = mt1.h;
                reentrantLock.lock();
                try {
                    K = e3s.K();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
            if (K == mt1.l) {
                mt1.l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (K != null) {
                    K.k();
                }
            }
        }
    }

    public /* synthetic */ jt1(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ jt1(String str) {
        super(str);
    }

    public /* synthetic */ jt1(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
