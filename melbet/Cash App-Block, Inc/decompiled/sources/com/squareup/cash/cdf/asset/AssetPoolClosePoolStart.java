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
public final class AssetPoolClosePoolStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Double current_amount;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String pool_token;

    public AssetPoolClosePoolStart(Double d, String str, String str2) {
        this.flow_token = str;
        this.pool_token = str2;
        this.current_amount = d;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "pool_token", str2);
        Countries.putSafe(m, "current_amount", d);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolClosePoolStart)) {
            return false;
        }
        AssetPoolClosePoolStart assetPoolClosePoolStart = (AssetPoolClosePoolStart) obj;
        return Intrinsics.areEqual(this.flow_token, assetPoolClosePoolStart.flow_token) && Intrinsics.areEqual(this.pool_token, assetPoolClosePoolStart.pool_token) && this.current_amount.equals(assetPoolClosePoolStart.current_amount);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool ClosePoolStart";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pool_token;
        return this.current_amount.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetPoolClosePoolStart(flow_token=", this.flow_token, ", pool_token=", this.pool_token, ", current_amount=");
        m.append(this.current_amount);
        m.append(")");
        return m.toString();
    }
}
