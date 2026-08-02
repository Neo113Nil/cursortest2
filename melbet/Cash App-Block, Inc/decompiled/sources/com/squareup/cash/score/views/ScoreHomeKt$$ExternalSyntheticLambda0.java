package com.squareup.cash.score.views;

import com.squareup.cash.savings.viewmodels.UpsellCardEvent;
import com.squareup.cash.score.viewmodels.ScoreHomeViewEvent;
import com.squareup.cash.securityhub.viewmodels.BookletViewEvent;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewEvent;
import com.squareup.cash.securityhub.viewmodels.SecurityHubViewEvent;
import com.squareup.cash.sharesheet.ShareSheetViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewEvent;
import com.squareup.cash.shopping.settings.viewmodels.ErrorViewEvent$GoBack;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsAutofillViewEvent;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScoreHomeKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ScoreHomeViewEvent.DismissSheet dismissSheet = ScoreHomeViewEvent.DismissSheet.INSTANCE;
        BookletViewEvent.NavigateBack navigateBack = BookletViewEvent.NavigateBack.INSTANCE;
        RecoveryGuideViewEvent.NavigateBack navigateBack2 = RecoveryGuideViewEvent.NavigateBack.INSTANCE;
        SecurityHubViewEvent.NavigateBack navigateBack3 = SecurityHubViewEvent.NavigateBack.INSTANCE;
        AutofillViewEvent.SuccessAnimationCompleted successAnimationCompleted = AutofillViewEvent.SuccessAnimationCompleted.INSTANCE;
        AutofillViewEvent.EditButtonPressed editButtonPressed = AutofillViewEvent.EditButtonPressed.INSTANCE;
        AutofillViewEvent.ActionButtonPressed actionButtonPressed = AutofillViewEvent.ActionButtonPressed.INSTANCE;
        AutofillViewEvent.AutofillDismissed autofillDismissed = AutofillViewEvent.AutofillDismissed.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(ScoreHomeViewEvent.GoBack.INSTANCE);
                break;
            case 1:
                function1.invoke(UpsellCardEvent.Close.INSTANCE);
                break;
            case 2:
                function1.invoke(dismissSheet);
                break;
            case 3:
                function1.invoke(dismissSheet);
                break;
            case 4:
                function1.invoke(navigateBack);
                break;
            case 5:
                function1.invoke(navigateBack);
                break;
            case 6:
                function1.invoke(navigateBack2);
                break;
            case 7:
                function1.invoke(navigateBack2);
                break;
            case 8:
                function1.invoke(navigateBack3);
                break;
            case 9:
                function1.invoke(navigateBack3);
                break;
            case 10:
                function1.invoke(ShareSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 11:
                function1.invoke(successAnimationCompleted);
                break;
            case 12:
                function1.invoke(successAnimationCompleted);
                break;
            case 13:
                function1.invoke(EditAutofillViewEvent.ErrorCtaButtonClicked.INSTANCE);
                break;
            case 14:
                function1.invoke(EditAutofillViewEvent.DiscardChangesAccepted.INSTANCE);
                break;
            case 15:
                function1.invoke(EditAutofillViewEvent.CtaButtonClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(EditAutofillViewEvent.SuccessAnimationCompleted.INSTANCE);
                break;
            case 17:
                function1.invoke(autofillDismissed);
                break;
            case 18:
                function1.invoke(editButtonPressed);
                break;
            case 19:
                function1.invoke(actionButtonPressed);
                break;
            case 20:
                function1.invoke(editButtonPressed);
                break;
            case 21:
                function1.invoke(actionButtonPressed);
                break;
            case 22:
                function1.invoke(autofillDismissed);
                break;
            case 23:
                function1.invoke(ErrorViewEvent$GoBack.INSTANCE);
                break;
            case 24:
                function1.invoke(ShoppingSettingsAutofillViewEvent.AddAddressClicked.INSTANCE);
                break;
            case 25:
                function1.invoke(ShoppingSettingsAutofillViewEvent.GoBack.INSTANCE);
                break;
            case 26:
                function1.invoke(ShoppingSettingsAutofillViewEvent.AutofillToggleClicked.INSTANCE);
                break;
            case 27:
                function1.invoke(ShoppingSettingsAutofillViewEvent.EditAddressClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(ShoppingSettingsViewEvent.GoBack.INSTANCE);
                break;
            default:
                function1.invoke(ShoppingSettingsViewEvent.AutofillClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
