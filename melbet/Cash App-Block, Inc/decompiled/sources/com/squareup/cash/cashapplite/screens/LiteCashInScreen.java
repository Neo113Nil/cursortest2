package com.squareup.cash.cashapplite.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;

/* loaded from: classes.dex */
public final class LiteCashInScreen implements Screen {
    public static final LiteCashInScreen INSTANCE = new LiteCashInScreen();
    public static final Parcelable.Creator<LiteCashInScreen> CREATOR = new CheckCaptureQuestion.Creator(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LiteCashInScreen);
    }

    public final int hashCode() {
        return 2006699805;
    }

    public final String toString() {
        return "LiteCashInScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
