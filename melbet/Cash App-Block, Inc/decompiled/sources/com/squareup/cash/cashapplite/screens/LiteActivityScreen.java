package com.squareup.cash.cashapplite.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;

/* loaded from: classes.dex */
public final class LiteActivityScreen implements Screen {
    public static final LiteActivityScreen INSTANCE = new LiteActivityScreen();
    public static final Parcelable.Creator<LiteActivityScreen> CREATOR = new CheckCaptureQuestion.Creator(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LiteActivityScreen);
    }

    public final int hashCode() {
        return 2083213044;
    }

    public final String toString() {
        return "LiteActivityScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
