package com.squareup.cash.favorites.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.fileupload.api.UriString;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ListFavorites implements Screen {
    public static final Parcelable.Creator<ListFavorites> CREATOR = new UriString.Creator(6);
    public final UUID externalId;

    public ListFavorites(UUID uuid) {
        uuid.getClass();
        this.externalId = uuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListFavorites) && Intrinsics.areEqual(this.externalId, ((ListFavorites) obj).externalId);
    }

    public final int hashCode() {
        return this.externalId.hashCode();
    }

    public final String toString() {
        return "ListFavorites(externalId=" + this.externalId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.externalId);
    }
}
