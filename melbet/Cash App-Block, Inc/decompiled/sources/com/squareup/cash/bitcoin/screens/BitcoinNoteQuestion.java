package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinNoteQuestion implements Question {
    public static final Parcelable.Creator<BitcoinNoteQuestion> CREATOR = new BitcoinHome.Creator(21);
    public final String currentNote;

    public BitcoinNoteQuestion(String str) {
        this.currentNote = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinNoteQuestion) && Intrinsics.areEqual(this.currentNote, ((BitcoinNoteQuestion) obj).currentNote);
    }

    public final int hashCode() {
        String str = this.currentNote;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinNoteQuestion(currentNote=", this.currentNote, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.currentNote);
    }
}
