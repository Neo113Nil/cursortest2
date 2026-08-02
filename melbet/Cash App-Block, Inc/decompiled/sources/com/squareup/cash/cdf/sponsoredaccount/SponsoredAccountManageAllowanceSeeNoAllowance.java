package com.squareup.cash.cdf.sponsoredaccount;

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
public final class SponsoredAccountManageAllowanceSeeNoAllowance implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String dependent_customer_token;
    public final LinkedHashMap parameters;
    public final String sponsor_customer_token;

    public SponsoredAccountManageAllowanceSeeNoAllowance(String str, String str2) {
        this.sponsor_customer_token = str;
        this.dependent_customer_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "SponsoredAccount", "cdf_action", "ManageAllowance");
        Countries.putSafe(m, "sponsor_customer_token", str);
        Countries.putSafe(m, "dependent_customer_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountManageAllowanceSeeNoAllowance)) {
            return false;
        }
        SponsoredAccountManageAllowanceSeeNoAllowance sponsoredAccountManageAllowanceSeeNoAllowance = (SponsoredAccountManageAllowanceSeeNoAllowance) obj;
        return this.sponsor_customer_token.equals(sponsoredAccountManageAllowanceSeeNoAllowance.sponsor_customer_token) && Intrinsics.areEqual(this.dependent_customer_token, sponsoredAccountManageAllowanceSeeNoAllowance.dependent_customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount ManageAllowance SeeNoAllowance";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.sponsor_customer_token.hashCode() * 31;
        String str = this.dependent_customer_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SponsoredAccountManageAllowanceSeeNoAllowance(sponsor_customer_token=", this.sponsor_customer_token, ", dependent_customer_token=", this.dependent_customer_token, ")");
    }
}
