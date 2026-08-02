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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactInviteTapPromotionUpsell implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_route;
    public final ContactInviteEntryPoint entry_point;
    public final LinkedHashMap parameters;

    public ContactInviteTapPromotionUpsell(ContactInviteEntryPoint contactInviteEntryPoint, String str) {
        this.entry_point = contactInviteEntryPoint;
        this.client_route = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        Countries.putSafe(m, "client_route", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteTapPromotionUpsell)) {
            return false;
        }
        ContactInviteTapPromotionUpsell contactInviteTapPromotionUpsell = (ContactInviteTapPromotionUpsell) obj;
        return this.entry_point == contactInviteTapPromotionUpsell.entry_point && Intrinsics.areEqual(this.client_route, contactInviteTapPromotionUpsell.client_route);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite TapPromotionUpsell";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        int hashCode = (contactInviteEntryPoint == null ? 0 : contactInviteEntryPoint.hashCode()) * 31;
        String str = this.client_route;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ContactInviteTapPromotionUpsell(entry_point=" + this.entry_point + ", client_route=" + this.client_route + ")";
    }
}
