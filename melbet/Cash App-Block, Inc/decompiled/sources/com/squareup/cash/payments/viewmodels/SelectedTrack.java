package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectedTrack implements Parcelable {
    public static final Parcelable.Creator<SelectedTrack> CREATOR = new Size.Creator(22);
    public final Image albumArt;
    public final String artist;
    public final String musicId;
    public final String title;

    public SelectedTrack(Image image, String str, String str2, String str3) {
        image.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.albumArt = image;
        this.title = str;
        this.artist = str2;
        this.musicId = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedTrack)) {
            return false;
        }
        SelectedTrack selectedTrack = (SelectedTrack) obj;
        return Intrinsics.areEqual(this.albumArt, selectedTrack.albumArt) && Intrinsics.areEqual(this.title, selectedTrack.title) && Intrinsics.areEqual(this.artist, selectedTrack.artist) && Intrinsics.areEqual(this.musicId, selectedTrack.musicId);
    }

    public final int hashCode() {
        return this.musicId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.albumArt.hashCode() * 31, 31, this.title), 31, this.artist);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.albumArt, "SelectedTrack(albumArt=", ", title=", this.title, ", artist="), this.artist, ", musicId=", this.musicId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.albumArt, i);
        parcel.writeString(this.title);
        parcel.writeString(this.artist);
        parcel.writeString(this.musicId);
    }
}
