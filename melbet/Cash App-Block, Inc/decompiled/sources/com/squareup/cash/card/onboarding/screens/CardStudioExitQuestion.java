package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.borrow.screens.BorrowLimitHub;

/* loaded from: classes5.dex */
public final class CardStudioExitQuestion implements Question {
    public static final CardStudioExitQuestion INSTANCE = new CardStudioExitQuestion();
    public static final Parcelable.Creator<CardStudioExitQuestion> CREATOR = new BorrowLimitHub.Creator(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
