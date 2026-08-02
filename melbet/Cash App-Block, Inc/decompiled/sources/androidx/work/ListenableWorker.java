package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.n$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$3("WorkerParameters is null");
            throw null;
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.mBackgroundExecutor;
    }

    public abstract ListenableFuture getForegroundInfoAsync();

    public final UUID getId() {
        return this.mWorkerParams.mId;
    }

    public final Data getInputData() {
        return this.mWorkerParams.mInputData;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.mRuntimeExtras.responseAdapter;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.mRunAttemptCount;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.mTags;
    }

    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.mWorkTaskExecutor;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.mRuntimeExtras.path;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.mRuntimeExtras.requestAdapter;
    }

    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.mWorkerFactory;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final ListenableFuture setForegroundAsync(ForegroundInfo foregroundInfo) {
        WorkForegroundUpdater workForegroundUpdater = this.mWorkerParams.mForegroundUpdater;
        Context applicationContext = getApplicationContext();
        return DimensionKt.executeAsync(workForegroundUpdater.mTaskExecutor.mBackgroundExecutor, "setForegroundAsync", new l2$$ExternalSyntheticLambda7(workForegroundUpdater, getId(), foregroundInfo, applicationContext, 4));
    }

    public ListenableFuture setProgressAsync(Data data) {
        WorkProgressUpdater workProgressUpdater = this.mWorkerParams.mProgressUpdater;
        getApplicationContext();
        return DimensionKt.executeAsync(workProgressUpdater.mTaskExecutor.mBackgroundExecutor, "updateProgress", new n$$ExternalSyntheticLambda1(9, workProgressUpdater, getId(), data));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    public abstract class Result {

        public final class Retry extends Result {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && Retry.class == obj.getClass();
            }

            public final int hashCode() {
                return 25945934;
            }

            public final String toString() {
                return "Retry";
            }
        }

        public final class Success extends Result {
            public final Data mOutputData;

            public Success(Data data) {
                this.mOutputData = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Success.class != obj.getClass()) {
                    return false;
                }
                return this.mOutputData.equals(((Success) obj).mOutputData);
            }

            public final int hashCode() {
                return this.mOutputData.hashCode() - 1876823561;
            }

            public final String toString() {
                return "Success {mOutputData=" + this.mOutputData + '}';
            }
        }

        public static Success success() {
            return new Success(Data.EMPTY);
        }

        /* loaded from: classes3.dex */
        public final class Failure extends Result {
            public final Data mOutputData;

            public Failure(Data data) {
                this.mOutputData = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Failure.class != obj.getClass()) {
                    return false;
                }
                return this.mOutputData.equals(((Failure) obj).mOutputData);
            }

            public final Data getOutputData() {
                return this.mOutputData;
            }

            public final int hashCode() {
                return this.mOutputData.hashCode() + 846803280;
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.mOutputData + '}';
            }

            public Failure() {
                this(Data.EMPTY);
            }
        }
    }
}
