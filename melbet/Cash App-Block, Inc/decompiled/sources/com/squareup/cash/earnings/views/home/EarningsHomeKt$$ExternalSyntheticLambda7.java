package com.squareup.cash.earnings.views.home;

import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewEvent;
import com.squareup.cash.earnings.viewmodels.payers.PayerTaggingPromptViewEvent;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewEvent;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewEvent;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewEvent;
import com.squareup.cash.earningstracker.viewmodels.NetEarningsInfoSheetViewEvent;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsHomeKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ EarningsHomeKt$$ExternalSyntheticLambda7(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        AddPayerCustomersViewEvent.DismissError dismissError = AddPayerCustomersViewEvent.DismissError.INSTANCE;
        PayerTaggingPromptViewEvent.Dismiss dismiss = PayerTaggingPromptViewEvent.Dismiss.INSTANCE;
        AddPayerCustomersViewEvent.Dismiss dismiss2 = AddPayerCustomersViewEvent.Dismiss.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(EarningsHomeViewEvent.Back.INSTANCE);
                break;
            case 1:
                function1.invoke(EarningsHeaderViewEvent.ChartBarSelectionCleared.INSTANCE);
                break;
            case 2:
                function1.invoke(dismiss2);
                break;
            case 3:
                function1.invoke(dismiss2);
                break;
            case 4:
                function1.invoke(AddPayerCustomersViewEvent.TapDone.INSTANCE);
                break;
            case 5:
                function1.invoke(dismissError);
                break;
            case 6:
                function1.invoke(AddPayerCustomersViewEvent.RetryLoad.INSTANCE);
                break;
            case 7:
                function1.invoke(dismiss2);
                break;
            case 8:
                function1.invoke(dismissError);
                break;
            case 9:
                function1.invoke(PayerTaggingPromptViewEvent.Confirm.INSTANCE);
                break;
            case 10:
                function1.invoke(dismiss);
                break;
            case 11:
                function1.invoke(dismiss);
                break;
            case 12:
                function1.invoke(EarningsStreamDetailViewEvent.RetryLoad.INSTANCE);
                break;
            case 13:
                function1.invoke(EarningsStreamDetailViewEvent.Back.INSTANCE);
                break;
            case 14:
                function1.invoke(EarningsTimeframeSelectorSheetViewEvent.SheetDismissed.INSTANCE);
                break;
            case 15:
                function1.invoke(EarningsTimeframeSelectorSheetViewEvent.DoneButtonClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(EarningsTrackerViewEvent.HeaderAnimationComplete.INSTANCE);
                break;
            case 17:
                function1.invoke(EarningsTrackerViewEvent.BarSelectionCleared.INSTANCE);
                break;
            case 18:
                function1.invoke(EarningsTrackerViewEvent.NetEarningsInfoClick.INSTANCE);
                break;
            case 19:
                function1.invoke(EarningsTrackerViewEvent.GoBack.INSTANCE);
                break;
            case 20:
                function1.invoke(EarningsTrackerViewEvent.TimeframeSelectorIconClick.INSTANCE);
                break;
            case 21:
                function1.invoke(EarningsTrackerViewEvent.PullToRefresh.INSTANCE);
                break;
            case 22:
                function1.invoke(EarningsTrackerViewEvent.Refresh.INSTANCE);
                break;
            case 23:
                function1.invoke(NetEarningsInfoSheetViewEvent.SheetDismissed.INSTANCE);
                break;
            case 24:
                function1.invoke(NetEarningsInfoSheetViewEvent.ActionButtonClick.INSTANCE);
                break;
            case 25:
                function1.invoke(EducationStoryViewEvent.OnRefresh.INSTANCE);
                break;
            case 26:
                function1.invoke(EducationStoryViewEvent.OnNavigateBack.INSTANCE);
                break;
            case 27:
                function1.invoke(AllowanceViewEvent.TapNoAllowanceInDependentDetail.INSTANCE);
                break;
            case 28:
                function1.invoke(ControlDisablingConfirmationViewEvent.Cancel.INSTANCE);
                break;
            default:
                function1.invoke(ControlDisablingConfirmationViewEvent.Confirm.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
