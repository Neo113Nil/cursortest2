package com.squareup.cash.cdf.nearbypayment;

import com.google.mlkit.common.internal.zze;
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

/* loaded from: classes.dex */
public final class NearbyPaymentGetPaidPaymentReceivedPageLand implements Event {
    public static final zze Companion = new zze(26);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long amount;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String sender_customer_token;

    public NearbyPaymentGetPaidPaymentReceivedPageLand(Long l, String str, String str2) {
        this.amount = l;
        this.sender_customer_token = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "NearbyPayment", "cdf_action", "GetPaid");
        Countries.putSafe(m, "amount", l);
        Countries.putSafe(m, "sender_customer_token", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentGetPaidPaymentReceivedPageLand)) {
            return false;
        }
        NearbyPaymentGetPaidPaymentReceivedPageLand nearbyPaymentGetPaidPaymentReceivedPageLand = (NearbyPaymentGetPaidPaymentReceivedPageLand) obj;
        return this.amount.equals(nearbyPaymentGetPaidPaymentReceivedPageLand.amount) && Intrinsics.areEqual(this.sender_customer_token, nearbyPaymentGetPaidPaymentReceivedPageLand.sender_customer_token) && Intrinsics.areEqual(this.flow_token, nearbyPaymentGetPaidPaymentReceivedPageLand.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment GetPaid PaymentReceivedPageLand";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode() * 31;
        String str = this.sender_customer_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flow_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyPaymentGetPaidPaymentReceivedPageLand(amount=");
        sb.append(this.amount);
        sb.append(", sender_customer_token=");
        sb.append(this.sender_customer_token);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
