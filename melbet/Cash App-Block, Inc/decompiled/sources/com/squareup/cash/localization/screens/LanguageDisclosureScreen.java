package com.squareup.cash.localization.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.limits.screens.LimitsScreen;

/* loaded from: classes.dex */
public final class LanguageDisclosureScreen implements Screen {
    public static final LanguageDisclosureScreen INSTANCE = new LanguageDisclosureScreen();
    public static final Parcelable.Creator<LanguageDisclosureScreen> CREATOR = new LimitsScreen.Creator(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LanguageDisclosureScreen);
    }

    public final int hashCode() {
        return 364957275;
    }

    public final String toString() {
        return "LanguageDisclosureScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
