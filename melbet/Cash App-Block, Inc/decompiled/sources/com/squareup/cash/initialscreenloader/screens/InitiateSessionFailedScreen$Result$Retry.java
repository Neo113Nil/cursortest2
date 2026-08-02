package com.squareup.cash.initialscreenloader.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.fileupload.api.UriString;

/* loaded from: classes6.dex */
public final class InitiateSessionFailedScreen$Result$Retry implements Parcelable {
    public static final InitiateSessionFailedScreen$Result$Retry INSTANCE = new InitiateSessionFailedScreen$Result$Retry();
    public static final Parcelable.Creator<InitiateSessionFailedScreen$Result$Retry> CREATOR = new UriString.Creator(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof InitiateSessionFailedScreen$Result$Retry);
    }

    public final int hashCode() {
        return 653066499;
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
