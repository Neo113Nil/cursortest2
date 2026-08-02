package com.squareup.cash.cdf.afterpayapplet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.OrderState;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AfterpayAppletPurchasesViewOrder implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String afterpay_applet_flow_token;
    public final Long amount_displayed;
    public final String business_token;
    public final Integer item_row_index;
    public final Long next_payment;
    public final String next_payment_due;
    public final Integer num_remaining_payments;
    public final String order_id;
    public final OrderState order_state;
    public final LinkedHashMap parameters;
    public final String recipient_token;

    public AfterpayAppletPurchasesViewOrder(String str, String str2, String str3, Integer num, Long l, Integer num2, Long l2, String str4, OrderState orderState, String str5) {
        this.afterpay_applet_flow_token = str;
        this.order_id = str2;
        this.business_token = str3;
        this.item_row_index = num;
        this.amount_displayed = l;
        this.num_remaining_payments = num2;
        this.next_payment = l2;
        this.next_payment_due = str4;
        this.order_state = orderState;
        this.recipient_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "AfterpayApplet", "cdf_action", "Purchases");
        Countries.putSafe(m, "afterpay_applet_flow_token", str);
        Countries.putSafe(m, "order_id", str2);
        Countries.putSafe(m, "business_token", str3);
        Countries.putSafe(m, "item_row_index", num);
        Countries.putSafe(m, "amount_displayed", l);
        Countries.putSafe(m, "num_remaining_payments", num2);
        Countries.putSafe(m, "next_payment", l2);
        Countries.putSafe(m, "next_payment_due", str4);
        Countries.putSafe(m, "order_state", orderState);
        Countries.putSafe(m, "recipient_token", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletPurchasesViewOrder)) {
            return false;
        }
        AfterpayAppletPurchasesViewOrder afterpayAppletPurchasesViewOrder = (AfterpayAppletPurchasesViewOrder) obj;
        return Intrinsics.areEqual(this.afterpay_applet_flow_token, afterpayAppletPurchasesViewOrder.afterpay_applet_flow_token) && this.order_id.equals(afterpayAppletPurchasesViewOrder.order_id) && Intrinsics.areEqual(this.business_token, afterpayAppletPurchasesViewOrder.business_token) && this.item_row_index.equals(afterpayAppletPurchasesViewOrder.item_row_index) && Intrinsics.areEqual(this.amount_displayed, afterpayAppletPurchasesViewOrder.amount_displayed) && Intrinsics.areEqual(this.num_remaining_payments, afterpayAppletPurchasesViewOrder.num_remaining_payments) && Intrinsics.areEqual(this.next_payment, afterpayAppletPurchasesViewOrder.next_payment) && Intrinsics.areEqual(this.next_payment_due, afterpayAppletPurchasesViewOrder.next_payment_due) && this.order_state == afterpayAppletPurchasesViewOrder.order_state && Intrinsics.areEqual(this.recipient_token, afterpayAppletPurchasesViewOrder.recipient_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayApplet Purchases ViewOrder";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_applet_flow_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.order_id);
        String str2 = this.business_token;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.item_row_index);
        Long l = this.amount_displayed;
        int hashCode = (m2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.num_remaining_payments;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.next_payment;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.next_payment_due;
        int hashCode4 = (this.order_state.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 961)) * 31;
        String str4 = this.recipient_token;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletPurchasesViewOrder(afterpay_applet_flow_token=", this.afterpay_applet_flow_token, ", order_id=", this.order_id, ", business_token=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.business_token, ", item_row_index=", this.item_row_index, ", amount_displayed=");
        m.append(this.amount_displayed);
        m.append(", num_remaining_payments=");
        m.append(this.num_remaining_payments);
        m.append(", next_payment=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.next_payment, ", next_payment_due=", this.next_payment_due, ", next_payment_due_in_days=null, order_state=", m);
        m.append(this.order_state);
        m.append(", recipient_token=");
        m.append(this.recipient_token);
        m.append(")");
        return m.toString();
    }
}
