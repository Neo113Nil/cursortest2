package t;

import android.os.Process;

/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: e, reason: collision with root package name */
    public final int f2981e;

    public i(Runnable runnable, String str, int i2) {
        super(runnable, str);
        this.f2981e = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2981e);
        super.run();
    }
}
