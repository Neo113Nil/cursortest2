package L;

import android.os.Process;

/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final int f1712n;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f1712n = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f1712n);
        super.run();
    }
}
