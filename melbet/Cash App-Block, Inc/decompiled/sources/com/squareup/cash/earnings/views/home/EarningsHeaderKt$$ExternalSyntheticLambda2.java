package com.squareup.cash.earnings.views.home;

import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewEvent;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewEvent;
import com.squareup.cash.earnings.viewmodels.EarningsActivityListViewEvent$Close;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsHeaderKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ EarningsHeaderKt$$ExternalSyntheticLambda2(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DirectDepositSetupEvent.ManualSetupClick manualSetupClick = DirectDepositSetupEvent.ManualSetupClick.INSTANCE;
        DirectDepositManualFormCompletionViewEvent.Exit exit = DirectDepositManualFormCompletionViewEvent.Exit.INSTANCE;
        DirectDepositUpdateManualFormDetailsViewEvent.Exit exit2 = DirectDepositUpdateManualFormDetailsViewEvent.Exit.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(EarningsHeaderViewEvent.TotalEarningsAnimationComplete.INSTANCE);
                break;
            case 1:
                function1.invoke(DirectDepositSetupEvent.HelpClick.INSTANCE);
                break;
            case 2:
                function1.invoke(DirectDepositSetupEvent.Close.INSTANCE);
                break;
            case 3:
                function1.invoke(DirectDepositSetupEvent.RoutingNumberClick.INSTANCE);
                break;
            case 4:
                function1.invoke(DirectDepositSetupEvent.AccountNumberClick.INSTANCE);
                break;
            case 5:
                function1.invoke(manualSetupClick);
                break;
            case 6:
                function1.invoke(manualSetupClick);
                break;
            case 7:
                function1.invoke(DirectDepositEditPaycheckAmountViewEvent.NavigationIconClick.INSTANCE);
                break;
            case 8:
                function1.invoke(DirectDepositEditPaycheckAmountViewEvent.Submit.INSTANCE);
                break;
            case 9:
                function1.invoke(DirectDepositManualFormCompletionViewEvent.SendEmail.INSTANCE);
                break;
            case 10:
                function1.invoke(exit);
                break;
            case 11:
                function1.invoke(DirectDepositManualFormCompletionViewEvent.RetryFormSubmission.INSTANCE);
                break;
            case 12:
                function1.invoke(exit);
                break;
            case 13:
                function1.invoke(DirectDepositManualFormCompletionViewEvent.ViewForm.INSTANCE);
                break;
            case 14:
                function1.invoke(DirectDepositManualFormDetailsViewEvent.EditName.INSTANCE);
                break;
            case 15:
                function1.invoke(DirectDepositManualFormDetailsViewEvent.EditCompanyName.INSTANCE);
                break;
            case 16:
                function1.invoke(DirectDepositManualFormDetailsViewEvent.EditPaycheckAmount.INSTANCE);
                break;
            case 17:
                function1.invoke(DirectDepositManualFormDetailsViewEvent.CreateForm.INSTANCE);
                break;
            case 18:
                function1.invoke(DirectDepositManualFormDetailsViewEvent.NavigationIconClick.INSTANCE);
                break;
            case 19:
                function1.invoke(DirectDepositUpdateManualFormDetailsViewEvent.CreateForm.INSTANCE);
                break;
            case 20:
                function1.invoke(DirectDepositUpdateManualFormDetailsViewEvent.EditName.INSTANCE);
                break;
            case 21:
                function1.invoke(DirectDepositUpdateManualFormDetailsViewEvent.EditCompanyName.INSTANCE);
                break;
            case 22:
                function1.invoke(DirectDepositUpdateManualFormDetailsViewEvent.EditPaycheckAmount.INSTANCE);
                break;
            case 23:
                function1.invoke(exit2);
                break;
            case 24:
                function1.invoke(DirectDepositUpdateManualFormDetailsViewEvent.RetryLoadingForm.INSTANCE);
                break;
            case 25:
                function1.invoke(exit2);
                break;
            case 26:
                function1.invoke(DirectDepositUpdateManualFormDetailsViewEvent.ViewExistingForm.INSTANCE);
                break;
            case 27:
                function1.invoke(PromotionDetailsViewEvent.ShareStarted.INSTANCE);
                break;
            case 28:
                function1.invoke(EarningsActivityListViewEvent$Close.INSTANCE);
                break;
            default:
                function1.invoke(EarningsHeaderViewEvent.ChartBarSelected.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
