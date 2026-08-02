package app.cash.redwood.treehouse;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.PaymentPasscodeActivity$loadView$3$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SequentialStateFlow$collect$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FlowCollector $collector;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SequentialStateFlow$collect$2(FlowCollector flowCollector, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$collector = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                SequentialStateFlow$collect$2 sequentialStateFlow$collect$2 = new SequentialStateFlow$collect$2(this.$collector, continuation, 0);
                sequentialStateFlow$collect$2.L$0 = obj;
                return sequentialStateFlow$collect$2;
            default:
                SequentialStateFlow$collect$2 sequentialStateFlow$collect$22 = new SequentialStateFlow$collect$2(this.$collector, continuation, 1);
                sequentialStateFlow$collect$22.L$0 = obj;
                return sequentialStateFlow$collect$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((SequentialStateFlow$collect$2) create((StateFlow) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((SequentialStateFlow$collect$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        FlowCollector flowCollector = this.$collector;
        int i2 = 1;
        switch (i) {
            case 0:
                StateFlow stateFlow = (StateFlow) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentPasscodeActivity$loadView$3$1 paymentPasscodeActivity$loadView$3$1 = new PaymentPasscodeActivity$loadView$3$1(flowCollector, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (stateFlow.collect(paymentPasscodeActivity$loadView$3$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            default:
                Object obj2 = this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(obj2, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
