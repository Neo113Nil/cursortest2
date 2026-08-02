package com.bumptech.glide.load.engine;

import android.os.Process;
import com.google.android.datatransport.runtime.logging.Logging;

/* loaded from: classes4.dex */
public final class ActiveResources$1$1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Runnable val$r;

    public /* synthetic */ ActiveResources$1$1(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.val$r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Runnable runnable = this.val$r;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                try {
                    runnable.run();
                    break;
                } catch (Exception e) {
                    Logging.e(e, "Executor", "Background execution failure.");
                    return;
                }
            case 3:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }

    public String toString() {
        int i = this.$r8$classId;
        Runnable runnable = this.val$r;
        switch (i) {
            case 3:
                return runnable.toString();
            case 4:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
