package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.profile.screens.OpenSourceScreen;

/* loaded from: classes.dex */
public final class ActivePasswordDialog extends ProfileScreens implements DialogScreen {
    public static final ActivePasswordDialog INSTANCE = new ActivePasswordDialog();
    public static final Parcelable.Creator<ActivePasswordDialog> CREATOR = new OpenSourceScreen.Creator(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ActivePasswordDialog);
    }

    public final int hashCode() {
        return -887147993;
    }

    public final String toString() {
        return "ActivePasswordDialog";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
