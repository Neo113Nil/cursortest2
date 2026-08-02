package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final class v0o extends Thread {
    public final int a;

    public v0o(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
