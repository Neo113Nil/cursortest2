package com.squareup.cash.cdf.sponsoredaccount;

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
public final class SponsoredAccountInviteFromSponsoredAccountsViewStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String sponsor_customer_token;

    public SponsoredAccountInviteFromSponsoredAccountsViewStart(String str) {
        this.sponsor_customer_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "SponsoredAccount", "cdf_action", "InviteFromSponsoredAccountsView");
        Countries.putSafe(m, "sponsor_customer_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SponsoredAccountInviteFromSponsoredAccountsViewStart) && this.sponsor_customer_token.equals(((SponsoredAccountInviteFromSponsoredAccountsViewStart) obj).sponsor_customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount InviteFromSponsoredAccountsView Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.sponsor_customer_token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SponsoredAccountInviteFromSponsoredAccountsViewStart(sponsor_customer_token=", this.sponsor_customer_token, ")");
    }
}
