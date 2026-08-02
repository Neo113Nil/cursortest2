package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.glance.session.SessionWorker$doWork$2$2;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.squareup.cash.graphics.swampgl.components.Scene;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class TooltipStateImpl {
    public CancellableContinuationImpl job;
    public final MutatorMutex mutatorMutex;
    public final MutableTransitionState transition = new MutableTransitionState(Boolean.FALSE);

    public TooltipStateImpl(MutatorMutex mutatorMutex) {
        this.mutatorMutex = mutatorMutex;
    }

    public final void dismiss() {
        this.transition.setTargetState(Boolean.FALSE);
    }

    public final boolean isVisible() {
        MutableTransitionState mutableTransitionState = this.transition;
        return ((Boolean) mutableTransitionState.currentState$delegate.getValue()).booleanValue() || ((Boolean) mutableTransitionState.targetState$delegate.getValue()).booleanValue();
    }

    public final Object show(MutatePriority mutatePriority, SuspendLambda suspendLambda) {
        Continuation continuation = null;
        SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, new Scene.AnonymousClass1(this, continuation, 6), mutatePriority, continuation, 6);
        MutatorMutex mutatorMutex = this.mutatorMutex;
        mutatorMutex.getClass();
        Object coroutineScope = JobKt.coroutineScope(new EngineInterceptor$intercept$2(mutatePriority, mutatorMutex, sessionWorker$doWork$2$2, continuation, 3), suspendLambda);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }
}
