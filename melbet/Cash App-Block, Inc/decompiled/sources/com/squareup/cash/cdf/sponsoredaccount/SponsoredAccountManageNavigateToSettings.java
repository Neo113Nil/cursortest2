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
public final class SponsoredAccountManageNavigateToSettings implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String dependent_customer_token;
    public final LinkedHashMap parameters;
    public final String sponsor_customer_token;

    public SponsoredAccountManageNavigateToSettings(String str, String str2) {
        this.sponsor_customer_token = str;
        this.dependent_customer_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "SponsoredAccount", "cdf_action", "Manage");
        Countries.putSafe(m, "sponsor_customer_token", str);
        Countries.putSafe(m, "dependent_customer_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountManageNavigateToSettings)) {
            return false;
        }
        SponsoredAccountManageNavigateToSettings sponsoredAccountManageNavigateToSettings = (SponsoredAccountManageNavigateToSettings) obj;
        return Intrinsics.areEqual(this.sponsor_customer_token, sponsoredAccountManageNavigateToSettings.sponsor_customer_token) && Intrinsics.areEqual(this.dependent_customer_token, sponsoredAccountManageNavigateToSettings.dependent_customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount Manage NavigateToSettings";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.sponsor_customer_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dependent_customer_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SponsoredAccountManageNavigateToSettings(sponsor_customer_token=", this.sponsor_customer_token, ", dependent_customer_token=", this.dependent_customer_token, ")");
    }
}
