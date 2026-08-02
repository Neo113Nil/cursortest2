package com.squareup.cash.cdf.stock;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class StockToggleToggleDividendReinvestments implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final DividendReinvestmentStatus set;
    public final ScreenSource source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DividendReinvestmentStatus {
        public static final /* synthetic */ DividendReinvestmentStatus[] $VALUES;
        public static final DividendReinvestmentStatus PAYOUT;
        public static final DividendReinvestmentStatus REINVEST;

        static {
            DividendReinvestmentStatus dividendReinvestmentStatus = new DividendReinvestmentStatus("PAYOUT", 0);
            PAYOUT = dividendReinvestmentStatus;
            DividendReinvestmentStatus dividendReinvestmentStatus2 = new DividendReinvestmentStatus("REINVEST", 1);
            REINVEST = dividendReinvestmentStatus2;
            $VALUES = new DividendReinvestmentStatus[]{dividendReinvestmentStatus, dividendReinvestmentStatus2};
        }

        public static DividendReinvestmentStatus valueOf(String str) {
            return (DividendReinvestmentStatus) Enum.valueOf(DividendReinvestmentStatus.class, str);
        }

        public static DividendReinvestmentStatus[] values() {
            return (DividendReinvestmentStatus[]) $VALUES.clone();
        }
    }

    public StockToggleToggleDividendReinvestments(ScreenSource screenSource, DividendReinvestmentStatus dividendReinvestmentStatus) {
        this.source = screenSource;
        this.set = dividendReinvestmentStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Toggle");
        Countries.putSafe(m, "source", screenSource);
        Countries.putSafe(m, "set", dividendReinvestmentStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockToggleToggleDividendReinvestments)) {
            return false;
        }
        StockToggleToggleDividendReinvestments stockToggleToggleDividendReinvestments = (StockToggleToggleDividendReinvestments) obj;
        return this.source == stockToggleToggleDividendReinvestments.source && this.set == stockToggleToggleDividendReinvestments.set;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Toggle ToggleDividendReinvestments";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ScreenSource screenSource = this.source;
        return this.set.hashCode() + ((screenSource == null ? 0 : screenSource.hashCode()) * 31);
    }

    public final String toString() {
        return "StockToggleToggleDividendReinvestments(source=" + this.source + ", set=" + this.set + ")";
    }
}
