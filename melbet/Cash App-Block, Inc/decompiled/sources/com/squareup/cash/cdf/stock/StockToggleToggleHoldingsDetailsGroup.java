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
public final class StockToggleToggleHoldingsDetailsGroup implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Group group;
    public final LinkedHashMap parameters;
    public final String ticker;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Group {
        public static final /* synthetic */ Group[] $VALUES;
        public static final Group HOLDINGS;
        public static final Group SECTORS;

        static {
            Group group = new Group("SECTORS", 0);
            SECTORS = group;
            Group group2 = new Group("HOLDINGS", 1);
            HOLDINGS = group2;
            $VALUES = new Group[]{group, group2};
        }

        public static Group valueOf(String str) {
            return (Group) Enum.valueOf(Group.class, str);
        }

        public static Group[] values() {
            return (Group[]) $VALUES.clone();
        }
    }

    public StockToggleToggleHoldingsDetailsGroup(String str, Group group) {
        this.ticker = str;
        this.group = group;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Toggle");
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "group", group);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockToggleToggleHoldingsDetailsGroup)) {
            return false;
        }
        StockToggleToggleHoldingsDetailsGroup stockToggleToggleHoldingsDetailsGroup = (StockToggleToggleHoldingsDetailsGroup) obj;
        return Intrinsics.areEqual(this.ticker, stockToggleToggleHoldingsDetailsGroup.ticker) && this.group == stockToggleToggleHoldingsDetailsGroup.group;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Toggle ToggleHoldingsDetailsGroup";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.ticker;
        return this.group.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StockToggleToggleHoldingsDetailsGroup(ticker=" + this.ticker + ", group=" + this.group + ")";
    }
}
