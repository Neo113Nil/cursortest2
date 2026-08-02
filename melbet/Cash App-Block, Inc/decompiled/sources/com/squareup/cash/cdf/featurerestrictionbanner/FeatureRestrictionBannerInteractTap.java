package com.squareup.cash.cdf.featurerestrictionbanner;

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
public final class FeatureRestrictionBannerInteractTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ActionLocation action_location;
    public final String action_text;
    public final Location location;
    public final LinkedHashMap parameters;

    public FeatureRestrictionBannerInteractTap(Location location, String str, ActionLocation actionLocation) {
        this.location = location;
        this.action_text = str;
        this.action_location = actionLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "FeatureRestrictionBanner", "cdf_action", "Interact");
        Countries.putSafe(m, "location", location);
        Countries.putSafe(m, "action_text", str);
        Countries.putSafe(m, "action_location", actionLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureRestrictionBannerInteractTap)) {
            return false;
        }
        FeatureRestrictionBannerInteractTap featureRestrictionBannerInteractTap = (FeatureRestrictionBannerInteractTap) obj;
        return this.location == featureRestrictionBannerInteractTap.location && Intrinsics.areEqual(this.action_text, featureRestrictionBannerInteractTap.action_text) && this.action_location == featureRestrictionBannerInteractTap.action_location;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "FeatureRestrictionBanner Interact Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Location location = this.location;
        int hashCode = (location == null ? 0 : location.hashCode()) * 961;
        String str = this.action_text;
        return (this.action_location.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "FeatureRestrictionBannerInteractTap(location=" + this.location + ", action=null, action_text=" + this.action_text + ", action_location=" + this.action_location + ", banner_text=null)";
    }
}
