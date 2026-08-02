package androidx.compose.runtime;

import androidx.compose.runtime.internal.AwaiterQueue$Awaiter;
import coil3.ComponentRegistry;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$await$2$1;

/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public final Function0 onNewAwaiters;
    public final ComponentRegistry.Builder queue = new ComponentRegistry.Builder(1);

    public final class FrameAwaiter extends AwaiterQueue$Awaiter {
        public CancellableContinuationImpl continuation;
        public Function1 onFrame;

        @Override // androidx.compose.runtime.internal.AwaiterQueue$Awaiter
        public final void cancel() {
            this.onFrame = null;
            this.continuation = null;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue$Awaiter
        public final void resumeWithException(Throwable th) {
            CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(SafeTrace.createFailure(th));
            }
        }
    }

    public BroadcastFrameClock(Function0 function0) {
        this.onNewAwaiters = function0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object withFrameNanos(Continuation continuation, Function1 function1) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        FrameAwaiter frameAwaiter = new FrameAwaiter();
        frameAwaiter.continuation = cancellableContinuationImpl;
        frameAwaiter.onFrame = function1;
        cancellableContinuationImpl.invokeOnCancellation(new KotlinExtensions$await$2$1(this.queue.addAwaiter(frameAwaiter, this.onNewAwaiters), 1));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
