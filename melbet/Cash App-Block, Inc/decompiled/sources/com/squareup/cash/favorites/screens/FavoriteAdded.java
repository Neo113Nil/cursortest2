package com.squareup.cash.favorites.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;

/* loaded from: classes.dex */
public final class FavoriteAdded implements DialogScreen {
    public static final Parcelable.Creator<FavoriteAdded> CREATOR = new UriString.Creator(4);
    public final Color accentColor;
    public final String message;
    public final Character monogram;
    public final String name;
    public final Image photo;
    public final boolean showViewFavorites;

    public FavoriteAdded(String str, String str2, Image image, Color color, Character ch, boolean z) {
        str.getClass();
        this.name = str;
        this.message = str2;
        this.photo = image;
        this.accentColor = color;
        this.monogram = ch;
        this.showViewFavorites = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        char charValue;
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.message);
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.accentColor, i);
        Character ch = this.monogram;
        if (ch == null) {
            charValue = 0;
        } else {
            parcel.writeInt(1);
            charValue = ch.charValue();
        }
        parcel.writeInt(charValue);
        parcel.writeInt(this.showViewFavorites ? 1 : 0);
    }
}
