package com.squareup.cash.cdf.asset;

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
public final class AssetPoolLeavePoolStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Double contribution_total;
    public final String flow_token;
    public final Double goal_amount;
    public final LinkedHashMap parameters;
    public final String pool_token;

    public AssetPoolLeavePoolStart(Double d, Double d2, String str, String str2) {
        this.pool_token = str;
        this.goal_amount = d;
        this.contribution_total = d2;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "pool_token", str);
        Countries.putSafe(m, "goal_amount", d);
        Countries.putSafe(m, "contribution_total", d2);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolLeavePoolStart)) {
            return false;
        }
        AssetPoolLeavePoolStart assetPoolLeavePoolStart = (AssetPoolLeavePoolStart) obj;
        return Intrinsics.areEqual(this.pool_token, assetPoolLeavePoolStart.pool_token) && this.goal_amount.equals(assetPoolLeavePoolStart.goal_amount) && this.contribution_total.equals(assetPoolLeavePoolStart.contribution_total) && Intrinsics.areEqual(this.flow_token, assetPoolLeavePoolStart.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool LeavePoolStart";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.pool_token;
        int hashCode = (this.contribution_total.hashCode() + ((this.goal_amount.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.flow_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AssetPoolLeavePoolStart(customer_token=null, pool_token=" + this.pool_token + ", goal_amount=" + this.goal_amount + ", contribution_total=" + this.contribution_total + ", flow_token=" + this.flow_token + ")";
    }
}
