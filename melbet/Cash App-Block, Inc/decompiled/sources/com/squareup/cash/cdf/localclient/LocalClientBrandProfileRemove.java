package com.squareup.cash.cdf.localclient;

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
public final class LocalClientBrandProfileRemove implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String attribution_key;
    public final String brand_token;
    public final String location_token;
    public final LinkedHashMap parameters;

    public LocalClientBrandProfileRemove(String str, String str2, String str3) {
        this.brand_token = str;
        this.location_token = str2;
        this.attribution_key = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "LocalClient", "cdf_action", "BrandProfile");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "location_token", str2);
        Countries.putSafe(m, "attribution_key", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientBrandProfileRemove)) {
            return false;
        }
        LocalClientBrandProfileRemove localClientBrandProfileRemove = (LocalClientBrandProfileRemove) obj;
        return Intrinsics.areEqual(this.brand_token, localClientBrandProfileRemove.brand_token) && Intrinsics.areEqual(this.location_token, localClientBrandProfileRemove.location_token) && Intrinsics.areEqual(this.attribution_key, localClientBrandProfileRemove.attribution_key);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient BrandProfile Remove";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.attribution_key;
        return (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientBrandProfileRemove(brand_token=", this.brand_token, ", location_token=", this.location_token, ", attribution_key="), this.attribution_key, ", invocation_method=null)");
    }
}
