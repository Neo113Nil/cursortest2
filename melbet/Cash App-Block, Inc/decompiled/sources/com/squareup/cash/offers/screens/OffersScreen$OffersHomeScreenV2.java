package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;

/* loaded from: classes.dex */
public final class OffersScreen$OffersHomeScreenV2 implements Screen {
    public static final OffersScreen$OffersHomeScreenV2 INSTANCE = new OffersScreen$OffersHomeScreenV2();
    public static final Parcelable.Creator<OffersScreen$OffersHomeScreenV2> CREATOR = new ListSection.Creator(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OffersScreen$OffersHomeScreenV2);
    }

    public final int hashCode() {
        return -960409251;
    }

    public final String toString() {
        return "OffersHomeScreenV2";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
