package androidx.camera.camera2.pipe.core;

import android.os.Handler;
import android.util.Log;
import androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda1;
import bo.app.y0$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class Threads {
    public final Lazy _camera2Executor;
    public final Lazy _camera2Handler;
    public final CoroutineDispatcher backgroundDispatcher;
    public final Executor backgroundExecutor;
    public final CoroutineDispatcher blockingDispatcher;
    public final Executor blockingExecutor;
    public final CoroutineScope cameraPipeDispatchScope;
    public final CoroutineScope cameraPipeScope;
    public final CoroutineDispatcher lightweightDispatcher;
    public final Executor lightweightExecutor;

    public Threads(CoroutineScope coroutineScope, CoroutineScope coroutineScope2, Executor executor, CoroutineDispatcher coroutineDispatcher, Executor executor2, CoroutineDispatcher coroutineDispatcher2, Executor executor3, CoroutineDispatcher coroutineDispatcher3, Function0 function0, ThreadConfigModule$$ExternalSyntheticLambda1 threadConfigModule$$ExternalSyntheticLambda1) {
        coroutineScope.getClass();
        coroutineScope2.getClass();
        executor.getClass();
        executor2.getClass();
        executor3.getClass();
        this.cameraPipeScope = coroutineScope;
        this.cameraPipeDispatchScope = coroutineScope2;
        this.blockingExecutor = executor;
        this.blockingDispatcher = coroutineDispatcher;
        this.backgroundExecutor = executor2;
        this.backgroundDispatcher = coroutineDispatcher2;
        this.lightweightExecutor = executor3;
        this.lightweightDispatcher = coroutineDispatcher3;
        this._camera2Handler = LazyKt.lazy(new y0$$ExternalSyntheticLambda0(1, function0));
        this._camera2Executor = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(threadConfigModule$$ExternalSyntheticLambda1, 0));
    }

    public final Handler getCamera2Handler() {
        return (Handler) this._camera2Handler.getValue();
    }

    public final Object runBlockingCheckedOrNull(long j, Function1 function1) {
        try {
            return JobKt.runBlockingK(this.blockingDispatcher, new ToastKt$Toast$8$1(this, function1, j, (Continuation) null));
        } catch (InterruptedException e) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
            return null;
        }
    }
}
