package v;

import android.os.Process;

/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f8502a;

    public h(Runnable runnable, String str, int i2) {
        super(runnable, str);
        this.f8502a = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f8502a);
        super.run();
    }
}
