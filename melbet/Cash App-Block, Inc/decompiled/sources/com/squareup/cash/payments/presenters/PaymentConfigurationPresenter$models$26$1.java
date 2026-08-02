package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$26$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $paymentRouterData$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ RealPaymentConfigurationRouter $router;
    public final /* synthetic */ CoroutineScope $scope;
    public int label;
    public final /* synthetic */ PaymentConfigurationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$26$1(MutableState mutableState, PaymentConfigurationPresenter paymentConfigurationPresenter, CoroutineScope coroutineScope, RealPaymentConfigurationRouter realPaymentConfigurationRouter, Continuation continuation) {
        super(2, continuation);
        this.$paymentRouterData$delegate = mutableState;
        this.this$0 = paymentConfigurationPresenter;
        this.$scope = coroutineScope;
        this.$router = realPaymentConfigurationRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new PaymentConfigurationPresenter$models$26$1(this.$paymentRouterData$delegate, this.this$0, this.$scope, this.$router, continuation);
            default:
                return new PaymentConfigurationPresenter$models$26$1(this.this$0, this.$paymentRouterData$delegate, this.$scope, this.$router, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentConfigurationPresenter$models$26$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState = this.$paymentRouterData$delegate;
                    String str = ((PaymentRouterData) mutableState.getValue()).payLinkToken;
                    if (str != null) {
                        this.label = 1;
                        if (PaymentConfigurationPresenter.access$models$loadPayLinkData(this.this$0, mutableState, this.$scope, this.$router, str, this) == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentConfigurationPresenter paymentConfigurationPresenter = this.this$0;
                    PaymentConfigurationFlow paymentConfigurationFlow = paymentConfigurationPresenter.args.paymentConfigurationFlow;
                    boolean z = paymentConfigurationFlow instanceof PaymentConfigurationFlow.PayLinkReview;
                    MutableState mutableState2 = this.$paymentRouterData$delegate;
                    if (z) {
                        String str2 = ((PaymentRouterData) mutableState2.getValue()).payLinkToken;
                        if (str2 != null) {
                            this.label = 1;
                            if (PaymentConfigurationPresenter.access$models$loadPayLinkData(paymentConfigurationPresenter, mutableState2, this.$scope, this.$router, str2, this) == coroutineSingletons2) {
                                break;
                            }
                        }
                    } else if (paymentConfigurationFlow instanceof PaymentConfigurationFlow.StablecoinQrScanFlow) {
                        mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16711679));
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$26$1(PaymentConfigurationPresenter paymentConfigurationPresenter, MutableState mutableState, CoroutineScope coroutineScope, RealPaymentConfigurationRouter realPaymentConfigurationRouter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentConfigurationPresenter;
        this.$paymentRouterData$delegate = mutableState;
        this.$scope = coroutineScope;
        this.$router = realPaymentConfigurationRouter;
    }
}
