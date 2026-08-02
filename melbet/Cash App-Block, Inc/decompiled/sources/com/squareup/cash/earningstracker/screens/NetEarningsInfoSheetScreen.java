package com.squareup.cash.earningstracker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;

/* loaded from: classes.dex */
public final class NetEarningsInfoSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final NetEarningsInfoSheetScreen INSTANCE = new NetEarningsInfoSheetScreen();
    public static final Parcelable.Creator<NetEarningsInfoSheetScreen> CREATOR = new AddPayerCustomersScreen.Creator(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof NetEarningsInfoSheetScreen);
    }

    public final int hashCode() {
        return 2055915919;
    }

    public final String toString() {
        return "NetEarningsInfoSheetScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
