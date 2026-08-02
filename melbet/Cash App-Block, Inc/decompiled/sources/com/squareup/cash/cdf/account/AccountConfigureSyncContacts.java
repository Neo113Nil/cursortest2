package com.squareup.cash.cdf.account;

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
public final class AccountConfigureSyncContacts implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.BRAZE});
    public final Boolean enabled;
    public final LinkedHashMap parameters;

    public AccountConfigureSyncContacts(Boolean bool) {
        this.enabled = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Account", "cdf_action", "Configure");
        Countries.putSafe(m, "enabled", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountConfigureSyncContacts) && this.enabled.equals(((AccountConfigureSyncContacts) obj).enabled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Configure SyncContacts";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.enabled.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.enabled, "AccountConfigureSyncContacts(enabled=", ")");
    }
}
