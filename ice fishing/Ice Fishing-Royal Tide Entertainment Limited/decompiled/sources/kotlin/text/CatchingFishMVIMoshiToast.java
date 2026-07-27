package kotlin.text;

import android.os.Process;

/* loaded from: classes.dex */
public final class CatchingFishMVIMoshiToast extends Thread {
    public final int CatchingFishReduxKtor;

    public CatchingFishMVIMoshiToast(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.CatchingFishReduxKtor = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.CatchingFishReduxKtor);
        super.run();
    }
}
