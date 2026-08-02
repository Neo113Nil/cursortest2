package com.squareup.cash.cdf.activityhistory;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.QABItemOrigin;
import com.squareup.cash.cdf.QABItemType;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActivityHistorySelectQABItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String activity_flow_token;
    public final String counterparty_token;
    public final Boolean is_treehouse;
    public final QABItemType item_type;
    public final QABItemOrigin origin;
    public final LinkedHashMap parameters;

    public ActivityHistorySelectQABItem(QABItemType qABItemType, QABItemOrigin qABItemOrigin, Boolean bool, String str, String str2) {
        this.item_type = qABItemType;
        this.origin = qABItemOrigin;
        this.is_treehouse = bool;
        this.activity_flow_token = str;
        this.counterparty_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "ActivityHistory", "cdf_action", "Select");
        Countries.putSafe(m, "item_type", qABItemType);
        Countries.putSafe(m, "origin", qABItemOrigin);
        Countries.putSafe(m, "is_treehouse", bool);
        Countries.putSafe(m, "activity_flow_token", str);
        Countries.putSafe(m, "counterparty_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHistorySelectQABItem)) {
            return false;
        }
        ActivityHistorySelectQABItem activityHistorySelectQABItem = (ActivityHistorySelectQABItem) obj;
        return this.item_type == activityHistorySelectQABItem.item_type && this.origin == activityHistorySelectQABItem.origin && Intrinsics.areEqual(this.is_treehouse, activityHistorySelectQABItem.is_treehouse) && Intrinsics.areEqual(this.activity_flow_token, activityHistorySelectQABItem.activity_flow_token) && Intrinsics.areEqual(this.counterparty_token, activityHistorySelectQABItem.counterparty_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityHistory Select QABItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.item_type.hashCode() * 31;
        QABItemOrigin qABItemOrigin = this.origin;
        int hashCode2 = (hashCode + (qABItemOrigin == null ? 0 : qABItemOrigin.hashCode())) * 31;
        Boolean bool = this.is_treehouse;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.activity_flow_token;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.counterparty_token;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityHistorySelectQABItem(item_type=");
        sb.append(this.item_type);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", is_treehouse=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_treehouse, ", activity_flow_token=", this.activity_flow_token, ", counterparty_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.counterparty_token, ")");
    }
}
