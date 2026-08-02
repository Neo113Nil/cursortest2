package app.cash.local.views.map;

import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewEvent;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewEvent;
import app.cash.local.viewmodels.marketingmessages.MessageFilter;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewEvent;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewEvent;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewEvent;
import app.cash.local.viewmodels.sheet.LoyaltySheetEvent;
import app.cash.local.viewmodels.sheet.MenuPickerSheetEvent;
import app.cash.local.viewmodels.wallet.BrandSheetViewEvent;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class BrandSheetViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrandSheetViewEvent.Dismissed dismissed = BrandSheetViewEvent.Dismissed.INSTANCE;
        LocalHomeViewEvent.CheckInClicked checkInClicked = LocalHomeViewEvent.CheckInClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(dismissed);
                break;
            case 1:
                function1.invoke(dismissed);
                break;
            case 2:
                function1.invoke(BrandSheetViewEvent.CheckInClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(BrandSheetViewEvent.ProfileClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(MarketingMessageViewEvent.TermsOnClick.INSTANCE);
                break;
            case 5:
                function1.invoke(MarketingMessageViewEvent.CtaOnClick.INSTANCE);
                break;
            case 6:
                function1.invoke(MarketingMessageViewEvent.DismissOnClick.INSTANCE);
                break;
            case 7:
                function1.invoke(MarketingMessagesViewEvent.BackClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(new MarketingMessagesViewEvent.FilterSelected(MessageFilter.ALL));
                break;
            case 9:
                function1.invoke(new MarketingMessagesViewEvent.FilterSelected(MessageFilter.COUPONS));
                break;
            case 10:
                function1.invoke(LocalPosBrandOnboardingViewEvent.CtaClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(LocalPosCheckInViewEvent.NavigationClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(LocalPosLocalCashRedemptionViewEvent.ConfirmClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(LocalPosLocalCashRedemptionViewEvent.UnlinkClicked.INSTANCE);
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                function1.invoke(LoyaltySheetEvent.SheetDismissed.INSTANCE);
                break;
            case 20:
                function1.invoke(LoyaltySheetEvent.Redeem.INSTANCE);
                break;
            case 21:
                function1.invoke(MenuPickerSheetEvent.SheetDismissed.INSTANCE);
                break;
            case 22:
                function1.invoke(LocalHomeViewEvent.MapButtonClicked.INSTANCE);
                break;
            case 23:
                function1.invoke(LocalHomeViewEvent.AddMenuClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(LocalHomeViewEvent.BrandCollectionAppletViewed.INSTANCE);
                break;
            case 25:
                function1.invoke(LocalHomeViewEvent.LocalCashClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(LocalHomeViewEvent.AllMarketingMessagesOnClick.INSTANCE);
                break;
            case 27:
                function1.invoke(LocalHomeViewEvent.OnboardingCtaClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(checkInClicked);
                break;
            default:
                function1.invoke(checkInClicked);
                break;
        }
        return Unit.INSTANCE;
    }
}
