package com.squareup.cash.investing.viewmodels;

import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final class StockContentModel {
    public final LinkScanner avatar;
    public final InvestmentEntityToken investmentEntityToken;
    public final boolean isStale;
    public final StockMetric metric;
    public final String stockPrice;
    public final String subTitle;
    public final String title;
    public final String upcomingLabel;

    public StockContentModel(LinkScanner linkScanner, String str, String str2, StockMetric stockMetric, InvestmentEntityToken investmentEntityToken, boolean z, String str3, String str4) {
        str.getClass();
        investmentEntityToken.getClass();
        this.avatar = linkScanner;
        this.title = str;
        this.subTitle = str2;
        this.metric = stockMetric;
        this.investmentEntityToken = investmentEntityToken;
        this.isStale = z;
        this.upcomingLabel = str3;
        this.stockPrice = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockContentModel)) {
            return false;
        }
        StockContentModel stockContentModel = (StockContentModel) obj;
        return this.avatar.equals(stockContentModel.avatar) && Intrinsics.areEqual(this.title, stockContentModel.title) && Intrinsics.areEqual(this.subTitle, stockContentModel.subTitle) && Intrinsics.areEqual(this.metric, stockContentModel.metric) && Intrinsics.areEqual(this.investmentEntityToken, stockContentModel.investmentEntityToken) && this.isStale == stockContentModel.isStale && Intrinsics.areEqual(this.upcomingLabel, stockContentModel.upcomingLabel) && Intrinsics.areEqual(this.stockPrice, stockContentModel.stockPrice);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.title);
        String str = this.subTitle;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        StockMetric stockMetric = this.metric;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (stockMetric == null ? 0 : stockMetric.hashCode())) * 31, 31, this.investmentEntityToken.value), 31, this.isStale);
        String str2 = this.upcomingLabel;
        int hashCode2 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stockPrice;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StockContentModel(avatar=");
        sb.append(this.avatar);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subTitle=");
        sb.append(this.subTitle);
        sb.append(", metric=");
        sb.append(this.metric);
        sb.append(", investmentEntityToken=");
        sb.append(this.investmentEntityToken);
        sb.append(", isStale=");
        sb.append(this.isStale);
        sb.append(", upcomingLabel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.upcomingLabel, ", stockPrice=", this.stockPrice, ")");
    }
}
