package com.squareup.cash.afterpayapplet.presenters;

import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OverdueInfo {
    public final Money amount;
    public final AfterpayAppletAnalyticsEventsSpec analyticTapEvent;
    public final AfterpayAppletAnalyticsEventsSpec analyticViewEvent;

    public OverdueInfo(Money money, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2) {
        money.getClass();
        this.amount = money;
        this.analyticViewEvent = afterpayAppletAnalyticsEventsSpec;
        this.analyticTapEvent = afterpayAppletAnalyticsEventsSpec2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverdueInfo)) {
            return false;
        }
        OverdueInfo overdueInfo = (OverdueInfo) obj;
        return Intrinsics.areEqual(this.amount, overdueInfo.amount) && Intrinsics.areEqual(this.analyticViewEvent, overdueInfo.analyticViewEvent) && Intrinsics.areEqual(this.analyticTapEvent, overdueInfo.analyticTapEvent);
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode() * 31;
        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = this.analyticViewEvent;
        int hashCode2 = (hashCode + (afterpayAppletAnalyticsEventsSpec == null ? 0 : afterpayAppletAnalyticsEventsSpec.hashCode())) * 31;
        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2 = this.analyticTapEvent;
        return hashCode2 + (afterpayAppletAnalyticsEventsSpec2 != null ? afterpayAppletAnalyticsEventsSpec2.hashCode() : 0);
    }

    public final String toString() {
        return "OverdueInfo(amount=" + this.amount + ", analyticViewEvent=" + this.analyticViewEvent + ", analyticTapEvent=" + this.analyticTapEvent + ")";
    }
}
