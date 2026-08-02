package com.squareup.cash.cdf.stock;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockToggleToggleFinancialWindow implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final FinancialWindowType financial_window_type;
    public final LinkedHashMap parameters;
    public final String ticker;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FinancialWindowType {
        public static final /* synthetic */ FinancialWindowType[] $VALUES;
        public static final FinancialWindowType ANNUALLY;
        public static final FinancialWindowType QUARTERLY;

        static {
            FinancialWindowType financialWindowType = new FinancialWindowType("QUARTERLY", 0);
            QUARTERLY = financialWindowType;
            FinancialWindowType financialWindowType2 = new FinancialWindowType("ANNUALLY", 1);
            ANNUALLY = financialWindowType2;
            $VALUES = new FinancialWindowType[]{financialWindowType, financialWindowType2};
        }

        public static FinancialWindowType valueOf(String str) {
            return (FinancialWindowType) Enum.valueOf(FinancialWindowType.class, str);
        }

        public static FinancialWindowType[] values() {
            return (FinancialWindowType[]) $VALUES.clone();
        }
    }

    public StockToggleToggleFinancialWindow(String str, FinancialWindowType financialWindowType) {
        this.ticker = str;
        this.financial_window_type = financialWindowType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Toggle");
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "financial_window_type", financialWindowType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockToggleToggleFinancialWindow)) {
            return false;
        }
        StockToggleToggleFinancialWindow stockToggleToggleFinancialWindow = (StockToggleToggleFinancialWindow) obj;
        return Intrinsics.areEqual(this.ticker, stockToggleToggleFinancialWindow.ticker) && this.financial_window_type == stockToggleToggleFinancialWindow.financial_window_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Toggle ToggleFinancialWindow";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.ticker;
        return this.financial_window_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StockToggleToggleFinancialWindow(ticker=" + this.ticker + ", financial_window_type=" + this.financial_window_type + ")";
    }
}
