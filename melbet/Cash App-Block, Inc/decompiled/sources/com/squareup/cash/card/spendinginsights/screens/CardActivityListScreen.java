package com.squareup.cash.card.spendinginsights.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CardActivityListScreen implements SpendingInsightsScreen, RestoringScreen {
    public static final Parcelable.Creator<CardActivityListScreen> CREATOR = new CheckCaptureQuestion.Creator(9);
    public final String title;

    public CardActivityListScreen(String str) {
        str.getClass();
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardActivityListScreen) && Intrinsics.areEqual(this.title, ((CardActivityListScreen) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardActivityListScreen(title=", this.title, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
    }
}
