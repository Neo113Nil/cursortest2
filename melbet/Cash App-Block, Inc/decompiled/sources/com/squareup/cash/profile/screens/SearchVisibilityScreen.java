package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.viewmodels.Alias;

/* loaded from: classes.dex */
public final class SearchVisibilityScreen extends ProfileScreens {
    public static final SearchVisibilityScreen INSTANCE = new SearchVisibilityScreen();
    public static final Parcelable.Creator<SearchVisibilityScreen> CREATOR = new Alias.Creator(14);

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
