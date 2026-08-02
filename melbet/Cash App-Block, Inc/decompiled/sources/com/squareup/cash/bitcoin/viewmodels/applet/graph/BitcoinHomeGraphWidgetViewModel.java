package com.squareup.cash.bitcoin.viewmodels.applet.graph;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinHomeGraphWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final String amount;
    public final InvestingHomePortfolioHeaderContentModel graphHeaderModel;
    public final InvestingGraphContentModel graphModel;
    public final HistoricalRange selectedRange;
    public final String subAmount;

    public BitcoinHomeGraphWidgetViewModel(InvestingGraphContentModel investingGraphContentModel, InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel, String str, String str2, HistoricalRange historicalRange) {
        historicalRange.getClass();
        this.graphModel = investingGraphContentModel;
        this.graphHeaderModel = investingHomePortfolioHeaderContentModel;
        this.amount = str;
        this.subAmount = str2;
        this.selectedRange = historicalRange;
        historicalRange.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinHomeGraphWidgetViewModel)) {
            return false;
        }
        BitcoinHomeGraphWidgetViewModel bitcoinHomeGraphWidgetViewModel = (BitcoinHomeGraphWidgetViewModel) obj;
        return Intrinsics.areEqual(this.graphModel, bitcoinHomeGraphWidgetViewModel.graphModel) && Intrinsics.areEqual(this.graphHeaderModel, bitcoinHomeGraphWidgetViewModel.graphHeaderModel) && Intrinsics.areEqual(this.amount, bitcoinHomeGraphWidgetViewModel.amount) && Intrinsics.areEqual(this.subAmount, bitcoinHomeGraphWidgetViewModel.subAmount) && this.selectedRange == bitcoinHomeGraphWidgetViewModel.selectedRange;
    }

    public final int hashCode() {
        InvestingGraphContentModel investingGraphContentModel = this.graphModel;
        int hashCode = (investingGraphContentModel == null ? 0 : investingGraphContentModel.hashCode()) * 31;
        InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel = this.graphHeaderModel;
        int hashCode2 = (hashCode + (investingHomePortfolioHeaderContentModel == null ? 0 : investingHomePortfolioHeaderContentModel.hashCode())) * 31;
        String str = this.amount;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subAmount;
        return this.selectedRange.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinHomeGraphWidgetViewModel(graphModel=");
        sb.append(this.graphModel);
        sb.append(", graphHeaderModel=");
        sb.append(this.graphHeaderModel);
        sb.append(", amount=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.amount, ", subAmount=", this.subAmount, ", selectedRange=");
        sb.append(this.selectedRange);
        sb.append(")");
        return sb.toString();
    }
}
