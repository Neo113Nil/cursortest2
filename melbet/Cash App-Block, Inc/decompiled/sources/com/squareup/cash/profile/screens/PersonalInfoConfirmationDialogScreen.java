package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.profile.screens.ProfileScreens;

/* loaded from: classes.dex */
public final class PersonalInfoConfirmationDialogScreen extends ProfileScreens implements DialogScreen {
    public static final PersonalInfoConfirmationDialogScreen INSTANCE = new PersonalInfoConfirmationDialogScreen();
    public static final Parcelable.Creator<PersonalInfoConfirmationDialogScreen> CREATOR = new ProfileScreens.CropScreen.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PersonalInfoConfirmationDialogScreen);
    }

    public final int hashCode() {
        return 1562210197;
    }

    public final String toString() {
        return "PersonalInfoConfirmationDialogScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
