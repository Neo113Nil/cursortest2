package com.squareup.cash.cdf.nearbypayment;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class NearbyPaymentGetPaidReceivedMultiplePaymentsLand implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long amount;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Integer people_count;

    public NearbyPaymentGetPaidReceivedMultiplePaymentsLand(Integer num, Long l, String str) {
        this.amount = l;
        this.people_count = num;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "NearbyPayment", "cdf_action", "GetPaid");
        Countries.putSafe(m, "amount", l);
        Countries.putSafe(m, "people_count", num);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentGetPaidReceivedMultiplePaymentsLand)) {
            return false;
        }
        NearbyPaymentGetPaidReceivedMultiplePaymentsLand nearbyPaymentGetPaidReceivedMultiplePaymentsLand = (NearbyPaymentGetPaidReceivedMultiplePaymentsLand) obj;
        return this.amount.equals(nearbyPaymentGetPaidReceivedMultiplePaymentsLand.amount) && this.people_count.equals(nearbyPaymentGetPaidReceivedMultiplePaymentsLand.people_count) && this.flow_token.equals(nearbyPaymentGetPaidReceivedMultiplePaymentsLand.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment GetPaid ReceivedMultiplePaymentsLand";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.amount.hashCode() * 31, 31, this.people_count);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyPaymentGetPaidReceivedMultiplePaymentsLand(amount=");
        sb.append(this.amount);
        sb.append(", people_count=");
        sb.append(this.people_count);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
