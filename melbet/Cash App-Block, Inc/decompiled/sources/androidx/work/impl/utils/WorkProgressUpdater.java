package androidx.work.impl.utils;

import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;

/* loaded from: classes.dex */
public final class WorkProgressUpdater {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("WorkProgressUpdater");
    public final WorkManagerTaskExecutor mTaskExecutor;
    public final WorkDatabase mWorkDatabase;

    public WorkProgressUpdater(WorkDatabase workDatabase, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.mWorkDatabase = workDatabase;
        this.mTaskExecutor = workManagerTaskExecutor;
    }
}
