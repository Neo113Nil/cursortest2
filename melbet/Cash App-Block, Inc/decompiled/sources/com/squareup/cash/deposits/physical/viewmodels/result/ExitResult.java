package com.squareup.cash.deposits.physical.viewmodels.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;

/* loaded from: classes6.dex */
public final class ExitResult implements Parcelable {
    public static final ExitResult INSTANCE = new ExitResult();
    public static final Parcelable.Creator<ExitResult> CREATOR = new Limit.Creator(2);

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
