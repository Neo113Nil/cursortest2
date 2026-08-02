package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactSkipReason;
import com.squareup.cash.cdf.ContactSyncType;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ContactSyncSkip implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final ContactSyncType f1077type;

    public ContactSyncSkip(ContactSyncType contactSyncType) {
        ContactSkipReason contactSkipReason = ContactSkipReason.EMPTY_CONTACTS;
        this.f1077type = contactSyncType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Contact", "cdf_action", "Sync");
        Countries.putSafe(m, "reason", contactSkipReason);
        Countries.putSafe(m, "type", contactSyncType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSyncSkip)) {
            return false;
        }
        ContactSkipReason contactSkipReason = ContactSkipReason.EMPTY_CONTACTS;
        return this.f1077type == ((ContactSyncSkip) obj).f1077type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Sync Skip";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1077type.hashCode() + (ContactSkipReason.EMPTY_CONTACTS.hashCode() * 31);
    }

    public final String toString() {
        return "ContactSyncSkip(reason=" + ContactSkipReason.EMPTY_CONTACTS + ", type=" + this.f1077type + ")";
    }
}
