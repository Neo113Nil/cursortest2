package com.squareup.cash.investing.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockDetails {
    public final List aboutDetailRows;
    public final String aboutText;
    public final List announcements;
    public final Color color;
    public final InvestmentEntityWithPrice entityWithPrice;
    public final Money marketCap;
    public final long shares;
    public final String symbol;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentEntityType f1150type;

    public StockDetails(InvestmentEntityWithPrice investmentEntityWithPrice, String str, EmptyList emptyList, long j, Color color, Money money, InvestmentEntityType investmentEntityType, String str2, List list) {
        str.getClass();
        emptyList.getClass();
        investmentEntityType.getClass();
        list.getClass();
        this.entityWithPrice = investmentEntityWithPrice;
        this.symbol = str;
        this.announcements = emptyList;
        this.shares = j;
        this.color = color;
        this.marketCap = money;
        this.f1150type = investmentEntityType;
        this.aboutText = str2;
        this.aboutDetailRows = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockDetails)) {
            return false;
        }
        StockDetails stockDetails = (StockDetails) obj;
        return this.entityWithPrice.equals(stockDetails.entityWithPrice) && Intrinsics.areEqual(this.symbol, stockDetails.symbol) && Intrinsics.areEqual(this.announcements, stockDetails.announcements) && this.shares == stockDetails.shares && this.color.equals(stockDetails.color) && Intrinsics.areEqual(this.marketCap, stockDetails.marketCap) && this.f1150type == stockDetails.f1150type && Intrinsics.areEqual(this.aboutText, stockDetails.aboutText) && Intrinsics.areEqual(this.aboutDetailRows, stockDetails.aboutDetailRows);
    }

    public final int hashCode() {
        int m = SVG$Unit$EnumUnboxingLocalUtility.m(this.color, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entityWithPrice.hashCode() * 31, 31, this.symbol), 31, this.announcements), 31, this.shares), 31);
        Money money = this.marketCap;
        int hashCode = (this.f1150type.hashCode() + ((m + (money == null ? 0 : money.hashCode())) * 31)) * 31;
        String str = this.aboutText;
        return this.aboutDetailRows.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StockDetails(entityWithPrice=" + this.entityWithPrice + ", symbol=" + this.symbol + ", announcements=" + this.announcements + ", shares=" + this.shares + ", color=" + this.color + ", marketCap=" + this.marketCap + ", type=" + this.f1150type + ", aboutText=" + this.aboutText + ", aboutDetailRows=" + this.aboutDetailRows + ")";
    }
}
