package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y20 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
