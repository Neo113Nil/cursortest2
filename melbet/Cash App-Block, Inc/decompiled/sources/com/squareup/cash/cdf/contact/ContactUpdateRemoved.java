package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ContactUpdateRemoved implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer numberOfContacts;
    public final LinkedHashMap parameters;

    public ContactUpdateRemoved(Integer num) {
        this.numberOfContacts = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Contact", "cdf_action", "Update");
        Countries.putSafe(m, "numberOfContacts", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactUpdateRemoved) && this.numberOfContacts.equals(((ContactUpdateRemoved) obj).numberOfContacts);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Update Removed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.numberOfContacts.hashCode();
    }

    public final String toString() {
        return "ContactUpdateRemoved(numberOfContacts=" + this.numberOfContacts + ")";
    }
}
