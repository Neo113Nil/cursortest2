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
public final class ContactInviteViewPromotionUpsell implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ContactInviteEntryPoint entry_point;
    public final LinkedHashMap parameters;
    public final Boolean permission_granted;

    public ContactInviteViewPromotionUpsell(ContactInviteEntryPoint contactInviteEntryPoint, Boolean bool) {
        this.entry_point = contactInviteEntryPoint;
        this.permission_granted = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        Countries.putSafe(m, "permission_granted", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteViewPromotionUpsell)) {
            return false;
        }
        ContactInviteViewPromotionUpsell contactInviteViewPromotionUpsell = (ContactInviteViewPromotionUpsell) obj;
        return this.entry_point == contactInviteViewPromotionUpsell.entry_point && this.permission_granted.equals(contactInviteViewPromotionUpsell.permission_granted);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite ViewPromotionUpsell";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        return this.permission_granted.hashCode() + ((contactInviteEntryPoint == null ? 0 : contactInviteEntryPoint.hashCode()) * 31);
    }

    public final String toString() {
        return "ContactInviteViewPromotionUpsell(entry_point=" + this.entry_point + ", permission_granted=" + this.permission_granted + ")";
    }
}
