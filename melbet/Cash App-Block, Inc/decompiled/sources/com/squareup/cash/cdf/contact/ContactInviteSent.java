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
public final class ContactInviteSent implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.AMPLITUDE});
    public final ContactInviteEntryPoint entry_point;
    public final String invitation_token;
    public final Boolean is_recommended;
    public final LinkedHashMap parameters;
    public final ContactSection section;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ContactSection {
        public static final /* synthetic */ ContactSection[] $VALUES;
        public static final ContactSection ALL_CONTACTS;
        public static final ContactSection NOT_IN_CONTACTS;
        public static final ContactSection RECOMMENDED;

        static {
            ContactSection contactSection = new ContactSection("RECOMMENDED", 0);
            RECOMMENDED = contactSection;
            ContactSection contactSection2 = new ContactSection("ALL_CONTACTS", 1);
            ALL_CONTACTS = contactSection2;
            ContactSection contactSection3 = new ContactSection("NOT_IN_CONTACTS", 2);
            NOT_IN_CONTACTS = contactSection3;
            $VALUES = new ContactSection[]{contactSection, contactSection2, contactSection3};
        }

        public static ContactSection valueOf(String str) {
            return (ContactSection) Enum.valueOf(ContactSection.class, str);
        }

        public static ContactSection[] values() {
            return (ContactSection[]) $VALUES.clone();
        }
    }

    public ContactInviteSent(String str, ContactInviteEntryPoint contactInviteEntryPoint, ContactSection contactSection, Boolean bool) {
        this.invitation_token = str;
        this.entry_point = contactInviteEntryPoint;
        this.section = contactSection;
        this.is_recommended = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "invitation_token", str);
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        Countries.putSafe(m, "section", contactSection);
        Countries.putSafe(m, "is_recommended", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteSent)) {
            return false;
        }
        ContactInviteSent contactInviteSent = (ContactInviteSent) obj;
        return Intrinsics.areEqual(this.invitation_token, contactInviteSent.invitation_token) && this.entry_point == contactInviteSent.entry_point && this.section == contactInviteSent.section && this.is_recommended.equals(contactInviteSent.is_recommended);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite Sent";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.invitation_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        return this.is_recommended.hashCode() + ((this.section.hashCode() + ((hashCode + (contactInviteEntryPoint != null ? contactInviteEntryPoint.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ContactInviteSent(invitation_token=" + this.invitation_token + ", entry_point=" + this.entry_point + ", section=" + this.section + ", is_recommended=" + this.is_recommended + ")";
    }
}
