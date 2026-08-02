package androidx.glance.session;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import app.cash.trifle.KeyHandle$keyPair$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class InteractiveFrameClock implements MonotonicFrameClock {
    public CancellableContinuationImpl interactiveCoroutine;
    public long lastFrame;
    public final CoroutineScope scope;
    public final BroadcastFrameClock frameClock = new BroadcastFrameClock(new KeyHandle$keyPair$2(this, 8));
    public final Object lock = new Object();
    public int currentHz = 5;

    public InteractiveFrameClock(TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1) {
        this.scope = timerScopeKt$withTimer$2$1$blockScope$1;
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

    public final void stopInteractive() {
        synchronized (this.lock) {
            CancellableContinuationImpl cancellableContinuationImpl = this.interactiveCoroutine;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.cancel(null);
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object withFrameNanos(Continuation continuation, Function1 function1) {
        return this.frameClock.withFrameNanos(continuation, function1);
    }
}
