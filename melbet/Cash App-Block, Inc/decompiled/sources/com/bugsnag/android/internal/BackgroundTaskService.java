package com.bugsnag.android.internal;

import app.cash.molecule.PlatformKt;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class BackgroundTaskService {
    public final ThreadPoolExecutor defaultExecutor;
    public final ThreadPoolExecutor errorExecutor;
    public final ThreadPoolExecutor internalReportExecutor;
    public final ThreadPoolExecutor ioExecutor;
    public final ThreadPoolExecutor sessionExecutor;

    public BackgroundTaskService() {
        ThreadPoolExecutor createExecutor = PlatformKt.createExecutor("Bugsnag Error thread", TaskType.ERROR_REQUEST, true);
        ThreadPoolExecutor createExecutor2 = PlatformKt.createExecutor("Bugsnag Session thread", TaskType.SESSION_REQUEST, true);
        ThreadPoolExecutor createExecutor3 = PlatformKt.createExecutor("Bugsnag IO thread", TaskType.IO, true);
        ThreadPoolExecutor createExecutor4 = PlatformKt.createExecutor("Bugsnag Internal Report thread", TaskType.INTERNAL_REPORT, false);
        ThreadPoolExecutor createExecutor5 = PlatformKt.createExecutor("Bugsnag Default thread", TaskType.DEFAULT, false);
        this.errorExecutor = createExecutor;
        this.sessionExecutor = createExecutor2;
        this.ioExecutor = createExecutor3;
        this.internalReportExecutor = createExecutor4;
        this.defaultExecutor = createExecutor5;
    }

    public final void execute(TaskType taskType, Runnable runnable) {
        int ordinal = taskType.ordinal();
        if (ordinal == 0) {
            this.errorExecutor.execute(runnable);
            return;
        }
        if (ordinal == 1) {
            this.sessionExecutor.execute(runnable);
            return;
        }
        if (ordinal == 2) {
            this.ioExecutor.execute(runnable);
        } else if (ordinal == 3) {
            this.internalReportExecutor.execute(runnable);
        } else {
            if (ordinal != 4) {
                return;
            }
            this.defaultExecutor.execute(runnable);
        }
    }

    public final SafeFuture submitTask(TaskType taskType, Callable callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(taskType, futureTask);
        return new SafeFuture(futureTask, taskType);
    }

    public final class SafeFuture implements Future {
        public final FutureTask delegate;
        public final TaskType taskType;

        public SafeFuture(FutureTask futureTask, TaskType taskType) {
            this.delegate = futureTask;
            this.taskType = taskType;
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return this.delegate.cancel(z);
        }

        public final void ensureTaskGetSafe() {
            FutureTask futureTask = this.delegate;
            if (futureTask.isDone()) {
                return;
            }
            Thread currentThread = Thread.currentThread();
            TaskTypeThread taskTypeThread = currentThread instanceof TaskTypeThread ? (TaskTypeThread) currentThread : null;
            if ((taskTypeThread != null ? taskTypeThread.taskType : null) == this.taskType) {
                futureTask.run();
            }
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            ensureTaskGetSafe();
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.delegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            ensureTaskGetSafe();
            return this.delegate.get(j, timeUnit);
        }
    }

    public final SafeFuture submitTask(TaskType taskType, Runnable runnable) {
        return submitTask(taskType, Executors.callable(runnable));
    }
}
