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
public final class AssetRequestChangeOrientation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final LinkedHashMap parameters;

    public AssetRequestChangeOrientation(String str) {
        this.external_id = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "external_id", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AssetRequestChangeOrientation) && Intrinsics.areEqual(this.external_id, ((AssetRequestChangeOrientation) obj).external_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request ChangeOrientation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetRequestChangeOrientation(external_id=", this.external_id, ", profile_directory_flow_token=null)");
    }
}
