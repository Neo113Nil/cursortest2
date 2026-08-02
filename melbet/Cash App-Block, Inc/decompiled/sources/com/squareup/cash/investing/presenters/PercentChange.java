package com.squareup.cash.investing.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.util.BigDecimalsKt;
import java.math.BigDecimal;

/* loaded from: classes6.dex */
public final class PercentChange implements StockMetric {
    public final StockMetric.BackgroundType backgroundColorType;
    public final BigDecimal change;
    public final InvestingCryptoImage netProfitIcon;
    public final String text;

    public PercentChange(BigDecimal bigDecimal, InvestingCryptoImage investingCryptoImage) {
        this.change = bigDecimal;
        this.netProfitIcon = investingCryptoImage;
        BigDecimal abs = bigDecimal.abs();
        abs.getClass();
        this.text = BigDecimalsKt.toPrettyString(abs, true).concat("%");
        this.backgroundColorType = bigDecimal.signum() >= 0 ? StockMetric.BackgroundType.LIGHT : StockMetric.BackgroundType.DARK;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        StockMetric stockMetric = (StockMetric) obj;
        stockMetric.getClass();
        if (stockMetric instanceof PercentChange) {
            return this.change.compareTo(((PercentChange) stockMetric).change);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PercentChange)) {
            return false;
        }
        PercentChange percentChange = (PercentChange) obj;
        return this.change.equals(percentChange.change) && this.netProfitIcon == percentChange.netProfitIcon;
    }

    @Override // com.squareup.cash.investing.viewmodels.StockMetric
    public final StockMetric.BackgroundType getBackgroundColorType() {
        return this.backgroundColorType;
    }

    @Override // com.squareup.cash.investing.viewmodels.StockMetric
    public final InvestingCryptoImage getNetProfitIcon() {
        return this.netProfitIcon;
    }

    @Override // com.squareup.cash.investing.viewmodels.StockMetric
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = this.change.hashCode() * 31;
        InvestingCryptoImage investingCryptoImage = this.netProfitIcon;
        return hashCode + (investingCryptoImage == null ? 0 : investingCryptoImage.hashCode());
    }

    public final String toString() {
        return "PercentChange(change=" + this.change + ", netProfitIcon=" + this.netProfitIcon + ")";
    }
}
