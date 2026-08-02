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
public final class StockSelectSelectDisclosures implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final DisclosureOrigin origin;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DisclosureOrigin {
        public static final /* synthetic */ DisclosureOrigin[] $VALUES;
        public static final DisclosureOrigin HOME;
        public static final DisclosureOrigin INVEST_SEARCH;

        static {
            DisclosureOrigin disclosureOrigin = new DisclosureOrigin("HOME", 0);
            HOME = disclosureOrigin;
            DisclosureOrigin disclosureOrigin2 = new DisclosureOrigin("INVEST_SEARCH", 1);
            INVEST_SEARCH = disclosureOrigin2;
            $VALUES = new DisclosureOrigin[]{disclosureOrigin, disclosureOrigin2, new DisclosureOrigin("STOCK_DETAILS", 2)};
        }

        public static DisclosureOrigin valueOf(String str) {
            return (DisclosureOrigin) Enum.valueOf(DisclosureOrigin.class, str);
        }

        public static DisclosureOrigin[] values() {
            return (DisclosureOrigin[]) $VALUES.clone();
        }
    }

    public StockSelectSelectDisclosures(DisclosureOrigin disclosureOrigin) {
        this.origin = disclosureOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "origin", disclosureOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StockSelectSelectDisclosures) && this.origin == ((StockSelectSelectDisclosures) obj).origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select SelectDisclosures";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "StockSelectSelectDisclosures(origin=" + this.origin + ")";
    }
}
