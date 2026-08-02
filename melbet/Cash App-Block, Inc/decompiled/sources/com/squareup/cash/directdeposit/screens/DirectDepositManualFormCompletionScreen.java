package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DirectDepositManualFormCompletionScreen implements DirectDepositManualFormSubmissionScreen {
    public static final Parcelable.Creator<DirectDepositManualFormCompletionScreen> CREATOR = new Limit.Creator(14);
    public final DirectDepositManualFormSubmissionScreen.FormDetails formDetails;
    public final String token;

    public DirectDepositManualFormCompletionScreen(String str, DirectDepositManualFormSubmissionScreen.FormDetails formDetails) {
        str.getClass();
        formDetails.getClass();
        this.token = str;
        this.formDetails = formDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositManualFormCompletionScreen)) {
            return false;
        }
        DirectDepositManualFormCompletionScreen directDepositManualFormCompletionScreen = (DirectDepositManualFormCompletionScreen) obj;
        return Intrinsics.areEqual(this.token, directDepositManualFormCompletionScreen.token) && Intrinsics.areEqual(this.formDetails, directDepositManualFormCompletionScreen.formDetails);
    }

    @Override // com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen
    public final DirectDepositManualFormSubmissionScreen.FormDetails getFormDetails() {
        return this.formDetails;
    }

    @Override // com.squareup.cash.directdeposit.screens.DirectDepositManualSetupScreen
    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        return this.formDetails.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "DirectDepositManualFormCompletionScreen(token=" + this.token + ", formDetails=" + this.formDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        this.formDetails.writeToParcel(parcel, i);
    }
}
