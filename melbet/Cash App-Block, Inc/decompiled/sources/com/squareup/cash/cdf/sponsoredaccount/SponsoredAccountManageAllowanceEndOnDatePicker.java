package com.squareup.cash.cdf.sponsoredaccount;

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
public final class SponsoredAccountManageAllowanceEndOnDatePicker implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Boolean is_new_allowance;
    public final LinkedHashMap parameters;

    public SponsoredAccountManageAllowanceEndOnDatePicker(String str, Boolean bool) {
        this.flow_token = str;
        this.is_new_allowance = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "SponsoredAccount", "cdf_action", "ManageAllowance");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "is_new_allowance", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountManageAllowanceEndOnDatePicker)) {
            return false;
        }
        SponsoredAccountManageAllowanceEndOnDatePicker sponsoredAccountManageAllowanceEndOnDatePicker = (SponsoredAccountManageAllowanceEndOnDatePicker) obj;
        return Intrinsics.areEqual(this.flow_token, sponsoredAccountManageAllowanceEndOnDatePicker.flow_token) && this.is_new_allowance.equals(sponsoredAccountManageAllowanceEndOnDatePicker.is_new_allowance);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount ManageAllowance EndOnDatePicker";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.is_new_allowance.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SponsoredAccountManageAllowanceEndOnDatePicker(sponsor_customer_token=null, dependent_customer_token=null, flow_token=" + this.flow_token + ", is_new_allowance=" + this.is_new_allowance + ")";
    }
}
