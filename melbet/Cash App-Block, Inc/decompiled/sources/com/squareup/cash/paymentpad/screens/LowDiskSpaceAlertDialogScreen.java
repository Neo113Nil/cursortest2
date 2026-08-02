package com.squareup.cash.paymentpad.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.payments.common.PaymentRecipient;

/* loaded from: classes.dex */
public final class LowDiskSpaceAlertDialogScreen implements DialogScreen {
    public static final Parcelable.Creator<LowDiskSpaceAlertDialogScreen> CREATOR = new PaymentRecipient.Creator(27);
    public final double spaceNeeded;

    public LowDiskSpaceAlertDialogScreen(double d) {
        this.spaceNeeded = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LowDiskSpaceAlertDialogScreen) && Double.compare(this.spaceNeeded, ((LowDiskSpaceAlertDialogScreen) obj).spaceNeeded) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.spaceNeeded);
    }

    public final String toString() {
        return "LowDiskSpaceAlertDialogScreen(spaceNeeded=" + this.spaceNeeded + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.spaceNeeded);
    }
}
