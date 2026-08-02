package com.squareup.cash.cashapppay.settings.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;

/* loaded from: classes6.dex */
public final class RemoveLinkedBusinessResult$Negative implements Parcelable {
    public static final RemoveLinkedBusinessResult$Negative INSTANCE = new RemoveLinkedBusinessResult$Negative();
    public static final Parcelable.Creator<RemoveLinkedBusinessResult$Negative> CREATOR = new CheckCaptureQuestion.Creator(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RemoveLinkedBusinessResult$Negative);
    }

    public final int hashCode() {
        return -756093325;
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
