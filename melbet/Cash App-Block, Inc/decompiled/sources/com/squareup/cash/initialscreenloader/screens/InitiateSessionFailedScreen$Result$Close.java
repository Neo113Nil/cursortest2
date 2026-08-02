package com.squareup.cash.initialscreenloader.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.fileupload.api.UriString;

/* loaded from: classes6.dex */
public final class InitiateSessionFailedScreen$Result$Close implements Parcelable {
    public static final InitiateSessionFailedScreen$Result$Close INSTANCE = new InitiateSessionFailedScreen$Result$Close();
    public static final Parcelable.Creator<InitiateSessionFailedScreen$Result$Close> CREATOR = new UriString.Creator(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof InitiateSessionFailedScreen$Result$Close);
    }

    public final int hashCode() {
        return 639417427;
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
