package com.squareup.cash.cashapplite.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;

/* loaded from: classes.dex */
public final class LiteAddMoneyScreen implements Screen, OnlyOneOverlayTreatment {
    public static final LiteAddMoneyScreen INSTANCE = new LiteAddMoneyScreen();
    public static final Parcelable.Creator<LiteAddMoneyScreen> CREATOR = new CheckCaptureQuestion.Creator(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LiteAddMoneyScreen);
    }

    public final int hashCode() {
        return -944577404;
    }

    public final String toString() {
        return "LiteAddMoneyScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
