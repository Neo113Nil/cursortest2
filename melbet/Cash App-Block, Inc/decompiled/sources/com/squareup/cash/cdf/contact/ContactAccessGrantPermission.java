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
public final class ContactAccessGrantPermission implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ContactInviteEntryPoint entry_point;
    public final LinkedHashMap parameters;
    public final Boolean permission_granted;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ContactsAccessLevel {
        public static final /* synthetic */ ContactsAccessLevel[] $VALUES;
        public static final ContactsAccessLevel FULL;

        static {
            ContactsAccessLevel contactsAccessLevel = new ContactsAccessLevel("FULL", 0);
            FULL = contactsAccessLevel;
            $VALUES = new ContactsAccessLevel[]{contactsAccessLevel, new ContactsAccessLevel("LIMITED", 1)};
        }

        public static ContactsAccessLevel valueOf(String str) {
            return (ContactsAccessLevel) Enum.valueOf(ContactsAccessLevel.class, str);
        }

        public static ContactsAccessLevel[] values() {
            return (ContactsAccessLevel[]) $VALUES.clone();
        }
    }

    public ContactAccessGrantPermission(ContactInviteEntryPoint contactInviteEntryPoint, Boolean bool) {
        ContactsAccessLevel contactsAccessLevel = ContactsAccessLevel.FULL;
        this.permission_granted = bool;
        this.entry_point = contactInviteEntryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Contact", "cdf_action", "Access");
        Countries.putSafe(m, "permission_granted", bool);
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        Countries.putSafe(m, "access_level", contactsAccessLevel);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactAccessGrantPermission)) {
            return false;
        }
        ContactAccessGrantPermission contactAccessGrantPermission = (ContactAccessGrantPermission) obj;
        if (!this.permission_granted.equals(contactAccessGrantPermission.permission_granted) || this.entry_point != contactAccessGrantPermission.entry_point) {
            return false;
        }
        ContactsAccessLevel contactsAccessLevel = ContactsAccessLevel.FULL;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Access GrantPermission";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.permission_granted.hashCode() * 31;
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        return ContactsAccessLevel.FULL.hashCode() + ((hashCode + (contactInviteEntryPoint == null ? 0 : contactInviteEntryPoint.hashCode())) * 31);
    }

    public final String toString() {
        return "ContactAccessGrantPermission(permission_granted=" + this.permission_granted + ", entry_point=" + this.entry_point + ", access_level=" + ContactsAccessLevel.FULL + ")";
    }
}
