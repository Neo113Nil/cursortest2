package X2;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3785n = 1;

    public /* synthetic */ d(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.f3785n) {
            case 0:
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
            case 1:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                G1.a aVar = y8.c.f41937h;
                reentrantLock = y8.c.f41938j;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                y8.c b9 = y2.e.b();
                if (b9 == y8.c.i) {
                    y8.c.i = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (b9 != null) {
                        b9.k();
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ d(String str) {
        super(str);
    }

    public /* synthetic */ d(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
