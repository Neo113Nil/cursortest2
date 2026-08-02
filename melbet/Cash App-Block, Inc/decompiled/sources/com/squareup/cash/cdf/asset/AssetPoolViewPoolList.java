package com.squareup.cash.cdf.asset;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class AssetPoolViewPoolList implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String applet_state;
    public final Integer closed_pool_count;
    public final String flow_token;
    public final Integer open_pool_count;
    public final String origin;
    public final LinkedHashMap parameters;

    public AssetPoolViewPoolList(Integer num, Integer num2, String str, String str2, String str3) {
        this.open_pool_count = num;
        this.closed_pool_count = num2;
        this.flow_token = str;
        this.origin = str2;
        this.applet_state = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "open_pool_count", num);
        Countries.putSafe(m, "closed_pool_count", num2);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "origin", str2);
        Countries.putSafe(m, "applet_state", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolViewPoolList)) {
            return false;
        }
        AssetPoolViewPoolList assetPoolViewPoolList = (AssetPoolViewPoolList) obj;
        return Intrinsics.areEqual(this.open_pool_count, assetPoolViewPoolList.open_pool_count) && Intrinsics.areEqual(this.closed_pool_count, assetPoolViewPoolList.closed_pool_count) && Intrinsics.areEqual(this.flow_token, assetPoolViewPoolList.flow_token) && Intrinsics.areEqual(this.origin, assetPoolViewPoolList.origin) && Intrinsics.areEqual(this.applet_state, assetPoolViewPoolList.applet_state);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool ViewPoolList";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.open_pool_count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.closed_pool_count;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.flow_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.origin;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applet_state;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetPoolViewPoolList(open_pool_count=");
        sb.append(this.open_pool_count);
        sb.append(", closed_pool_count=");
        sb.append(this.closed_pool_count);
        sb.append(", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.flow_token, ", origin=", this.origin, ", applet_state=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.applet_state, ")");
    }
}
