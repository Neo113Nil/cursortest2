package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Alias;

/* loaded from: classes.dex */
public final class ProfileUnavailableScreen extends ProfileScreens.ProfileDialogScreens {
    public static final ProfileUnavailableScreen INSTANCE = new ProfileUnavailableScreen();
    public static final Parcelable.Creator<ProfileUnavailableScreen> CREATOR = new Alias.Creator(12);

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
