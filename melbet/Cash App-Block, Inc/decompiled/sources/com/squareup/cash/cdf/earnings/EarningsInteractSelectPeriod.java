package com.squareup.cash.cdf.earnings;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class EarningsInteractSelectPeriod implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final EarningsPeriod period;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EarningsPeriod {
        public static final /* synthetic */ EarningsPeriod[] $VALUES;
        public static final EarningsPeriod ALL_TIME;
        public static final EarningsPeriod LAST_MONTH;
        public static final EarningsPeriod THIS_MONTH;
        public static final EarningsPeriod TWO_MONTHS_AGO;
        public static final EarningsPeriod YEAR_TO_DATE;

        static {
            EarningsPeriod earningsPeriod = new EarningsPeriod("THIS_MONTH", 0);
            THIS_MONTH = earningsPeriod;
            EarningsPeriod earningsPeriod2 = new EarningsPeriod("LAST_MONTH", 1);
            LAST_MONTH = earningsPeriod2;
            EarningsPeriod earningsPeriod3 = new EarningsPeriod("TWO_MONTHS_AGO", 2);
            TWO_MONTHS_AGO = earningsPeriod3;
            EarningsPeriod earningsPeriod4 = new EarningsPeriod("YEAR_TO_DATE", 3);
            YEAR_TO_DATE = earningsPeriod4;
            EarningsPeriod earningsPeriod5 = new EarningsPeriod("ALL_TIME", 4);
            ALL_TIME = earningsPeriod5;
            $VALUES = new EarningsPeriod[]{earningsPeriod, earningsPeriod2, earningsPeriod3, earningsPeriod4, earningsPeriod5};
        }

        public static EarningsPeriod valueOf(String str) {
            return (EarningsPeriod) Enum.valueOf(EarningsPeriod.class, str);
        }

        public static EarningsPeriod[] values() {
            return (EarningsPeriod[]) $VALUES.clone();
        }
    }

    public EarningsInteractSelectPeriod(EarningsPeriod earningsPeriod) {
        this.period = earningsPeriod;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Earnings", "cdf_action", "Interact");
        Countries.putSafe(m, "period", earningsPeriod);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsInteractSelectPeriod) && this.period == ((EarningsInteractSelectPeriod) obj).period;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Earnings Interact SelectPeriod";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.period.hashCode();
    }

    public final String toString() {
        return "EarningsInteractSelectPeriod(period=" + this.period + ")";
    }
}
