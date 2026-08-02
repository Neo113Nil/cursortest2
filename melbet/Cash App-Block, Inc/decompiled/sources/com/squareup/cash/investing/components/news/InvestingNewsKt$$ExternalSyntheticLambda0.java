package com.squareup.cash.investing.components.news;

import com.squareup.cash.investing.components.drip.DividendReinvestmentLearnMoreSheetViewV2;
import com.squareup.cash.investing.components.market.hours.InvestingPendingTradesTileView;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.activity.InvestingEntityActivityHistoryViewEvent$TapBack;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewEvent;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentLearnMoreSheetViewEvent$CloseClicked;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewEvent;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentWelcomeViewEvent;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewEvent;
import com.squareup.cash.investing.viewmodels.keystats.InvestingKeyStatsDetailsViewEvent$Back;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingNewsKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ InvestingNewsKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InvestingCustomOrderViewEvent.OverlayPressed overlayPressed = InvestingCustomOrderViewEvent.OverlayPressed.INSTANCE;
        DividendReinvestmentLearnMoreSheetViewEvent$CloseClicked dividendReinvestmentLearnMoreSheetViewEvent$CloseClicked = DividendReinvestmentLearnMoreSheetViewEvent$CloseClicked.INSTANCE;
        InvestingExchangeViewEvent.ChangeOrderTypeClicked changeOrderTypeClicked = InvestingExchangeViewEvent.ChangeOrderTypeClicked.INSTANCE;
        InvestingExchangeViewEvent.CloseButtonClicked closeButtonClicked = InvestingExchangeViewEvent.CloseButtonClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(InvestingCryptoNewsViewEvent.NavigationClicked.INSTANCE);
                break;
            case 1:
                function1.invoke(InvestingEntityActivityHistoryViewEvent$TapBack.INSTANCE);
                break;
            case 2:
                function1.invoke(InvestingSearchViewEvent.FilterMenuClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(InvestingSearchViewEvent.BackClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(InvestingCategoryFilterViewEvent.TapReset.INSTANCE);
                break;
            case 5:
                function1.invoke(InvestingCategoryFilterViewEvent.TapApply.INSTANCE);
                break;
            case 6:
                function1.invoke(InvestingCategoryFilterViewEvent.TapClose.INSTANCE);
                break;
            case 7:
                function1.invoke(InvestingSearchViewEvent.ResetFiltersClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(InvestingCustomOrderViewEvent.CloseExplanation.INSTANCE);
                break;
            case 9:
                function1.invoke(InvestingCustomOrderViewEvent.BackPressed.INSTANCE);
                break;
            case 10:
                function1.invoke(InvestingCustomOrderViewEvent.KeypadPressed.INSTANCE);
                break;
            case 11:
                function1.invoke(overlayPressed);
                break;
            case 12:
                function1.invoke(overlayPressed);
                break;
            case 13:
                function1.invoke(dividendReinvestmentLearnMoreSheetViewEvent$CloseClicked);
                break;
            case 14:
                int i2 = DividendReinvestmentLearnMoreSheetViewV2.$r8$clinit;
                function1.invoke(dividendReinvestmentLearnMoreSheetViewEvent$CloseClicked);
                break;
            case 15:
                function1.invoke(DividendReinvestmentSettingViewEvent.BackClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(DividendReinvestmentWelcomeViewEvent.CloseClicked.INSTANCE);
                break;
            case 17:
                function1.invoke(DividendReinvestmentWelcomeViewEvent.CtaClicked.INSTANCE);
                break;
            case 18:
                function1.invoke(changeOrderTypeClicked);
                break;
            case 19:
                function1.invoke(closeButtonClicked);
                break;
            case 20:
                function1.invoke(changeOrderTypeClicked);
                break;
            case 21:
                function1.invoke(InvestingExchangeViewEvent.Submit.INSTANCE);
                break;
            case 22:
                function1.invoke(closeButtonClicked);
                break;
            case 23:
                function1.invoke(InvestingHomeViewEvent.DependentDisabledStateCtaClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(InvestingEtfHoldingDetailsViewEvent.TapBack.INSTANCE);
                break;
            case 25:
                function1.invoke(InvestingEtfHoldingsViewEvent.ShowMoreClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(InvestingKeyStatsDetailsViewEvent$Back.INSTANCE);
                break;
            case 27:
                int i3 = InvestingPendingTradesTileView.$r8$clinit;
                function1.invoke(InvestingHomeViewEvent.PendingTradesTileViewAllClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(InvestingFinancialViewEvent.MoreInfoClicked.INSTANCE);
                break;
            default:
                function1.invoke(InvestingEarningsViewEvent$MoreInfoClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
