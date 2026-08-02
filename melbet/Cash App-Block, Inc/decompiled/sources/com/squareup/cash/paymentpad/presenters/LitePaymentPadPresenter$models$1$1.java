package com.squareup.cash.paymentpad.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.protos.common.CurrencyCode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class LitePaymentPadPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $amountErrorTrigger$delegate;
    public final /* synthetic */ MutableState $errorMessage$delegate;
    public final /* synthetic */ MutableState $inputCurrencyCode$delegate;
    public final /* synthetic */ MutableState $profileCurrencyCode$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $rawAmount$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LitePaymentPadPresenter$models$1$1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$rawAmount$delegate = mutableState;
        this.$profileCurrencyCode$delegate = mutableState2;
        this.$inputCurrencyCode$delegate = mutableState3;
        this.$amountErrorTrigger$delegate = mutableState4;
        this.$errorMessage$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new LitePaymentPadPresenter$models$1$1(this.$rawAmount$delegate, this.$profileCurrencyCode$delegate, this.$inputCurrencyCode$delegate, this.$amountErrorTrigger$delegate, this.$errorMessage$delegate, continuation, 0);
            case 1:
                return new LitePaymentPadPresenter$models$1$1(this.$rawAmount$delegate, this.$profileCurrencyCode$delegate, this.$inputCurrencyCode$delegate, this.$amountErrorTrigger$delegate, this.$errorMessage$delegate, continuation, 1);
            default:
                return new LitePaymentPadPresenter$models$1$1(this.$rawAmount$delegate, this.$profileCurrencyCode$delegate, this.$inputCurrencyCode$delegate, this.$amountErrorTrigger$delegate, this.$errorMessage$delegate, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((LitePaymentPadPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        FidesmoDeviceState.PreparingDelivery preparingDelivery = FidesmoDeviceState.PreparingDelivery.INSTANCE;
        MutableState mutableState = this.$errorMessage$delegate;
        MutableState mutableState2 = this.$rawAmount$delegate;
        MutableState mutableState3 = this.$amountErrorTrigger$delegate;
        MutableState mutableState4 = this.$profileCurrencyCode$delegate;
        MutableState mutableState5 = this.$inputCurrencyCode$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue("0");
                mutableState5.setValue((CurrencyCode) mutableState4.getValue());
                mutableState3.setValue(null);
                mutableState.setValue(null);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) mutableState2.getValue();
                if (Intrinsics.areEqual(fidesmoDeviceState, preparingDelivery)) {
                    mutableState4.setValue(null);
                    FidesmoDeprovisioningPresenter.access$models$advanceSyntheticProgressTargetByStep(mutableState5, mutableState3);
                } else if (fidesmoDeviceState instanceof FidesmoDeviceState.DeliveringService) {
                    if (!Intrinsics.areEqual((FidesmoDeviceState.DeliveringService) mutableState4.getValue(), fidesmoDeviceState)) {
                        FidesmoDeprovisioningPresenter.access$models$advanceSyntheticProgressTargetByStep(mutableState5, mutableState3);
                        mutableState4.setValue((FidesmoDeviceState.DeliveringService) fidesmoDeviceState);
                    }
                } else if (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDelivered) {
                    Integer num = (Integer) mutableState5.getValue();
                    if (num == null) {
                        Integer num2 = (Integer) mutableState3.getValue();
                        num = new Integer(num2 != null ? num2.intValue() : 0);
                    }
                    mutableState5.setValue(num);
                    mutableState3.setValue(new Integer(100));
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FidesmoDeviceState fidesmoDeviceState2 = (FidesmoDeviceState) mutableState2.getValue();
                if (Intrinsics.areEqual(fidesmoDeviceState2, preparingDelivery)) {
                    mutableState4.setValue(null);
                    FidesmoProvisioningPresenter.access$models$advanceSyntheticProgressTargetByStep(mutableState5, mutableState3);
                } else if (fidesmoDeviceState2 instanceof FidesmoDeviceState.DeliveringService) {
                    if (!Intrinsics.areEqual((FidesmoDeviceState.DeliveringService) mutableState4.getValue(), fidesmoDeviceState2)) {
                        FidesmoProvisioningPresenter.access$models$advanceSyntheticProgressTargetByStep(mutableState5, mutableState3);
                        mutableState4.setValue((FidesmoDeviceState.DeliveringService) fidesmoDeviceState2);
                    }
                } else if (fidesmoDeviceState2 instanceof FidesmoDeviceState.ServiceDelivered) {
                    Integer num3 = (Integer) mutableState5.getValue();
                    if (num3 == null) {
                        Integer num4 = (Integer) mutableState3.getValue();
                        num3 = new Integer(num4 != null ? num4.intValue() : 0);
                    }
                    mutableState5.setValue(num3);
                    mutableState3.setValue(new Integer(100));
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
