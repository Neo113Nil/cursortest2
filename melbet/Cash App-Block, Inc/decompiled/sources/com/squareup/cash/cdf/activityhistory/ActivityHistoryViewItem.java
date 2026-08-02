package com.squareup.cash.cdf.activityhistory;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.PaymentOrientation;
import com.squareup.cash.cdf.PaymentRole;
import com.squareup.cash.cdf.PaymentState;
import com.squareup.cash.cdf.RetroEligibilityStatus;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActivityHistoryViewItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String activity_flow_token;
    public final String activity_item_type;
    public final String activity_product_classifiers;
    public final String counterparty_token;
    public final String entity_id;
    public final Boolean is_badged;
    public final Boolean is_outstanding;
    public final ActivityItemOrigin origin;
    public final LinkedHashMap parameters;
    public final PaymentOrientation payment_orientation;
    public final PaymentRole payment_role;
    public final PaymentState payment_state;
    public final String query_token;
    public final RetroEligibilityStatus retro_eligibility_status;
    public final Integer row_index;
    public final String search_flow_token;

    public ActivityHistoryViewItem(String str, Boolean bool, Boolean bool2, PaymentRole paymentRole, PaymentOrientation paymentOrientation, PaymentState paymentState, ActivityItemOrigin activityItemOrigin, String str2, String str3, String str4, String str5, String str6, Integer num, RetroEligibilityStatus retroEligibilityStatus, String str7) {
        Boolean bool3 = Boolean.FALSE;
        this.entity_id = str;
        this.is_outstanding = bool;
        this.is_badged = bool2;
        this.payment_role = paymentRole;
        this.payment_orientation = paymentOrientation;
        this.payment_state = paymentState;
        this.origin = activityItemOrigin;
        this.activity_flow_token = str2;
        this.search_flow_token = str3;
        this.query_token = str4;
        this.activity_item_type = str5;
        this.counterparty_token = str6;
        this.row_index = num;
        this.retro_eligibility_status = retroEligibilityStatus;
        this.activity_product_classifiers = str7;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 19, "ActivityHistory", "cdf_action", "View");
        Countries.putSafe(m, "entity_id", str);
        Countries.putSafe(m, "is_outstanding", bool);
        Countries.putSafe(m, "is_badged", bool2);
        Countries.putSafe(m, "payment_role", paymentRole);
        Countries.putSafe(m, "payment_orientation", paymentOrientation);
        Countries.putSafe(m, "payment_state", paymentState);
        Countries.putSafe(m, "origin", activityItemOrigin);
        Countries.putSafe(m, "is_treehouse", bool3);
        Countries.putSafe(m, "activity_flow_token", str2);
        Countries.putSafe(m, "search_flow_token", str3);
        Countries.putSafe(m, "query_token", str4);
        Countries.putSafe(m, "activity_item_type", str5);
        Countries.putSafe(m, "counterparty_token", str6);
        Countries.putSafe(m, "row_index", num);
        Countries.putSafe(m, "is_recurring", bool3);
        Countries.putSafe(m, "retro_eligibility_status", retroEligibilityStatus);
        Countries.putSafe(m, "activity_product_classifiers", str7);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHistoryViewItem)) {
            return false;
        }
        ActivityHistoryViewItem activityHistoryViewItem = (ActivityHistoryViewItem) obj;
        if (!Intrinsics.areEqual(this.entity_id, activityHistoryViewItem.entity_id) || !this.is_outstanding.equals(activityHistoryViewItem.is_outstanding) || !this.is_badged.equals(activityHistoryViewItem.is_badged) || this.payment_role != activityHistoryViewItem.payment_role || this.payment_orientation != activityHistoryViewItem.payment_orientation || this.payment_state != activityHistoryViewItem.payment_state || this.origin != activityHistoryViewItem.origin) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && Intrinsics.areEqual(this.activity_flow_token, activityHistoryViewItem.activity_flow_token) && Intrinsics.areEqual(this.search_flow_token, activityHistoryViewItem.search_flow_token) && Intrinsics.areEqual(this.query_token, activityHistoryViewItem.query_token) && Intrinsics.areEqual(this.activity_item_type, activityHistoryViewItem.activity_item_type) && Intrinsics.areEqual(this.counterparty_token, activityHistoryViewItem.counterparty_token) && this.row_index.equals(activityHistoryViewItem.row_index) && obj2.equals(obj2) && this.retro_eligibility_status == activityHistoryViewItem.retro_eligibility_status && Intrinsics.areEqual(this.activity_product_classifiers, activityHistoryViewItem.activity_product_classifiers);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityHistory View Item";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.entity_id;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_badged, ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_outstanding, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        PaymentRole paymentRole = this.payment_role;
        int hashCode = (m + (paymentRole == null ? 0 : paymentRole.hashCode())) * 31;
        PaymentOrientation paymentOrientation = this.payment_orientation;
        int hashCode2 = (hashCode + (paymentOrientation == null ? 0 : paymentOrientation.hashCode())) * 31;
        PaymentState paymentState = this.payment_state;
        int hashCode3 = (hashCode2 + (paymentState == null ? 0 : paymentState.hashCode())) * 31;
        ActivityItemOrigin activityItemOrigin = this.origin;
        int hashCode4 = (hashCode3 + (activityItemOrigin == null ? 0 : activityItemOrigin.hashCode())) * 31;
        Boolean bool = Boolean.FALSE;
        int m2 = ViewEvent$State$EnumUnboxingLocalUtility.m(bool, hashCode4, 31);
        String str2 = this.activity_flow_token;
        int hashCode5 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.search_flow_token;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.query_token;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.activity_item_type;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.counterparty_token;
        int m3 = ViewEvent$State$EnumUnboxingLocalUtility.m(bool, CameraState$Type$EnumUnboxingLocalUtility.m((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.row_index), 31);
        RetroEligibilityStatus retroEligibilityStatus = this.retro_eligibility_status;
        int hashCode9 = (m3 + (retroEligibilityStatus == null ? 0 : retroEligibilityStatus.hashCode())) * 31;
        String str7 = this.activity_product_classifiers;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.is_outstanding, "ActivityHistoryViewItem(entity_id=", this.entity_id, ", is_outstanding=", ", is_badged=");
        m.append(this.is_badged);
        m.append(", payment_role=");
        m.append(this.payment_role);
        m.append(", payment_orientation=");
        m.append(this.payment_orientation);
        m.append(", payment_state=");
        m.append(this.payment_state);
        m.append(", origin=");
        m.append(this.origin);
        m.append(", is_treehouse=");
        m.append(bool);
        m.append(", activity_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.activity_flow_token, ", search_flow_token=", this.search_flow_token, ", query_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.query_token, ", activity_item_type=", this.activity_item_type, ", counterparty_token=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.counterparty_token, ", row_index=", this.row_index, ", is_recurring=");
        m.append(bool);
        m.append(", retro_eligibility_status=");
        m.append(this.retro_eligibility_status);
        m.append(", activity_product_classifiers=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.activity_product_classifiers, ")");
    }
}
