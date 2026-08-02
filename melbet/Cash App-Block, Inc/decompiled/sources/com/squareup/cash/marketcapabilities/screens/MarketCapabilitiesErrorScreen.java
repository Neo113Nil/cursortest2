package com.squareup.cash.marketcapabilities.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.limits.screens.LimitsScreen;

/* loaded from: classes6.dex */
public final class MarketCapabilitiesErrorScreen implements DialogScreen {
    public static final MarketCapabilitiesErrorScreen INSTANCE = new MarketCapabilitiesErrorScreen();
    public static final Parcelable.Creator<MarketCapabilitiesErrorScreen> CREATOR = new LimitsScreen.Creator(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
