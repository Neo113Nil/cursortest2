package com.squareup.cash.cdf.localclient;

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
public final class LocalClientMapClickBrandCard implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String brand_token;
    public final String location_token;
    public final LinkedHashMap parameters;

    public LocalClientMapClickBrandCard(String str, String str2) {
        this.brand_token = str;
        this.location_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "LocalClient", "cdf_action", "Map");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "location_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientMapClickBrandCard)) {
            return false;
        }
        LocalClientMapClickBrandCard localClientMapClickBrandCard = (LocalClientMapClickBrandCard) obj;
        return Intrinsics.areEqual(this.brand_token, localClientMapClickBrandCard.brand_token) && this.location_token.equals(localClientMapClickBrandCard.location_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Map ClickBrandCard";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        return this.location_token.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LocalClientMapClickBrandCard(brand_token=", this.brand_token, ", location_token=", this.location_token, ")");
    }
}
