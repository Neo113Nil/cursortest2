package com.squareup.cash.borrow.presenters;

import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewLoanAmountPicker;
import com.squareup.protos.lending.InitiateLoanData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BorrowHomeAmountPickerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InitiateLoanData $pickerData;
    public final /* synthetic */ BorrowHomeAmountPickerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowHomeAmountPickerPresenter$models$1$1(InitiateLoanData initiateLoanData, BorrowHomeAmountPickerPresenter borrowHomeAmountPickerPresenter, Continuation continuation) {
        super(2, continuation);
        this.$pickerData = initiateLoanData;
        this.this$0 = borrowHomeAmountPickerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BorrowHomeAmountPickerPresenter$models$1$1(this.$pickerData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BorrowHomeAmountPickerPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        String joinToString$default = CollectionsKt.joinToString$default(this.$pickerData.quick_loan_options, ",", null, null, 0, null, new LoanDetailsSheetKt$$ExternalSyntheticLambda3(1), 30);
        BorrowHomeAmountPickerPresenter borrowHomeAmountPickerPresenter = this.this$0;
        borrowHomeAmountPickerPresenter.analytics.track(new BorrowAppletViewLoanAmountPicker(borrowHomeAmountPickerPresenter.flowToken, joinToString$default), null);
        return Unit.INSTANCE;
    }
}
