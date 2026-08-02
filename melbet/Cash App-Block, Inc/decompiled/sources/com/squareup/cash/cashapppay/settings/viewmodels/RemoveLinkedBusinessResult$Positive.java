package com.squareup.cash.cashapppay.settings.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;

/* loaded from: classes6.dex */
public final class RemoveLinkedBusinessResult$Positive implements Parcelable {
    public static final RemoveLinkedBusinessResult$Positive INSTANCE = new RemoveLinkedBusinessResult$Positive();
    public static final Parcelable.Creator<RemoveLinkedBusinessResult$Positive> CREATOR = new CheckCaptureQuestion.Creator(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RemoveLinkedBusinessResult$Positive);
    }

    public final int hashCode() {
        return -929399753;
    }

    public final String toString() {
        return "Positive";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
