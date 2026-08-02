package app.cash.local.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OrderLimitBanner {
    public final String body;
    public final boolean isLimitExceeded;
    public final String title;

    public OrderLimitBanner(String str, String str2, boolean z) {
        str.getClass();
        this.isLimitExceeded = z;
        this.title = str;
        this.body = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderLimitBanner)) {
            return false;
        }
        OrderLimitBanner orderLimitBanner = (OrderLimitBanner) obj;
        return this.isLimitExceeded == orderLimitBanner.isLimitExceeded && Intrinsics.areEqual(this.title, orderLimitBanner.title) && Intrinsics.areEqual(this.body, orderLimitBanner.body);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isLimitExceeded) * 31, 31, this.title);
        String str = this.body;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("OrderLimitBanner(isLimitExceeded=", ", title=", this.title, ", body=", this.isLimitExceeded), this.body, ")");
    }
}
