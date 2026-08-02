package androidx.glance.session;

import androidx.compose.animation.BoundsAnimation$animate$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SessionWorkerKt$runSession$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InteractiveFrameClock $frameClock;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorkerKt$runSession$6$1(InteractiveFrameClock interactiveFrameClock, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$frameClock = interactiveFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new SessionWorkerKt$runSession$6$1(this.$frameClock, continuation, 0);
            default:
                return new SessionWorkerKt$runSession$6$1(this.$frameClock, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SessionWorkerKt$runSession$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Continuation continuation = null;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InteractiveFrameClock interactiveFrameClock = this.$frameClock;
                    this.label = 1;
                    interactiveFrameClock.getClass();
                    if (JobKt.withTimeoutOrNull(5000L, new SessionWorkerKt$runSession$6$1(interactiveFrameClock, continuation, i), this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.$frameClock.stopInteractive();
                    InteractiveFrameClock interactiveFrameClock2 = this.$frameClock;
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl.initCancellability();
                    synchronized (interactiveFrameClock2.lock) {
                        interactiveFrameClock2.currentHz = 20;
                        interactiveFrameClock2.interactiveCoroutine = cancellableContinuationImpl;
                    }
                    cancellableContinuationImpl.invokeOnCancellation(new BoundsAnimation$animate$1(interactiveFrameClock2, 22));
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
