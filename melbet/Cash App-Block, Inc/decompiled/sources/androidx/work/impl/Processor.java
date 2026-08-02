package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Configuration;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import bo.app.q4$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class Processor {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("Processor");
    public final Context mAppContext;
    public final Configuration mConfiguration;
    public final WorkDatabase mWorkDatabase;
    public final WorkManagerTaskExecutor mWorkTaskExecutor;
    public final HashMap mEnqueuedWorkMap = new HashMap();
    public final HashMap mForegroundWorkMap = new HashMap();
    public final HashSet mCancelledIds = new HashSet();
    public final ArrayList mOuterListeners = new ArrayList();
    public PowerManager.WakeLock mForegroundLock = null;
    public final Object mLock = new Object();
    public final HashMap mWorkRuns = new HashMap();

    public Processor(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, WorkDatabase workDatabase) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = workManagerTaskExecutor;
        this.mWorkDatabase = workDatabase;
    }

    public static boolean interrupt(String str, WorkerWrapper workerWrapper, int i) {
        String str2 = TAG;
        if (workerWrapper == null) {
            Logger$LogcatLogger.get().debug(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.workerJob.cancelImpl$kotlinx_coroutines_core(new WorkerStoppedException(i));
        Logger$LogcatLogger.get().debug(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void addExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public final WorkerWrapper cleanUpWorkerUnsafe(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.mForegroundWorkMap.remove(str);
        boolean z = workerWrapper != null;
        if (!z) {
            workerWrapper = (WorkerWrapper) this.mEnqueuedWorkMap.remove(str);
        }
        this.mWorkRuns.remove(str);
        if (z) {
            synchronized (this.mLock) {
                try {
                    if (this.mForegroundWorkMap.isEmpty()) {
                        try {
                            this.mAppContext.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                        } catch (Throwable th) {
                            Logger$LogcatLogger.get().error(TAG, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.mForegroundLock;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.mForegroundLock = null;
                        }
                    }
                } finally {
                }
            }
        }
        return workerWrapper;
    }

    public final WorkerWrapper getWorkerWrapperUnsafe(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.mForegroundWorkMap.get(str);
        return workerWrapper == null ? (WorkerWrapper) this.mEnqueuedWorkMap.get(str) : workerWrapper;
    }

    public final void runOnExecuted(WorkGenerationalId workGenerationalId) {
        this.mWorkTaskExecutor.mMainThreadExecutor.execute(new q4$$ExternalSyntheticLambda0(9, this, workGenerationalId));
    }
}
