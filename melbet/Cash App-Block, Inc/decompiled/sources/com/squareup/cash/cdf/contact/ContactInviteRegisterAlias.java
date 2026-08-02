package com.squareup.cash.cdf.contact;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AliasType;
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
public final class ContactInviteRegisterAlias implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final ContactInviteEntryPoint entry_point;
    public final String hashed_alias_id;
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

    public ContactInviteRegisterAlias(AliasType aliasType, ContactSection contactSection, Boolean bool, String str, ContactInviteEntryPoint contactInviteEntryPoint) {
        this.alias_type = aliasType;
        this.section = contactSection;
        this.is_recommended = bool;
        this.hashed_alias_id = str;
        this.entry_point = contactInviteEntryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "section", contactSection);
        Countries.putSafe(m, "is_recommended", bool);
        Countries.putSafe(m, "hashed_alias_id", str);
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteRegisterAlias)) {
            return false;
        }
        ContactInviteRegisterAlias contactInviteRegisterAlias = (ContactInviteRegisterAlias) obj;
        return this.alias_type == contactInviteRegisterAlias.alias_type && this.section == contactInviteRegisterAlias.section && this.is_recommended.equals(contactInviteRegisterAlias.is_recommended) && Intrinsics.areEqual(this.hashed_alias_id, contactInviteRegisterAlias.hashed_alias_id) && this.entry_point == contactInviteRegisterAlias.entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite RegisterAlias";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_recommended, (this.section.hashCode() + (this.alias_type.hashCode() * 31)) * 31, 31);
        String str = this.hashed_alias_id;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        return hashCode + (contactInviteEntryPoint != null ? contactInviteEntryPoint.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInviteRegisterAlias(alias_type=");
        sb.append(this.alias_type);
        sb.append(", section=");
        sb.append(this.section);
        sb.append(", is_recommended=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_recommended, ", hashed_alias_id=", this.hashed_alias_id, ", entry_point=");
        sb.append(this.entry_point);
        sb.append(")");
        return sb.toString();
    }
}
