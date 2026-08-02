package com.squareup.cash.cdf.autoreload;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AutoReloadSettingsViewed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source BALANCE;
        public static final Source CARD;
        public static final Source MONEY_TAB;

        static {
            Source source = new Source("MONEY_TAB", 0);
            MONEY_TAB = source;
            Source source2 = new Source("BALANCE", 1);
            BALANCE = source2;
            Source source3 = new Source("CARD", 2);
            CARD = source3;
            $VALUES = new Source[]{source, source2, source3};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public AutoReloadSettingsViewed(Source source) {
        this.source = source;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "AutoReload", "cdf_action", "Settings");
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoReloadSettingsViewed) && this.source == ((AutoReloadSettingsViewed) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AutoReload Settings Viewed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Source source = this.source;
        if (source == null) {
            return 0;
        }
        return source.hashCode();
    }

    public final String toString() {
        return "AutoReloadSettingsViewed(source=" + this.source + ")";
    }
}
