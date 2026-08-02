package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.music.screens.MusicScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MoneybotStaticPickerScreen implements MoneybotScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<MoneybotStaticPickerScreen> CREATOR = new MusicScreen.Creator(19);
    public final AskedQuestion askedQuestion;

    public MoneybotStaticPickerScreen(AskedQuestion askedQuestion) {
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
        return (obj instanceof MoneybotStaticPickerScreen) && Intrinsics.areEqual(this.askedQuestion, ((MoneybotStaticPickerScreen) obj).askedQuestion);
    }

    public final int hashCode() {
        return this.askedQuestion.hashCode();
    }

    public final String toString() {
        return "MoneybotStaticPickerScreen(askedQuestion=" + this.askedQuestion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.askedQuestion, i);
    }
}
