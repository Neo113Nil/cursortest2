package com.squareup.cash.clientrouting.data;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class TargetDestination implements Parcelable {

    public final class RouteDestination extends TargetDestination {
        public static final Parcelable.Creator<RouteDestination> CREATOR = new RoutingParams.Creator(16);
        public final String routeUrl;
        public final RoutingParams routingParams;

        public RouteDestination(RoutingParams routingParams, String str) {
            str.getClass();
            routingParams.getClass();
            this.routeUrl = str;
            this.routingParams = routingParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteDestination)) {
                return false;
            }
            RouteDestination routeDestination = (RouteDestination) obj;
            return Intrinsics.areEqual(this.routeUrl, routeDestination.routeUrl) && Intrinsics.areEqual(this.routingParams, routeDestination.routingParams);
        }

        public final int hashCode() {
            return this.routingParams.hashCode() + (this.routeUrl.hashCode() * 31);
        }

        public final String toString() {
            return "RouteDestination(routeUrl=" + this.routeUrl + ", routingParams=" + this.routingParams + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.routeUrl);
            this.routingParams.writeToParcel(parcel, i);
        }
    }

    public final class ScreenDestination extends TargetDestination {
        public static final Parcelable.Creator<ScreenDestination> CREATOR = new RoutingParams.Creator(17);
        public final Screen screen;

        public ScreenDestination(Screen screen) {
            screen.getClass();
            this.screen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScreenDestination) && Intrinsics.areEqual(this.screen, ((ScreenDestination) obj).screen);
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.screen, "ScreenDestination(screen=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.screen, i);
        }
    }
}
