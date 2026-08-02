package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.payments.common.PaymentRecipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaycheckAggregationReceiptScreen implements PaychecksScreen, BottomSheetScreen {
    public static final Parcelable.Creator<PaycheckAggregationReceiptScreen> CREATOR = new PaymentRecipient.Creator(21);
    public final PaychecksUiState.CalendarMonthPaychecksAggregation aggregation;

    public PaycheckAggregationReceiptScreen(PaychecksUiState.CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation) {
        calendarMonthPaychecksAggregation.getClass();
        this.aggregation = calendarMonthPaychecksAggregation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaycheckAggregationReceiptScreen) && Intrinsics.areEqual(this.aggregation, ((PaycheckAggregationReceiptScreen) obj).aggregation);
    }

    public final int hashCode() {
        return this.aggregation.hashCode();
    }

    public final String toString() {
        return "PaycheckAggregationReceiptScreen(aggregation=" + this.aggregation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.aggregation, i);
    }
}
