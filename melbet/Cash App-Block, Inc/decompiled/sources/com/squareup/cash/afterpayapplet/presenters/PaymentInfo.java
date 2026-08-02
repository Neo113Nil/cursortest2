package com.squareup.cash.afterpayapplet.presenters;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PaymentInfo {
    public final Money amount;
    public final AfterpayAppletAnalyticsEventsSpec analyticTapEvent;
    public final AfterpayAppletAnalyticsEventsSpec analyticViewEvent;
    public final long dueDateMs;

    public PaymentInfo(long j, Money money, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2) {
        money.getClass();
        this.dueDateMs = j;
        this.amount = money;
        this.analyticViewEvent = afterpayAppletAnalyticsEventsSpec;
        this.analyticTapEvent = afterpayAppletAnalyticsEventsSpec2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInfo)) {
            return false;
        }
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        return this.dueDateMs == paymentInfo.dueDateMs && Intrinsics.areEqual(this.amount, paymentInfo.amount) && Intrinsics.areEqual(this.analyticViewEvent, paymentInfo.analyticViewEvent) && Intrinsics.areEqual(this.analyticTapEvent, paymentInfo.analyticTapEvent);
    }

    public final int hashCode() {
        int m = NavAction$$ExternalSyntheticOutline0.m(this.amount, Long.hashCode(this.dueDateMs) * 31, 31);
        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = this.analyticViewEvent;
        int hashCode = (m + (afterpayAppletAnalyticsEventsSpec == null ? 0 : afterpayAppletAnalyticsEventsSpec.hashCode())) * 31;
        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2 = this.analyticTapEvent;
        return hashCode + (afterpayAppletAnalyticsEventsSpec2 != null ? afterpayAppletAnalyticsEventsSpec2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentInfo(dueDateMs=" + this.dueDateMs + ", amount=" + this.amount + ", analyticViewEvent=" + this.analyticViewEvent + ", analyticTapEvent=" + this.analyticTapEvent + ")";
    }
}
