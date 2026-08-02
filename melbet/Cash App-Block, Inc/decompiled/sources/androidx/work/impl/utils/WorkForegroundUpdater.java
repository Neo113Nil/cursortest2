package androidx.work.impl.utils;

import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;

/* loaded from: classes.dex */
public final class WorkForegroundUpdater {
    public final Processor mForegroundProcessor;
    public final WorkManagerTaskExecutor mTaskExecutor;
    public final WorkSpecDao_Impl mWorkSpecDao;

    static {
        Logger$LogcatLogger.tagWithPrefix("WMFgUpdater");
    }

    public WorkForegroundUpdater(WorkDatabase workDatabase, Processor processor, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.mForegroundProcessor = processor;
        this.mTaskExecutor = workManagerTaskExecutor;
        this.mWorkSpecDao = workDatabase.workSpecDao();
    }
}
