package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactSyncTriggerReason;
import com.squareup.cash.cdf.ContactSyncType;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactSyncNetworkError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String description;
    public final LinkedHashMap parameters;
    public final ContactSyncTriggerReason triggerReason;

    /* renamed from: type, reason: collision with root package name */
    public final ContactSyncType f1076type;

    public ContactSyncNetworkError(ContactSyncTriggerReason contactSyncTriggerReason, String str, ContactSyncType contactSyncType) {
        this.triggerReason = contactSyncTriggerReason;
        this.description = str;
        this.f1076type = contactSyncType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Contact", "cdf_action", "Sync");
        Countries.putSafe(m, "triggerReason", contactSyncTriggerReason);
        Countries.putSafe(m, "description", str);
        Countries.putSafe(m, "type", contactSyncType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSyncNetworkError)) {
            return false;
        }
        ContactSyncNetworkError contactSyncNetworkError = (ContactSyncNetworkError) obj;
        return this.triggerReason == contactSyncNetworkError.triggerReason && Intrinsics.areEqual(this.description, contactSyncNetworkError.description) && this.f1076type == contactSyncNetworkError.f1076type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Sync NetworkError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactSyncTriggerReason contactSyncTriggerReason = this.triggerReason;
        int hashCode = (contactSyncTriggerReason == null ? 0 : contactSyncTriggerReason.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ContactSyncType contactSyncType = this.f1076type;
        return hashCode2 + (contactSyncType != null ? contactSyncType.hashCode() : 0);
    }

    public final String toString() {
        return "ContactSyncNetworkError(triggerReason=" + this.triggerReason + ", description=" + this.description + ", type=" + this.f1076type + ")";
    }
}
