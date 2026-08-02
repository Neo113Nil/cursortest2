package com.squareup.cash.card.spendinginsights.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;

/* loaded from: classes.dex */
public final class SpendingInsightsHomeScreen implements SpendingInsightsScreen, RestoringScreen {
    public static final SpendingInsightsHomeScreen INSTANCE = new SpendingInsightsHomeScreen();
    public static final Parcelable.Creator<SpendingInsightsHomeScreen> CREATOR = new CheckCaptureQuestion.Creator(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SpendingInsightsHomeScreen);
    }

    public final int hashCode() {
        return 1108693364;
    }

    public final String toString() {
        return "SpendingInsightsHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
