package com.squareup.cash.cdf.performance;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class PerformanceMeasureLaunchDuration implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long duration_ms;
    public final AppLaunchType launch_type;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AppLaunchType {
        public static final /* synthetic */ AppLaunchType[] $VALUES;
        public static final AppLaunchType COLD;
        public static final AppLaunchType HOT;
        public static final AppLaunchType WARM;

        static {
            AppLaunchType appLaunchType = new AppLaunchType("COLD", 0);
            COLD = appLaunchType;
            AppLaunchType appLaunchType2 = new AppLaunchType("WARM", 1);
            WARM = appLaunchType2;
            AppLaunchType appLaunchType3 = new AppLaunchType("HOT", 2);
            HOT = appLaunchType3;
            $VALUES = new AppLaunchType[]{appLaunchType, appLaunchType2, appLaunchType3};
        }

        public static AppLaunchType valueOf(String str) {
            return (AppLaunchType) Enum.valueOf(AppLaunchType.class, str);
        }

        public static AppLaunchType[] values() {
            return (AppLaunchType[]) $VALUES.clone();
        }
    }

    public PerformanceMeasureLaunchDuration(Long l, AppLaunchType appLaunchType) {
        this.duration_ms = l;
        this.launch_type = appLaunchType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Performance", "cdf_action", "Measure");
        Countries.putSafe(m, "duration_ms", l);
        Countries.putSafe(m, "launch_type", appLaunchType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceMeasureLaunchDuration)) {
            return false;
        }
        PerformanceMeasureLaunchDuration performanceMeasureLaunchDuration = (PerformanceMeasureLaunchDuration) obj;
        return this.duration_ms.equals(performanceMeasureLaunchDuration.duration_ms) && this.launch_type == performanceMeasureLaunchDuration.launch_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Performance Measure LaunchDuration";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return (this.launch_type.hashCode() + (this.duration_ms.hashCode() * 31)) * 887503681;
    }

    public final String toString() {
        return "PerformanceMeasureLaunchDuration(duration_ms=" + this.duration_ms + ", launch_type=" + this.launch_type + ", ios_application_did_finish_launching_timestamp=null, ios_application_did_enter_background_timestamp=null, ios_application_will_enter_foreground_timestamp=null, ios_application_will_finish_launching_timestamp=null, ios_main_entry_timestamp=null, ios_process_age=null)";
    }
}
