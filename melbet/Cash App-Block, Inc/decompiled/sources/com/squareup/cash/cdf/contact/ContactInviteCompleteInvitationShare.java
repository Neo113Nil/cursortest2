package com.squareup.cash.cdf.contact;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactInviteCompleteInvitationShare implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String activity;
    public final LinkedHashMap parameters;
    public final String source;

    public ContactInviteCompleteInvitationShare(String str, String str2) {
        this.activity = str;
        this.source = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Contact", "cdf_action", "Invite");
        Countries.putSafe(m, "activity", str);
        Countries.putSafe(m, "source", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInviteCompleteInvitationShare)) {
            return false;
        }
        ContactInviteCompleteInvitationShare contactInviteCompleteInvitationShare = (ContactInviteCompleteInvitationShare) obj;
        return Intrinsics.areEqual(this.activity, contactInviteCompleteInvitationShare.activity) && Intrinsics.areEqual(this.source, contactInviteCompleteInvitationShare.source);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Invite CompleteInvitationShare";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.activity;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ContactInviteCompleteInvitationShare(activity=", this.activity, ", source=", this.source, ")");
    }
}
