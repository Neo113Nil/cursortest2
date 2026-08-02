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
public final class PersonalProfileViewShoppingAutofillToggleError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean autofill_enabled;
    public final Boolean autofill_enabled_attempted_change;
    public final LinkedHashMap parameters;

    public PersonalProfileViewShoppingAutofillToggleError(Boolean bool, Boolean bool2) {
        this.autofill_enabled = bool;
        this.autofill_enabled_attempted_change = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PersonalProfile", "cdf_action", "View");
        Countries.putSafe(m, "autofill_enabled", bool);
        Countries.putSafe(m, "autofill_enabled_attempted_change", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalProfileViewShoppingAutofillToggleError)) {
            return false;
        }
        PersonalProfileViewShoppingAutofillToggleError personalProfileViewShoppingAutofillToggleError = (PersonalProfileViewShoppingAutofillToggleError) obj;
        return this.autofill_enabled.equals(personalProfileViewShoppingAutofillToggleError.autofill_enabled) && this.autofill_enabled_attempted_change.equals(personalProfileViewShoppingAutofillToggleError.autofill_enabled_attempted_change);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile View ShoppingAutofillToggleError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.autofill_enabled_attempted_change.hashCode() + (this.autofill_enabled.hashCode() * 31);
    }

    public final String toString() {
        return "PersonalProfileViewShoppingAutofillToggleError(autofill_enabled=" + this.autofill_enabled + ", autofill_enabled_attempted_change=" + this.autofill_enabled_attempted_change + ")";
    }
}
