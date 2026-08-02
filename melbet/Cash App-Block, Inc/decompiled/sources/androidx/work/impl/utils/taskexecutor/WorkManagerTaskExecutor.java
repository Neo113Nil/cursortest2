package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.room.TransactionExecutor;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import retrofit2.AndroidMainExecutor;

/* loaded from: classes.dex */
public final class WorkManagerTaskExecutor implements TaskExecutor {
    public final TransactionExecutor mBackgroundExecutor;
    public final CoroutineDispatcher mTaskDispatcher;
    public final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    public final AndroidMainExecutor mMainThreadExecutor = new AndroidMainExecutor(this);

    public WorkManagerTaskExecutor(ExecutorService executorService) {
        TransactionExecutor transactionExecutor = new TransactionExecutor(executorService, 1);
        this.mBackgroundExecutor = transactionExecutor;
        this.mTaskDispatcher = JobKt.from(transactionExecutor);
    }
}
