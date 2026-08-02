package app.cash.local.presenters.cart;

import androidx.paging.LoadState;

/* loaded from: classes3.dex */
public final class OrderLimitChecker$OrderLimitCheckResult$NoLimitReached extends LoadState {
    public static final OrderLimitChecker$OrderLimitCheckResult$NoLimitReached INSTANCE = new OrderLimitChecker$OrderLimitCheckResult$NoLimitReached(false);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OrderLimitChecker$OrderLimitCheckResult$NoLimitReached);
    }

    public final int hashCode() {
        return 409794800;
    }

    public final String toString() {
        return "NoLimitReached";
    }
}
