package com.squareup.cash.profile.results;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.screens.OpenSourceScreen;

/* loaded from: classes7.dex */
public final class CropSuccessResult implements Parcelable {
    public static final CropSuccessResult INSTANCE = new CropSuccessResult();
    public static final Parcelable.Creator<CropSuccessResult> CREATOR = new OpenSourceScreen.Creator(5);

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
