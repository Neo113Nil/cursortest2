package com.squareup.cash.profile.viewmodels;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.viewmodels.Alias;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RingtoneResult implements Parcelable {
    public static final Parcelable.Creator<RingtoneResult> CREATOR = new Alias.Creator(24);
    public final Uri ringtoneUri;

    public RingtoneResult(Uri uri) {
        this.ringtoneUri = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RingtoneResult) && Intrinsics.areEqual(this.ringtoneUri, ((RingtoneResult) obj).ringtoneUri);
    }

    public final int hashCode() {
        Uri uri = this.ringtoneUri;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "RingtoneResult(ringtoneUri=" + this.ringtoneUri + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.ringtoneUri, i);
    }
}
