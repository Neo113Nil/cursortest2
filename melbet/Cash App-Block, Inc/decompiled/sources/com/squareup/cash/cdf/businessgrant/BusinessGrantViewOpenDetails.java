package com.squareup.cash.cdf.businessgrant;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BusinessGrantViewOpenDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String grant_id;
    public final LinkedHashMap parameters;

    public BusinessGrantViewOpenDetails(String str) {
        this.grant_id = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BusinessGrant", "cdf_action", "View");
        Countries.putSafe(m, "grant_id", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BusinessGrantViewOpenDetails) && this.grant_id.equals(((BusinessGrantViewOpenDetails) obj).grant_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BusinessGrant View OpenDetails";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.grant_id.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BusinessGrantViewOpenDetails(grant_id=", this.grant_id, ")");
    }
}
