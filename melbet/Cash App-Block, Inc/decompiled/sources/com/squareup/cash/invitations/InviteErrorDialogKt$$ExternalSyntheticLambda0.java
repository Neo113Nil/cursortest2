package com.squareup.cash.invitations;

import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaSheetView;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.SectionMoreInfoViewEvent;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeSelectionViewEvent;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewEvent;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewEvent;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewEvent$BackClicked;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.limits.viewmodels.LimitsViewEvent;
import com.squareup.cash.limits.views.arcade.GroupedLimitsSectionDetailScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InviteErrorDialogKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ InviteErrorDialogKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InvestingOrderTypeSelectionViewEvent.CloseClick closeClick = InvestingOrderTypeSelectionViewEvent.CloseClick.INSTANCE;
        SectionMoreInfoViewEvent.CloseClick closeClick2 = SectionMoreInfoViewEvent.CloseClick.INSTANCE;
        InvestingStockDetailsViewEvent.Close close = InvestingStockDetailsViewEvent.Close.INSTANCE;
        StocksTransferEtaViewEvent$BackClicked stocksTransferEtaViewEvent$BackClicked = StocksTransferEtaViewEvent$BackClicked.INSTANCE;
        InviteContactsViewEvent.DismissBottomSheet dismissBottomSheet = InviteContactsViewEvent.DismissBottomSheet.INSTANCE;
        LimitsViewEvent.ExitFlow exitFlow = LimitsViewEvent.ExitFlow.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(InviteErrorViewEvent$Close.INSTANCE);
                break;
            case 1:
                function1.invoke(InvestingRecurringFrequencyPickerViewEvent.BackPressed.INSTANCE);
                break;
            case 2:
                function1.invoke(InvestingRecurringPurchaseReceiptViewEvent.ClosePressed.INSTANCE);
                break;
            case 3:
                function1.invoke(InvestingRecurringPurchaseReceiptViewEvent.CancelPurchasePressed.INSTANCE);
                break;
            case 4:
                function1.invoke(closeClick);
                break;
            case 5:
                function1.invoke(closeClick);
                break;
            case 6:
                function1.invoke(InvestingOrderTypeSelectionViewEvent.HelpClick.INSTANCE);
                break;
            case 7:
                function1.invoke(InvestingSearchViewEvent.BackClicked.INSTANCE);
                break;
            case 8:
                function1.invoke("");
                break;
            case 9:
                function1.invoke(InvestingSettingsViewEvent.BackClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(closeClick2);
                break;
            case 11:
                function1.invoke(SectionMoreInfoViewEvent.UrlTextClick.INSTANCE);
                break;
            case 12:
                function1.invoke(closeClick2);
                break;
            case 13:
                function1.invoke(InvestingAnalystOpinionsViewEvent$MoreInfoClicked.INSTANCE);
                break;
            case 14:
                function1.invoke(close);
                break;
            case 15:
                function1.invoke(InvestingStockDetailsViewEvent.ShowEntityPerformance.INSTANCE);
                break;
            case 16:
                function1.invoke(close);
                break;
            case 17:
                function1.invoke(stocksTransferEtaViewEvent$BackClicked);
                break;
            case 18:
                int i2 = StocksTransferEtaSheetView.$r8$clinit;
                function1.invoke(stocksTransferEtaViewEvent$BackClicked);
                break;
            case 19:
                function1.invoke(InvestingCryptoNewsViewEvent.ListViewed.INSTANCE);
                break;
            case 20:
                function1.invoke(InvestingCryptoNewsViewEvent.ViewAllArticlesClicked.INSTANCE);
                break;
            case 21:
                function1.invoke(PeriodSelectionViewEvent.BackClick.INSTANCE);
                break;
            case 22:
                function1.invoke(PeriodSelectionViewEvent.SubmitClick.INSTANCE);
                break;
            case 23:
                function1.invoke(InviteContactsViewEvent.RequestPermissions.INSTANCE);
                break;
            case 24:
                function1.invoke(dismissBottomSheet);
                break;
            case 25:
                function1.invoke(dismissBottomSheet);
                break;
            case 26:
                function1.invoke(dismissBottomSheet);
                break;
            case 27:
                function1.invoke(exitFlow);
                break;
            case 28:
                int i3 = GroupedLimitsSectionDetailScreen.$r8$clinit;
                function1.invoke(exitFlow);
                break;
            default:
                function1.invoke(exitFlow);
                break;
        }
        return Unit.INSTANCE;
    }
}
