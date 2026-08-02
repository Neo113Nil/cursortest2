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
public final class BrowserTapEditAutofillDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AutofillOrigin origin;
    public final LinkedHashMap parameters;

    public BrowserTapEditAutofillDetails(AutofillOrigin autofillOrigin) {
        this.origin = autofillOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Browser", "cdf_action", "Tap");
        Countries.putSafe(m, "origin", autofillOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrowserTapEditAutofillDetails) && this.origin == ((BrowserTapEditAutofillDetails) obj).origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Tap EditAutofillDetails";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "BrowserTapEditAutofillDetails(origin=" + this.origin + ")";
    }
}
