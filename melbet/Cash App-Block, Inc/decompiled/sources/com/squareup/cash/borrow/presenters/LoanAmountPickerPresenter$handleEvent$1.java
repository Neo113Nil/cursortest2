package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.borrow.viewmodels.LoanSelectorItem;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractSubmitBorrowAmount;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.common.Money;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class LoanAmountPickerPresenter$handleEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AmountPickerViewEvent $event;
    public final /* synthetic */ MutableState $loading;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ LoanAmountPickerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoanAmountPickerPresenter$handleEvent$1(LoanAmountPickerPresenter loanAmountPickerPresenter, AmountPickerViewEvent amountPickerViewEvent, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = loanAmountPickerPresenter;
        this.$event = amountPickerViewEvent;
        this.$loading = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new LoanAmountPickerPresenter$handleEvent$1(this.this$0, this.$event, this.$loading, continuation, 0);
            default:
                return new LoanAmountPickerPresenter$handleEvent$1(this.this$0, this.$event, this.$loading, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((LoanAmountPickerPresenter$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final MutableState mutableState = this.$loading;
        AmountPickerViewEvent amountPickerViewEvent = this.$event;
        final LoanAmountPickerPresenter loanAmountPickerPresenter = this.this$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    AmountSelectorWidgetModel.Item item = ((AmountPickerViewEvent$Condensed$ItemConfirmed) amountPickerViewEvent).item;
                    item.getClass();
                    Analytics analytics = loanAmountPickerPresenter.analytics;
                    String str = loanAmountPickerPresenter.flowToken;
                    BorrowAppletInteractSubmitBorrowAmount.SelectionType selectionType = BorrowAppletInteractSubmitBorrowAmount.SelectionType.RECOMMENDED;
                    Money money = ((LoanSelectorItem.Amount) item).amount;
                    analytics.track(new BorrowAppletInteractSubmitBorrowAmount(str, selectionType, money.amount), null);
                    LoanAmountPickerPresenter.updateWith(mutableState);
                    Object initiateLoan = loanAmountPickerPresenter.loanFlowStarter.initiateLoan(loanAmountPickerPresenter.navigator, money, new Function1() { // from class: com.squareup.cash.borrow.presenters.LoanAmountPickerPresenter$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i4 = i2;
                            MutableState mutableState2 = mutableState;
                            LoanAmountPickerPresenter loanAmountPickerPresenter2 = loanAmountPickerPresenter;
                            ApiResult.Failure failure = (ApiResult.Failure) obj2;
                            switch (i4) {
                                case 0:
                                    failure.getClass();
                                    loanAmountPickerPresenter2.handleInitiateLoanFailure(failure, mutableState2);
                                    break;
                                default:
                                    failure.getClass();
                                    loanAmountPickerPresenter2.handleInitiateLoanFailure(failure, mutableState2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, this);
                    if (initiateLoan != coroutineSingletons) {
                        initiateLoan = Unit.INSTANCE;
                    }
                    if (initiateLoan == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AmountPickerViewEvent$Full$MoneySubmitted amountPickerViewEvent$Full$MoneySubmitted = (AmountPickerViewEvent$Full$MoneySubmitted) amountPickerViewEvent;
                    this.label = 1;
                    loanAmountPickerPresenter.analytics.track(new BorrowAppletInteractSubmitBorrowAmount(loanAmountPickerPresenter.flowToken, BorrowAppletInteractSubmitBorrowAmount.SelectionType.CUSTOM, amountPickerViewEvent$Full$MoneySubmitted.amount.amount), null);
                    LoanAmountPickerPresenter.updateWith(mutableState);
                    final int i5 = 0;
                    Object initiateLoan2 = loanAmountPickerPresenter.loanFlowStarter.initiateLoan(loanAmountPickerPresenter.navigator, amountPickerViewEvent$Full$MoneySubmitted.amount, new Function1() { // from class: com.squareup.cash.borrow.presenters.LoanAmountPickerPresenter$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i42 = i5;
                            MutableState mutableState2 = mutableState;
                            LoanAmountPickerPresenter loanAmountPickerPresenter2 = loanAmountPickerPresenter;
                            ApiResult.Failure failure = (ApiResult.Failure) obj2;
                            switch (i42) {
                                case 0:
                                    failure.getClass();
                                    loanAmountPickerPresenter2.handleInitiateLoanFailure(failure, mutableState2);
                                    break;
                                default:
                                    failure.getClass();
                                    loanAmountPickerPresenter2.handleInitiateLoanFailure(failure, mutableState2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, this);
                    if (initiateLoan2 != coroutineSingletons2) {
                        initiateLoan2 = Unit.INSTANCE;
                    }
                    if (initiateLoan2 == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
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
