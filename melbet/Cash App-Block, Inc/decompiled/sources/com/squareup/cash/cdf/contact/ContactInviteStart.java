package com.squareup.cash.cdf.contact;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class ContactInviteStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.AMPLITUDE});
    public final ContactInviteEntryPoint entry_point;
    public final LinkedHashMap parameters;
    public final Boolean permission_granted;
    public final Integer recommendations_count;

    public ContactInviteStart(ContactInviteEntryPoint contactInviteEntryPoint, Boolean bool, Integer num) {
        this.entry_point = contactInviteEntryPoint;
        this.permission_granted = bool;
        this.recommendations_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        Countries.putSafe(m, "permission_granted", bool);
        Countries.putSafe(m, "recommendations_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteStart)) {
            return false;
        }
        ContactInviteStart contactInviteStart = (ContactInviteStart) obj;
        return this.entry_point == contactInviteStart.entry_point && this.permission_granted.equals(contactInviteStart.permission_granted) && this.recommendations_count.equals(contactInviteStart.recommendations_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        return this.recommendations_count.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.permission_granted, (contactInviteEntryPoint == null ? 0 : contactInviteEntryPoint.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInviteStart(entry_point=");
        sb.append(this.entry_point);
        sb.append(", permission_granted=");
        sb.append(this.permission_granted);
        sb.append(", recommendations_count=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.recommendations_count, ")");
    }
}
