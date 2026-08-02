package com.squareup.cash.cdf.activityrecord;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.PaymentOrientation;
import com.squareup.cash.cdf.PaymentRole;
import com.squareup.cash.cdf.PaymentState;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ActivityRecordViewOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
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
    public final String search_flow_token;

    public ActivityRecordViewOpen(String str, Boolean bool, Boolean bool2, ActivityItemOrigin activityItemOrigin, PaymentRole paymentRole, PaymentOrientation paymentOrientation, PaymentState paymentState, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        Boolean bool3 = Boolean.FALSE;
        ActivityItemOrigin activityItemOrigin2 = (i & 8) != 0 ? null : activityItemOrigin;
        String str8 = (i & 512) != 0 ? null : str2;
        String str9 = (i & 1024) != 0 ? null : str3;
        String str10 = (i & 2048) != 0 ? null : str4;
        String str11 = (i & PKIFailureInfo.transactionIdInUse) == 0 ? str7 : null;
        this.entity_id = str;
        this.is_badged = bool;
        this.is_outstanding = bool2;
        this.origin = activityItemOrigin2;
        this.payment_role = paymentRole;
        this.payment_orientation = paymentOrientation;
        this.payment_state = paymentState;
        this.activity_flow_token = str8;
        this.search_flow_token = str9;
        this.query_token = str10;
        this.counterparty_token = str5;
        this.activity_item_type = str6;
        this.activity_product_classifiers = str11;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 21, "ActivityRecord", "cdf_action", "View");
        Countries.putSafe(m, "entity_id", str);
        Countries.putSafe(m, "is_badged", bool);
        Countries.putSafe(m, "is_outstanding", bool2);
        Countries.putSafe(m, "origin", activityItemOrigin2);
        Countries.putSafe(m, "payment_role", paymentRole);
        Countries.putSafe(m, "payment_orientation", paymentOrientation);
        Countries.putSafe(m, "payment_state", paymentState);
        Countries.putSafe(m, "is_treehouse", bool3);
        Countries.putSafe(m, "activity_flow_token", str8);
        Countries.putSafe(m, "search_flow_token", str9);
        Countries.putSafe(m, "query_token", str10);
        Countries.putSafe(m, "counterparty_token", str5);
        Countries.putSafe(m, "activity_item_type", str6);
        Countries.putSafe(m, "activity_product_classifiers", str11);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecordViewOpen)) {
            return false;
        }
        ActivityRecordViewOpen activityRecordViewOpen = (ActivityRecordViewOpen) obj;
        if (!this.entity_id.equals(activityRecordViewOpen.entity_id) || !this.is_badged.equals(activityRecordViewOpen.is_badged) || !this.is_outstanding.equals(activityRecordViewOpen.is_outstanding) || this.origin != activityRecordViewOpen.origin || this.payment_role != activityRecordViewOpen.payment_role || this.payment_orientation != activityRecordViewOpen.payment_orientation || this.payment_state != activityRecordViewOpen.payment_state) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && Intrinsics.areEqual(this.activity_flow_token, activityRecordViewOpen.activity_flow_token) && Intrinsics.areEqual(this.search_flow_token, activityRecordViewOpen.search_flow_token) && Intrinsics.areEqual(this.query_token, activityRecordViewOpen.query_token) && Intrinsics.areEqual(this.counterparty_token, activityRecordViewOpen.counterparty_token) && Intrinsics.areEqual(this.activity_item_type, activityRecordViewOpen.activity_item_type) && Intrinsics.areEqual(this.activity_product_classifiers, activityRecordViewOpen.activity_product_classifiers);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityRecord View Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_outstanding, ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_badged, this.entity_id.hashCode() * 31, 31), 31);
        ActivityItemOrigin activityItemOrigin = this.origin;
        int hashCode = (m + (activityItemOrigin == null ? 0 : activityItemOrigin.hashCode())) * 31;
        PaymentRole paymentRole = this.payment_role;
        int hashCode2 = (hashCode + (paymentRole == null ? 0 : paymentRole.hashCode())) * 31;
        PaymentOrientation paymentOrientation = this.payment_orientation;
        int hashCode3 = (hashCode2 + (paymentOrientation == null ? 0 : paymentOrientation.hashCode())) * 31;
        PaymentState paymentState = this.payment_state;
        int m2 = ViewEvent$State$EnumUnboxingLocalUtility.m(Boolean.FALSE, (hashCode3 + (paymentState == null ? 0 : paymentState.hashCode())) * 961, 31);
        String str = this.activity_flow_token;
        int hashCode4 = (m2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.search_flow_token;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.query_token;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.counterparty_token;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.activity_item_type;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 28629151;
        String str6 = this.activity_product_classifiers;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.is_badged, "ActivityRecordViewOpen(entity_id=", this.entity_id, ", is_badged=", ", is_outstanding=");
        m.append(this.is_outstanding);
        m.append(", origin=");
        m.append(this.origin);
        m.append(", payment_role=");
        m.append(this.payment_role);
        m.append(", payment_orientation=");
        m.append(this.payment_orientation);
        m.append(", payment_state=");
        m.append(this.payment_state);
        m.append(", transaction_type=null, is_treehouse=");
        m.append(bool);
        m.append(", activity_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.activity_flow_token, ", search_flow_token=", this.search_flow_token, ", query_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.query_token, ", counterparty_token=", this.counterparty_token, ", activity_item_type=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.activity_item_type, ", primary_button_text=null, primary_button_action=null, secondary_button_text=null, secondary_button_action=null, activity_product_classifiers=", this.activity_product_classifiers, ")");
    }
}
