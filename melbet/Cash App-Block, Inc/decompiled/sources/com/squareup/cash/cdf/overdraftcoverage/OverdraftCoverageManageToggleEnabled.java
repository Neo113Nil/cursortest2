package com.squareup.cash.cdf.overdraftcoverage;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class OverdraftCoverageManageToggleEnabled implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final Enabled enabled;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class Enabled {
        public static final /* synthetic */ Enabled[] $VALUES;
        public static final Enabled False;
        public static final Enabled True;

        static {
            Enabled enabled = new Enabled("True", 0);
            True = enabled;
            Enabled enabled2 = new Enabled("False", 1);
            False = enabled2;
            $VALUES = new Enabled[]{enabled, enabled2};
        }

        public static Enabled valueOf(String str) {
            return (Enabled) Enum.valueOf(Enabled.class, str);
        }

        public static Enabled[] values() {
            return (Enabled[]) $VALUES.clone();
        }
    }

    public OverdraftCoverageManageToggleEnabled(Enabled enabled) {
        this.enabled = enabled;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "OverdraftCoverage", "cdf_action", "Manage");
        Countries.putSafe(m, "enabled", enabled);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftCoverageManageToggleEnabled) && this.enabled == ((OverdraftCoverageManageToggleEnabled) obj).enabled;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "OverdraftCoverage Manage ToggleEnabled";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.enabled.hashCode();
    }

    public final String toString() {
        return "OverdraftCoverageManageToggleEnabled(enabled=" + this.enabled + ")";
    }
}
