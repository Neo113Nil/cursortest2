package defpackage;

import android.os.Process;

/* loaded from: classes11.dex */
public abstract class xh4 implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
