package com.squareup.cash.cdf.recipient;

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
public final class RecipientSearchLatencyMeasurement implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final LinkedHashMap parameters;
    public final String query_token;
    public final Long search_start_timestamp;
    public final Long search_stop_timestamp;
    public final Integer search_text_length;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Origin {
        public static final /* synthetic */ Origin[] $VALUES;
        public static final Origin AMOUNT_FIRST;

        static {
            Origin origin = new Origin("AMOUNT_FIRST", 0);
            AMOUNT_FIRST = origin;
            $VALUES = new Origin[]{origin, new Origin("DISCOVER", 1), new Origin("CUSTOMER_PROFILE_DISCOVER", 2)};
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public RecipientSearchLatencyMeasurement(String str, Integer num, String str2, Long l, Long l2) {
        Origin origin = Origin.AMOUNT_FIRST;
        this.external_id = str;
        this.search_text_length = num;
        this.query_token = str2;
        this.search_start_timestamp = l;
        this.search_stop_timestamp = l2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Recipient", "cdf_action", "Search");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "search_text_length", num);
        Countries.putSafe(m, "query_token", str2);
        Countries.putSafe(m, "search_start_timestamp", l);
        Countries.putSafe(m, "search_stop_timestamp", l2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSearchLatencyMeasurement)) {
            return false;
        }
        RecipientSearchLatencyMeasurement recipientSearchLatencyMeasurement = (RecipientSearchLatencyMeasurement) obj;
        if (!this.external_id.equals(recipientSearchLatencyMeasurement.external_id)) {
            return false;
        }
        Origin origin = Origin.AMOUNT_FIRST;
        return this.search_text_length.equals(recipientSearchLatencyMeasurement.search_text_length) && Intrinsics.areEqual(this.query_token, recipientSearchLatencyMeasurement.query_token) && Intrinsics.areEqual(this.search_start_timestamp, recipientSearchLatencyMeasurement.search_start_timestamp) && this.search_stop_timestamp.equals(recipientSearchLatencyMeasurement.search_stop_timestamp);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Recipient Search LatencyMeasurement";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((Origin.AMOUNT_FIRST.hashCode() + (this.external_id.hashCode() * 31)) * 961, 31, this.search_text_length);
        String str = this.query_token;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.search_start_timestamp;
        return this.search_stop_timestamp.hashCode() + ((hashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Origin origin = Origin.AMOUNT_FIRST;
        StringBuilder sb = new StringBuilder("RecipientSearchLatencyMeasurement(external_id=");
        sb.append(this.external_id);
        sb.append(", origin=");
        sb.append(origin);
        sb.append(", client_query_token=null, search_text_length=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.search_text_length, ", query_token=", this.query_token, ", search_start_timestamp=");
        sb.append(this.search_start_timestamp);
        sb.append(", search_stop_timestamp=");
        sb.append(this.search_stop_timestamp);
        sb.append(")");
        return sb.toString();
    }
}
