package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.screens.NearbyPayer;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaymentScheduleSelection implements Parcelable {
    public static final Parcelable.Creator<PaymentScheduleSelection> CREATOR = new NearbyPayer.Creator(17);
    public final LocalDate date;
    public final PaymentScheduleFrequency frequency;

    public PaymentScheduleSelection(LocalDate localDate, PaymentScheduleFrequency paymentScheduleFrequency) {
        localDate.getClass();
        paymentScheduleFrequency.getClass();
        this.date = localDate;
        this.frequency = paymentScheduleFrequency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentScheduleSelection)) {
            return false;
        }
        PaymentScheduleSelection paymentScheduleSelection = (PaymentScheduleSelection) obj;
        return Intrinsics.areEqual(this.date, paymentScheduleSelection.date) && this.frequency == paymentScheduleSelection.frequency;
    }

    public final int hashCode() {
        return this.frequency.hashCode() + (this.date.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentScheduleSelection(date=" + this.date + ", frequency=" + this.frequency + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.date);
        parcel.writeString(this.frequency.name());
    }
}
