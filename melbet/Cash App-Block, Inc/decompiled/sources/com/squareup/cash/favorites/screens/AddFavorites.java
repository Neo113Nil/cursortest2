package com.squareup.cash.favorites.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.fileupload.api.UriString;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AddFavorites implements Screen {
    public static final Parcelable.Creator<AddFavorites> CREATOR = new UriString.Creator(3);
    public final UUID externalId;

    public AddFavorites(UUID uuid) {
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
        return (obj instanceof AddFavorites) && Intrinsics.areEqual(this.externalId, ((AddFavorites) obj).externalId);
    }

    public final int hashCode() {
        return this.externalId.hashCode();
    }

    public final String toString() {
        return "AddFavorites(externalId=" + this.externalId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.externalId);
    }
}
