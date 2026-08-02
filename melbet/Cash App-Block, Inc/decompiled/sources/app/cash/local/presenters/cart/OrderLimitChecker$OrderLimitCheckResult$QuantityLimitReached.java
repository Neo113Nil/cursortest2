package app.cash.local.presenters.cart;

import androidx.paging.LoadState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class OrderLimitChecker$OrderLimitCheckResult$QuantityLimitReached extends LoadState implements OrderLimitChecker$OrderLimitCheckResult$HasQuantityLimit {
    public final int maxQuantity;

    public OrderLimitChecker$OrderLimitCheckResult$QuantityLimitReached(int i) {
        super(false);
        this.maxQuantity = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderLimitChecker$OrderLimitCheckResult$QuantityLimitReached) && this.maxQuantity == ((OrderLimitChecker$OrderLimitCheckResult$QuantityLimitReached) obj).maxQuantity;
    }

    @Override // app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$HasQuantityLimit
    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxQuantity);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxQuantity, "QuantityLimitReached(maxQuantity=", ")");
    }
}
