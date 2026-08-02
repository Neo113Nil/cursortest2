package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ContactInviteInviteConsentScreenViewed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String area_code_state;
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

    public ContactInviteInviteConsentScreenViewed(ContactSection contactSection, String str) {
        this.section = contactSection;
        this.area_code_state = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "section", contactSection);
        Countries.putSafe(m, "area_code_state", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteInviteConsentScreenViewed)) {
            return false;
        }
        ContactInviteInviteConsentScreenViewed contactInviteInviteConsentScreenViewed = (ContactInviteInviteConsentScreenViewed) obj;
        return this.section == contactInviteInviteConsentScreenViewed.section && this.area_code_state.equals(contactInviteInviteConsentScreenViewed.area_code_state);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite InviteConsentScreenViewed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.area_code_state.hashCode() + (this.section.hashCode() * 31);
    }

    public final String toString() {
        return "ContactInviteInviteConsentScreenViewed(section=" + this.section + ", area_code_state=" + this.area_code_state + ")";
    }
}
