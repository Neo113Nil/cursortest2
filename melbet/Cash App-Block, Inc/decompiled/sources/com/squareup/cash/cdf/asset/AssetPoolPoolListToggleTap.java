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
public final class AssetPoolPoolListToggleTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String tab;

    public AssetPoolPoolListToggleTap(String str, String str2) {
        this.flow_token = str;
        this.tab = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "tab", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolPoolListToggleTap)) {
            return false;
        }
        AssetPoolPoolListToggleTap assetPoolPoolListToggleTap = (AssetPoolPoolListToggleTap) obj;
        return Intrinsics.areEqual(this.flow_token, assetPoolPoolListToggleTap.flow_token) && this.tab.equals(assetPoolPoolListToggleTap.tab);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool PoolListToggleTap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.tab.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AssetPoolPoolListToggleTap(flow_token=", this.flow_token, ", tab=", this.tab, ")");
    }
}
