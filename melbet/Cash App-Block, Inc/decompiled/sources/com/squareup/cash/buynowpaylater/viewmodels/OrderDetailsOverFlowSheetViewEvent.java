package com.squareup.cash.buynowpaylater.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class OrderDetailsOverFlowSheetViewEvent {

    public final class OverflowCloseButtonClicked extends OrderDetailsOverFlowSheetViewEvent {
        public static final OverflowCloseButtonClicked INSTANCE = new OverflowCloseButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OverflowCloseButtonClicked);
        }

        public final int hashCode() {
            return -464706774;
        }

        public final String toString() {
            return "OverflowCloseButtonClicked";
        }
    }

    public final class OverflowItemClicked extends OrderDetailsOverFlowSheetViewEvent {
        public final String route;

        public OverflowItemClicked(String str) {
            str.getClass();
            this.route = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OverflowItemClicked) && Intrinsics.areEqual(this.route, ((OverflowItemClicked) obj).route);
        }

        public final int hashCode() {
            return this.route.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OverflowItemClicked(route=", this.route, ")");
        }
    }
}
