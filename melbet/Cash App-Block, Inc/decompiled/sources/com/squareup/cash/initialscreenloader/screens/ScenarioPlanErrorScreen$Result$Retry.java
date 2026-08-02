package com.squareup.cash.initialscreenloader.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.instruments.common.Instrument;

/* loaded from: classes6.dex */
public final class ScenarioPlanErrorScreen$Result$Retry implements Parcelable {
    public static final ScenarioPlanErrorScreen$Result$Retry INSTANCE = new ScenarioPlanErrorScreen$Result$Retry();
    public static final Parcelable.Creator<ScenarioPlanErrorScreen$Result$Retry> CREATOR = new Instrument.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ScenarioPlanErrorScreen$Result$Retry);
    }

    public final int hashCode() {
        return 1279066766;
    }

    public final String toString() {
        return "Retry";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
