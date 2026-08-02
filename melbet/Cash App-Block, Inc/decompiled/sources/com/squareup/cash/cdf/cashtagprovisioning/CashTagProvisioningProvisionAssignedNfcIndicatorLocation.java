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
public final class CashTagProvisioningProvisionAssignedNfcIndicatorLocation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final String nfc_indicator_placement;
    public final LinkedHashMap parameters;
    public final String placement_source;
    public final Double x_location;
    public final Double y_location;

    public CashTagProvisioningProvisionAssignedNfcIndicatorLocation(String str, String str2, String str3, Double d, Double d2, String str4) {
        this.flow_token = str;
        this.nfc_indicator_placement = str2;
        this.placement_source = str3;
        this.x_location = d;
        this.y_location = d2;
        this.journey_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "nfc_indicator_placement", str2);
        Countries.putSafe(m, "placement_source", str3);
        Countries.putSafe(m, "x_location", d);
        Countries.putSafe(m, "y_location", d2);
        Countries.putSafe(m, "journey_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionAssignedNfcIndicatorLocation)) {
            return false;
        }
        CashTagProvisioningProvisionAssignedNfcIndicatorLocation cashTagProvisioningProvisionAssignedNfcIndicatorLocation = (CashTagProvisioningProvisionAssignedNfcIndicatorLocation) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionAssignedNfcIndicatorLocation.flow_token) && Intrinsics.areEqual(this.nfc_indicator_placement, cashTagProvisioningProvisionAssignedNfcIndicatorLocation.nfc_indicator_placement) && this.placement_source.equals(cashTagProvisioningProvisionAssignedNfcIndicatorLocation.placement_source) && Intrinsics.areEqual((Object) this.x_location, (Object) cashTagProvisioningProvisionAssignedNfcIndicatorLocation.x_location) && Intrinsics.areEqual((Object) this.y_location, (Object) cashTagProvisioningProvisionAssignedNfcIndicatorLocation.y_location) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionAssignedNfcIndicatorLocation.journey_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision AssignedNfcIndicatorLocation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nfc_indicator_placement;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.placement_source);
        Double d = this.x_location;
        int hashCode2 = (m + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.y_location;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.journey_token;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashTagProvisioningProvisionAssignedNfcIndicatorLocation(flow_token=", this.flow_token, ", nfc_indicator_placement=", this.nfc_indicator_placement, ", placement_source=");
        m.append(this.placement_source);
        m.append(", x_location=");
        m.append(this.x_location);
        m.append(", y_location=");
        m.append(this.y_location);
        m.append(", journey_token=");
        m.append(this.journey_token);
        m.append(")");
        return m.toString();
    }
}
