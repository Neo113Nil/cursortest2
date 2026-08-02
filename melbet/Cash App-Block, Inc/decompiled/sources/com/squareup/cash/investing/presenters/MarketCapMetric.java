package com.squareup.cash.investing.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.protos.common.CurrencyCode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MarketCapMetric implements StockMetric {
    public final StockMetric.BackgroundType backgroundColorType;
    public final CurrencyCode currencyCode;
    public final long marketCap;
    public final String text;

    public MarketCapMetric(long j, CurrencyCode currencyCode, String str) {
        str.getClass();
        this.marketCap = j;
        this.currencyCode = currencyCode;
        this.text = str;
        this.backgroundColorType = StockMetric.BackgroundType.LIGHT;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        StockMetric stockMetric = (StockMetric) obj;
        stockMetric.getClass();
        if (stockMetric instanceof MarketCapMetric) {
            return Intrinsics.compare(this.marketCap, ((MarketCapMetric) stockMetric).marketCap);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCapMetric)) {
            return false;
        }
        MarketCapMetric marketCapMetric = (MarketCapMetric) obj;
        return this.marketCap == marketCapMetric.marketCap && this.currencyCode == marketCapMetric.currencyCode && Intrinsics.areEqual(this.text, marketCapMetric.text);
    }

    @Override // com.squareup.cash.investing.viewmodels.StockMetric
    public final StockMetric.BackgroundType getBackgroundColorType() {
        return this.backgroundColorType;
    }

    @Override // com.squareup.cash.investing.viewmodels.StockMetric
    public final InvestingCryptoImage getNetProfitIcon() {
        return null;
    }

    @Override // com.squareup.cash.investing.viewmodels.StockMetric
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.text.hashCode() + ((this.currencyCode.hashCode() + (Long.hashCode(this.marketCap) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCapMetric(marketCap=");
        sb.append(this.marketCap);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", text=", this.text, ")");
    }
}
