package com.squareup.cash.cdf.activityrecord;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.TransactionType;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActivityRecordViewOpenLink implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String activity_flow_token;
    public final String activity_item_type;
    public final String button_text;
    public final String counterparty_token;
    public final String entity_id;
    public final Boolean is_outstanding;
    public final LinkType link_type;
    public final LinkedHashMap parameters;
    public final String query_token;
    public final String search_flow_token;
    public final TransactionType transaction_type;

    public ActivityRecordViewOpenLink(TransactionType transactionType, LinkType linkType, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        Boolean bool2 = Boolean.FALSE;
        this.transaction_type = transactionType;
        this.link_type = linkType;
        this.button_text = str;
        this.activity_flow_token = str2;
        this.search_flow_token = str3;
        this.query_token = str4;
        this.entity_id = str5;
        this.activity_item_type = str6;
        this.counterparty_token = str7;
        this.is_outstanding = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "ActivityRecord", "cdf_action", "View");
        Countries.putSafe(m, "transaction_type", transactionType);
        Countries.putSafe(m, "is_treehouse", bool2);
        Countries.putSafe(m, "link_type", linkType);
        Countries.putSafe(m, "button_text", str);
        Countries.putSafe(m, "activity_flow_token", str2);
        Countries.putSafe(m, "search_flow_token", str3);
        Countries.putSafe(m, "query_token", str4);
        Countries.putSafe(m, "entity_id", str5);
        Countries.putSafe(m, "activity_item_type", str6);
        Countries.putSafe(m, "counterparty_token", str7);
        Countries.putSafe(m, "is_outstanding", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecordViewOpenLink)) {
            return false;
        }
        ActivityRecordViewOpenLink activityRecordViewOpenLink = (ActivityRecordViewOpenLink) obj;
        if (this.transaction_type != activityRecordViewOpenLink.transaction_type) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && this.link_type == activityRecordViewOpenLink.link_type && Intrinsics.areEqual(this.button_text, activityRecordViewOpenLink.button_text) && Intrinsics.areEqual(this.activity_flow_token, activityRecordViewOpenLink.activity_flow_token) && Intrinsics.areEqual(this.search_flow_token, activityRecordViewOpenLink.search_flow_token) && Intrinsics.areEqual(this.query_token, activityRecordViewOpenLink.query_token) && this.entity_id.equals(activityRecordViewOpenLink.entity_id) && Intrinsics.areEqual(this.activity_item_type, activityRecordViewOpenLink.activity_item_type) && Intrinsics.areEqual(this.counterparty_token, activityRecordViewOpenLink.counterparty_token) && this.is_outstanding.equals(activityRecordViewOpenLink.is_outstanding);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityRecord View OpenLink";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        TransactionType transactionType = this.transaction_type;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(Boolean.FALSE, (transactionType == null ? 0 : transactionType.hashCode()) * 31, 31);
        LinkType linkType = this.link_type;
        int hashCode = (m + (linkType == null ? 0 : linkType.hashCode())) * 31;
        String str = this.button_text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activity_flow_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.search_flow_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.query_token;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.entity_id);
        String str5 = this.activity_item_type;
        int hashCode5 = (m2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.counterparty_token;
        return this.is_outstanding.hashCode() + ((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("ActivityRecordViewOpenLink(transaction_type=");
        sb.append(this.transaction_type);
        sb.append(", is_treehouse=");
        sb.append(bool);
        sb.append(", link_type=");
        sb.append(this.link_type);
        sb.append(", button_text=");
        sb.append(this.button_text);
        sb.append(", activity_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.activity_flow_token, ", search_flow_token=", this.search_flow_token, ", query_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.query_token, ", entity_id=", this.entity_id, ", activity_item_type=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.activity_item_type, ", counterparty_token=", this.counterparty_token, ", is_outstanding=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_outstanding, ")");
    }
}
