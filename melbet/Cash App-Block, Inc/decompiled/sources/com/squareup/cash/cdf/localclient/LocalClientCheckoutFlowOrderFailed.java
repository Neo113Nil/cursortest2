package com.squareup.cash.cdf.localclient;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class LocalClientCheckoutFlowOrderFailed implements Event {
    public static final zze Companion = new zze(22);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String brand_token;
    public final String buyer_token;
    public final String cart_token;
    public final String error_message;
    public final ErrorType error_type;
    public final String location_token;
    public final LinkedHashMap parameters;

    public LocalClientCheckoutFlowOrderFailed(String str, String str2, String str3, String str4, ErrorType errorType, String str5) {
        this.buyer_token = str;
        this.brand_token = str2;
        this.location_token = str3;
        this.cart_token = str4;
        this.error_type = errorType;
        this.error_message = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "LocalClient", "cdf_action", "CheckoutFlow");
        Countries.putSafe(m, "buyer_token", str);
        Countries.putSafe(m, "brand_token", str2);
        Countries.putSafe(m, "location_token", str3);
        Countries.putSafe(m, "cart_token", str4);
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "error_message", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCheckoutFlowOrderFailed)) {
            return false;
        }
        LocalClientCheckoutFlowOrderFailed localClientCheckoutFlowOrderFailed = (LocalClientCheckoutFlowOrderFailed) obj;
        return Intrinsics.areEqual(this.buyer_token, localClientCheckoutFlowOrderFailed.buyer_token) && Intrinsics.areEqual(this.brand_token, localClientCheckoutFlowOrderFailed.brand_token) && Intrinsics.areEqual(this.location_token, localClientCheckoutFlowOrderFailed.location_token) && Intrinsics.areEqual(this.cart_token, localClientCheckoutFlowOrderFailed.cart_token) && this.error_type == localClientCheckoutFlowOrderFailed.error_type && Intrinsics.areEqual(this.error_message, localClientCheckoutFlowOrderFailed.error_message);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient CheckoutFlow OrderFailed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.buyer_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.brand_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cart_token;
        int hashCode4 = (this.error_type.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.error_message;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientCheckoutFlowOrderFailed(anonymous_buyer_token=null, buyer_token=", this.buyer_token, ", brand_token=", this.brand_token, ", location_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.location_token, ", cart_token=", this.cart_token, ", error_type=");
        m.append(this.error_type);
        m.append(", error_message=");
        m.append(this.error_message);
        m.append(")");
        return m.toString();
    }
}
