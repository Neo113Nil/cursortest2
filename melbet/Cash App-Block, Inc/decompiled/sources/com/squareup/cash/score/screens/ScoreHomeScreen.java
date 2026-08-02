package com.squareup.cash.score.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.screens.BoostDetailsScreen;

/* loaded from: classes.dex */
public final class ScoreHomeScreen implements Screen, RestoringScreen {
    public static final ScoreHomeScreen INSTANCE = new ScoreHomeScreen();
    public static final Parcelable.Creator<ScoreHomeScreen> CREATOR = new BoostDetailsScreen.Creator(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ScoreHomeScreen);
    }

    public final int hashCode() {
        return -704623800;
    }

    public final String toString() {
        return "ScoreHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
