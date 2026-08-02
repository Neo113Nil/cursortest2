package com.google.android.play.core.splitcompat;

import android.os.Process;
import com.bumptech.glide.load.engine.ActiveResources$1$1;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public final class zzc implements ThreadFactory {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        switch (this.$r8$classId) {
            case 0:
                return new Thread(runnable, "SplitCompatBackgroundThread");
            case 1:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 2:
                return new Thread(runnable) { // from class: androidx.core.provider.RequestExecutor$DefaultThreadFactory$ProcessPriorityThread
                    public final int mPriority = 10;

                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        Process.setThreadPriority(this.mPriority);
                        super.run();
                    }
                };
            default:
                return new Thread(new ActiveResources$1$1(0, runnable), "glide-active-resources");
        }
    }
}
