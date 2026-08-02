package com.squareup.cash.cdf.paychecks;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PaychecksSetUpDirectDepositStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean has_distribution_set;
    public final LinkedHashMap parameters;
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source FOOTER;
        public static final Source TIMELINE;

        static {
            Source source = new Source("TIMELINE", 0);
            TIMELINE = source;
            Source source2 = new Source("FOOTER", 1);
            FOOTER = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public PaychecksSetUpDirectDepositStart(Boolean bool, Source source) {
        this.has_distribution_set = bool;
        this.source = source;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Paychecks", "cdf_action", "SetUpDirectDeposit");
        Countries.putSafe(m, "has_distribution_set", bool);
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksSetUpDirectDepositStart)) {
            return false;
        }
        PaychecksSetUpDirectDepositStart paychecksSetUpDirectDepositStart = (PaychecksSetUpDirectDepositStart) obj;
        return this.has_distribution_set.equals(paychecksSetUpDirectDepositStart.has_distribution_set) && this.source == paychecksSetUpDirectDepositStart.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks SetUpDirectDeposit Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.has_distribution_set.hashCode() * 31);
    }

    public final String toString() {
        return "PaychecksSetUpDirectDepositStart(has_distribution_set=" + this.has_distribution_set + ", source=" + this.source + ")";
    }
}
