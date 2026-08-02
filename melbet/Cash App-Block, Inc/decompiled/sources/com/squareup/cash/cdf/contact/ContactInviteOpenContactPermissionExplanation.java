package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ContactInviteOpenContactPermissionExplanation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final ContactInviteEntryPoint entry_point;
    public final LinkedHashMap parameters;

    public ContactInviteOpenContactPermissionExplanation(ContactInviteEntryPoint contactInviteEntryPoint) {
        this.entry_point = contactInviteEntryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactInviteOpenContactPermissionExplanation) && this.entry_point == ((ContactInviteOpenContactPermissionExplanation) obj).entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite OpenContactPermissionExplanation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        if (contactInviteEntryPoint == null) {
            return 0;
        }
        return contactInviteEntryPoint.hashCode();
    }

    public final String toString() {
        return "ContactInviteOpenContactPermissionExplanation(entry_point=" + this.entry_point + ")";
    }
}
