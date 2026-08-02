package com.squareup.cash.banking.views;

import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewEvent;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewEvent;
import com.squareup.cash.banking.viewmodels.OverdraftViewEvent;
import com.squareup.cash.banking.viewmodels.RecurringDepositsFirstTimeUserViewEvent;
import com.squareup.cash.banking.viewmodels.RecurringDepositsViewEvent;
import com.squareup.cash.banking.viewmodels.TransfersInstructionsEvent;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class TransfersView$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ TransfersView$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TransfersInstructionsEvent.GoBack goBack = TransfersInstructionsEvent.GoBack.INSTANCE;
        TransfersInstructionsEvent.WireTransferActionClick wireTransferActionClick = TransfersInstructionsEvent.WireTransferActionClick.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                int i2 = TransfersView.$r8$clinit;
                function1.invoke(goBack);
                break;
            case 1:
                function1.invoke(BenefitsLeafletViewEvent.DoneButtonClicked.INSTANCE);
                break;
            case 2:
                function1.invoke(BetterOverdraftViewEvent.ToggleButtonClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(BetterOverdraftViewEvent.PayButtonClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(BetterOverdraftViewEvent.BackClicked.INSTANCE);
                break;
            case 5:
                function1.invoke(BetterOverdraftViewEvent.ConfirmTurnOffClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(BetterOverdraftViewEvent.CancelTurnOffClicked.INSTANCE);
                break;
            case 7:
                int i3 = OverdraftCoverageSheetView.$r8$clinit;
                function1.invoke(OverdraftViewEvent.GoBack.INSTANCE);
                break;
            case 8:
                function1.invoke(OverdraftViewEvent.FooterClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(OverdraftViewEvent.RepaymentClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(OverdraftViewEvent.ToggleClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(RecurringDepositsFirstTimeUserViewEvent.CloseClick.INSTANCE);
                break;
            case 12:
                function1.invoke(RecurringDepositsFirstTimeUserViewEvent.ContinueButtonClick.INSTANCE);
                break;
            case 13:
                function1.invoke(RecurringDepositsViewEvent.ScheduledOptionClick.INSTANCE);
                break;
            case 14:
                function1.invoke(RecurringDepositsViewEvent.LearnMoreHelpClick.INSTANCE);
                break;
            case 15:
                function1.invoke(RecurringDepositsViewEvent.ExitFlow.INSTANCE);
                break;
            case 16:
                function1.invoke(RecurringDepositsViewEvent.BalanceBasedOptionClick.INSTANCE);
                break;
            case 17:
                function1.invoke(goBack);
                break;
            case 18:
                function1.invoke(wireTransferActionClick);
                break;
            case 19:
                function1.invoke(wireTransferActionClick);
                break;
            case 20:
                function1.invoke(wireTransferActionClick);
                break;
            case 21:
                function1.invoke(TransfersInstructionsEvent.WireTransferRoutingNumberClick.INSTANCE);
                break;
            case 22:
                function1.invoke(TransfersInstructionsEvent.BankTransferHowToClick.INSTANCE);
                break;
            case 23:
                function1.invoke(TransfersInstructionsEvent.BankTransferOrderCashCard.INSTANCE);
                break;
            case 24:
                function1.invoke(TransfersInstructionsEvent.BankTransferGoToCards.INSTANCE);
                break;
            case 25:
                function1.invoke(TransfersInstructionsEvent.BankTransferRoutingNumberClick.INSTANCE);
                break;
            case 26:
                function1.invoke(TransfersInstructionsEvent.BankTransferAccountNumberClick.INSTANCE);
                break;
            case 27:
                function1.invoke(TransfersInstructionsEvent.WireTransferAccountNumberClick.INSTANCE);
                break;
            case 28:
                function1.invoke(BankingBenefitsBookletViewEvent.Close.INSTANCE);
                break;
            default:
                function1.invoke(BankingBenefitsBookletViewEvent.PrimaryFooterButtonClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
