package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewEvent;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.AtmPickerAmountBlocker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class AtmPickerAmountBlockerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AtmPickerAmountBlockerViewEvent $event;
    public final /* synthetic */ MutableState $isLoading$delegate;
    public int label;
    public final /* synthetic */ AtmPickerAmountBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtmPickerAmountBlockerPresenter$models$1$1(AtmPickerAmountBlockerPresenter atmPickerAmountBlockerPresenter, AtmPickerAmountBlockerViewEvent atmPickerAmountBlockerViewEvent, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = atmPickerAmountBlockerPresenter;
        this.$event = atmPickerAmountBlockerViewEvent;
        this.$isLoading$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AtmPickerAmountBlockerPresenter$models$1$1(this.this$0, this.$event, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AtmPickerAmountBlockerPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        AtmPickerAmountBlocker.AtmPickerOption.PresetAmount presetAmount = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.$isLoading$delegate.setValue(Boolean.TRUE);
            AtmPickerAmountBlockerPresenter atmPickerAmountBlockerPresenter = this.this$0;
            AtmPickerAmountBlocker.AtmPickerOption.Option option = atmPickerAmountBlockerPresenter.atmPicker.options.get(((AtmPickerAmountBlockerViewEvent.ConfirmAtmPickerOption) this.$event).index).option;
            if (option != null) {
                AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount presetAmount2 = option instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount ? (AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option : null;
                if (presetAmount2 != null) {
                    presetAmount = presetAmount2.getValue();
                }
            }
            presetAmount.getClass();
            Money money = presetAmount.amount;
            money.getClass();
            this.label = 1;
            if (AtmPickerAmountBlockerPresenter.access$submitAmount(atmPickerAmountBlockerPresenter, money, this) == coroutineSingletons) {
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
