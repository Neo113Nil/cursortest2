package com.squareup.cash.cdf.afterpayapplet;

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
public final class AfterpayAppletPaymentInitiate implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String afterpay_applet_flow_token;
    public final String business_token;
    public final LinkedHashMap parameters;
    public final String recipient_token;

    public AfterpayAppletPaymentInitiate(String str, String str2, String str3) {
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.PURCHASES;
        this.afterpay_applet_flow_token = str;
        this.business_token = str2;
        this.recipient_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "AfterpayApplet", "cdf_action", "Payment");
        Countries.putSafe(m, "afterpay_applet_flow_token", str);
        Countries.putSafe(m, "from_screen", afterpayAppletScreen);
        Countries.putSafe(m, "from_section", "AFTERPAY_PURCHASES_SCREEN");
        Countries.putSafe(m, "business_token", str2);
        Countries.putSafe(m, "recipient_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletPaymentInitiate)) {
            return false;
        }
        AfterpayAppletPaymentInitiate afterpayAppletPaymentInitiate = (AfterpayAppletPaymentInitiate) obj;
        if (!Intrinsics.areEqual(this.afterpay_applet_flow_token, afterpayAppletPaymentInitiate.afterpay_applet_flow_token)) {
            return false;
        }
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.ENTRYPOINT;
        return Intrinsics.areEqual(this.business_token, afterpayAppletPaymentInitiate.business_token) && Intrinsics.areEqual(this.recipient_token, afterpayAppletPaymentInitiate.recipient_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayApplet Payment Initiate";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_applet_flow_token;
        int hashCode = (((AfterpayAppletScreen.PURCHASES.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31) + 412108908) * 29791;
        String str2 = this.business_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 923521;
        String str3 = this.recipient_token;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.PURCHASES;
        StringBuilder sb = new StringBuilder("AfterpayAppletPaymentInitiate(afterpay_applet_flow_token=");
        sb.append(this.afterpay_applet_flow_token);
        sb.append(", from_screen=");
        sb.append(afterpayAppletScreen);
        sb.append(", from_section=AFTERPAY_PURCHASES_SCREEN, source_screen=null, source_section=null, business_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.business_token, ", amount_due=null, due_in_days=null, number_of_payments_remaining=null, recipient_token=", this.recipient_token, ")");
    }
}
