package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.AnimatableKt;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PullRefreshState$animateIndicatorTo$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ float $offset;
    public int label;
    public final /* synthetic */ PullRefreshState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshState$animateIndicatorTo$1$1(PullRefreshState pullRefreshState, float f, Continuation continuation) {
        super(1, continuation);
        this.this$0 = pullRefreshState;
        this.$offset = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PullRefreshState$animateIndicatorTo$1$1(this.this$0, this.$offset, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PullRefreshState$animateIndicatorTo$1$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            PullRefreshState pullRefreshState = this.this$0;
            float floatValue = pullRefreshState._position$delegate.getFloatValue();
            HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0 = new HintHandler$$ExternalSyntheticLambda0(pullRefreshState, 14);
            this.label = 1;
            if (AnimatableKt.animate$default(floatValue, this.$offset, null, hintHandler$$ExternalSyntheticLambda0, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
