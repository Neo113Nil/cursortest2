package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactClearDataReason;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ContactEncryptedSyncClearData implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final ContactClearDataReason reason;

    public ContactEncryptedSyncClearData(ContactClearDataReason contactClearDataReason) {
        this.reason = contactClearDataReason;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Contact", "cdf_action", "EncryptedSync");
        Countries.putSafe(m, "reason", contactClearDataReason);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactEncryptedSyncClearData) && this.reason == ((ContactEncryptedSyncClearData) obj).reason;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact EncryptedSync ClearData";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.reason.hashCode();
    }

    public final String toString() {
        return "ContactEncryptedSyncClearData(reason=" + this.reason + ")";
    }
}
