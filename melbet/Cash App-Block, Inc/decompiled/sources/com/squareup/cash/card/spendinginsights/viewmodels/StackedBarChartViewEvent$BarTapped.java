package com.squareup.cash.card.spendinginsights.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StackedBarChartViewEvent$BarTapped {
    public final String clientRoute;

    public StackedBarChartViewEvent$BarTapped(String str) {
        str.getClass();
        this.clientRoute = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StackedBarChartViewEvent$BarTapped) && Intrinsics.areEqual(this.clientRoute, ((StackedBarChartViewEvent$BarTapped) obj).clientRoute);
    }

    public final int hashCode() {
        return this.clientRoute.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BarTapped(clientRoute=", this.clientRoute, ")");
    }
}
