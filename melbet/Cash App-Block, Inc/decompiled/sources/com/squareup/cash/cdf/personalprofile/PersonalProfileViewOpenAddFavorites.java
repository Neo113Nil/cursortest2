package com.squareup.cash.cdf.personalprofile;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PersonalProfileViewOpenAddFavorites implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer favorites_count;
    public final LinkedHashMap parameters;

    public PersonalProfileViewOpenAddFavorites(Integer num) {
        this.favorites_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PersonalProfile", "cdf_action", "View");
        Countries.putSafe(m, "favorites_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalProfileViewOpenAddFavorites) && this.favorites_count.equals(((PersonalProfileViewOpenAddFavorites) obj).favorites_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile View OpenAddFavorites";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.favorites_count.hashCode();
    }

    public final String toString() {
        return "PersonalProfileViewOpenAddFavorites(favorites_count=" + this.favorites_count + ")";
    }
}
