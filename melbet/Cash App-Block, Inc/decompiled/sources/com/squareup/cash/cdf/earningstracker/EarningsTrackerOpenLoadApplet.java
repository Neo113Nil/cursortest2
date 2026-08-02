package com.squareup.cash.cdf.earningstracker;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class EarningsTrackerOpenLoadApplet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final EarningsTrackerEntrypoint entrypoint;
    public final LinkedHashMap parameters;
    public final Timeframe timeframe;
    public final Integer timeframe_month;
    public final Integer timeframe_year;
    public final Trigger trigger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger APPLET_OPEN;
        public static final Trigger ERROR_REFRESH;
        public static final Trigger FILTER_UPDATE;
        public static final Trigger MANUAL_REFRESH;

        static {
            Trigger trigger = new Trigger("APPLET_OPEN", 0);
            APPLET_OPEN = trigger;
            Trigger trigger2 = new Trigger("AUTO_REFRESH", 1);
            Trigger trigger3 = new Trigger("MANUAL_REFRESH", 2);
            MANUAL_REFRESH = trigger3;
            Trigger trigger4 = new Trigger("ERROR_REFRESH", 3);
            ERROR_REFRESH = trigger4;
            Trigger trigger5 = new Trigger("FILTER_UPDATE", 4);
            FILTER_UPDATE = trigger5;
            $VALUES = new Trigger[]{trigger, trigger2, trigger3, trigger4, trigger5};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public EarningsTrackerOpenLoadApplet(EarningsTrackerEntrypoint earningsTrackerEntrypoint, Trigger trigger, Timeframe timeframe, Integer num, Integer num2) {
        this.entrypoint = earningsTrackerEntrypoint;
        this.trigger = trigger;
        this.timeframe = timeframe;
        this.timeframe_month = num;
        this.timeframe_year = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "EarningsTracker", "cdf_action", "Open");
        Countries.putSafe(m, "entrypoint", earningsTrackerEntrypoint);
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "timeframe", timeframe);
        Countries.putSafe(m, "timeframe_month", num);
        Countries.putSafe(m, "timeframe_year", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerOpenLoadApplet)) {
            return false;
        }
        EarningsTrackerOpenLoadApplet earningsTrackerOpenLoadApplet = (EarningsTrackerOpenLoadApplet) obj;
        return this.entrypoint == earningsTrackerOpenLoadApplet.entrypoint && this.trigger == earningsTrackerOpenLoadApplet.trigger && this.timeframe == earningsTrackerOpenLoadApplet.timeframe && Intrinsics.areEqual(this.timeframe_month, earningsTrackerOpenLoadApplet.timeframe_month) && Intrinsics.areEqual(this.timeframe_year, earningsTrackerOpenLoadApplet.timeframe_year);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "EarningsTracker Open LoadApplet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        EarningsTrackerEntrypoint earningsTrackerEntrypoint = this.entrypoint;
        int hashCode = (this.trigger.hashCode() + ((earningsTrackerEntrypoint == null ? 0 : earningsTrackerEntrypoint.hashCode()) * 31)) * 31;
        Timeframe timeframe = this.timeframe;
        int hashCode2 = (hashCode + (timeframe == null ? 0 : timeframe.hashCode())) * 31;
        Integer num = this.timeframe_month;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeframe_year;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarningsTrackerOpenLoadApplet(entrypoint=");
        sb.append(this.entrypoint);
        sb.append(", trigger=");
        sb.append(this.trigger);
        sb.append(", timeframe=");
        sb.append(this.timeframe);
        sb.append(", timeframe_month=");
        sb.append(this.timeframe_month);
        sb.append(", timeframe_year=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.timeframe_year, ")");
    }
}
