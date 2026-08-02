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
public final class StockToggleStockToggleToggleGraphTimeRange implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EquityType equity_type;
    public final LinkedHashMap parameters;
    public final String ticker;
    public final TimeRange timeRange;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TimeRange {
        public static final /* synthetic */ TimeRange[] $VALUES;
        public static final TimeRange ALL;
        public static final TimeRange DAY;
        public static final TimeRange MONTH;
        public static final TimeRange WEEK;
        public static final TimeRange YEAR;

        static {
            TimeRange timeRange = new TimeRange("DAY", 0);
            DAY = timeRange;
            TimeRange timeRange2 = new TimeRange("WEEK", 1);
            WEEK = timeRange2;
            TimeRange timeRange3 = new TimeRange("MONTH", 2);
            MONTH = timeRange3;
            TimeRange timeRange4 = new TimeRange("YEAR", 3);
            YEAR = timeRange4;
            TimeRange timeRange5 = new TimeRange("ALL", 4);
            ALL = timeRange5;
            $VALUES = new TimeRange[]{timeRange, timeRange2, timeRange3, timeRange4, timeRange5};
        }

        public static TimeRange valueOf(String str) {
            return (TimeRange) Enum.valueOf(TimeRange.class, str);
        }

        public static TimeRange[] values() {
            return (TimeRange[]) $VALUES.clone();
        }
    }

    public StockToggleStockToggleToggleGraphTimeRange(String str, TimeRange timeRange, EquityType equityType) {
        this.ticker = str;
        this.timeRange = timeRange;
        this.equity_type = equityType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Toggle");
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "timeRange", timeRange);
        Countries.putSafe(m, "equity_type", equityType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockToggleStockToggleToggleGraphTimeRange)) {
            return false;
        }
        StockToggleStockToggleToggleGraphTimeRange stockToggleStockToggleToggleGraphTimeRange = (StockToggleStockToggleToggleGraphTimeRange) obj;
        return Intrinsics.areEqual(this.ticker, stockToggleStockToggleToggleGraphTimeRange.ticker) && this.timeRange == stockToggleStockToggleToggleGraphTimeRange.timeRange && this.equity_type == stockToggleStockToggleToggleGraphTimeRange.equity_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Toggle StockToggleToggleGraphTimeRange";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.ticker;
        int hashCode = (this.timeRange.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        EquityType equityType = this.equity_type;
        return hashCode + (equityType != null ? equityType.hashCode() : 0);
    }

    public final String toString() {
        return "StockToggleStockToggleToggleGraphTimeRange(ticker=" + this.ticker + ", timeRange=" + this.timeRange + ", equity_type=" + this.equity_type + ")";
    }
}
