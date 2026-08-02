package androidx.compose.runtime;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public final MonotonicFrameClock frameClock;
    public final Latch latch = new Latch();

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.frameClock = monotonicFrameClock;
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object withFrameNanos(Continuation continuation, Function1 function1) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        int i;
        boolean z;
        Object result;
        if (continuation instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) continuation;
            int i2 = pausableMonotonicFrameClock$withFrameNanos$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pausableMonotonicFrameClock$withFrameNanos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pausableMonotonicFrameClock$withFrameNanos$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Latch latch = this.latch;
                    pausableMonotonicFrameClock$withFrameNanos$1.L$0 = function1;
                    pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
                    synchronized (latch.lock) {
                        z = latch._isOpen;
                    }
                    if (z) {
                        result = Unit.INSTANCE;
                    } else {
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(pausableMonotonicFrameClock$withFrameNanos$1));
                        cancellableContinuationImpl.initCancellability();
                        synchronized (latch.lock) {
                            ((ArrayList) latch.awaiters).add(cancellableContinuationImpl);
                        }
                        cancellableContinuationImpl.invokeOnCancellation(new Latch$await$2$2(0, latch, cancellableContinuationImpl));
                        result = cancellableContinuationImpl.getResult();
                        if (result != coroutineSingletons) {
                            result = Unit.INSTANCE;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = pausableMonotonicFrameClock$withFrameNanos$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                MonotonicFrameClock monotonicFrameClock = this.frameClock;
                pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
                pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
                Object withFrameNanos = monotonicFrameClock.withFrameNanos(pausableMonotonicFrameClock$withFrameNanos$1, function1);
                return withFrameNanos != coroutineSingletons ? coroutineSingletons : withFrameNanos;
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, continuation);
        Object obj2 = pausableMonotonicFrameClock$withFrameNanos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pausableMonotonicFrameClock$withFrameNanos$1.label;
        if (i != 0) {
        }
        MonotonicFrameClock monotonicFrameClock2 = this.frameClock;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        Object withFrameNanos2 = monotonicFrameClock2.withFrameNanos(pausableMonotonicFrameClock$withFrameNanos$1, function1);
        if (withFrameNanos2 != coroutineSingletons2) {
        }
    }
}
