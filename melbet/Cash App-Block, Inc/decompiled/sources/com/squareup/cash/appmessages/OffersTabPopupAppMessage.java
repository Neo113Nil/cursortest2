package com.squareup.cash.appmessages;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.activity.screens.ActivityScreen;

/* loaded from: classes.dex */
public final class OffersTabPopupAppMessage implements DialogScreen {
    public static final OffersTabPopupAppMessage INSTANCE = new OffersTabPopupAppMessage();
    public static final Parcelable.Creator<OffersTabPopupAppMessage> CREATOR = new ActivityScreen.Creator(29);

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
