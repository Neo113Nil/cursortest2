package com.squareup.cash.benefits.views;

import com.squareup.cash.banking.viewmodels.BenefitDetailsViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewEvent;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewEvent;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewEvent;
import com.squareup.cash.benefits.viewmodels.GreenEligibleTransactionsViewEvent;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewEvent;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewEvent;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewEvent;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.SatoshisLearnMoreViewEvent$DoneClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay;
import com.squareup.cash.bitcoin.viewmodels.applet.toolbar.BitcoinHomeToolbarEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsHubViewKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BenefitsHubViewKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        BenefitsHubViewEvent.Close close = BenefitsHubViewEvent.Close.INSTANCE;
        PdsaBenefitsExplainerViewEvent.Close close2 = PdsaBenefitsExplainerViewEvent.Close.INSTANCE;
        SatoshisLearnMoreViewEvent$DoneClicked satoshisLearnMoreViewEvent$DoneClicked = SatoshisLearnMoreViewEvent$DoneClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(close);
                break;
            case 1:
                function1.invoke(BenefitDetailsViewEvent.Back.INSTANCE);
                break;
            case 2:
                function1.invoke(BenefitsExplanationViewEvent.Back.INSTANCE);
                break;
            case 3:
                function1.invoke(BenefitsHomeViewEvent.ViewTransactionsClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(BenefitsHomeViewEvent.OtherWaysToQualifyClicked.INSTANCE);
                break;
            case 5:
                function1.invoke(BenefitsHomeViewEvent.Exit.INSTANCE);
                break;
            case 6:
                function1.invoke(BenefitsHomeViewEvent.StickyCtaClicked.INSTANCE);
                break;
            case 7:
                function1.invoke(BenefitsHubViewEvent.ExplainBenefitsClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(BenefitsHubViewEvent.Retry.INSTANCE);
                break;
            case 9:
                function1.invoke(close);
                break;
            case 10:
                function1.invoke(GreenEligibleTransactionsViewEvent.Back.INSTANCE);
                break;
            case 11:
                function1.invoke(GreenEligibleTransactionsViewEvent.LearnMore.INSTANCE);
                break;
            case 12:
                function1.invoke(PdsaBenefitsExplainerViewEvent.PrimaryButtonClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(close2);
                break;
            case 14:
                function1.invoke(close2);
                break;
            case 15:
                function1.invoke(BillsSubscriptionsMerchantListViewEvent.DoneClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(BillsSubscriptionsMerchantListViewEvent.BackClicked.INSTANCE);
                break;
            case 17:
                function1.invoke(satoshisLearnMoreViewEvent$DoneClicked);
                break;
            case 18:
                function1.invoke(satoshisLearnMoreViewEvent$DoneClicked);
                break;
            case 19:
                function1.invoke(new BitcoinDisplayCurrencyViewEvent.BitcoinDisplayUnitsSelected(BitcoinDisplayUnits.SATOSHIS));
                break;
            case 20:
                function1.invoke(BitcoinDisplayCurrencyViewEvent.LearnMorePressed.INSTANCE);
                break;
            case 21:
                function1.invoke(BitcoinDisplayCurrencyViewEvent.BackPressed.INSTANCE);
                break;
            case 22:
                function1.invoke(new BitcoinDisplayCurrencyViewEvent.BitcoinDisplayUnitsSelected(BitcoinDisplayUnits.SATOSHIS));
                break;
            case 23:
                function1.invoke(new BitcoinDisplayCurrencyViewEvent.BitcoinDisplayUnitsSelected(BitcoinDisplayUnits.BITCOIN));
                break;
            case 24:
                function1.invoke(new BitcoinDisplayCurrencyViewEvent.BitcoinDisplayUnitsSelected(BitcoinDisplayUnits.BITCOIN));
                break;
            case 25:
                function1.invoke(BitcoinPayInUsdSettingsViewEvent.BackClick.INSTANCE);
                break;
            case 26:
                function1.invoke(BitcoinHomeToolbarEvent.BitcoinMapClicked.INSTANCE);
                break;
            case 27:
                function1.invoke(BitcoinHomeToolbarEvent.BitcoinScannerClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(BitcoinHomeToolbarEvent.BackClicked.INSTANCE);
                break;
            default:
                function1.invoke(BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
