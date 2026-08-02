package com.squareup.cash.borrow.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.protos.lending.CustomRepaymentAmountSelectionData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RepayCustomAmountPicker implements BorrowScreen {
    public static final Parcelable.Creator<RepayCustomAmountPicker> CREATOR = new BorrowLimitHub.Creator(4);
    public final CustomRepaymentAmountSelectionData repaymentData;

    public RepayCustomAmountPicker(CustomRepaymentAmountSelectionData customRepaymentAmountSelectionData) {
        customRepaymentAmountSelectionData.getClass();
        this.repaymentData = customRepaymentAmountSelectionData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RepayCustomAmountPicker) && Intrinsics.areEqual(this.repaymentData, ((RepayCustomAmountPicker) obj).repaymentData);
    }

    public final int hashCode() {
        return this.repaymentData.hashCode();
    }

    public final String toString() {
        return "RepayCustomAmountPicker(repaymentData=" + this.repaymentData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.repaymentData, i);
    }
}
