package com.squareup.cash.borrow.views;

import com.squareup.cash.blockers.viewmodels.InviteFriendsViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyAliasViewEvent;
import com.squareup.cash.blockers.views.components.VerifyAliasView;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowMultiStepLoadingViewEvent$Close;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListEvent;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewEvent;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticAttachment;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BorrowHomeKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BorrowHomeKt$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        WebViewBlockerViewEvent.Close close = WebViewBlockerViewEvent.Close.INSTANCE;
        BorrowMultiStepLoadingViewEvent$Close borrowMultiStepLoadingViewEvent$Close = BorrowMultiStepLoadingViewEvent$Close.INSTANCE;
        BugReportingViewEvent.ToggleDiagnosticAttachmentsExpanded toggleDiagnosticAttachmentsExpanded = BugReportingViewEvent.ToggleDiagnosticAttachmentsExpanded.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(BorrowHomeViewEvent.Close.INSTANCE);
                break;
            case 1:
                function1.invoke(InviteFriendsViewEvent.InviteClick.INSTANCE);
                break;
            case 2:
                int i2 = VerifyAliasView.$r8$clinit;
                function1.invoke(VerifyAliasViewEvent.GoBack.INSTANCE);
                break;
            case 3:
                VerifyAliasViewEvent.ResendCode.Source source = VerifyAliasViewEvent.ResendCode.Source.TOP_LEVEL;
                function1.invoke(new VerifyAliasViewEvent.ResendCode());
                break;
            case 4:
                function1.invoke(VerifyAliasViewEvent.Help.INSTANCE);
                break;
            case 5:
                function1.invoke(close);
                break;
            case 6:
                function1.invoke(close);
                break;
            case 7:
                function1.invoke(BorrowAmountPickerViewEvent.Dismiss.INSTANCE);
                break;
            case 8:
                function1.invoke(BorrowLimitHubViewEvent.Close.INSTANCE);
                break;
            case 9:
                function1.invoke(borrowMultiStepLoadingViewEvent$Close);
                break;
            case 10:
                function1.invoke(borrowMultiStepLoadingViewEvent$Close);
                break;
            case 11:
                function1.invoke(ExpandedLoanHistoryListEvent.Close.INSTANCE);
                break;
            case 12:
                function1.invoke(FirstTimeBorrowViewEvent.BulletsButtonClick.INSTANCE);
                break;
            case 13:
                function1.invoke(FirstTimeBorrowViewEvent.BorrowButtonClick.INSTANCE);
                break;
            case 14:
                function1.invoke(FirstTimeBorrowViewEvent.Close.INSTANCE);
                break;
            case 15:
                function1.invoke(FirstTimeBorrowViewEvent.HelpButtonClick.INSTANCE);
                break;
            case 16:
                function1.invoke(toggleDiagnosticAttachmentsExpanded);
                break;
            case 17:
                function1.invoke(new BugReportingViewEvent.ToggleDiagnosticAttachment(DiagnosticAttachment.ViewHierarchy));
                break;
            case 18:
                function1.invoke(new BugReportingViewEvent.ToggleDiagnosticAttachment(DiagnosticAttachment.BackStack));
                break;
            case 19:
                function1.invoke(new BugReportingViewEvent.ToggleDiagnosticAttachment(DiagnosticAttachment.Logs));
                break;
            case 20:
                function1.invoke(new BugReportingViewEvent.ToggleDiagnosticAttachment(DiagnosticAttachment.Database));
                break;
            case 21:
                function1.invoke(new BugReportingViewEvent.ToggleDiagnosticAttachment(DiagnosticAttachment.Preferences));
                break;
            case 22:
                function1.invoke(new BugReportingViewEvent.ToggleDiagnosticAttachment(DiagnosticAttachment.DebugPreferences));
                break;
            case 23:
                function1.invoke(new BugReportingViewEvent.ToggleDiagnosticAttachment(DiagnosticAttachment.SamEligibility));
                break;
            case 24:
                function1.invoke(BugReportingViewEvent.GoBack.INSTANCE);
                break;
            case 25:
                function1.invoke(toggleDiagnosticAttachmentsExpanded);
                break;
            case 26:
                function1.invoke(BugReportingViewEvent.ShareTicketUrl.INSTANCE);
                break;
            case 27:
                function1.invoke(BugReportingViewEvent.Continue.INSTANCE);
                break;
            case 28:
                function1.invoke(AfterPayOrderDetailsViewEvent.CloseOrderDetailsButtonClicked.INSTANCE);
                break;
            default:
                function1.invoke(AfterPayOrderDetailsViewEvent.TryAgainClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
