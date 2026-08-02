package defpackage;

import android.os.Process;

/* loaded from: classes10.dex */
public final class wht extends Thread {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ wht(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
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
    }

    public /* synthetic */ wht(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ wht(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
