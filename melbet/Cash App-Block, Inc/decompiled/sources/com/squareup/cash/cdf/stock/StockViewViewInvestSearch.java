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
public final class StockViewViewInvestSearch implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InvestingSearchOrigin {
        public static final /* synthetic */ InvestingSearchOrigin[] $VALUES;
        public static final InvestingSearchOrigin HOME;

        static {
            InvestingSearchOrigin investingSearchOrigin = new InvestingSearchOrigin("HOME", 0);
            HOME = investingSearchOrigin;
            $VALUES = new InvestingSearchOrigin[]{investingSearchOrigin};
        }

        public static InvestingSearchOrigin valueOf(String str) {
            return (InvestingSearchOrigin) Enum.valueOf(InvestingSearchOrigin.class, str);
        }

        public static InvestingSearchOrigin[] values() {
            return (InvestingSearchOrigin[]) $VALUES.clone();
        }
    }

    public StockViewViewInvestSearch() {
        InvestingSearchOrigin investingSearchOrigin = InvestingSearchOrigin.HOME;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Stock", "cdf_action", "View");
        Countries.putSafe(m, "origin", investingSearchOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockViewViewInvestSearch)) {
            return false;
        }
        InvestingSearchOrigin investingSearchOrigin = InvestingSearchOrigin.HOME;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock View ViewInvestSearch";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return InvestingSearchOrigin.HOME.hashCode();
    }

    public final String toString() {
        return "StockViewViewInvestSearch(origin=" + InvestingSearchOrigin.HOME + ")";
    }
}
