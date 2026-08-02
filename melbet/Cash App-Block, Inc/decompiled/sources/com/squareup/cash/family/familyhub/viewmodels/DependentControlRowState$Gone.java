package com.squareup.cash.family.familyhub.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.zzco;
import com.squareup.cash.family.familyhub.screens.FamilyHome;

/* loaded from: classes6.dex */
public final class DependentControlRowState$Gone extends zzco {
    public static final DependentControlRowState$Gone INSTANCE = new DependentControlRowState$Gone();
    public static final Parcelable.Creator<DependentControlRowState$Gone> CREATOR = new FamilyHome.Creator(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DependentControlRowState$Gone);
    }

    public final int hashCode() {
        return 1157273358;
    }

    public final String toString() {
        return "Gone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
