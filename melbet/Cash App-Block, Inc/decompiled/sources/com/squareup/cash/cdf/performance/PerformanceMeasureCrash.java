package com.squareup.cash.cdf.performance;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PerformanceMeasureCrash implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.KAFKA, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String crash_uuid;
    public final String error_message;
    public final String error_name;
    public final LinkedHashMap parameters;
    public final String source_class_name;
    public final String source_method_name;

    public PerformanceMeasureCrash(String str, String str2, String str3, String str4, String str5) {
        this.crash_uuid = str;
        this.error_message = str2;
        this.error_name = str3;
        this.source_class_name = str4;
        this.source_method_name = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Performance", "cdf_action", "Measure");
        Countries.putSafe(m, "crash_uuid", str);
        Countries.putSafe(m, "error_message", str2);
        Countries.putSafe(m, "error_name", str3);
        Countries.putSafe(m, "source_class_name", str4);
        Countries.putSafe(m, "source_method_name", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceMeasureCrash)) {
            return false;
        }
        PerformanceMeasureCrash performanceMeasureCrash = (PerformanceMeasureCrash) obj;
        return Intrinsics.areEqual(this.crash_uuid, performanceMeasureCrash.crash_uuid) && Intrinsics.areEqual(this.error_message, performanceMeasureCrash.error_message) && this.error_name.equals(performanceMeasureCrash.error_name) && Intrinsics.areEqual(this.source_class_name, performanceMeasureCrash.source_class_name) && Intrinsics.areEqual(this.source_method_name, performanceMeasureCrash.source_method_name);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Performance Measure Crash";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.crash_uuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.error_message;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.error_name);
        String str3 = this.source_class_name;
        int hashCode2 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source_method_name;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PerformanceMeasureCrash(crash_uuid=", this.crash_uuid, ", error_message=", this.error_message, ", error_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.error_name, ", source_class_name=", this.source_class_name, ", source_method_name=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.source_method_name, ")");
    }
}
