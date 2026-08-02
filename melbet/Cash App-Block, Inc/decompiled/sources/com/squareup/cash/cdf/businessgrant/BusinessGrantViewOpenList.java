package com.squareup.cash.cdf.businessgrant;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BusinessGrantViewOpenList implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EntryPoint {
        public static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint PROFILE_ROW;

        static {
            EntryPoint entryPoint = new EntryPoint("PROFILE_ROW", 0);
            PROFILE_ROW = entryPoint;
            $VALUES = new EntryPoint[]{entryPoint};
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public BusinessGrantViewOpenList() {
        EntryPoint entryPoint = EntryPoint.PROFILE_ROW;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BusinessGrant", "cdf_action", "View");
        Countries.putSafe(m, "entry_point", entryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGrantViewOpenList)) {
            return false;
        }
        EntryPoint entryPoint = EntryPoint.PROFILE_ROW;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BusinessGrant View OpenList";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return EntryPoint.PROFILE_ROW.hashCode();
    }

    public final String toString() {
        return "BusinessGrantViewOpenList(entry_point=" + EntryPoint.PROFILE_ROW + ")";
    }
}
