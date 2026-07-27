package t;

import android.os.Process;

/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: f, reason: collision with root package name */
    public final int f2976f;

    public i(Runnable runnable, String str, int i2) {
        super(runnable, str);
        this.f2976f = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2976f);
        super.run();
    }
}
