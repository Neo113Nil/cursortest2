package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinDepositNoteScreen extends MainScreens {
    public static final Parcelable.Creator<BitcoinDepositNoteScreen> CREATOR = new BitcoinHome.Creator(5);
    public final AskedQuestion askedQuestion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinDepositNoteScreen(AskedQuestion askedQuestion) {
        super(1);
        askedQuestion.getClass();
        this.askedQuestion = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinDepositNoteScreen) && Intrinsics.areEqual(this.askedQuestion, ((BitcoinDepositNoteScreen) obj).askedQuestion);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.askedQuestion.hashCode();
    }

    public final String toString() {
        return "BitcoinDepositNoteScreen(askedQuestion=" + this.askedQuestion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.askedQuestion, i);
    }
}
