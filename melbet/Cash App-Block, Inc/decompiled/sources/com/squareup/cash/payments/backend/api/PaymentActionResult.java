package com.squareup.cash.payments.backend.api;

import android.content.Intent;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaymentActionResult {

    public final class GoToScreen implements PaymentActionResult {
        public final Screen screen;

        public GoToScreen(Screen screen) {
            screen.getClass();
            this.screen = screen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GoToScreen) && Intrinsics.areEqual(this.screen, ((GoToScreen) obj).screen);
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.screen, "GoToScreen(screen=", ")");
        }
    }

    public final class IntentResult implements PaymentActionResult {
        public final Intent intent;

        public IntentResult(Intent intent) {
            intent.getClass();
            this.intent = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntentResult) && Intrinsics.areEqual(this.intent, ((IntentResult) obj).intent);
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final String toString() {
            return "IntentResult(intent=" + this.intent + ")";
        }
    }

    public final class Route implements PaymentActionResult {
        public final String route;

        public Route(String str) {
            this.route = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Route) && Intrinsics.areEqual(this.route, ((Route) obj).route);
        }

        public final int hashCode() {
            String str = this.route;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Route(route=", this.route, ")");
        }
    }
}
