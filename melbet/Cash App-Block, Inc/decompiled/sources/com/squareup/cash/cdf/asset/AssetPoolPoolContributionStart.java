package com.squareup.cash.cdf.asset;

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
public final class AssetPoolPoolContributionStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Double contribution_total;
    public final String flow_token;
    public final Double goal_amount;
    public final PoolViewerType member_type;
    public final LinkedHashMap parameters;
    public final String pool_token;

    public AssetPoolPoolContributionStart(PoolViewerType poolViewerType, String str, Double d, Double d2, String str2) {
        this.member_type = poolViewerType;
        this.pool_token = str;
        this.goal_amount = d;
        this.contribution_total = d2;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "member_type", poolViewerType);
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
        if (!(obj instanceof AssetPoolPoolContributionStart)) {
            return false;
        }
        AssetPoolPoolContributionStart assetPoolPoolContributionStart = (AssetPoolPoolContributionStart) obj;
        return this.member_type == assetPoolPoolContributionStart.member_type && Intrinsics.areEqual(this.pool_token, assetPoolPoolContributionStart.pool_token) && this.goal_amount.equals(assetPoolPoolContributionStart.goal_amount) && this.contribution_total.equals(assetPoolPoolContributionStart.contribution_total) && Intrinsics.areEqual(this.flow_token, assetPoolPoolContributionStart.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool PoolContributionStart";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.member_type.hashCode() * 31;
        String str = this.pool_token;
        int hashCode2 = (this.contribution_total.hashCode() + ((this.goal_amount.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.flow_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetPoolPoolContributionStart(customer_token=null, member_type=");
        sb.append(this.member_type);
        sb.append(", pool_token=");
        sb.append(this.pool_token);
        sb.append(", goal_amount=");
        sb.append(this.goal_amount);
        sb.append(", contribution_total=");
        sb.append(this.contribution_total);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
