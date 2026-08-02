package com.squareup.cash.appmessages;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.activity.screens.ActivityScreen;

/* loaded from: classes.dex */
public final class CardTabPopupAppMessage implements DialogScreen {
    public static final CardTabPopupAppMessage INSTANCE = new CardTabPopupAppMessage();
    public static final Parcelable.Creator<CardTabPopupAppMessage> CREATOR = new ActivityScreen.Creator(27);

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
