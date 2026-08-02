package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewEvent;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractSubmitBorrowAmount;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FirstTimeBorrowData;
import com.squareup.protos.lending.InitiateLoanData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class CreditFirstTimeBorrowBlockerPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BorrowAmountPickerViewEvent $amountPickerEvent;
    public final /* synthetic */ MutableState $errorDialogState;
    public final /* synthetic */ MutableState $isSubmittingAmountPicker;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CreditFirstTimeBorrowBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditFirstTimeBorrowBlockerPresenter$models$2$2(CreditFirstTimeBorrowBlockerPresenter creditFirstTimeBorrowBlockerPresenter, BorrowAmountPickerViewEvent borrowAmountPickerViewEvent, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = creditFirstTimeBorrowBlockerPresenter;
        this.$amountPickerEvent = borrowAmountPickerViewEvent;
        this.$isSubmittingAmountPicker = mutableState;
        this.$errorDialogState = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CreditFirstTimeBorrowBlockerPresenter$models$2$2(this.this$0, this.$amountPickerEvent, this.$isSubmittingAmountPicker, this.$errorDialogState, continuation, 0);
            default:
                return new CreditFirstTimeBorrowBlockerPresenter$models$2$2(this.this$0, this.$amountPickerEvent, this.$isSubmittingAmountPicker, this.$errorDialogState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CreditFirstTimeBorrowBlockerPresenter$models$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$errorDialogState;
        MutableState mutableState2 = this.$isSubmittingAmountPicker;
        BorrowAmountPickerViewEvent borrowAmountPickerViewEvent = this.$amountPickerEvent;
        CreditFirstTimeBorrowBlockerPresenter creditFirstTimeBorrowBlockerPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    FirstTimeBorrowData firstTimeBorrowData = creditFirstTimeBorrowBlockerPresenter.args.blocker.first_time_borrow_data;
                    firstTimeBorrowData.getClass();
                    InitiateLoanData initiateLoanData = firstTimeBorrowData.picker_data;
                    initiateLoanData.getClass();
                    Money money = initiateLoanData.quick_loan_options.get(((BorrowAmountPickerViewEvent.ConfirmQuickAmount) borrowAmountPickerViewEvent).index).amount;
                    money.getClass();
                    creditFirstTimeBorrowBlockerPresenter.analytics.track(new BorrowAppletInteractSubmitBorrowAmount(creditFirstTimeBorrowBlockerPresenter.flowToken, BorrowAppletInteractSubmitBorrowAmount.SelectionType.RECOMMENDED, money.amount), null);
                    Object handleAmountPickerConfirmAmount = creditFirstTimeBorrowBlockerPresenter.handleAmountPickerConfirmAmount(money, mutableState2, mutableState, this);
                    if (handleAmountPickerConfirmAmount != coroutineSingletons) {
                        handleAmountPickerConfirmAmount = Unit.INSTANCE;
                    }
                    if (handleAmountPickerConfirmAmount == coroutineSingletons) {
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
                    BorrowAmountPickerViewEvent.ConfirmCustomAmount confirmCustomAmount = (BorrowAmountPickerViewEvent.ConfirmCustomAmount) borrowAmountPickerViewEvent;
                    this.label = 1;
                    creditFirstTimeBorrowBlockerPresenter.analytics.track(new BorrowAppletInteractSubmitBorrowAmount(creditFirstTimeBorrowBlockerPresenter.flowToken, BorrowAppletInteractSubmitBorrowAmount.SelectionType.CUSTOM, confirmCustomAmount.amount.amount), null);
                    Object handleAmountPickerConfirmAmount2 = creditFirstTimeBorrowBlockerPresenter.handleAmountPickerConfirmAmount(confirmCustomAmount.amount, mutableState2, mutableState, this);
                    if (handleAmountPickerConfirmAmount2 != coroutineSingletons2) {
                        handleAmountPickerConfirmAmount2 = Unit.INSTANCE;
                    }
                    if (handleAmountPickerConfirmAmount2 == coroutineSingletons2) {
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
