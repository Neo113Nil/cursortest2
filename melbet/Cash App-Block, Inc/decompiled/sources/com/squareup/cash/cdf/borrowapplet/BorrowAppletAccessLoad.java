package com.squareup.cash.cdf.borrowapplet;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BorrowAppletAccessLoad implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final EntryPointType source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EntryPointType {
        public static final /* synthetic */ EntryPointType[] $VALUES;
        public static final EntryPointType NONE;
        public static final EntryPointType TILE;

        /* JADX INFO: Fake field, exist only in values array */
        EntryPointType EF0;

        static {
            EntryPointType entryPointType = new EntryPointType("ROW", 0);
            EntryPointType entryPointType2 = new EntryPointType("LEGACY_ROW", 1);
            EntryPointType entryPointType3 = new EntryPointType("NONE", 2);
            NONE = entryPointType3;
            EntryPointType entryPointType4 = new EntryPointType("LEGACY_NONE", 3);
            EntryPointType entryPointType5 = new EntryPointType("TILE", 4);
            TILE = entryPointType5;
            $VALUES = new EntryPointType[]{entryPointType, entryPointType2, entryPointType3, entryPointType4, entryPointType5};
        }

        public static EntryPointType valueOf(String str) {
            return (EntryPointType) Enum.valueOf(EntryPointType.class, str);
        }

        public static EntryPointType[] values() {
            return (EntryPointType[]) $VALUES.clone();
        }
    }

    public BorrowAppletAccessLoad(EntryPointType entryPointType) {
        this.source = entryPointType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BorrowApplet", "cdf_action", "Access");
        Countries.putSafe(m, "source", entryPointType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowAppletAccessLoad) && this.source == ((BorrowAppletAccessLoad) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowApplet Access Load";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        EntryPointType entryPointType = this.source;
        if (entryPointType == null) {
            return 0;
        }
        return entryPointType.hashCode();
    }

    public final String toString() {
        return "BorrowAppletAccessLoad(source=" + this.source + ")";
    }
}
