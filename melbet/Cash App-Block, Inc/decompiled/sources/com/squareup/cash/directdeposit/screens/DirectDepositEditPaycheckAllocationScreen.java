package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DirectDepositEditPaycheckAllocationScreen implements DirectDepositManualSetupScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<DirectDepositEditPaycheckAllocationScreen> CREATOR = new Limit.Creator(10);
    public final AskedQuestion question;
    public final String token;

    /* loaded from: classes6.dex */
    public final class EditPaycheckQuestion implements Question {
        public static final Parcelable.Creator<EditPaycheckQuestion> CREATOR = new Limit.Creator(11);
        public final PaycheckDepositAllocation paycheckDepositAllocation;

        public EditPaycheckQuestion(PaycheckDepositAllocation paycheckDepositAllocation) {
            paycheckDepositAllocation.getClass();
            this.paycheckDepositAllocation = paycheckDepositAllocation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditPaycheckQuestion) && Intrinsics.areEqual(this.paycheckDepositAllocation, ((EditPaycheckQuestion) obj).paycheckDepositAllocation);
        }

        public final int hashCode() {
            return this.paycheckDepositAllocation.hashCode();
        }

        public final String toString() {
            return "EditPaycheckQuestion(paycheckDepositAllocation=" + this.paycheckDepositAllocation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.paycheckDepositAllocation, i);
        }
    }

    public DirectDepositEditPaycheckAllocationScreen(String str, AskedQuestion askedQuestion) {
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
        if (!(obj instanceof DirectDepositEditPaycheckAllocationScreen)) {
            return false;
        }
        DirectDepositEditPaycheckAllocationScreen directDepositEditPaycheckAllocationScreen = (DirectDepositEditPaycheckAllocationScreen) obj;
        return Intrinsics.areEqual(this.token, directDepositEditPaycheckAllocationScreen.token) && Intrinsics.areEqual(this.question, directDepositEditPaycheckAllocationScreen.question);
    }

    @Override // com.squareup.cash.directdeposit.screens.DirectDepositManualSetupScreen
    public final String getToken() {
        throw null;
    }

    public final int hashCode() {
        return this.question.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "DirectDepositEditPaycheckAllocationScreen(token=" + this.token + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeParcelable(this.question, i);
    }
}
