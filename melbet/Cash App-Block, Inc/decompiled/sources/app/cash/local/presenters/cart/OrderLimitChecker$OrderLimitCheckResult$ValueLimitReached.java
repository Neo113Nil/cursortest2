package app.cash.local.presenters.cart;

import androidx.paging.LoadState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class OrderLimitChecker$OrderLimitCheckResult$ValueLimitReached extends LoadState implements OrderLimitChecker$OrderLimitCheckResult$HasValueLimit {
    public final String maxValue;

    public OrderLimitChecker$OrderLimitCheckResult$ValueLimitReached(String str) {
        super(false);
        this.maxValue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderLimitChecker$OrderLimitCheckResult$ValueLimitReached) && this.maxValue.equals(((OrderLimitChecker$OrderLimitCheckResult$ValueLimitReached) obj).maxValue);
    }

    @Override // app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$HasValueLimit
    public final String getMaxValue() {
        return this.maxValue;
    }

    public final int hashCode() {
        return this.maxValue.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ValueLimitReached(maxValue=", this.maxValue, ")");
    }
}
