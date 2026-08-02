package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class AddMoneyBlockerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isGooglePayReady$delegate;
    public MutableState L$0;
    public int label;
    public final /* synthetic */ AddMoneyBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyBlockerPresenter$models$1$1(AddMoneyBlockerPresenter addMoneyBlockerPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = addMoneyBlockerPresenter;
        this.$isGooglePayReady$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddMoneyBlockerPresenter$models$1$1(this.this$0, this.$isGooglePayReady$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddMoneyBlockerPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AddMoneyBlockerPresenter addMoneyBlockerPresenter = this.this$0;
            if (addMoneyBlockerPresenter.googlePayEnabled && addMoneyBlockerPresenter.addMoneyScreen.google_pay_button != null) {
                GooglePayPaymentsClient googlePayPaymentsClient = addMoneyBlockerPresenter.googlePayPaymentsClient;
                MutableState mutableState2 = this.$isGooglePayReady$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                obj = ((RealGooglePayPaymentsClient) googlePayPaymentsClient).isReadyToPay(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableState = mutableState2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mutableState = this.L$0;
        SafeTrace.throwOnFailure(obj);
        Boolean bool = (Boolean) obj;
        bool.getClass();
        mutableState.setValue(bool);
        return Unit.INSTANCE;
    }
}
