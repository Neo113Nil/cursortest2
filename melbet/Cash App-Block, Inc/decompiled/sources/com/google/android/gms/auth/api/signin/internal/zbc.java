package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.AsyncTask;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.loader.app.LoaderManagerImpl;
import androidx.loader.content.AsyncTaskLoader$LoadTask;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public final class zbc {
    public volatile AsyncTaskLoader$LoadTask mCancellingTask;
    public Executor mExecutor;
    public LoaderManagerImpl.LoaderInfo mListener;
    public volatile AsyncTaskLoader$LoadTask mTask;
    public final Semaphore zba;
    public final Set zbb;
    public boolean mStarted = false;
    public boolean mAbandoned = false;
    public boolean mReset = true;
    public boolean mContentChanged = false;

    public zbc(Context context, Set set) {
        context.getApplicationContext();
        this.zba = new Semaphore(0);
        this.zbb = set;
    }

    public final void cancelLoad() {
        if (this.mTask != null) {
            boolean z = this.mStarted;
            if (!z) {
                if (z) {
                    forceLoad();
                } else {
                    this.mContentChanged = true;
                }
            }
            AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask = this.mCancellingTask;
            AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask2 = this.mTask;
            if (asyncTaskLoader$LoadTask != null) {
                asyncTaskLoader$LoadTask2.getClass();
                this.mTask = null;
                return;
            }
            asyncTaskLoader$LoadTask2.getClass();
            AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask3 = this.mTask;
            asyncTaskLoader$LoadTask3.mCancelled.set(true);
            if (asyncTaskLoader$LoadTask3.mFuture.cancel(false)) {
                this.mCancellingTask = this.mTask;
            }
            this.mTask = null;
        }
    }

    public final void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        this.mTask.getClass();
        if (this.mExecutor == null) {
            this.mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask = this.mTask;
        Executor executor = this.mExecutor;
        if (asyncTaskLoader$LoadTask.mStatus == 1) {
            asyncTaskLoader$LoadTask.mStatus = 2;
            executor.execute(asyncTaskLoader$LoadTask.mFuture);
            return;
        }
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(asyncTaskLoader$LoadTask.mStatus);
        if (ordinal == 1) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot execute task: the task is already running.");
        } else if (ordinal != 2) {
            a$$ExternalSyntheticBUOutline0.m$1("We should never reach this state");
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void forceLoad() {
        cancelLoad();
        this.mTask = new AsyncTaskLoader$LoadTask(this);
        executePendingTask();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
