package app.cash.molecule;

import android.view.Choreographer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public final Choreographer choreographer;

    public AndroidUiFrameClock(Choreographer choreographer) {
        this.choreographer = choreographer;
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
    public final Object withFrameNanos(Continuation continuation, final Function1 function1) {
        CoroutineContext.Element element = continuation.getContext().get(ContinuationInterceptor.Key);
        AndroidUiDispatcher androidUiDispatcher = element instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) element : null;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback(this, function1) { // from class: app.cash.molecule.AndroidUiFrameClock$withFrameNanos$2$callback$1
            public final /* synthetic */ Function1 $onFrame;

            {
                this.$onFrame = function1;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object failure;
                Function1 function12 = this.$onFrame;
                try {
                    Result.Companion companion = Result.Companion;
                    failure = function12.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                CancellableContinuationImpl.this.resumeWith(failure);
            }
        };
        if (androidUiDispatcher == null || !Intrinsics.areEqual(androidUiDispatcher.choreographer, this.choreographer)) {
            this.choreographer.postFrameCallback(frameCallback);
            cancellableContinuationImpl.invokeOnCancellation(new Latch$await$2$2(17, this, frameCallback));
        } else {
            synchronized (androidUiDispatcher.lock) {
                androidUiDispatcher.toRunOnFrame.add(frameCallback);
                if (!androidUiDispatcher.scheduledFrameDispatch) {
                    androidUiDispatcher.scheduledFrameDispatch = true;
                    androidUiDispatcher.choreographer.postFrameCallback(androidUiDispatcher.dispatchCallback);
                }
            }
            cancellableContinuationImpl.invokeOnCancellation(new Latch$await$2$2(16, androidUiDispatcher, frameCallback));
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
