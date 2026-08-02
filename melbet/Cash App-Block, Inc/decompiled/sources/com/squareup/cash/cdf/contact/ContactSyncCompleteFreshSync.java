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
public final class ContactSyncCompleteFreshSync implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Boolean persist_hashed_alias_ids;

    public ContactSyncCompleteFreshSync(Boolean bool) {
        this.persist_hashed_alias_ids = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Contact", "cdf_action", "Sync");
        Countries.putSafe(m, "persist_hashed_alias_ids", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactSyncCompleteFreshSync) && this.persist_hashed_alias_ids.equals(((ContactSyncCompleteFreshSync) obj).persist_hashed_alias_ids);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Sync CompleteFreshSync";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.persist_hashed_alias_ids.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.persist_hashed_alias_ids, "ContactSyncCompleteFreshSync(persist_hashed_alias_ids=", ")");
    }
}
