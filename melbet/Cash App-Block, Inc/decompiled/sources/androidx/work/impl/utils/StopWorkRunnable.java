package androidx.work.impl.utils;

import androidx.appcompat.widget.ActionMenuView;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkerWrapper;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Set;

/* loaded from: classes3.dex */
public final class StopWorkRunnable implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object processor;
    public final int reason;
    public final boolean stopInForeground;
    public final Object token;

    public StopWorkRunnable(Processor processor, StartStopToken startStopToken, boolean z, int i) {
        processor.getClass();
        startStopToken.getClass();
        this.processor = processor;
        this.token = startStopToken;
        this.stopInForeground = z;
        this.reason = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean interrupt;
        WorkerWrapper cleanUpWorkerUnsafe;
        switch (this.$r8$classId) {
            case 0:
                boolean z = this.stopInForeground;
                Processor processor = (Processor) this.processor;
                StartStopToken startStopToken = (StartStopToken) this.token;
                if (z) {
                    int i = this.reason;
                    processor.getClass();
                    String str = startStopToken.id.workSpecId;
                    synchronized (processor.mLock) {
                        cleanUpWorkerUnsafe = processor.cleanUpWorkerUnsafe(str);
                    }
                    interrupt = Processor.interrupt(str, cleanUpWorkerUnsafe, i);
                } else {
                    int i2 = this.reason;
                    processor.getClass();
                    String str2 = startStopToken.id.workSpecId;
                    synchronized (processor.mLock) {
                        try {
                            if (processor.mForegroundWorkMap.get(str2) != null) {
                                Logger$LogcatLogger.get().debug(Processor.TAG, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                            } else {
                                Set set = (Set) processor.mWorkRuns.get(str2);
                                if (set != null && set.contains(startStopToken)) {
                                    interrupt = Processor.interrupt(str2, processor.cleanUpWorkerUnsafe(str2), i2);
                                }
                            }
                            interrupt = false;
                        } finally {
                        }
                    }
                }
                Logger$LogcatLogger.get().debug(Logger$LogcatLogger.tagWithPrefix("StopWorkRunnable"), "StopWorkRunnable for " + ((StartStopToken) this.token).id.workSpecId + "; Processor.stopWork = " + interrupt);
                return;
            default:
                ((ActionMenuView) this.processor).setTranslationX(((BottomAppBar) this.token).getActionMenuViewTranslationX(r0, this.reason, this.stopInForeground));
                return;
        }
    }

    public StopWorkRunnable(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.token = bottomAppBar;
        this.processor = actionMenuView;
        this.reason = i;
        this.stopInForeground = z;
    }
}
