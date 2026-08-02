package androidx.work;

import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.squareup.wire.GrpcMethod;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class WorkerParameters {
    public ExecutorService mBackgroundExecutor;
    public WorkForegroundUpdater mForegroundUpdater;
    public UUID mId;
    public Data mInputData;
    public WorkProgressUpdater mProgressUpdater;
    public int mRunAttemptCount;
    public GrpcMethod mRuntimeExtras;
    public HashSet mTags;
    public WorkManagerTaskExecutor mWorkTaskExecutor;
    public CoroutineContext mWorkerContext;
    public WorkerFactory mWorkerFactory;
}
