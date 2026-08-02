package com.squareup.cash.investing.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.protos.common.CurrencyCode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SharePriceMetric implements StockMetric {
    public final StockMetric.BackgroundType backgroundColorType;
    public final CurrencyCode currencyCode;
    public final long sharePrice;
    public final String text;

    public SharePriceMetric(long j, CurrencyCode currencyCode, String str) {
        currencyCode.getClass();
        str.getClass();
        this.sharePrice = j;
        this.currencyCode = currencyCode;
        this.text = str;
        this.backgroundColorType = StockMetric.BackgroundType.LIGHT;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        StockMetric stockMetric = (StockMetric) obj;
        stockMetric.getClass();
        if (stockMetric instanceof SharePriceMetric) {
            return Intrinsics.compare(this.sharePrice, ((SharePriceMetric) stockMetric).sharePrice);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePriceMetric)) {
            return false;
        }
        SharePriceMetric sharePriceMetric = (SharePriceMetric) obj;
        return this.sharePrice == sharePriceMetric.sharePrice && this.currencyCode == sharePriceMetric.currencyCode && Intrinsics.areEqual(this.text, sharePriceMetric.text);
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
        return this.text.hashCode() + ((this.currencyCode.hashCode() + (Long.hashCode(this.sharePrice) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharePriceMetric(sharePrice=");
        sb.append(this.sharePrice);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", text=", this.text, ")");
    }
}
