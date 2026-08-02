package com.squareup.cash.recurringpayments.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewEvent;
import com.squareup.cash.recurringpayments.screens.CreateOrEditRecurringPaymentScreen;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes7.dex */
public final class RealCreateOrEditRecurringPaymentPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AmountChooserViewEvent $event;
    public final /* synthetic */ MutableState $isLoading$delegate;
    public final /* synthetic */ MutableState $rawAmount$delegate;
    public final /* synthetic */ MutableState $shouldShakeAmountAndShowLimitText$delegate;
    public int label;
    public final /* synthetic */ RealCreateOrEditRecurringPaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCreateOrEditRecurringPaymentPresenter$models$1$1(AmountChooserViewEvent amountChooserViewEvent, RealCreateOrEditRecurringPaymentPresenter realCreateOrEditRecurringPaymentPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$event = amountChooserViewEvent;
        this.this$0 = realCreateOrEditRecurringPaymentPresenter;
        this.$rawAmount$delegate = mutableState;
        this.$shouldShakeAmountAndShowLimitText$delegate = mutableState2;
        this.$isLoading$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealCreateOrEditRecurringPaymentPresenter$models$1$1(this.$event, this.this$0, this.$rawAmount$delegate, this.$shouldShakeAmountAndShowLimitText$delegate, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealCreateOrEditRecurringPaymentPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecurringPaymentBlocker.Button.Action action;
        RealCreateOrEditRecurringPaymentPresenter realCreateOrEditRecurringPaymentPresenter = this.this$0;
        CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen = realCreateOrEditRecurringPaymentPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (this.$event instanceof AmountChooserViewEvent.TapPrimaryButton) {
                RecurringPaymentBlocker.Button button = createOrEditRecurringPaymentScreen.primaryButton;
                button.getClass();
                action = button.action;
                action.getClass();
            } else {
                RecurringPaymentBlocker.Button button2 = createOrEditRecurringPaymentScreen.secondaryButton;
                button2.getClass();
                action = button2.action;
                action.getClass();
            }
            MutableState mutableState = this.$rawAmount$delegate;
            boolean isInLimit = WiresAccountInfo.WiresProfile.isInLimit(createOrEditRecurringPaymentScreen.minAmountInCents, (String) mutableState.getValue(), createOrEditRecurringPaymentScreen.maxAmountInCents);
            if (action != RecurringPaymentBlocker.Button.Action.SET || isInLimit) {
                this.$isLoading$delegate.setValue(Boolean.TRUE);
                RecurringPaymentBlocker.Schedule schedule = createOrEditRecurringPaymentScreen.selectedSchedule;
                schedule.getClass();
                Money money = new Money(new Long(WiresAccountInfo.WiresProfile.toCents((String) mutableState.getValue())), createOrEditRecurringPaymentScreen.currencyCode, 4);
                this.label = 1;
                if (RealCreateOrEditRecurringPaymentPresenter.access$handleButtonTap(realCreateOrEditRecurringPaymentPresenter, action, schedule, money, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                MutableState mutableState2 = this.$shouldShakeAmountAndShowLimitText$delegate;
                mutableState2.setValue(VersionedKt.update((Versioned) mutableState2.getValue(), Boolean.TRUE));
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
