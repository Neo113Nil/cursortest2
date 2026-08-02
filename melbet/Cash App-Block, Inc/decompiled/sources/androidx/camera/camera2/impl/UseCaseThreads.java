package androidx.camera.camera2.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class UseCaseThreads {
    public final Executor backgroundExecutor;
    public final ThreadLocal isSequentialThread;
    public final ContextScope scope;
    public final PlayerControlView$$ExternalSyntheticLambda0 sequentialExecutor;
    public final SequentialExecutor sequentialExecutorDelegate;
    public final ContextScope sequentialScope;

    public UseCaseThreads(ContextScope contextScope, Executor executor, CoroutineDispatcher coroutineDispatcher) {
        executor.getClass();
        this.scope = contextScope;
        this.backgroundExecutor = executor;
        new Handler(Looper.getMainLooper());
        this.sequentialExecutorDelegate = new SequentialExecutor(executor);
        this.isSequentialThread = new ThreadLocal();
        PlayerControlView$$ExternalSyntheticLambda0 playerControlView$$ExternalSyntheticLambda0 = new PlayerControlView$$ExternalSyntheticLambda0(this, 1);
        this.sequentialExecutor = playerControlView$$ExternalSyntheticLambda0;
        this.sequentialScope = JobKt.CoroutineScope(contextScope.coroutineContext.plus(JobKt.SupervisorJob$default()).plus(JobKt.from(playerControlView$$ExternalSyntheticLambda0)));
    }
}
