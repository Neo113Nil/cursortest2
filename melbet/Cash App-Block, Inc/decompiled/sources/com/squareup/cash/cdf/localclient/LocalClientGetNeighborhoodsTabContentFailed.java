package com.squareup.cash.cdf.localclient;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LocalClientGetNeighborhoodsTabContentFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String error_message;
    public final ErrorType error_type;
    public final LinkedHashMap parameters;

    public LocalClientGetNeighborhoodsTabContentFailed(ErrorType errorType, String str) {
        this.error_type = errorType;
        this.error_message = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "LocalClient", "cdf_action", "GetNeighborhoodsTabContent");
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "error_message", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientGetNeighborhoodsTabContentFailed)) {
            return false;
        }
        LocalClientGetNeighborhoodsTabContentFailed localClientGetNeighborhoodsTabContentFailed = (LocalClientGetNeighborhoodsTabContentFailed) obj;
        return this.error_type == localClientGetNeighborhoodsTabContentFailed.error_type && this.error_message.equals(localClientGetNeighborhoodsTabContentFailed.error_message);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient GetNeighborhoodsTabContent Failed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.error_message.hashCode() + (this.error_type.hashCode() * 31);
    }

    public final String toString() {
        return "LocalClientGetNeighborhoodsTabContentFailed(error_type=" + this.error_type + ", error_message=" + this.error_message + ")";
    }
}
