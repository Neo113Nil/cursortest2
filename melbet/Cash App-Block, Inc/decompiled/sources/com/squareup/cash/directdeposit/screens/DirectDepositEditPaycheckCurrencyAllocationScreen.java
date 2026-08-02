package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DirectDepositEditPaycheckCurrencyAllocationScreen implements DirectDepositManualSetupScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<DirectDepositEditPaycheckCurrencyAllocationScreen> CREATOR = new Limit.Creator(12);
    public final AskedQuestion question;
    public final String token;

    public DirectDepositEditPaycheckCurrencyAllocationScreen(String str, AskedQuestion askedQuestion) {
        str.getClass();
        askedQuestion.getClass();
        this.token = str;
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
        if (!(obj instanceof DirectDepositEditPaycheckCurrencyAllocationScreen)) {
            return false;
        }
        DirectDepositEditPaycheckCurrencyAllocationScreen directDepositEditPaycheckCurrencyAllocationScreen = (DirectDepositEditPaycheckCurrencyAllocationScreen) obj;
        return Intrinsics.areEqual(this.token, directDepositEditPaycheckCurrencyAllocationScreen.token) && Intrinsics.areEqual(this.question, directDepositEditPaycheckCurrencyAllocationScreen.question);
    }

    public final int hashCode() {
        return this.question.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "DirectDepositEditPaycheckCurrencyAllocationScreen(token=" + this.token + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeParcelable(this.question, i);
    }
}
