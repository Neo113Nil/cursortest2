package com.squareup.cash.directdeposit.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaycheckDepositAllocation extends Parcelable {

    public final class All implements PaycheckDepositAllocation {
        public static final All INSTANCE = new All();
        public static final Parcelable.Creator<All> CREATOR = new Limit.Creator(3);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class CurrencyAmount implements PaycheckDepositAllocation {
        public static final Parcelable.Creator<CurrencyAmount> CREATOR = new Limit.Creator(4);
        public final Money amount;
        public final String inputText;

        public CurrencyAmount(Money money, String str) {
            money.getClass();
            str.getClass();
            this.amount = money;
            this.inputText = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrencyAmount)) {
                return false;
            }
            CurrencyAmount currencyAmount = (CurrencyAmount) obj;
            return Intrinsics.areEqual(this.amount, currencyAmount.amount) && Intrinsics.areEqual(this.inputText, currencyAmount.inputText);
        }

        public final int hashCode() {
            return this.inputText.hashCode() + (this.amount.hashCode() * 31);
        }

        public final String toString() {
            return "CurrencyAmount(amount=" + this.amount + ", inputText=" + this.inputText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.inputText);
        }
    }

    public final class Percentage implements PaycheckDepositAllocation {
        public static final Parcelable.Creator<Percentage> CREATOR = new Limit.Creator(5);
        public final int percentage;

        public Percentage(int i) {
            this.percentage = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Percentage) && this.percentage == ((Percentage) obj).percentage;
        }

        public final int hashCode() {
            return Integer.hashCode(this.percentage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.percentage, "Percentage(percentage=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.percentage);
        }
    }
}
