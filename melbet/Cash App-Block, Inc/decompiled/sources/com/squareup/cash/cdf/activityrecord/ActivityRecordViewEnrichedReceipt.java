package com.squareup.cash.cdf.activityrecord;

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
public final class ActivityRecordViewEnrichedReceipt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String activity_flow_token;
    public final String activity_item_type;
    public final String entity_id;
    public final LinkedHashMap parameters;
    public final String query_token;
    public final String search_flow_token;

    public ActivityRecordViewEnrichedReceipt(String str, String str2, String str3, String str4, String str5) {
        Boolean bool = Boolean.TRUE;
        this.entity_id = str;
        this.activity_item_type = str2;
        this.activity_flow_token = str3;
        this.search_flow_token = str4;
        this.query_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "ActivityRecord", "cdf_action", "View");
        Countries.putSafe(m, "entity_id", str);
        Countries.putSafe(m, "activity_item_type", str2);
        Countries.putSafe(m, "activity_flow_token", str3);
        Countries.putSafe(m, "search_flow_token", str4);
        Countries.putSafe(m, "query_token", str5);
        Countries.putSafe(m, "is_native", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecordViewEnrichedReceipt)) {
            return false;
        }
        ActivityRecordViewEnrichedReceipt activityRecordViewEnrichedReceipt = (ActivityRecordViewEnrichedReceipt) obj;
        if (!this.entity_id.equals(activityRecordViewEnrichedReceipt.entity_id) || !Intrinsics.areEqual(this.activity_item_type, activityRecordViewEnrichedReceipt.activity_item_type) || !Intrinsics.areEqual(this.activity_flow_token, activityRecordViewEnrichedReceipt.activity_flow_token) || !Intrinsics.areEqual(this.search_flow_token, activityRecordViewEnrichedReceipt.search_flow_token) || !Intrinsics.areEqual(this.query_token, activityRecordViewEnrichedReceipt.query_token)) {
            return false;
        }
        Object obj2 = Boolean.TRUE;
        return obj2.equals(obj2);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityRecord View EnrichedReceipt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.entity_id.hashCode() * 31;
        String str = this.activity_item_type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activity_flow_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.search_flow_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.query_token;
        return Boolean.TRUE.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Boolean bool = Boolean.TRUE;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivityRecordViewEnrichedReceipt(entity_id=", this.entity_id, ", activity_item_type=", this.activity_item_type, ", activity_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.activity_flow_token, ", search_flow_token=", this.search_flow_token, ", query_token=");
        m.append(this.query_token);
        m.append(", is_native=");
        m.append(bool);
        m.append(")");
        return m.toString();
    }
}
