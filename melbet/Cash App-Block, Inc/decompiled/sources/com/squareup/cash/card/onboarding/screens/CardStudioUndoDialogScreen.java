package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.borrow.screens.BorrowLimitHub;

/* loaded from: classes.dex */
public final class CardStudioUndoDialogScreen implements DialogScreen {
    public static final CardStudioUndoDialogScreen INSTANCE = new CardStudioUndoDialogScreen();
    public static final Parcelable.Creator<CardStudioUndoDialogScreen> CREATOR = new BorrowLimitHub.Creator(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CardStudioUndoDialogScreen);
    }

    public final int hashCode() {
        return -146975444;
    }

    public final String toString() {
        return "CardStudioUndoDialogScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
