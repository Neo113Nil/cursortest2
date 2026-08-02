package com.squareup.cash.cdf.afterpayapplet;

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
public final class AfterpayAppletPurchasesViewedAllOrders implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String afterpay_applet_flow_token;
    public final Boolean isPurchaseHistory;
    public final LinkedHashMap parameters;

    public AfterpayAppletPurchasesViewedAllOrders(String str, Boolean bool) {
        this.afterpay_applet_flow_token = str;
        this.isPurchaseHistory = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "AfterpayApplet", "cdf_action", "Purchases");
        Countries.putSafe(m, "afterpay_applet_flow_token", str);
        Countries.putSafe(m, "isPurchaseHistory", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletPurchasesViewedAllOrders)) {
            return false;
        }
        AfterpayAppletPurchasesViewedAllOrders afterpayAppletPurchasesViewedAllOrders = (AfterpayAppletPurchasesViewedAllOrders) obj;
        return Intrinsics.areEqual(this.afterpay_applet_flow_token, afterpayAppletPurchasesViewedAllOrders.afterpay_applet_flow_token) && this.isPurchaseHistory.equals(afterpayAppletPurchasesViewedAllOrders.isPurchaseHistory);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayApplet Purchases ViewedAllOrders";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_applet_flow_token;
        return this.isPurchaseHistory.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AfterpayAppletPurchasesViewedAllOrders(afterpay_applet_flow_token=" + this.afterpay_applet_flow_token + ", isPurchaseHistory=" + this.isPurchaseHistory + ")";
    }
}
