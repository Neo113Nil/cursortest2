package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.screens.OpenSourceScreen;

/* loaded from: classes.dex */
public final class InvestingContactScreen extends ProfileScreens {
    public static final InvestingContactScreen INSTANCE = new InvestingContactScreen();
    public static final Parcelable.Creator<InvestingContactScreen> CREATOR = new OpenSourceScreen.Creator(29);

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
