package com.squareup.cash.cdf.personalprofile;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PersonalProfileViewShoppingAutofillSettings implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean autofill_enabled;
    public final LinkedHashMap parameters;

    public PersonalProfileViewShoppingAutofillSettings(Boolean bool) {
        this.autofill_enabled = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PersonalProfile", "cdf_action", "View");
        Countries.putSafe(m, "autofill_enabled", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalProfileViewShoppingAutofillSettings) && this.autofill_enabled.equals(((PersonalProfileViewShoppingAutofillSettings) obj).autofill_enabled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile View ShoppingAutofillSettings";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.autofill_enabled.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.autofill_enabled, "PersonalProfileViewShoppingAutofillSettings(autofill_enabled=", ")");
    }
}
