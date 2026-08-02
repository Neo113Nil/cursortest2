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
public final class ContactInviteComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ContactInviteEntryPoint entry_point;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger CLOSE_BUTTON;

        static {
            Trigger trigger = new Trigger("CLOSE_BUTTON", 0);
            CLOSE_BUTTON = trigger;
            $VALUES = new Trigger[]{trigger, new Trigger("BACK", 1)};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public ContactInviteComplete(ContactInviteEntryPoint contactInviteEntryPoint) {
        Trigger trigger = Trigger.CLOSE_BUTTON;
        this.entry_point = contactInviteEntryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "entry_point", contactInviteEntryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteComplete)) {
            return false;
        }
        Trigger trigger = Trigger.CLOSE_BUTTON;
        return this.entry_point == ((ContactInviteComplete) obj).entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = Trigger.CLOSE_BUTTON.hashCode() * 31;
        ContactInviteEntryPoint contactInviteEntryPoint = this.entry_point;
        return hashCode + (contactInviteEntryPoint == null ? 0 : contactInviteEntryPoint.hashCode());
    }

    public final String toString() {
        return "ContactInviteComplete(trigger=" + Trigger.CLOSE_BUTTON + ", entry_point=" + this.entry_point + ")";
    }
}
