package com.squareup.cash.bitcoin.viewmodels.applet.news;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BitcoinHomeNewsWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final InvestingCryptoNewsViewModel viewModel;

    public BitcoinHomeNewsWidgetViewModel(InvestingCryptoNewsViewModel investingCryptoNewsViewModel) {
        investingCryptoNewsViewModel.getClass();
        this.viewModel = investingCryptoNewsViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinHomeNewsWidgetViewModel) && Intrinsics.areEqual(this.viewModel, ((BitcoinHomeNewsWidgetViewModel) obj).viewModel);
    }

    public final int hashCode() {
        return this.viewModel.hashCode();
    }

    public final String toString() {
        return "BitcoinHomeNewsWidgetViewModel(viewModel=" + this.viewModel + ")";
    }
}
