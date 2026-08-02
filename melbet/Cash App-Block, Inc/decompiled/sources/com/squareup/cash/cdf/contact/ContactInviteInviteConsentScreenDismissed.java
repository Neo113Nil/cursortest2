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
public final class ContactInviteInviteConsentScreenDismissed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean confirmed;
    public final LinkedHashMap parameters;

    public ContactInviteInviteConsentScreenDismissed(Boolean bool) {
        this.confirmed = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "confirmed", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactInviteInviteConsentScreenDismissed) && this.confirmed.equals(((ContactInviteInviteConsentScreenDismissed) obj).confirmed);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite InviteConsentScreenDismissed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.confirmed.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.confirmed, "ContactInviteInviteConsentScreenDismissed(confirmed=", ")");
    }
}
