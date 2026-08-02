package com.squareup.cash.cdf.browser;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BrowserDismissEditAutofillDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean has_unsaved_changes;
    public final AutofillOrigin origin;
    public final LinkedHashMap parameters;

    public BrowserDismissEditAutofillDetails(AutofillOrigin autofillOrigin, Boolean bool) {
        this.origin = autofillOrigin;
        this.has_unsaved_changes = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Browser", "cdf_action", "Dismiss");
        Countries.putSafe(m, "origin", autofillOrigin);
        Countries.putSafe(m, "has_unsaved_changes", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserDismissEditAutofillDetails)) {
            return false;
        }
        BrowserDismissEditAutofillDetails browserDismissEditAutofillDetails = (BrowserDismissEditAutofillDetails) obj;
        return this.origin == browserDismissEditAutofillDetails.origin && this.has_unsaved_changes.equals(browserDismissEditAutofillDetails.has_unsaved_changes);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Dismiss EditAutofillDetails";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.has_unsaved_changes.hashCode() + (this.origin.hashCode() * 31);
    }

    public final String toString() {
        return "BrowserDismissEditAutofillDetails(origin=" + this.origin + ", has_unsaved_changes=" + this.has_unsaved_changes + ")";
    }
}
