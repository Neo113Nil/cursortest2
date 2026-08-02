package androidx.work;

import android.content.Context;
import androidx.lifecycle.BlockRunner$cancel$1;
import coil3.size.DimensionKt;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.presenters.RecipientAvatars;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ForegroundInfo;", "getForegroundInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/Data;", "data", "", "setProgress", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "DeprecatedDispatcher", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final CoroutineDispatcher coroutineContext;
    private final WorkerParameters params;

    public final class DeprecatedDispatcher extends CoroutineDispatcher {
        public static final DeprecatedDispatcher INSTANCE = new DeprecatedDispatcher();
        public static final DefaultScheduler dispatcher = Dispatchers.Default;

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
            coroutineContext.getClass();
            runnable.getClass();
            dispatcher.dispatch(coroutineContext, runnable);
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
            coroutineContext.getClass();
            dispatcher.getClass();
            return !false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.params = workerParameters;
        this.coroutineContext = DeprecatedDispatcher.INSTANCE;
    }

    @Deprecated
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, Continuation<? super ForegroundInfo> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(Continuation continuation);

    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(Continuation<? super ForegroundInfo> continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture getForegroundInfoAsync() {
        return DimensionKt.launchFuture$default(getCoroutineContext().plus(JobKt.Job$default()), new BlockRunner$cancel$1(this, (Continuation) null, 4));
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, Continuation<? super Unit> continuation) {
        ListenableFuture foregroundAsync = setForegroundAsync(foregroundInfo);
        foregroundAsync.getClass();
        Object await = RecipientAvatars.await(foregroundAsync, continuation);
        return await == CoroutineSingletons.COROUTINE_SUSPENDED ? await : Unit.INSTANCE;
    }

    public final Object setProgress(Data data, Continuation<? super Unit> continuation) {
        ListenableFuture progressAsync = setProgressAsync(data);
        progressAsync.getClass();
        Object await = RecipientAvatars.await(progressAsync, continuation);
        return await == CoroutineSingletons.COROUTINE_SUSPENDED ? await : Unit.INSTANCE;
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture startWork() {
        CoroutineContext coroutineContext = !Intrinsics.areEqual(getCoroutineContext(), DeprecatedDispatcher.INSTANCE) ? getCoroutineContext() : this.params.mWorkerContext;
        coroutineContext.getClass();
        return DimensionKt.launchFuture$default(coroutineContext.plus(JobKt.Job$default()), new CashApp$onCreate$4$1$1(this, null, 6));
    }
}
