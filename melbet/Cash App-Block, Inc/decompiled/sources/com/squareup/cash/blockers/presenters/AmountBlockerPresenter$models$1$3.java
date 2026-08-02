package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.protos.franklin.app.SetAmountRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class AmountBlockerPresenter$models$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AmountPickerViewEvent $event;
    public final /* synthetic */ MutableState $isLoading$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ AmountBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountBlockerPresenter$models$1$3(AmountBlockerPresenter amountBlockerPresenter, AmountPickerViewEvent amountPickerViewEvent, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = amountBlockerPresenter;
        this.$event = amountPickerViewEvent;
        this.$isLoading$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AmountBlockerPresenter$models$1$3(this.this$0, this.$event, this.$isLoading$delegate, continuation, 0);
            default:
                return new AmountBlockerPresenter$models$1$3(this.this$0, this.$event, this.$isLoading$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AmountBlockerPresenter$models$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isLoading$delegate;
        AmountPickerViewEvent amountPickerViewEvent = this.$event;
        AmountBlockerPresenter amountBlockerPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SetAmountRequest access$toAmountRequest = AmountBlockerPresenter.access$toAmountRequest(amountBlockerPresenter, amountPickerViewEvent);
                    QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(1, mutableState);
                    QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$12 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(2, mutableState);
                    this.label = 1;
                    if (AmountBlockerPresenter.access$handleSubmission(amountBlockerPresenter, access$toAmountRequest, quickPayViewKt$QuickPay$1$1$1$2$1$3$1, quickPayViewKt$QuickPay$1$1$1$2$1$3$12, this) == coroutineSingletons) {
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
                    SetAmountRequest access$toAmountRequest2 = AmountBlockerPresenter.access$toAmountRequest(amountBlockerPresenter, amountPickerViewEvent);
                    QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$13 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(3, mutableState);
                    QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$14 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(4, mutableState);
                    this.label = 1;
                    if (AmountBlockerPresenter.access$handleSubmission(amountBlockerPresenter, access$toAmountRequest2, quickPayViewKt$QuickPay$1$1$1$2$1$3$13, quickPayViewKt$QuickPay$1$1$1$2$1$3$14, this) == coroutineSingletons2) {
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
