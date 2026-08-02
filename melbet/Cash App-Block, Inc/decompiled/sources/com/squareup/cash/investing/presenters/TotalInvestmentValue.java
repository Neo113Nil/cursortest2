package com.squareup.cash.investing.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TotalInvestmentValue implements StockMetric {
    public final StockMetric.BackgroundType backgroundColorType;
    public final CurrencyCode currencyCode;
    public final InvestmentEntityToken entityToken;
    public final String text;
    public final long totalInvestment;

    public TotalInvestmentValue(long j, CurrencyCode currencyCode, InvestmentEntityToken investmentEntityToken, StockMetric.BackgroundType backgroundType, String str) {
        investmentEntityToken.getClass();
        str.getClass();
        this.totalInvestment = j;
        this.currencyCode = currencyCode;
        this.entityToken = investmentEntityToken;
        this.backgroundColorType = backgroundType;
        this.text = str;
        new Money(Long.valueOf(j), currencyCode, 4);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        StockMetric stockMetric = (StockMetric) obj;
        stockMetric.getClass();
        if (stockMetric instanceof TotalInvestmentValue) {
            return Intrinsics.compare(this.totalInvestment, ((TotalInvestmentValue) stockMetric).totalInvestment);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalInvestmentValue)) {
            return false;
        }
        TotalInvestmentValue totalInvestmentValue = (TotalInvestmentValue) obj;
        return this.totalInvestment == totalInvestmentValue.totalInvestment && this.currencyCode == totalInvestmentValue.currencyCode && Intrinsics.areEqual(this.entityToken, totalInvestmentValue.entityToken) && this.backgroundColorType == totalInvestmentValue.backgroundColorType && Intrinsics.areEqual(this.text, totalInvestmentValue.text);
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
        int hashCode = Long.hashCode(this.totalInvestment) * 31;
        CurrencyCode currencyCode = this.currencyCode;
        return this.text.hashCode() + ((this.backgroundColorType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31, 31, this.entityToken.value)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotalInvestmentValue(totalInvestment=");
        sb.append(this.totalInvestment);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(", entityToken=");
        sb.append(this.entityToken);
        sb.append(", backgroundColorType=");
        sb.append(this.backgroundColorType);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", text=", this.text, ")");
    }
}
