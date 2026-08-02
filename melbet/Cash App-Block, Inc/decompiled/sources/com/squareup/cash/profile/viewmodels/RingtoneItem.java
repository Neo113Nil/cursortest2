package com.squareup.cash.profile.viewmodels;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.viewmodels.Alias;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RingtoneItem implements Parcelable {
    public static final Parcelable.Creator<RingtoneItem> CREATOR = new Alias.Creator(23);
    public final int nameResId;
    public final Uri persistedUri;
    public final Uri playbackUri;

    public RingtoneItem(int i, Uri uri, Uri uri2) {
        uri.getClass();
        uri2.getClass();
        this.nameResId = i;
        this.playbackUri = uri;
        this.persistedUri = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RingtoneItem)) {
            return false;
        }
        RingtoneItem ringtoneItem = (RingtoneItem) obj;
        return this.nameResId == ringtoneItem.nameResId && Intrinsics.areEqual(this.playbackUri, ringtoneItem.playbackUri) && Intrinsics.areEqual(this.persistedUri, ringtoneItem.persistedUri);
    }

    public final int hashCode() {
        return this.persistedUri.hashCode() + ((this.playbackUri.hashCode() + (Integer.hashCode(this.nameResId) * 31)) * 31);
    }

    public final String toString() {
        return "RingtoneItem(nameResId=" + this.nameResId + ", playbackUri=" + this.playbackUri + ", persistedUri=" + this.persistedUri + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.nameResId);
        parcel.writeParcelable(this.playbackUri, i);
        parcel.writeParcelable(this.persistedUri, i);
    }
}
