package com.squareup.cash.card.spendinginsights.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SpendingInsightDetailViewEvent {

    public final class ClientRoute implements SpendingInsightDetailViewEvent {
        public final String route;

        public ClientRoute(String str) {
            str.getClass();
            this.route = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientRoute) && Intrinsics.areEqual(this.route, ((ClientRoute) obj).route);
        }

        public final int hashCode() {
            return this.route.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(route=", this.route, ")");
        }
    }

    public final class Exit implements SpendingInsightDetailViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 267842592;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class MerchantRowTapped implements SpendingInsightDetailViewEvent {
        public final StackedBarChartViewEvent$BarTapped event;

        public MerchantRowTapped(StackedBarChartViewEvent$BarTapped stackedBarChartViewEvent$BarTapped) {
            this.event = stackedBarChartViewEvent$BarTapped;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MerchantRowTapped) && this.event.equals(((MerchantRowTapped) obj).event);
        }

        public final int hashCode() {
            return this.event.clientRoute.hashCode();
        }

        public final String toString() {
            return "MerchantRowTapped(event=" + this.event + ")";
        }
    }
}
