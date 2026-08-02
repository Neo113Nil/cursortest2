package com.squareup.cash.cdf.earnings;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsViewOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final EarningsOrigin origin;
    public final LinkedHashMap parameters;
    public final String sections;
    public final String tools;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EarningsOrigin {
        public static final /* synthetic */ EarningsOrigin[] $VALUES;
        public static final EarningsOrigin ACTIVITY;
        public static final EarningsOrigin DEEP_LINK;
        public static final EarningsOrigin MONEY_TAB_APPLET;
        public static final EarningsOrigin PUSH;
        public static final EarningsOrigin RECEIPT;
        public static final EarningsOrigin UNKNOWN;

        static {
            EarningsOrigin earningsOrigin = new EarningsOrigin("MONEY_TAB_APPLET", 0);
            MONEY_TAB_APPLET = earningsOrigin;
            EarningsOrigin earningsOrigin2 = new EarningsOrigin("DEEP_LINK", 1);
            DEEP_LINK = earningsOrigin2;
            EarningsOrigin earningsOrigin3 = new EarningsOrigin("ACTIVITY", 2);
            ACTIVITY = earningsOrigin3;
            EarningsOrigin earningsOrigin4 = new EarningsOrigin("RECEIPT", 3);
            RECEIPT = earningsOrigin4;
            EarningsOrigin earningsOrigin5 = new EarningsOrigin("PUSH", 4);
            PUSH = earningsOrigin5;
            EarningsOrigin earningsOrigin6 = new EarningsOrigin("UNKNOWN", 5);
            UNKNOWN = earningsOrigin6;
            $VALUES = new EarningsOrigin[]{earningsOrigin, earningsOrigin2, earningsOrigin3, earningsOrigin4, earningsOrigin5, earningsOrigin6};
        }

        public static EarningsOrigin valueOf(String str) {
            return (EarningsOrigin) Enum.valueOf(EarningsOrigin.class, str);
        }

        public static EarningsOrigin[] values() {
            return (EarningsOrigin[]) $VALUES.clone();
        }
    }

    public EarningsViewOpen(EarningsOrigin earningsOrigin, String str, String str2) {
        this.origin = earningsOrigin;
        this.sections = str;
        this.tools = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Earnings", "cdf_action", "View");
        Countries.putSafe(m, "origin", earningsOrigin);
        Countries.putSafe(m, "sections", str);
        Countries.putSafe(m, "tools", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsViewOpen)) {
            return false;
        }
        EarningsViewOpen earningsViewOpen = (EarningsViewOpen) obj;
        return this.origin == earningsViewOpen.origin && this.sections.equals(earningsViewOpen.sections) && Intrinsics.areEqual(this.tools, earningsViewOpen.tools);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Earnings View Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.origin.hashCode() * 31, 31, this.sections);
        String str = this.tools;
        return (m + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarningsViewOpen(origin=");
        sb.append(this.origin);
        sb.append(", sections=");
        sb.append(this.sections);
        sb.append(", tools=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tools, ", load_time_ms=null)");
    }
}
