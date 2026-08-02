package com.squareup.cash.cdf.localclient;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zza;
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
public final class LocalClientCheckoutFlowPlaceOrder implements Event {
    public static final zza Companion = new zza(23);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String cart_token;
    public final LinkedHashMap parameters;
    public final PaymentType payment_type;
    public final Long tip_amount;
    public final String tip_options;

    public LocalClientCheckoutFlowPlaceOrder(String str, Long l, String str2, PaymentType paymentType) {
        this.cart_token = str;
        this.tip_amount = l;
        this.tip_options = str2;
        this.payment_type = paymentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 15, "LocalClient", "cdf_action", "CheckoutFlow");
        Countries.putSafe(m, "cart_token", str);
        Countries.putSafe(m, "tip_amount", l);
        Countries.putSafe(m, "tip_options", str2);
        Countries.putSafe(m, "payment_type", paymentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCheckoutFlowPlaceOrder)) {
            return false;
        }
        LocalClientCheckoutFlowPlaceOrder localClientCheckoutFlowPlaceOrder = (LocalClientCheckoutFlowPlaceOrder) obj;
        return Intrinsics.areEqual(this.cart_token, localClientCheckoutFlowPlaceOrder.cart_token) && Intrinsics.areEqual(this.tip_amount, localClientCheckoutFlowPlaceOrder.tip_amount) && this.tip_options.equals(localClientCheckoutFlowPlaceOrder.tip_options) && this.payment_type == localClientCheckoutFlowPlaceOrder.payment_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient CheckoutFlow PlaceOrder";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.cart_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.tip_amount;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.tip_options);
        PaymentType paymentType = this.payment_type;
        return (m + (paymentType != null ? paymentType.hashCode() : 0)) * 28629151;
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.tip_amount, "LocalClientCheckoutFlowPlaceOrder(anonymous_buyer_token=null, buyer_token=null, brand_token=null, location_token=null, cart_token=", this.cart_token, ", tip_amount=", ", tip_options=");
        m.append(this.tip_options);
        m.append(", payment_type=");
        m.append(this.payment_type);
        m.append(", store_payment=null, coupon_code_redemption=null, coupon_codes=null, gc_redemption=null, gc_tokens=null)");
        return m.toString();
    }
}
