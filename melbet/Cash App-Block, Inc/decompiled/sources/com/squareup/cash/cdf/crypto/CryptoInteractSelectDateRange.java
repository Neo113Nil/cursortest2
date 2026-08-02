package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoInteractSelectDateRange implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final DateRange date_range;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    public final class DateRange {
        public static final /* synthetic */ DateRange[] $VALUES;
        public static final DateRange ALL;
        public static final DateRange DAY;
        public static final DateRange MONTH;
        public static final DateRange WEEK;
        public static final DateRange YEAR;

        static {
            DateRange dateRange = new DateRange("DAY", 0);
            DAY = dateRange;
            DateRange dateRange2 = new DateRange("WEEK", 1);
            WEEK = dateRange2;
            DateRange dateRange3 = new DateRange("MONTH", 2);
            MONTH = dateRange3;
            DateRange dateRange4 = new DateRange("YEAR", 3);
            YEAR = dateRange4;
            DateRange dateRange5 = new DateRange("ALL", 4);
            ALL = dateRange5;
            $VALUES = new DateRange[]{dateRange, dateRange2, dateRange3, dateRange4, dateRange5};
        }

        public static DateRange valueOf(String str) {
            return (DateRange) Enum.valueOf(DateRange.class, str);
        }

        public static DateRange[] values() {
            return (DateRange[]) $VALUES.clone();
        }
    }

    public CryptoInteractSelectDateRange(DateRange dateRange) {
        this.date_range = dateRange;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Interact");
        Countries.putSafe(m, "date_range", dateRange);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoInteractSelectDateRange) && this.date_range == ((CryptoInteractSelectDateRange) obj).date_range;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Interact SelectDateRange";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.date_range.hashCode();
    }

    public final String toString() {
        return "CryptoInteractSelectDateRange(date_range=" + this.date_range + ")";
    }
}
