package com.gamericefishpro.space.z3;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {
    public final int d;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.d = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.d);
        super.run();
    }
}
