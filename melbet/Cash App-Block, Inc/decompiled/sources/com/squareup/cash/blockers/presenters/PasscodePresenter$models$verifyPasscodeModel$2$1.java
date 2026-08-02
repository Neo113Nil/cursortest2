package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class PasscodePresenter$models$verifyPasscodeModel$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $events;
    public final /* synthetic */ PasscodeTypedTransformer $typedPresenter;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PasscodePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodePresenter$models$verifyPasscodeModel$2$1(PasscodePresenter passcodePresenter, PasscodeTypedTransformer passcodeTypedTransformer, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.this$0 = passcodePresenter;
        this.$typedPresenter = passcodeTypedTransformer;
        this.$events = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PasscodePresenter$models$verifyPasscodeModel$2$1 passcodePresenter$models$verifyPasscodeModel$2$1 = new PasscodePresenter$models$verifyPasscodeModel$2$1(this.this$0, this.$typedPresenter, this.$events, continuation);
        passcodePresenter$models$verifyPasscodeModel$2$1.L$0 = obj;
        return passcodePresenter$models$verifyPasscodeModel$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PasscodePresenter$models$verifyPasscodeModel$2$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope = (ProducerScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            StateFlow stateFlow = this.this$0.lifecycleState;
            MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(16);
            PasscodePresenter$models$1$2 passcodePresenter$models$1$2 = new PasscodePresenter$models$1$2(this.$typedPresenter, this.$events, producerScope, null, 13);
            this.L$0 = null;
            this.label = 1;
            if (StateFlowKt.doWhile(stateFlow, moveBitcoinViewKt$$ExternalSyntheticLambda3, passcodePresenter$models$1$2, this) == coroutineSingletons) {
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
