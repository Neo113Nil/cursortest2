package com.squareup.cash.blockers.views;

import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewEvent;
import com.squareup.cash.blockers.viewmodels.CashtagViewEvent;
import com.squareup.cash.blockers.viewmodels.ConfirmableOptionViewEvent;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadOptionsSheetResult;
import com.squareup.cash.blockers.viewmodels.FilesetUploadOptionsViewEvent;
import com.squareup.cash.blockers.viewmodels.GpsExplainerViewEvent;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewEvent;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewEvent$Retry;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class CashtagViewKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ CashtagViewKt$$ExternalSyntheticLambda6(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ConfirmableOptionViewEvent.Cancel cancel = ConfirmableOptionViewEvent.Cancel.INSTANCE;
        EarnerUpsellBlockerViewEvent.Close close = EarnerUpsellBlockerViewEvent.Close.INSTANCE;
        EarnerEnrollmentBlockerViewEvent.Back back = EarnerEnrollmentBlockerViewEvent.Back.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(CashtagViewEvent.Dismiss.INSTANCE);
                break;
            case 1:
                function1.invoke(CalendarBlockerViewEvent.ToolbarButtonClicked.INSTANCE);
                break;
            case 2:
                function1.invoke(CalendarBlockerViewEvent.ActionButtonClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(CardActivationQrViewEvent.MissingQr.INSTANCE);
                break;
            case 4:
                int i2 = ConfirmableOptionView.$r8$clinit;
                function1.invoke(cancel);
                break;
            case 5:
                int i3 = ConfirmableOptionView.$r8$clinit;
                function1.invoke(cancel);
                break;
            case 6:
                int i4 = ConfirmableOptionView.$r8$clinit;
                function1.invoke(ConfirmableOptionViewEvent.Confirm.INSTANCE);
                break;
            case 7:
                function1.invoke(back);
                break;
            case 8:
                function1.invoke(EarnerEnrollmentBlockerViewEvent.Continue.INSTANCE);
                break;
            case 9:
                function1.invoke(back);
                break;
            case 10:
                function1.invoke(EarnerEnrollmentBlockerViewEvent.EarnerCategorySelected.INSTANCE);
                break;
            case 11:
                function1.invoke(EarnerEnrollmentBlockerViewEvent.ManageCustomerList.INSTANCE);
                break;
            case 12:
                function1.invoke(EarnerEnrollmentBlockerViewEvent.Done.INSTANCE);
                break;
            case 13:
                function1.invoke(back);
                break;
            case 14:
                function1.invoke(back);
                break;
            case 15:
                function1.invoke(EarnerEnrollmentBlockerViewEvent.EarnerCategorySelectionContinued.INSTANCE);
                break;
            case 16:
                function1.invoke(close);
                break;
            case 17:
                function1.invoke(EarnerUpsellBlockerViewEvent.GetStarted.INSTANCE);
                break;
            case 18:
                function1.invoke(close);
                break;
            case 19:
                function1.invoke(close);
                break;
            case 20:
                function1.invoke(new FilesetUploadOptionsViewEvent.Complete(FilesetUploadOptionsSheetResult.TAKE_A_PHOTO));
                break;
            case 21:
                function1.invoke(new FilesetUploadOptionsViewEvent.Complete(FilesetUploadOptionsSheetResult.UPLOAD_A_FILE));
                break;
            case 22:
                function1.invoke(GpsExplainerViewEvent.CloseClicked.INSTANCE);
                break;
            case 23:
                function1.invoke(GpsLocationConsentBlockerViewEvent.Cancel.INSTANCE);
                break;
            case 24:
                function1.invoke(InputCardInfoViewEvent.TapBack.INSTANCE);
                break;
            case 25:
                function1.invoke(InputCardInfoViewEvent.TapScanCard.INSTANCE);
                break;
            case 26:
                function1.invoke(InputCardInfoViewEvent.TapSkipBlocker.INSTANCE);
                break;
            case 27:
                function1.invoke(OnboardingInternalRouteViewEvent$Retry.INSTANCE);
                break;
            case 28:
                function1.invoke(PasscodeViewEvent.BackPressed.INSTANCE);
                break;
            default:
                function1.invoke(PasscodeViewEvent.HelpButtonClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
