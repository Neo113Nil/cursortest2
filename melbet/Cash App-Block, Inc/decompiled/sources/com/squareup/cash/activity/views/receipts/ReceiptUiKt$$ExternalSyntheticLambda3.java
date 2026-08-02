package com.squareup.cash.activity.views.receipts;

import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletActivityListEmbeddedViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletMerchantSheetViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletNotificationViewEvent$Dismissed;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletPurchasesEmbeddedViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletUpsellSheetViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.SelectAfterpayPromptViewEvent;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletNotificationView;
import com.squareup.cash.afterpayapplet.views.browser.SelectAfterpayPromptSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptUiKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ActivityItemViewEvent.AvatarClicked avatarClicked = ActivityItemViewEvent.AvatarClicked.INSTANCE;
        AfterpayAppletHomeViewEvent.HelpButtonTapped helpButtonTapped = AfterpayAppletHomeViewEvent.HelpButtonTapped.INSTANCE;
        AfterpayAppletPurchasesEmbeddedViewEvent.TapBack tapBack = AfterpayAppletPurchasesEmbeddedViewEvent.TapBack.INSTANCE;
        ReceiptViewEvent.Close close = ReceiptViewEvent.Close.INSTANCE;
        AfterpayAppletHomeViewEvent.GoBack goBack = AfterpayAppletHomeViewEvent.GoBack.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(close);
                break;
            case 1:
                function1.invoke(avatarClicked);
                break;
            case 2:
                function1.invoke(avatarClicked);
                break;
            case 3:
                function1.invoke(ReceiptViewEvent.Refresh.INSTANCE);
                break;
            case 4:
                function1.invoke(close);
                break;
            case 5:
                function1.invoke(close);
                break;
            case 6:
                function1.invoke(new ReceiptViewEvent.OpenTimelineDetailsOverlay(null));
                break;
            case 7:
                function1.invoke(ReceiptViewEvent.AvatarClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(AfterpayAppletActivityListEmbeddedViewEvent.TapBack.INSTANCE);
                break;
            case 9:
                function1.invoke(goBack);
                break;
            case 10:
                function1.invoke(AfterpayAppletHomeViewEvent.TryAgainTapped.INSTANCE);
                break;
            case 11:
                function1.invoke(helpButtonTapped);
                break;
            case 12:
                function1.invoke(goBack);
                break;
            case 13:
                function1.invoke(goBack);
                break;
            case 14:
                function1.invoke(helpButtonTapped);
                break;
            case 15:
                function1.invoke(goBack);
                break;
            case 16:
                function1.invoke(AfterpayAppletHomeViewEvent.Refresh.INSTANCE);
                break;
            case 17:
                function1.invoke(AfterpayAppletMerchantSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 18:
                function1.invoke(AfterpayAppletMerchantSheetViewEvent.TryAgain.INSTANCE);
                break;
            case 19:
                int i2 = AfterpayAppletNotificationView.$r8$clinit;
                function1.invoke(AfterpayAppletNotificationViewEvent$Dismissed.INSTANCE);
                break;
            case 20:
                function1.invoke(tapBack);
                break;
            case 21:
                function1.invoke(AfterpayAppletPurchasesEmbeddedViewEvent.TryAgainTapped.INSTANCE);
                break;
            case 22:
                function1.invoke(AfterpayAppletPurchasesEmbeddedViewEvent.Refresh.INSTANCE);
                break;
            case 23:
                function1.invoke(AfterpayAppletPurchasesEmbeddedViewEvent.SeeAllCompletedPurchases.INSTANCE);
                break;
            case 24:
                function1.invoke(AfterpayAppletPurchasesEmbeddedViewEvent.SeeAllUpcomingPurchases.INSTANCE);
                break;
            case 25:
                function1.invoke(tapBack);
                break;
            case 26:
                function1.invoke(AfterpayAppletUpsellSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 27:
                function1.invoke(AfterpaySearchViewEvent.FilterBottomSheetViewEvent.CloseFilterBottomSheet.INSTANCE);
                break;
            case 28:
                int i3 = SelectAfterpayPromptSheet.$r8$clinit;
                function1.invoke(SelectAfterpayPromptViewEvent.Dismiss.INSTANCE);
                break;
            default:
                function1.invoke(SelectAfterpayPromptViewEvent.ConfirmClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
