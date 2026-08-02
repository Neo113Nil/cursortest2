package com.squareup.cash.cdf.nearbypayment;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class NearbyPaymentPaySelectPaymentMethod implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String selection;

    public NearbyPaymentPaySelectPaymentMethod(String str, String str2) {
        this.selection = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "NearbyPayment", "cdf_action", "Pay");
        Countries.putSafe(m, "selection", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentPaySelectPaymentMethod)) {
            return false;
        }
        NearbyPaymentPaySelectPaymentMethod nearbyPaymentPaySelectPaymentMethod = (NearbyPaymentPaySelectPaymentMethod) obj;
        return this.selection.equals(nearbyPaymentPaySelectPaymentMethod.selection) && this.flow_token.equals(nearbyPaymentPaySelectPaymentMethod.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment Pay SelectPaymentMethod";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode() + (this.selection.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("NearbyPaymentPaySelectPaymentMethod(selection=", this.selection, ", flow_token=", this.flow_token, ")");
    }
}
