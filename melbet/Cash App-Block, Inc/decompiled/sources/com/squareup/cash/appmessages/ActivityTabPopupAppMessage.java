package com.squareup.cash.appmessages;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.activity.screens.ActivityScreen;

/* loaded from: classes.dex */
public final class ActivityTabPopupAppMessage implements DialogScreen {
    public static final ActivityTabPopupAppMessage INSTANCE = new ActivityTabPopupAppMessage();
    public static final Parcelable.Creator<ActivityTabPopupAppMessage> CREATOR = new ActivityScreen.Creator(25);

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
