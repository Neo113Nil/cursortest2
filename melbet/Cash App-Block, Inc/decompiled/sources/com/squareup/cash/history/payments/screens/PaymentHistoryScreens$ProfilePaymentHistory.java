package com.squareup.cash.history.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.cash.screens.Redacted;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaymentHistoryScreens$ProfilePaymentHistory implements Parcelable {
    public static final Parcelable.Creator<PaymentHistoryScreens$ProfilePaymentHistory> CREATOR = new UriString.Creator(19);
    public final boolean isBusiness;
    public final boolean isCashCustomer;
    public final Redacted profileId;

    public PaymentHistoryScreens$ProfilePaymentHistory(Redacted redacted, boolean z, boolean z2) {
        redacted.getClass();
        this.profileId = redacted;
        this.isCashCustomer = z;
        this.isBusiness = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryScreens$ProfilePaymentHistory)) {
            return false;
        }
        PaymentHistoryScreens$ProfilePaymentHistory paymentHistoryScreens$ProfilePaymentHistory = (PaymentHistoryScreens$ProfilePaymentHistory) obj;
        return Intrinsics.areEqual(this.profileId, paymentHistoryScreens$ProfilePaymentHistory.profileId) && this.isCashCustomer == paymentHistoryScreens$ProfilePaymentHistory.isCashCustomer && this.isBusiness == paymentHistoryScreens$ProfilePaymentHistory.isBusiness;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isBusiness) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.profileId.hashCode() * 31, 31, this.isCashCustomer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilePaymentHistory(profileId=");
        sb.append(this.profileId);
        sb.append(", isCashCustomer=");
        sb.append(this.isCashCustomer);
        sb.append(", isBusiness=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isBusiness, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.profileId, i);
        parcel.writeInt(this.isCashCustomer ? 1 : 0);
        parcel.writeInt(this.isBusiness ? 1 : 0);
    }
}
