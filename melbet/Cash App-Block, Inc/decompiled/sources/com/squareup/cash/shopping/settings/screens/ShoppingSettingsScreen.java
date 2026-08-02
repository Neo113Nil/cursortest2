package com.squareup.cash.shopping.settings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.screens.RedactedString;

/* loaded from: classes.dex */
public final class ShoppingSettingsScreen implements Screen {
    public static final ShoppingSettingsScreen INSTANCE = new ShoppingSettingsScreen();
    public static final Parcelable.Creator<ShoppingSettingsScreen> CREATOR = new RedactedString.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ShoppingSettingsScreen);
    }

    public final int hashCode() {
        return 1064993141;
    }

    public final String toString() {
        return "ShoppingSettingsScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
