package com.squareup.cash.cdf.activityrecord;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.PaymentRole;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActivityRecordViewComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String activity_flow_token;
    public final String activity_item_type;
    public final String counterparty_token;
    public final String entity_id;
    public final String entity_prefix;
    public final Boolean is_badged;
    public final Boolean is_outstanding;
    public final LinkedHashMap parameters;
    public final PaymentRole payment_role;
    public final String query_token;
    public final String search_flow_token;

    public ActivityRecordViewComplete(String str, String str2, Boolean bool, Boolean bool2, PaymentRole paymentRole, String str3, String str4, String str5, String str6, String str7) {
        this.entity_id = str;
        this.entity_prefix = str2;
        this.is_badged = bool;
        this.is_outstanding = bool2;
        this.payment_role = paymentRole;
        this.activity_flow_token = str3;
        this.search_flow_token = str4;
        this.query_token = str5;
        this.activity_item_type = str6;
        this.counterparty_token = str7;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "ActivityRecord", "cdf_action", "View");
        Countries.putSafe(m, "entity_id", str);
        Countries.putSafe(m, "entity_prefix", str2);
        Countries.putSafe(m, "is_badged", bool);
        Countries.putSafe(m, "is_outstanding", bool2);
        Countries.putSafe(m, "payment_role", paymentRole);
        Countries.putSafe(m, "activity_flow_token", str3);
        Countries.putSafe(m, "search_flow_token", str4);
        Countries.putSafe(m, "query_token", str5);
        Countries.putSafe(m, "activity_item_type", str6);
        Countries.putSafe(m, "counterparty_token", str7);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecordViewComplete)) {
            return false;
        }
        ActivityRecordViewComplete activityRecordViewComplete = (ActivityRecordViewComplete) obj;
        return this.entity_id.equals(activityRecordViewComplete.entity_id) && Intrinsics.areEqual(this.entity_prefix, activityRecordViewComplete.entity_prefix) && this.is_badged.equals(activityRecordViewComplete.is_badged) && this.is_outstanding.equals(activityRecordViewComplete.is_outstanding) && this.payment_role == activityRecordViewComplete.payment_role && Intrinsics.areEqual(this.activity_flow_token, activityRecordViewComplete.activity_flow_token) && Intrinsics.areEqual(this.search_flow_token, activityRecordViewComplete.search_flow_token) && Intrinsics.areEqual(this.query_token, activityRecordViewComplete.query_token) && Intrinsics.areEqual(this.activity_item_type, activityRecordViewComplete.activity_item_type) && Intrinsics.areEqual(this.counterparty_token, activityRecordViewComplete.counterparty_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityRecord View Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.entity_id.hashCode() * 31;
        String str = this.entity_prefix;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_outstanding, ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_badged, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        PaymentRole paymentRole = this.payment_role;
        int hashCode2 = (m + (paymentRole == null ? 0 : paymentRole.hashCode())) * 31;
        String str2 = this.activity_flow_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.search_flow_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.query_token;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.activity_item_type;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.counterparty_token;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivityRecordViewComplete(entity_id=", this.entity_id, ", entity_prefix=", this.entity_prefix, ", is_badged=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.is_badged, ", is_outstanding=", this.is_outstanding, ", payment_role=");
        m.append(this.payment_role);
        m.append(", activity_flow_token=");
        m.append(this.activity_flow_token);
        m.append(", search_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.search_flow_token, ", query_token=", this.query_token, ", activity_item_type=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.activity_item_type, ", counterparty_token=", this.counterparty_token, ")");
    }
}
