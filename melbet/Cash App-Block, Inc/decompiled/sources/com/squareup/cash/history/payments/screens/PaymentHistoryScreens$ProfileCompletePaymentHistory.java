package com.squareup.cash.history.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaymentHistoryScreens$ProfileCompletePaymentHistory implements Screen {
    public static final Parcelable.Creator<PaymentHistoryScreens$ProfileCompletePaymentHistory> CREATOR = new UriString.Creator(18);
    public final Redacted profileId;

    public PaymentHistoryScreens$ProfileCompletePaymentHistory(String str) {
        str.getClass();
        this.profileId = new RedactedString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentHistoryScreens$ProfileCompletePaymentHistory) && Intrinsics.areEqual(this.profileId, ((PaymentHistoryScreens$ProfileCompletePaymentHistory) obj).profileId);
    }

    public final int hashCode() {
        return this.profileId.hashCode();
    }

    public final String toString() {
        return "ProfileCompletePaymentHistory(profileId=" + this.profileId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.profileId, i);
    }

    public PaymentHistoryScreens$ProfileCompletePaymentHistory(Redacted redacted) {
        redacted.getClass();
        this.profileId = redacted;
    }
}
