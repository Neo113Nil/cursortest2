package com.squareup.cash.maps.views;

import com.squareup.cash.limits.viewmodels.LimitsInlineMessageViewEvent;
import com.squareup.cash.limits.viewmodels.LimitsViewEvent;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewEvent;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewEvent;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewEvent;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltyDetailsViewEvent;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltySheetViewEvent;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.money.booklet.MoneyTabBookletViewEvent;
import com.squareup.cash.money.viewmodels.HypeWelcomeEvent;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashMapViewKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LimitsInlineMessageViewEvent.PrimaryButtonClicked primaryButtonClicked = LimitsInlineMessageViewEvent.PrimaryButtonClicked.INSTANCE;
        LimitsViewEvent.ExitFlow exitFlow = LimitsViewEvent.ExitFlow.INSTANCE;
        LanguageDisclosureViewEvent.Close close = LanguageDisclosureViewEvent.Close.INSTANCE;
        MerchantInfoFeedbackViewEvent.SheetDismissed sheetDismissed = MerchantInfoFeedbackViewEvent.SheetDismissed.INSTANCE;
        MerchantProfileViewEvent.ReloadProfile reloadProfile = MerchantProfileViewEvent.ReloadProfile.INSTANCE;
        MerchantProfileViewEvent.AvatarClicked avatarClicked = MerchantProfileViewEvent.AvatarClicked.INSTANCE;
        SquareLoyaltySheetViewEvent.Close close2 = SquareLoyaltySheetViewEvent.Close.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(CashMapViewEvent.CenterOnUserLocationClick.INSTANCE);
                break;
            case 1:
                function1.invoke(exitFlow);
                break;
            case 2:
                function1.invoke(LimitsInlineMessageViewEvent.SecondaryButtonClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(primaryButtonClicked);
                break;
            case 4:
                function1.invoke(primaryButtonClicked);
                break;
            case 5:
                function1.invoke(exitFlow);
                break;
            case 6:
                function1.invoke(LanguageDisclosureViewEvent.OpenLocaleSettings.INSTANCE);
                break;
            case 7:
                function1.invoke(LanguageDisclosureViewEvent.Accept.INSTANCE);
                break;
            case 8:
                function1.invoke(close);
                break;
            case 9:
                function1.invoke(close);
                break;
            case 10:
                function1.invoke(MerchantBlockingViewEvent.CloseClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(MerchantInfoFeedbackViewEvent.ContinueClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(sheetDismissed);
                break;
            case 13:
                function1.invoke(sheetDismissed);
                break;
            case 14:
                function1.invoke(reloadProfile);
                break;
            case 15:
                function1.invoke(avatarClicked);
                break;
            case 16:
                function1.invoke(reloadProfile);
                break;
            case 17:
                function1.invoke(MerchantProfileViewEvent.NavigationIconClicked.INSTANCE);
                break;
            case 18:
                function1.invoke(avatarClicked);
                break;
            case 19:
                function1.invoke(SquareLoyaltyDetailsViewEvent.GoBack.INSTANCE);
                break;
            case 20:
                function1.invoke(close2);
                break;
            case 21:
                function1.invoke(close2);
                break;
            case 22:
                function1.invoke(PromotedAppletTileViewEvent$Click.INSTANCE);
                break;
            case 23:
                function1.invoke(MoneyTabBookletViewEvent.Close.INSTANCE);
                break;
            case 24:
                function1.invoke(MoneyTabBookletViewEvent.CtaClicked.INSTANCE);
                break;
            case 25:
                function1.invoke(HypeWelcomeEvent.BackClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(HypeWelcomeEvent.DismissHypeClicked.INSTANCE);
                break;
            case 27:
                function1.invoke(HypeWelcomeEvent.NotifyMeClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(MoneyTabEvent.HypeCountdownClicked.INSTANCE);
                break;
            default:
                function1.invoke(MoneyTabEvent.SuspensionsBannerClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
