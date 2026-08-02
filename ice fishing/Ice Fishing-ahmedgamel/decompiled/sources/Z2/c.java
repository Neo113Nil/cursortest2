package Z2;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4133n = 2;

    public /* synthetic */ c(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        y8.c b9;
        switch (this.f4133n) {
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
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                I1.a aVar = y8.c.f41911h;
                reentrantLock = y8.c.f41912j;
                reentrantLock.lock();
                try {
                    b9 = x1.g.b();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
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
        }
    }

    public /* synthetic */ c(String str) {
        super(str);
    }

    public /* synthetic */ c(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
