package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.profile.screens.ProfileScreens;

/* loaded from: classes.dex */
public final class CashtagRequiredScreen extends ProfileScreens.ProfileDialogScreens {
    public static final CashtagRequiredScreen INSTANCE = new CashtagRequiredScreen();
    public static final Parcelable.Creator<CashtagRequiredScreen> CREATOR = new OpenSourceScreen.Creator(8);

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
