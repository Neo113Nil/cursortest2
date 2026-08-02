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
public final class BorrowAppletViewSeeTile implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final TileType source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class TileType {
        public static final /* synthetic */ TileType[] $VALUES;
        public static final TileType BULLETINS;
        public static final TileType CREDIT_LIMIT_AND_BORROW_BUTTON;
        public static final TileType LOAN_HISTORY;
        public static final TileType PAYMENT_TIMELINE;

        static {
            TileType tileType = new TileType("CREDIT_LIMIT_AND_BORROW_BUTTON", 0);
            CREDIT_LIMIT_AND_BORROW_BUTTON = tileType;
            TileType tileType2 = new TileType("PAYMENT_TIMELINE", 1);
            PAYMENT_TIMELINE = tileType2;
            TileType tileType3 = new TileType("BULLETINS", 2);
            BULLETINS = tileType3;
            TileType tileType4 = new TileType("LOAN_HISTORY", 3);
            LOAN_HISTORY = tileType4;
            $VALUES = new TileType[]{tileType, tileType2, tileType3, tileType4, new TileType("LINKS", 4)};
        }

        public static TileType valueOf(String str) {
            return (TileType) Enum.valueOf(TileType.class, str);
        }

        public static TileType[] values() {
            return (TileType[]) $VALUES.clone();
        }
    }

    public BorrowAppletViewSeeTile(TileType tileType) {
        this.source = tileType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BorrowApplet", "cdf_action", "View");
        Countries.putSafe(m, "source", tileType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowAppletViewSeeTile) && this.source == ((BorrowAppletViewSeeTile) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowApplet View SeeTile";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "BorrowAppletViewSeeTile(source=" + this.source + ")";
    }
}
