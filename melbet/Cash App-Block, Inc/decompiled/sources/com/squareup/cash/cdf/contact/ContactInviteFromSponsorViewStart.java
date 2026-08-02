package com.squareup.cash.cdf.contact;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ContactInviteFromSponsorViewStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String dependent_customer_token;
    public final LinkedHashMap parameters;

    public ContactInviteFromSponsorViewStart(String str) {
        this.dependent_customer_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Contact", "cdf_action", "InviteFromSponsorView");
        Countries.putSafe(m, "dependent_customer_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactInviteFromSponsorViewStart) && this.dependent_customer_token.equals(((ContactInviteFromSponsorViewStart) obj).dependent_customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact InviteFromSponsorView Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.dependent_customer_token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactInviteFromSponsorViewStart(dependent_customer_token=", this.dependent_customer_token, ")");
    }
}
