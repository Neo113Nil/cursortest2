package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.payments.common.PaymentRecipient;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes.dex */
public final class PaycheckReceiptScreen implements PaychecksScreen, BottomSheetScreen {
    public static final Parcelable.Creator<PaycheckReceiptScreen> CREATOR = new PaymentRecipient.Creator(23);
    public final Paycheck paycheck;

    public PaycheckReceiptScreen(Paycheck paycheck) {
        paycheck.getClass();
        this.paycheck = paycheck;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaycheckReceiptScreen) && Intrinsics.areEqual(this.paycheck, ((PaycheckReceiptScreen) obj).paycheck);
    }

    public final int hashCode() {
        return this.paycheck.hashCode();
    }

    public final String toString() {
        return "PaycheckReceiptScreen(paycheck=" + this.paycheck + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.paycheck, i);
    }
}
