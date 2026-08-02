package androidx.work;

import android.content.Context;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.room.util.DBUtil;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Worker extends ListenableWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public abstract ListenableWorker.Result.Success doWork();

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return DBUtil.getFuture(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(17, backgroundExecutor, new Worker$$ExternalSyntheticLambda1(this)));
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return DBUtil.getFuture(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(17, backgroundExecutor, new Worker$$ExternalSyntheticLambda0(this, 0)));
    }
}
