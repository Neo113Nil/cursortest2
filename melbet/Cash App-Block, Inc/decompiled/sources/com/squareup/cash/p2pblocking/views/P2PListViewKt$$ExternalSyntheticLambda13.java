package com.squareup.cash.p2pblocking.views;

import app.cash.local.viewmodels.LocalEditorialViewEvent;
import app.cash.local.viewmodels.LocalOrderStatusViewEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionEvent;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotAutomationsViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewEvent;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewEvent;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewEvent$DetailsClicked;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PListViewKt$$ExternalSyntheticLambda13 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ P2PListViewKt$$ExternalSyntheticLambda13(String str, Function1 function1) {
        this.$r8$classId = 24;
        this.f$1 = str;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new P2PListViewEvent.TapHelp(str));
                break;
            case 1:
                function1.invoke(new LocalOrderStatusViewEvent.UrlClicked(str));
                break;
            case 2:
                function1.invoke(new LocalOrderStatusViewEvent.UrlClicked(str));
                break;
            case 3:
                function1.invoke(new LocalEditorialViewEvent.CarouselItemClicked(str));
                break;
            case 4:
                function1.invoke(new LocalEditorialViewEvent.CarouselItemClicked(str));
                break;
            case 5:
                function1.invoke(str);
                break;
            case 6:
                function1.invoke(new BrandCollectionEvent.LocationRowClicked(str));
                break;
            case 7:
                function1.invoke(new BrandCollectionEvent.LocationRowClicked(str));
                break;
            case 8:
                function1.invoke(new BusinessInfoViewEvent.BusinessAddressClicked(str));
                break;
            case 9:
                function1.invoke(str);
                break;
            case 10:
                function1.invoke(str);
                break;
            case 11:
                function1.invoke(str);
                break;
            case 12:
                function1.invoke(new InvestingEtfHoldingDetailsViewEvent.TapHolding(str));
                break;
            case 13:
                function1.invoke(new InvestingEtfHoldingsViewEvent.HoldingClicked(str));
                break;
            case 14:
                function1.invoke(new MoneybotAutomationsViewEvent.SuggestionTapped(str));
                break;
            case 15:
                function1.invoke(new MoneybotChatHistoryViewEvent.ConfirmDelete(str));
                break;
            case 16:
                function1.invoke(new MoneybotOverflowMenuViewEvent.ConfirmDelete(str));
                break;
            case 17:
                function1.invoke(new MoneybotChatViewEvent.QuickActionTap(str, MoneybotChatViewEvent.QuickActionTap.QuickActionType.THUMBS_UP));
                break;
            case 18:
                function1.invoke(new MoneybotChatViewEvent.QuickActionTap(str, MoneybotChatViewEvent.QuickActionTap.QuickActionType.THUMBS_DOWN));
                break;
            case 19:
                function1.invoke(new MoneybotChatViewEvent.QuickActionTap(str, MoneybotChatViewEvent.QuickActionTap.QuickActionType.THUMBS_UP));
                break;
            case 20:
                function1.invoke(new MoneybotChatViewEvent.QuickActionTap(str, MoneybotChatViewEvent.QuickActionTap.QuickActionType.THUMBS_DOWN));
                break;
            case 21:
                function1.invoke(str);
                break;
            case 22:
                function1.invoke(str);
                break;
            case 23:
                function1.invoke(str);
                break;
            case 24:
                if (str != null) {
                    function1.invoke(new ScreenshotReviewViewEvent.ViewScreenshot(str));
                }
                break;
            case 25:
                function1.invoke(str);
                break;
            case 26:
                function1.invoke(new WalletHomeViewEvent.PrepurchaseHeaderButtonClick(str));
                break;
            case 27:
                function1.invoke(new WalletHomeViewEvent.OpenUrl(str));
                break;
            case 28:
                function1.invoke(new WalletHomeViewEvent.OpenUrl(str));
                break;
            default:
                function1.invoke(new ShiftSection2ViewEvent$DetailsClicked(str));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ P2PListViewKt$$ExternalSyntheticLambda13(Function1 function1, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = str;
    }
}
