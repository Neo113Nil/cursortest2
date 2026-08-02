package com.squareup.cash.cdf.afterpayhub;

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
public final class AfterpayHubBrowseOpenPaymentDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String afterpay_order_id;
    public final LinkedHashMap parameters;
    public final PaymentStatus payment_status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PaymentStatus {
        public static final /* synthetic */ PaymentStatus[] $VALUES;
        public static final PaymentStatus CANCELED;
        public static final PaymentStatus DEFERRED;
        public static final PaymentStatus ON_HOLD;
        public static final PaymentStatus OVERDUE;
        public static final PaymentStatus OWED;
        public static final PaymentStatus PAID;
        public static final PaymentStatus PARTIALLY_REFUNDED;
        public static final PaymentStatus PAYMENT_PENDING;
        public static final PaymentStatus REFUNDED;
        public static final PaymentStatus UNSPECIFIED;

        static {
            PaymentStatus paymentStatus = new PaymentStatus("UNSPECIFIED", 0);
            UNSPECIFIED = paymentStatus;
            PaymentStatus paymentStatus2 = new PaymentStatus("OWED", 1);
            OWED = paymentStatus2;
            PaymentStatus paymentStatus3 = new PaymentStatus("PAID", 2);
            PAID = paymentStatus3;
            PaymentStatus paymentStatus4 = new PaymentStatus("OVERDUE", 3);
            OVERDUE = paymentStatus4;
            PaymentStatus paymentStatus5 = new PaymentStatus("REFUNDED", 4);
            REFUNDED = paymentStatus5;
            PaymentStatus paymentStatus6 = new PaymentStatus("DEFERRED", 5);
            DEFERRED = paymentStatus6;
            PaymentStatus paymentStatus7 = new PaymentStatus("PAYMENT_PENDING", 6);
            PAYMENT_PENDING = paymentStatus7;
            PaymentStatus paymentStatus8 = new PaymentStatus("PARTIALLY_REFUNDED", 7);
            PARTIALLY_REFUNDED = paymentStatus8;
            PaymentStatus paymentStatus9 = new PaymentStatus("CANCELED", 8);
            CANCELED = paymentStatus9;
            PaymentStatus paymentStatus10 = new PaymentStatus("ON_HOLD", 9);
            ON_HOLD = paymentStatus10;
            $VALUES = new PaymentStatus[]{paymentStatus, paymentStatus2, paymentStatus3, paymentStatus4, paymentStatus5, paymentStatus6, paymentStatus7, paymentStatus8, paymentStatus9, paymentStatus10};
        }

        public static PaymentStatus valueOf(String str) {
            return (PaymentStatus) Enum.valueOf(PaymentStatus.class, str);
        }

        public static PaymentStatus[] values() {
            return (PaymentStatus[]) $VALUES.clone();
        }
    }

    public AfterpayHubBrowseOpenPaymentDetails(String str, PaymentStatus paymentStatus) {
        this.afterpay_order_id = str;
        this.payment_status = paymentStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "AfterpayHub", "cdf_action", "Browse");
        Countries.putSafe(m, "afterpay_order_id", str);
        Countries.putSafe(m, "payment_status", paymentStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayHubBrowseOpenPaymentDetails)) {
            return false;
        }
        AfterpayHubBrowseOpenPaymentDetails afterpayHubBrowseOpenPaymentDetails = (AfterpayHubBrowseOpenPaymentDetails) obj;
        return Intrinsics.areEqual(this.afterpay_order_id, afterpayHubBrowseOpenPaymentDetails.afterpay_order_id) && this.payment_status == afterpayHubBrowseOpenPaymentDetails.payment_status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayHub Browse OpenPaymentDetails";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_order_id;
        return this.payment_status.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AfterpayHubBrowseOpenPaymentDetails(afterpay_order_id=" + this.afterpay_order_id + ", payment_status=" + this.payment_status + ")";
    }
}
