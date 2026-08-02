package com.squareup.cash.cdf.contact;

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
public final class ContactInvitePrefillRequest implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ContactInviteEntryPoint entry_point;
    public final String hashed_alias_id;
    public final Boolean is_recommended;
    public final LinkedHashMap parameters;

    public ContactInvitePrefillRequest(Boolean bool, String str, ContactInviteEntryPoint contactInviteEntryPoint) {
        AliasType aliasType = AliasType.SMS;
        this.is_recommended = bool;
        this.hashed_alias_id = str;
        this.entry_point = contactInviteEntryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "is_recommended", bool);
        Countries.putSafe(m, "hashed_alias_id", str);
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInvitePrefillRequest)) {
            return false;
        }
        ContactInvitePrefillRequest contactInvitePrefillRequest = (ContactInvitePrefillRequest) obj;
        AliasType aliasType = AliasType.SMS;
        return this.is_recommended.equals(contactInvitePrefillRequest.is_recommended) && Intrinsics.areEqual(this.hashed_alias_id, contactInvitePrefillRequest.hashed_alias_id) && this.entry_point == contactInvitePrefillRequest.entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite PrefillRequest";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_recommended, AliasType.SMS.hashCode() * 31, 31);
        String str = this.hashed_alias_id;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        return hashCode + (contactInviteEntryPoint != null ? contactInviteEntryPoint.hashCode() : 0);
    }

    public final String toString() {
        return "ContactInvitePrefillRequest(alias_type=" + AliasType.SMS + ", is_recommended=" + this.is_recommended + ", hashed_alias_id=" + this.hashed_alias_id + ", entry_point=" + this.entry_point + ")";
    }
}
