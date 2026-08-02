package com.squareup.cash.savings.viewmodels;

import androidx.core.view.ViewGroupKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public final class SavingsHeaderEvent$RouteClicked extends ViewGroupKt {
    public final CdfEvent cdfEvent;
    public final String clientRoute;

    public SavingsHeaderEvent$RouteClicked(String str, CdfEvent cdfEvent) {
        str.getClass();
        this.clientRoute = str;
        this.cdfEvent = cdfEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsHeaderEvent$RouteClicked)) {
            return false;
        }
        SavingsHeaderEvent$RouteClicked savingsHeaderEvent$RouteClicked = (SavingsHeaderEvent$RouteClicked) obj;
        return Intrinsics.areEqual(this.clientRoute, savingsHeaderEvent$RouteClicked.clientRoute) && Intrinsics.areEqual(this.cdfEvent, savingsHeaderEvent$RouteClicked.cdfEvent);
    }

    public final int hashCode() {
        int hashCode = this.clientRoute.hashCode() * 31;
        CdfEvent cdfEvent = this.cdfEvent;
        return hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode());
    }

    public final String toString() {
        return "RouteClicked(clientRoute=" + this.clientRoute + ", cdfEvent=" + this.cdfEvent + ")";
    }
}
