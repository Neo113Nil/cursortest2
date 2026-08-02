package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.screens.PasscodeHelpResult;

/* loaded from: classes4.dex */
public final class BusinessDetailsBackConfirmResult$Negative implements Parcelable {
    public static final BusinessDetailsBackConfirmResult$Negative INSTANCE = new BusinessDetailsBackConfirmResult$Negative();
    public static final Parcelable.Creator<BusinessDetailsBackConfirmResult$Negative> CREATOR = new PasscodeHelpResult.Creator(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BusinessDetailsBackConfirmResult$Negative);
    }

    public final int hashCode() {
        return -1138783277;
    }

    public final String toString() {
        return "Negative";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
