package com.squareup.cash.cdf.cashtagprovisioning;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashTagProvisioningProvisionEligibilityRequested implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningProvisionEligibilityRequested(String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionEligibilityRequested)) {
            return false;
        }
        CashTagProvisioningProvisionEligibilityRequested cashTagProvisioningProvisionEligibilityRequested = (CashTagProvisioningProvisionEligibilityRequested) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionEligibilityRequested.flow_token) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionEligibilityRequested.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionEligibilityRequested.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionEligibilityRequested.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision EligibilityRequested";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.journey_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.tag_theme_token;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashTagProvisioningProvisionEligibilityRequested(flow_token=", this.flow_token, ", thermal_state=null, journey_token=", this.journey_token, ", tag_cin="), this.tag_cin, ", is_provisioned=null, tag_theme_token=", this.tag_theme_token, ")");
    }
}
