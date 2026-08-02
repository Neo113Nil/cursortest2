package com.squareup.cash.family.familyhub.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.zzco;
import com.squareup.cash.family.familyhub.screens.FamilyHome;

/* loaded from: classes6.dex */
public final class DependentControlRowState$InitialLoading extends zzco {
    public static final DependentControlRowState$InitialLoading INSTANCE = new DependentControlRowState$InitialLoading();
    public static final Parcelable.Creator<DependentControlRowState$InitialLoading> CREATOR = new FamilyHome.Creator(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DependentControlRowState$InitialLoading);
    }

    public final int hashCode() {
        return -253213433;
    }

    public final String toString() {
        return "InitialLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
