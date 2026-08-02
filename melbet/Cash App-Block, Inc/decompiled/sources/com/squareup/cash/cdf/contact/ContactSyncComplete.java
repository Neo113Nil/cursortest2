package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactSyncResult;
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
public final class ContactSyncComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String errorDescription;
    public final LinkedHashMap parameters;
    public final ContactSyncResult result;
    public final Double roundtripDuration;
    public final ContactSyncTriggerReason triggerReason;

    /* renamed from: type, reason: collision with root package name */
    public final ContactSyncType f1075type;

    public ContactSyncComplete(ContactSyncTriggerReason contactSyncTriggerReason, ContactSyncType contactSyncType, ContactSyncResult contactSyncResult, String str, Double d) {
        this.triggerReason = contactSyncTriggerReason;
        this.f1075type = contactSyncType;
        this.result = contactSyncResult;
        this.errorDescription = str;
        this.roundtripDuration = d;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Contact", "cdf_action", "Sync");
        Countries.putSafe(m, "triggerReason", contactSyncTriggerReason);
        Countries.putSafe(m, "type", contactSyncType);
        Countries.putSafe(m, "result", contactSyncResult);
        Countries.putSafe(m, "errorDescription", str);
        Countries.putSafe(m, "roundtripDuration", d);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSyncComplete)) {
            return false;
        }
        ContactSyncComplete contactSyncComplete = (ContactSyncComplete) obj;
        return this.triggerReason == contactSyncComplete.triggerReason && this.f1075type == contactSyncComplete.f1075type && this.result == contactSyncComplete.result && Intrinsics.areEqual(this.errorDescription, contactSyncComplete.errorDescription) && Intrinsics.areEqual((Object) this.roundtripDuration, (Object) contactSyncComplete.roundtripDuration);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Sync Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactSyncTriggerReason contactSyncTriggerReason = this.triggerReason;
        int hashCode = (contactSyncTriggerReason == null ? 0 : contactSyncTriggerReason.hashCode()) * 31;
        ContactSyncType contactSyncType = this.f1075type;
        int hashCode2 = (hashCode + (contactSyncType == null ? 0 : contactSyncType.hashCode())) * 31;
        ContactSyncResult contactSyncResult = this.result;
        int hashCode3 = (hashCode2 + (contactSyncResult == null ? 0 : contactSyncResult.hashCode())) * 31;
        String str = this.errorDescription;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.roundtripDuration;
        return hashCode4 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "ContactSyncComplete(triggerReason=" + this.triggerReason + ", type=" + this.f1075type + ", result=" + this.result + ", errorDescription=" + this.errorDescription + ", roundtripDuration=" + this.roundtripDuration + ")";
    }
}
