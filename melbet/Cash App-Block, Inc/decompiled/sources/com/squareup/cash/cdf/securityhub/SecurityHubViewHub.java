package com.squareup.cash.cdf.securityhub;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class SecurityHubViewHub implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source SETTINGS;

        static {
            Source source = new Source("SETTINGS", 0);
            SETTINGS = source;
            $VALUES = new Source[]{source};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public SecurityHubViewHub(Source source) {
        this.source = source;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "SecurityHub", "cdf_action", "View");
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecurityHubViewHub) && this.source == ((SecurityHubViewHub) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SecurityHub View Hub";
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
        return "SecurityHubViewHub(source=" + this.source + ")";
    }
}
