package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;

/* loaded from: classes.dex */
public final class SponsorResourcesScreen implements Screen, SingleInstanceScreen {
    public static final SponsorResourcesScreen INSTANCE = new SponsorResourcesScreen();
    public static final Parcelable.Creator<SponsorResourcesScreen> CREATOR = new FamilyHome.Creator(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SponsorResourcesScreen);
    }

    public final int hashCode() {
        return -125398541;
    }

    public final String toString() {
        return "SponsorResourcesScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
