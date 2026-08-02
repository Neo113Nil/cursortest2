package com.squareup.cash.investing.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.protos.common.CurrencyCode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TotalReturn implements StockMetric {
    public final StockMetric.BackgroundType backgroundColorType;
    public final CurrencyCode currencyCode;
    public final String text;
    public final long totalReturn;

    public TotalReturn(long j, CurrencyCode currencyCode, String str) {
        this.totalReturn = j;
        this.currencyCode = currencyCode;
        this.text = str;
        this.backgroundColorType = j >= 0 ? StockMetric.BackgroundType.LIGHT : StockMetric.BackgroundType.DARK;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        StockMetric stockMetric = (StockMetric) obj;
        stockMetric.getClass();
        if (stockMetric instanceof TotalReturn) {
            return Intrinsics.compare(this.totalReturn, ((TotalReturn) stockMetric).totalReturn);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalReturn)) {
            return false;
        }
        TotalReturn totalReturn = (TotalReturn) obj;
        return this.totalReturn == totalReturn.totalReturn && this.currencyCode == totalReturn.currencyCode && this.text.equals(totalReturn.text);
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
        int hashCode = Long.hashCode(this.totalReturn) * 31;
        CurrencyCode currencyCode = this.currencyCode;
        return this.text.hashCode() + ((hashCode + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotalReturn(totalReturn=");
        sb.append(this.totalReturn);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", text=", this.text, ")");
    }
}
