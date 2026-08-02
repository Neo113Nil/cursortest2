package com.squareup.cash.initialscreenloader.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.instruments.common.Instrument;

/* loaded from: classes6.dex */
public final class ScenarioPlanErrorScreen$Result$Close implements Parcelable {
    public static final ScenarioPlanErrorScreen$Result$Close INSTANCE = new ScenarioPlanErrorScreen$Result$Close();
    public static final Parcelable.Creator<ScenarioPlanErrorScreen$Result$Close> CREATOR = new Instrument.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ScenarioPlanErrorScreen$Result$Close);
    }

    public final int hashCode() {
        return 1265417694;
    }

    public final String toString() {
        return Constants.META_CLOSE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
