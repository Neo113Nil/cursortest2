package com.squareup.cash.cdf.localclient;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class LocalClientCheckoutFlowConfirmOrder implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String brand_token;
    public final String buyer_token;
    public final String cart_token;
    public final Long local_cash_amount;
    public final Boolean local_cash_eligible;
    public final String location_token;
    public final LinkedHashMap parameters;
    public final Boolean tipping_enabled;
    public final Boolean use_local_cash;

    public LocalClientCheckoutFlowConfirmOrder(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l, Boolean bool3) {
        this.buyer_token = str;
        this.brand_token = str2;
        this.location_token = str3;
        this.cart_token = str4;
        this.local_cash_eligible = bool;
        this.use_local_cash = bool2;
        this.local_cash_amount = l;
        this.tipping_enabled = bool3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "LocalClient", "cdf_action", "CheckoutFlow");
        Countries.putSafe(m, "buyer_token", str);
        Countries.putSafe(m, "brand_token", str2);
        Countries.putSafe(m, "location_token", str3);
        Countries.putSafe(m, "cart_token", str4);
        Countries.putSafe(m, "local_cash_eligible", bool);
        Countries.putSafe(m, "use_local_cash", bool2);
        Countries.putSafe(m, "local_cash_amount", l);
        Countries.putSafe(m, "tipping_enabled", bool3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCheckoutFlowConfirmOrder)) {
            return false;
        }
        LocalClientCheckoutFlowConfirmOrder localClientCheckoutFlowConfirmOrder = (LocalClientCheckoutFlowConfirmOrder) obj;
        return Intrinsics.areEqual(this.buyer_token, localClientCheckoutFlowConfirmOrder.buyer_token) && Intrinsics.areEqual(this.brand_token, localClientCheckoutFlowConfirmOrder.brand_token) && Intrinsics.areEqual(this.location_token, localClientCheckoutFlowConfirmOrder.location_token) && Intrinsics.areEqual(this.cart_token, localClientCheckoutFlowConfirmOrder.cart_token) && this.local_cash_eligible.equals(localClientCheckoutFlowConfirmOrder.local_cash_eligible) && this.use_local_cash.equals(localClientCheckoutFlowConfirmOrder.use_local_cash) && Intrinsics.areEqual(this.local_cash_amount, localClientCheckoutFlowConfirmOrder.local_cash_amount) && this.tipping_enabled.equals(localClientCheckoutFlowConfirmOrder.tipping_enabled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient CheckoutFlow ConfirmOrder";
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
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.use_local_cash, ViewEvent$State$EnumUnboxingLocalUtility.m(this.local_cash_eligible, (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31);
        Long l = this.local_cash_amount;
        return this.tipping_enabled.hashCode() + ((m + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientCheckoutFlowConfirmOrder(anonymous_buyer_token=null, buyer_token=", this.buyer_token, ", brand_token=", this.brand_token, ", location_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.location_token, ", cart_token=", this.cart_token, ", local_cash_eligible=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.local_cash_eligible, ", use_local_cash=", this.use_local_cash, ", local_cash_amount=");
        m.append(this.local_cash_amount);
        m.append(", tipping_enabled=");
        m.append(this.tipping_enabled);
        m.append(")");
        return m.toString();
    }
}
