package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $paymentRouterData$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealPaymentConfigurationRouter $router;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentConfigurationPresenter$models$3$1(RealPaymentConfigurationRouter realPaymentConfigurationRouter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$router = realPaymentConfigurationRouter;
        this.$paymentRouterData$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$paymentRouterData$delegate;
        RealPaymentConfigurationRouter realPaymentConfigurationRouter = this.$router;
        switch (i) {
            case 0:
                return new PaymentConfigurationPresenter$models$3$1(realPaymentConfigurationRouter, mutableState, continuation, 0);
            default:
                return new PaymentConfigurationPresenter$models$3$1(realPaymentConfigurationRouter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentConfigurationPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$paymentRouterData$delegate;
        RealPaymentConfigurationRouter realPaymentConfigurationRouter = this.$router;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentRouterData paymentRouterData = (PaymentRouterData) mutableState.getValue();
                    this.label = 1;
                    StateFlowImpl stateFlowImpl = realPaymentConfigurationRouter._currentModel;
                    PaymentConfigurationViewModel viewModel = realPaymentConfigurationRouter.toViewModel((PaymentConfigurationStep) realPaymentConfigurationRouter._currentStep.getValue(), paymentRouterData);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, viewModel);
                    if (Unit.INSTANCE == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentRouterData paymentRouterData2 = (PaymentRouterData) mutableState.getValue();
                    this.label = 1;
                    if (realPaymentConfigurationRouter.previousStep(paymentRouterData2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
