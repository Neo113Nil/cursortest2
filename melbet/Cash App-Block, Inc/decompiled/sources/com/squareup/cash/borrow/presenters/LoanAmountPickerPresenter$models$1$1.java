package com.squareup.cash.borrow.presenters;

import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewLoanAmountPicker;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class LoanAmountPickerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LoanAmountPickerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanAmountPickerPresenter$models$1$1(LoanAmountPickerPresenter loanAmountPickerPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loanAmountPickerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoanAmountPickerPresenter$models$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoanAmountPickerPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        LoanAmountPickerPresenter loanAmountPickerPresenter = this.this$0;
        loanAmountPickerPresenter.analytics.track(new BorrowAppletViewLoanAmountPicker(loanAmountPickerPresenter.flowToken, CollectionsKt.joinToString$default(loanAmountPickerPresenter.args.getLoanData().quick_loan_options, ",", null, null, 0, null, new LoanDetailsSheetKt$$ExternalSyntheticLambda3(3), 30)), null);
        return Unit.INSTANCE;
    }
}
