package e3;

import android.os.Process;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends Thread {

    /* renamed from: g, reason: collision with root package name */
    public final int f2099g;

    public l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f2099g = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2099g);
        super.run();
    }
}
