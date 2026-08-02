package com.squareup.cash.family.familyhub.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ControlDisablingConfirmationResult extends Parcelable {

    public final class Negative implements ControlDisablingConfirmationResult {
        public static final Parcelable.Creator<Negative> CREATOR = new FamilyHome.Creator(19);
        public final Money limit;

        public Negative(Money money) {
            this.limit = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Negative) && Intrinsics.areEqual(this.limit, ((Negative) obj).limit);
        }

        public final int hashCode() {
            Money money = this.limit;
            if (money == null) {
                return 0;
            }
            return money.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.limit, "Negative(limit=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.limit, i);
        }
    }

    public final class Positive implements ControlDisablingConfirmationResult {
        public static final Parcelable.Creator<Positive> CREATOR = new FamilyHome.Creator(20);
        public final Money limit;

        public Positive(Money money) {
            this.limit = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Positive) && Intrinsics.areEqual(this.limit, ((Positive) obj).limit);
        }

        public final int hashCode() {
            Money money = this.limit;
            if (money == null) {
                return 0;
            }
            return money.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.limit, "Positive(limit=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.limit, i);
        }
    }
}
