package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MoneybotAmountInputAnswer implements Parcelable {

    public final class Dismissed extends MoneybotAmountInputAnswer {
        public static final Dismissed INSTANCE = new Dismissed();
        public static final Parcelable.Creator<Dismissed> CREATOR = new LimitsScreen.Creator(28);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -1062040248;
        }

        public final String toString() {
            return "Dismissed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Selected extends MoneybotAmountInputAnswer {
        public static final Parcelable.Creator<Selected> CREATOR = new LimitsScreen.Creator(29);
        public final Money amount;

        public Selected(Money money) {
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
            return (obj instanceof Selected) && Intrinsics.areEqual(this.amount, ((Selected) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "Selected(amount=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
        }
    }
}
