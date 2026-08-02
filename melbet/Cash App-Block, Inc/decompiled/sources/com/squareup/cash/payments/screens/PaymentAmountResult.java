package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaymentAmountResult extends Parcelable {

    public final class EditAmountResult implements PaymentAmountResult {
        public static final Parcelable.Creator<EditAmountResult> CREATOR = new NearbyPayer.Creator(2);
        public final Money amount;

        public EditAmountResult(Money money) {
            money.getClass();
            this.amount = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditAmountResult) && Intrinsics.areEqual(this.amount, ((EditAmountResult) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "EditAmountResult(amount=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
        }
    }
}
