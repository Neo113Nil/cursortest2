package com.squareup.cash.appupdate.screen;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class AppUpdateDialogScreen implements DialogScreen {
    public static final AppUpdateDialogScreen INSTANCE = new AppUpdateDialogScreen();
    public static final Parcelable.Creator<AppUpdateDialogScreen> CREATOR = new SheetAppMessage.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AppUpdateDialogScreen);
    }

    public final int hashCode() {
        return -714474158;
    }

    public final String toString() {
        return "AppUpdateDialogScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
