package com.squareup.cash.cdf.contact;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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

/* loaded from: classes6.dex */
public final class ContactEncryptedSyncStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer contactsAdded;
    public final Integer contactsRemoved;
    public final LinkedHashMap parameters;
    public final ContactSyncTriggerReason triggerReason;

    /* renamed from: type, reason: collision with root package name */
    public final ContactSyncType f1074type;

    public ContactEncryptedSyncStart(ContactSyncTriggerReason contactSyncTriggerReason, Integer num, Integer num2, ContactSyncType contactSyncType) {
        this.triggerReason = contactSyncTriggerReason;
        this.contactsAdded = num;
        this.contactsRemoved = num2;
        this.f1074type = contactSyncType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Contact", "cdf_action", "EncryptedSync");
        Countries.putSafe(m, "triggerReason", contactSyncTriggerReason);
        Countries.putSafe(m, "contactsAdded", num);
        Countries.putSafe(m, "contactsRemoved", num2);
        Countries.putSafe(m, "type", contactSyncType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactEncryptedSyncStart)) {
            return false;
        }
        ContactEncryptedSyncStart contactEncryptedSyncStart = (ContactEncryptedSyncStart) obj;
        return this.triggerReason == contactEncryptedSyncStart.triggerReason && this.contactsAdded.equals(contactEncryptedSyncStart.contactsAdded) && this.contactsRemoved.equals(contactEncryptedSyncStart.contactsRemoved) && this.f1074type == contactEncryptedSyncStart.f1074type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact EncryptedSync Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactSyncTriggerReason contactSyncTriggerReason = this.triggerReason;
        return this.f1074type.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((contactSyncTriggerReason == null ? 0 : contactSyncTriggerReason.hashCode()) * 31, 31, this.contactsAdded), 31, this.contactsRemoved);
    }

    public final String toString() {
        return "ContactEncryptedSyncStart(triggerReason=" + this.triggerReason + ", contactsAdded=" + this.contactsAdded + ", contactsRemoved=" + this.contactsRemoved + ", type=" + this.f1074type + ")";
    }
}
