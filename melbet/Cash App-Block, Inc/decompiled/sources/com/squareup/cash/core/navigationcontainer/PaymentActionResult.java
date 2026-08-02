package com.squareup.cash.core.navigationcontainer;

import android.content.Intent;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PaymentActionResult {

    public final class GoToScreen extends PaymentActionResult {
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

        public final Screen getScreen() {
            return this.screen;
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.screen, "GoToScreen(screen=", ")");
        }
    }

    public final class IntentResult extends PaymentActionResult {
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

        public final Intent getIntent() {
            return this.intent;
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final String toString() {
            return "IntentResult(intent=" + this.intent + ")";
        }
    }

    public final class Route extends PaymentActionResult {
        public final String route;
        public final RoutingParams routingParams;

        public Route(RoutingParams routingParams, String str) {
            this.route = str;
            this.routingParams = routingParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Route)) {
                return false;
            }
            Route route = (Route) obj;
            return Intrinsics.areEqual(this.route, route.route) && this.routingParams.equals(route.routingParams);
        }

        public final String getRoute() {
            return this.route;
        }

        public final RoutingParams getRoutingParams() {
            return this.routingParams;
        }

        public final int hashCode() {
            String str = this.route;
            return this.routingParams.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Route(route=" + this.route + ", routingParams=" + this.routingParams + ")";
        }
    }
}
