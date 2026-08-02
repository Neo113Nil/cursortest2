package com.squareup.cash.cdf.asset;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class AssetRequestViewShareOptionsScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean client_route_origination;
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AssetRequestViewShareOptionsScreen(String str, String str2, Boolean bool) {
        this.external_id = str;
        this.flow_token = str2;
        this.client_route_origination = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "client_route_origination", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRequestViewShareOptionsScreen)) {
            return false;
        }
        AssetRequestViewShareOptionsScreen assetRequestViewShareOptionsScreen = (AssetRequestViewShareOptionsScreen) obj;
        return this.external_id.equals(assetRequestViewShareOptionsScreen.external_id) && Intrinsics.areEqual(this.flow_token, assetRequestViewShareOptionsScreen.flow_token) && this.client_route_origination.equals(assetRequestViewShareOptionsScreen.client_route_origination);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request ViewShareOptionsScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.external_id.hashCode() * 31;
        String str = this.flow_token;
        return this.client_route_origination.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetRequestViewShareOptionsScreen(external_id=", this.external_id, ", flow_token=", this.flow_token, ", client_route_origination="), this.client_route_origination, ")");
    }
}
