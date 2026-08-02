package com.squareup.cash.cashapplite.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;

/* loaded from: classes.dex */
public final class LiteBalanceHomeScreen implements Screen {
    public static final LiteBalanceHomeScreen INSTANCE = new LiteBalanceHomeScreen();
    public static final Parcelable.Creator<LiteBalanceHomeScreen> CREATOR = new CheckCaptureQuestion.Creator(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LiteBalanceHomeScreen);
    }

    public final int hashCode() {
        return -1113260818;
    }

    public final String toString() {
        return "LiteBalanceHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
