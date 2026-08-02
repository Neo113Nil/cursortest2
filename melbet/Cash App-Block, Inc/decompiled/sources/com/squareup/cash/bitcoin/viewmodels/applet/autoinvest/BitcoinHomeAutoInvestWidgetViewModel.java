package com.squareup.cash.bitcoin.viewmodels.applet.autoinvest;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;

/* loaded from: classes4.dex */
public final class BitcoinHomeAutoInvestWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final InvestingCryptoRecurringPurchaseTileViewModel viewModel;

    public BitcoinHomeAutoInvestWidgetViewModel(InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel) {
        this.viewModel = investingCryptoRecurringPurchaseTileViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinHomeAutoInvestWidgetViewModel) && this.viewModel.equals(((BitcoinHomeAutoInvestWidgetViewModel) obj).viewModel);
    }

    public final int hashCode() {
        return this.viewModel.hashCode();
    }

    public final String toString() {
        return "BitcoinHomeAutoInvestWidgetViewModel(viewModel=" + this.viewModel + ")";
    }
}
