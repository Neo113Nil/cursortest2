package com.squareup.cash.invitations;

import androidx.compose.ui.focus.FocusStateImpl;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.graphics.views.GraphicsError;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionLoadingViewEvent$CloseClick;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.investing.components.market.hours.InvestingPlaceholderGraphView;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewEvent$KeyStatsDetailsClicked;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewEvent;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestmentType;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewEvent;
import com.squareup.cash.investing.viewmodels.metrics.Range;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InviteContactsBodyKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda5(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(str);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                GraphicsError graphicsError = new GraphicsError(th);
                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                if (errorReporter == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    break;
                } else {
                    errorReporter.report(graphicsError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    function1.invoke(th);
                    break;
                }
            case 2:
                function1.invoke(new GrowToolsManagerViewEvent.DetailRowTapped(((Integer) obj).intValue()));
                break;
            case 3:
                function1.invoke(new GrowToolsManagerViewEvent.ToggleTapped(((Boolean) obj).booleanValue()));
                break;
            case 4:
                ((DialogListenerEvent) obj).getClass();
                function1.invoke(InstrumentSelectionLoadingViewEvent$CloseClick.INSTANCE);
                break;
            case 5:
                SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument) obj;
                paymentInstrument.getClass();
                function1.invoke(new InstrumentSelectionViewEvent.SelectInstrument(paymentInstrument));
                break;
            case 6:
                function1.invoke(new InvestingCustomOrderViewEvent.SelectedPrice((PriceValue) obj));
                break;
            case 7:
                HistoricalRange historicalRange = (HistoricalRange) obj;
                historicalRange.getClass();
                function1.invoke(new InvestingCustomOrderViewEvent.SelectedRange(historicalRange));
                break;
            case 8:
                function1.invoke(InvestingCustomOrderViewEvent.OverlayPressed.INSTANCE);
                break;
            case 9:
                function1.invoke(new DividendReinvestmentSettingViewEvent.EntryToggled(((Boolean) obj).booleanValue()));
                break;
            case 10:
                function1.invoke(new DividendReinvestmentSettingViewEvent.EntryToggled(((Boolean) obj).booleanValue()));
                break;
            case 11:
                AmountSelection amountSelection = (AmountSelection) obj;
                amountSelection.getClass();
                function1.invoke(new InvestingExchangeViewEvent.ItemSelected(amountSelection));
                break;
            case 12:
                function1.invoke(new InvestingEtfHoldingDetailsViewEvent.ToggleInvestmentType((InvestmentType) InvestmentType.$ENTRIES.get(((Integer) obj).intValue())));
                break;
            case 13:
                HistoricalRange historicalRange2 = (HistoricalRange) obj;
                int i2 = InvestingPlaceholderGraphView.$r8$clinit;
                historicalRange2.getClass();
                function1.invoke(new InvestingHomeViewEvent.SelectHistoricalRange(historicalRange2));
                break;
            case 14:
                function1.invoke(new InvestingFinancialViewEvent.SelectRange(((Integer) obj).intValue() == 0 ? Range.ANNUALLY : Range.QUARTERLY));
                break;
            case 15:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    Object obj2 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent).result;
                    if (obj2 instanceof FilterConfiguration) {
                        function1.invoke(new InvestingSearchViewEvent.FilterConfigurationSelected((FilterConfiguration) obj2));
                    }
                }
                break;
            case 16:
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                if (focusStateImpl.isFocused()) {
                    function1.invoke(InvestingSearchViewEvent.InteractedWithSearchBar.INSTANCE);
                }
                break;
            case 17:
                InvestingDetailTileViewEvent$KeyStatsDetailsClicked investingDetailTileViewEvent$KeyStatsDetailsClicked = (InvestingDetailTileViewEvent$KeyStatsDetailsClicked) obj;
                investingDetailTileViewEvent$KeyStatsDetailsClicked.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.KeyStatEvent(investingDetailTileViewEvent$KeyStatsDetailsClicked));
                break;
            case 18:
                InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent = (InvestingCryptoNewsViewEvent) obj;
                investingCryptoNewsViewEvent.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.NewsEvent(investingCryptoNewsViewEvent));
                break;
            case 19:
                InvestingEtfHoldingsViewEvent investingEtfHoldingsViewEvent = (InvestingEtfHoldingsViewEvent) obj;
                investingEtfHoldingsViewEvent.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.EtfHoldingsEvent(investingEtfHoldingsViewEvent));
                break;
            case 20:
                InvestingFinancialViewEvent investingFinancialViewEvent = (InvestingFinancialViewEvent) obj;
                investingFinancialViewEvent.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.FinancialEvent(investingFinancialViewEvent));
                break;
            case 21:
                InvestingEarningsViewEvent$MoreInfoClicked investingEarningsViewEvent$MoreInfoClicked = (InvestingEarningsViewEvent$MoreInfoClicked) obj;
                investingEarningsViewEvent$MoreInfoClicked.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.EarningsEvent(investingEarningsViewEvent$MoreInfoClicked));
                break;
            case 22:
                InvestingAnalystOpinionsViewEvent$MoreInfoClicked investingAnalystOpinionsViewEvent$MoreInfoClicked = (InvestingAnalystOpinionsViewEvent$MoreInfoClicked) obj;
                investingAnalystOpinionsViewEvent$MoreInfoClicked.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.AnalystOpinionsEvent(investingAnalystOpinionsViewEvent$MoreInfoClicked));
                break;
            case 23:
                function1.invoke(new InvestingStockDetailsViewEvent.GraphEvent(new InvestingGraphViewEvent.ScrubPoint((InvestingGraphContentModel.Point) obj)));
                break;
            case 24:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.DisclosureLinkClick(str2));
                break;
            case 25:
                HistoricalRange historicalRange3 = (HistoricalRange) obj;
                historicalRange3.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.GraphEvent(new InvestingGraphViewEvent.SelectRange(historicalRange3)));
                break;
            case 26:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new PeriodSelectionViewEvent.PeriodClick(str3));
                break;
            case 27:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new InviteContactsViewEvent.TextChanged(str4));
                break;
            case 28:
                InviteContactsViewModel.Contact contact = (InviteContactsViewModel.Contact) obj;
                contact.getClass();
                function1.invoke(contact.onInvite);
                break;
            default:
                FocusStateImpl focusStateImpl2 = (FocusStateImpl) obj;
                focusStateImpl2.getClass();
                function1.invoke(Boolean.valueOf(focusStateImpl2.getHasFocus()));
                break;
        }
        return Unit.INSTANCE;
    }
}
