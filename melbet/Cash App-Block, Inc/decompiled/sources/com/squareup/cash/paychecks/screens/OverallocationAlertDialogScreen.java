package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.paychecks.backend.api.model.PaychecksAlertUi;
import com.squareup.cash.payments.common.PaymentRecipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OverallocationAlertDialogScreen implements PaycheckAlertDialogScreen {
    public static final Parcelable.Creator<OverallocationAlertDialogScreen> CREATOR = new PaymentRecipient.Creator(19);
    public final PaychecksAlertUi alert;

    public OverallocationAlertDialogScreen(PaychecksAlertUi paychecksAlertUi) {
        paychecksAlertUi.getClass();
        this.alert = paychecksAlertUi;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverallocationAlertDialogScreen) && Intrinsics.areEqual(this.alert, ((OverallocationAlertDialogScreen) obj).alert);
    }

    public final int hashCode() {
        return this.alert.hashCode();
    }

    public final String toString() {
        return "OverallocationAlertDialogScreen(alert=" + this.alert + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.alert, i);
    }
}
