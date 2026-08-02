package com.squareup.cash.cdf.featurerestrictionbanner;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class FeatureRestrictionBannerViewImpression implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Location location;
    public final LinkedHashMap parameters;

    public FeatureRestrictionBannerViewImpression(Location location) {
        this.location = location;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "FeatureRestrictionBanner", "cdf_action", "View");
        Countries.putSafe(m, "location", location);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureRestrictionBannerViewImpression) && this.location == ((FeatureRestrictionBannerViewImpression) obj).location;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "FeatureRestrictionBanner View Impression";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Location location = this.location;
        return (location == null ? 0 : location.hashCode()) * 31;
    }

    public final String toString() {
        return "FeatureRestrictionBannerViewImpression(location=" + this.location + ", banner_text=null)";
    }
}
