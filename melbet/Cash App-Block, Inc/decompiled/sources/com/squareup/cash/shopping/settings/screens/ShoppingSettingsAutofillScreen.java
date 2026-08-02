package com.squareup.cash.shopping.settings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.screens.RedactedString;

/* loaded from: classes.dex */
public final class ShoppingSettingsAutofillScreen implements Screen {
    public static final ShoppingSettingsAutofillScreen INSTANCE = new ShoppingSettingsAutofillScreen();
    public static final Parcelable.Creator<ShoppingSettingsAutofillScreen> CREATOR = new RedactedString.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ShoppingSettingsAutofillScreen);
    }

    public final int hashCode() {
        return -285300025;
    }

    public final String toString() {
        return "ShoppingSettingsAutofillScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
