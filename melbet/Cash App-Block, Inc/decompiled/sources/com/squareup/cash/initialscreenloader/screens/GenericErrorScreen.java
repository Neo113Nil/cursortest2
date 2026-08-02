package com.squareup.cash.initialscreenloader.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.fileupload.api.UriString;

/* loaded from: classes.dex */
public final class GenericErrorScreen implements DialogScreen {
    public static final GenericErrorScreen INSTANCE = new GenericErrorScreen();
    public static final Parcelable.Creator<GenericErrorScreen> CREATOR = new UriString.Creator(25);

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
