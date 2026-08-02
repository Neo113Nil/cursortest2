package com.squareup.cash.cdf.asset;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class AssetPoolPoolHomeViewError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String pool_token;

    public AssetPoolPoolHomeViewError(String str, String str2) {
        this.flow_token = str;
        this.pool_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "pool_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolPoolHomeViewError)) {
            return false;
        }
        AssetPoolPoolHomeViewError assetPoolPoolHomeViewError = (AssetPoolPoolHomeViewError) obj;
        return Intrinsics.areEqual(this.flow_token, assetPoolPoolHomeViewError.flow_token) && Intrinsics.areEqual(this.pool_token, assetPoolPoolHomeViewError.pool_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool PoolHomeViewError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pool_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AssetPoolPoolHomeViewError(member_type=null, flow_token=", this.flow_token, ", pool_token=", this.pool_token, ")");
    }
}
