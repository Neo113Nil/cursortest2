package com.squareup.cash.borrow.views;

import com.squareup.cash.borrow.viewmodels.BorrowHomeViewEvent;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListEvent;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class LoanHistoryTileKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ BorrowAppletLoanHistoryTile.Data.Loan f$1;

    public /* synthetic */ LoanHistoryTileKt$$ExternalSyntheticLambda5(Function1 function1, BorrowAppletLoanHistoryTile.Data.Loan loan, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = loan;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        BorrowAppletLoanHistoryTile.Data.Loan loan = this.f$1;
        Function1 function1 = this.f$0;
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj;
        switch (i) {
            case 0:
                details.getClass();
                function1.invoke(new BorrowHomeViewEvent.TapLoanHistoryRow(details, loan.legacy_reference_token));
                break;
            default:
                details.getClass();
                BorrowAppletLoanHistoryTile.Data.Loan.Details details2 = loan.loan_details;
                details2.getClass();
                function1.invoke(new ExpandedLoanHistoryListEvent.DisplayLoanDetails(details2, loan.legacy_reference_token));
                break;
        }
        return Unit.INSTANCE;
    }
}
