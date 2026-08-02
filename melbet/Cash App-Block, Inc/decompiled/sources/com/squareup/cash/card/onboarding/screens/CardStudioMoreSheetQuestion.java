package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.borrow.screens.BorrowLimitHub;

/* loaded from: classes5.dex */
public final class CardStudioMoreSheetQuestion implements Question {
    public static final CardStudioMoreSheetQuestion INSTANCE = new CardStudioMoreSheetQuestion();
    public static final Parcelable.Creator<CardStudioMoreSheetQuestion> CREATOR = new BorrowLimitHub.Creator(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CardStudioMoreSheetQuestion);
    }

    public final int hashCode() {
        return -39750340;
    }

    public final String toString() {
        return "CardStudioMoreSheetQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
