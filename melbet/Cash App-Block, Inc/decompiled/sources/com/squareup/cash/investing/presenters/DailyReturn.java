package com.squareup.cash.investing.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.protos.common.CurrencyCode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DailyReturn implements StockMetric {
    public final StockMetric.BackgroundType backgroundColorType;
    public final CurrencyCode currencyCode;
    public final long dailyReturn;
    public final String text;

    public DailyReturn(long j, CurrencyCode currencyCode, String str) {
        this.dailyReturn = j;
        this.currencyCode = currencyCode;
        this.text = str;
        this.backgroundColorType = j >= 0 ? StockMetric.BackgroundType.LIGHT : StockMetric.BackgroundType.DARK;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        StockMetric stockMetric = (StockMetric) obj;
        stockMetric.getClass();
        if (stockMetric instanceof DailyReturn) {
            return Intrinsics.compare(this.dailyReturn, ((DailyReturn) stockMetric).dailyReturn);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyReturn)) {
            return false;
        }
        DailyReturn dailyReturn = (DailyReturn) obj;
        return this.dailyReturn == dailyReturn.dailyReturn && this.currencyCode == dailyReturn.currencyCode && this.text.equals(dailyReturn.text);
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
        int hashCode = Long.hashCode(this.dailyReturn) * 31;
        CurrencyCode currencyCode = this.currencyCode;
        return this.text.hashCode() + ((hashCode + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyReturn(dailyReturn=");
        sb.append(this.dailyReturn);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", text=", this.text, ")");
    }
}
