package com.squareup.cash.cdf.customersupport;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class CustomerSupportAccessViewIncidentAlerts implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Integer total_count;
    public final Trigger trigger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger HOME;
        public static final Trigger NODE;

        static {
            Trigger trigger = new Trigger("HOME", 0);
            HOME = trigger;
            Trigger trigger2 = new Trigger("NODE", 1);
            NODE = trigger2;
            $VALUES = new Trigger[]{trigger, trigger2};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public CustomerSupportAccessViewIncidentAlerts(String str, Integer num, Trigger trigger) {
        this.flow_token = str;
        this.total_count = num;
        this.trigger = trigger;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "total_count", num);
        Countries.putSafe(m, "trigger", trigger);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessViewIncidentAlerts)) {
            return false;
        }
        CustomerSupportAccessViewIncidentAlerts customerSupportAccessViewIncidentAlerts = (CustomerSupportAccessViewIncidentAlerts) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessViewIncidentAlerts.flow_token) && this.total_count.equals(customerSupportAccessViewIncidentAlerts.total_count) && this.trigger == customerSupportAccessViewIncidentAlerts.trigger;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access ViewIncidentAlerts";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.trigger.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 31, this.total_count);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.total_count, "CustomerSupportAccessViewIncidentAlerts(flow_token=", this.flow_token, ", total_count=", ", trigger=");
        m.append(this.trigger);
        m.append(")");
        return m.toString();
    }
}
