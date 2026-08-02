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
public final class CryptoSpendViewMap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final ViewMapSource source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class ViewMapSource {
        public static final /* synthetic */ ViewMapSource[] $VALUES;
        public static final ViewMapSource BITCOIN_APPLET_CARD;
        public static final ViewMapSource BITCOIN_APPLET_HEADER;
        public static final ViewMapSource BITCOIN_APPLET_ITEM;
        public static final ViewMapSource ROUTE;

        static {
            ViewMapSource viewMapSource = new ViewMapSource("BITCOIN_APPLET_CARD", 0);
            BITCOIN_APPLET_CARD = viewMapSource;
            ViewMapSource viewMapSource2 = new ViewMapSource("BITCOIN_APPLET_ITEM", 1);
            BITCOIN_APPLET_ITEM = viewMapSource2;
            ViewMapSource viewMapSource3 = new ViewMapSource("BITCOIN_APPLET_HEADER", 2);
            BITCOIN_APPLET_HEADER = viewMapSource3;
            ViewMapSource viewMapSource4 = new ViewMapSource("ROUTE", 3);
            ROUTE = viewMapSource4;
            $VALUES = new ViewMapSource[]{viewMapSource, viewMapSource2, viewMapSource3, viewMapSource4};
        }

        public static ViewMapSource valueOf(String str) {
            return (ViewMapSource) Enum.valueOf(ViewMapSource.class, str);
        }

        public static ViewMapSource[] values() {
            return (ViewMapSource[]) $VALUES.clone();
        }
    }

    public CryptoSpendViewMap(ViewMapSource viewMapSource) {
        this.source = viewMapSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Spend");
        Countries.putSafe(m, "source", viewMapSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoSpendViewMap) && this.source == ((CryptoSpendViewMap) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Spend ViewMap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ViewMapSource viewMapSource = this.source;
        if (viewMapSource == null) {
            return 0;
        }
        return viewMapSource.hashCode();
    }

    public final String toString() {
        return "CryptoSpendViewMap(source=" + this.source + ")";
    }
}
