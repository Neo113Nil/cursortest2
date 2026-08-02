package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.music.screens.MusicScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MoneybotAmountInputScreen implements MoneybotScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<MoneybotAmountInputScreen> CREATOR = new MusicScreen.Creator(2);
    public final AskedQuestion askedQuestion;

    public MoneybotAmountInputScreen(AskedQuestion askedQuestion) {
        askedQuestion.getClass();
        this.askedQuestion = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneybotAmountInputScreen) && Intrinsics.areEqual(this.askedQuestion, ((MoneybotAmountInputScreen) obj).askedQuestion);
    }

    public final int hashCode() {
        return this.askedQuestion.hashCode();
    }

    public final String toString() {
        return "MoneybotAmountInputScreen(askedQuestion=" + this.askedQuestion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.askedQuestion, i);
    }
}
