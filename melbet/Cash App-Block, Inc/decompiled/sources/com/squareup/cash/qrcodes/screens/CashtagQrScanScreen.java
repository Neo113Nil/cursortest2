package com.squareup.cash.qrcodes.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.recipients.data.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CashtagQrScanScreen implements QrScreen {
    public static final Parcelable.Creator<CashtagQrScanScreen> CREATOR = new Recipient.Creator(2);
    public final AskedQuestion question;

    public CashtagQrScanScreen(AskedQuestion askedQuestion) {
        askedQuestion.getClass();
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
        return (obj instanceof CashtagQrScanScreen) && Intrinsics.areEqual(this.question, ((CashtagQrScanScreen) obj).question);
    }

    public final int hashCode() {
        return this.question.hashCode();
    }

    public final String toString() {
        return "CashtagQrScanScreen(question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.question, i);
    }
}
