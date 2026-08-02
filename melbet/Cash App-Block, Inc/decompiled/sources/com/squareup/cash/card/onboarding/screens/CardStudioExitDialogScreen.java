package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CardStudioExitDialogScreen implements DialogScreen {
    public static final Parcelable.Creator<CardStudioExitDialogScreen> CREATOR = new BorrowLimitHub.Creator(25);
    public final AskedQuestion question;

    public CardStudioExitDialogScreen(AskedQuestion askedQuestion) {
        this.question = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardStudioExitDialogScreen) && Intrinsics.areEqual(this.question, ((CardStudioExitDialogScreen) obj).question);
    }

    public final int hashCode() {
        AskedQuestion askedQuestion = this.question;
        if (askedQuestion == null) {
            return 0;
        }
        return askedQuestion.hashCode();
    }

    public final String toString() {
        return "CardStudioExitDialogScreen(question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.question, i);
    }
}
