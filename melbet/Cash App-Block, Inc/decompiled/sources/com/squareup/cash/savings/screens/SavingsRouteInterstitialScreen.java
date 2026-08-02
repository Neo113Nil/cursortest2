package com.squareup.cash.savings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.screens.BoostDetailsScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SavingsRouteInterstitialScreen implements SavingsScreen {
    public static final Parcelable.Creator<SavingsRouteInterstitialScreen> CREATOR = new BoostDetailsScreen.Creator(1);
    public final RoutingParams routingParams;

    public SavingsRouteInterstitialScreen(RoutingParams routingParams) {
        routingParams.getClass();
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
        return (obj instanceof SavingsRouteInterstitialScreen) && Intrinsics.areEqual(this.routingParams, ((SavingsRouteInterstitialScreen) obj).routingParams);
    }

    public final int hashCode() {
        return this.routingParams.hashCode();
    }

    public final String toString() {
        return "SavingsRouteInterstitialScreen(routingParams=" + this.routingParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.routingParams, i);
    }
}
