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
public final class AssetPoolViewMemberList implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final PoolViewerType viewer_type;

    public AssetPoolViewMemberList(String str, PoolViewerType poolViewerType) {
        this.flow_token = str;
        this.viewer_type = poolViewerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "viewer_type", poolViewerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolViewMemberList)) {
            return false;
        }
        AssetPoolViewMemberList assetPoolViewMemberList = (AssetPoolViewMemberList) obj;
        return Intrinsics.areEqual(this.flow_token, assetPoolViewMemberList.flow_token) && this.viewer_type == assetPoolViewMemberList.viewer_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool ViewMemberList";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.viewer_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AssetPoolViewMemberList(flow_token=" + this.flow_token + ", viewer_type=" + this.viewer_type + ")";
    }
}
