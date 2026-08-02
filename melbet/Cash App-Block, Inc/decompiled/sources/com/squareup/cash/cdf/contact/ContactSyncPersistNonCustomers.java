package com.squareup.cash.cdf.contact;

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
public final class ContactSyncPersistNonCustomers implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean contains_hashed_alias_ids;
    public final LinkedHashMap parameters;

    public ContactSyncPersistNonCustomers(Boolean bool) {
        this.contains_hashed_alias_ids = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Contact", "cdf_action", "Sync");
        Countries.putSafe(m, "contains_hashed_alias_ids", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactSyncPersistNonCustomers) && this.contains_hashed_alias_ids.equals(((ContactSyncPersistNonCustomers) obj).contains_hashed_alias_ids);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Sync PersistNonCustomers";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.contains_hashed_alias_ids.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.contains_hashed_alias_ids, "ContactSyncPersistNonCustomers(contains_hashed_alias_ids=", ")");
    }
}
