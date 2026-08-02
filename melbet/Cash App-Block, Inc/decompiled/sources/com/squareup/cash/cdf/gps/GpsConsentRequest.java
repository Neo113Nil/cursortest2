package com.squareup.cash.cdf.gps;

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
public final class GpsConsentRequest implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.KAFKA, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final GpsConsentStatus consent_status;
    public final String event_token;
    public final GpsEventTrigger event_trigger;
    public final LinkedHashMap parameters;
    public final boolean precise_enabled;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class GpsConsentStatus {
        public static final /* synthetic */ GpsConsentStatus[] $VALUES;
        public static final GpsConsentStatus ALWAYS;
        public static final GpsConsentStatus DENIED;
        public static final GpsConsentStatus WHILE_USING_APP;

        /* JADX INFO: Fake field, exist only in values array */
        GpsConsentStatus EF0;

        static {
            GpsConsentStatus gpsConsentStatus = new GpsConsentStatus("ALLOW_ONCE", 0);
            GpsConsentStatus gpsConsentStatus2 = new GpsConsentStatus("WHILE_USING_APP", 1);
            WHILE_USING_APP = gpsConsentStatus2;
            GpsConsentStatus gpsConsentStatus3 = new GpsConsentStatus("ALWAYS", 2);
            ALWAYS = gpsConsentStatus3;
            GpsConsentStatus gpsConsentStatus4 = new GpsConsentStatus("DENIED", 3);
            DENIED = gpsConsentStatus4;
            $VALUES = new GpsConsentStatus[]{gpsConsentStatus, gpsConsentStatus2, gpsConsentStatus3, gpsConsentStatus4, new GpsConsentStatus("UNSPECIFIED", 4)};
        }

        public static GpsConsentStatus valueOf(String str) {
            return (GpsConsentStatus) Enum.valueOf(GpsConsentStatus.class, str);
        }

        public static GpsConsentStatus[] values() {
            return (GpsConsentStatus[]) $VALUES.clone();
        }
    }

    public GpsConsentRequest(GpsConsentStatus gpsConsentStatus, boolean z, GpsEventTrigger gpsEventTrigger, String str) {
        this.consent_status = gpsConsentStatus;
        this.precise_enabled = z;
        this.event_trigger = gpsEventTrigger;
        this.event_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Gps", "cdf_action", "Consent");
        Countries.putSafe(m, "consent_status", gpsConsentStatus);
        Countries.putSafe(m, "precise_enabled", Boolean.valueOf(z));
        Countries.putSafe(m, "event_trigger", gpsEventTrigger);
        Countries.putSafe(m, "event_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsConsentRequest)) {
            return false;
        }
        GpsConsentRequest gpsConsentRequest = (GpsConsentRequest) obj;
        return this.consent_status == gpsConsentRequest.consent_status && this.precise_enabled == gpsConsentRequest.precise_enabled && this.event_trigger == gpsConsentRequest.event_trigger && Intrinsics.areEqual(this.event_token, gpsConsentRequest.event_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Gps Consent Request";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.consent_status.hashCode() * 31, 31, this.precise_enabled);
        GpsEventTrigger gpsEventTrigger = this.event_trigger;
        int hashCode = (m + (gpsEventTrigger == null ? 0 : gpsEventTrigger.hashCode())) * 31;
        String str = this.event_token;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "GpsConsentRequest(consent_status=" + this.consent_status + ", precise_enabled=" + this.precise_enabled + ", event_trigger=" + this.event_trigger + ", event_token=" + this.event_token + ")";
    }
}
