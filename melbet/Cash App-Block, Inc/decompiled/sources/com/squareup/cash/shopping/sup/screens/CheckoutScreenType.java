package com.squareup.cash.shopping.sup.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface CheckoutScreenType extends Parcelable {

    public final class ConnectionFailedWarning implements CheckoutScreenType {
        public static final ConnectionFailedWarning INSTANCE = new ConnectionFailedWarning();
        public static final Parcelable.Creator<ConnectionFailedWarning> CREATOR = new ErrorScreen.Creator(7);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectionFailedWarning);
        }

        public final int hashCode() {
            return -74342630;
        }

        public final String toString() {
            return "ConnectionFailedWarning";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class CreditLimitExceededWarning implements CheckoutScreenType {
        public static final Parcelable.Creator<CreditLimitExceededWarning> CREATOR = new ErrorScreen.Creator(8);
        public final String availableLimit;
        public final String cartTotal;

        public CreditLimitExceededWarning(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.availableLimit = str;
            this.cartTotal = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreditLimitExceededWarning)) {
                return false;
            }
            CreditLimitExceededWarning creditLimitExceededWarning = (CreditLimitExceededWarning) obj;
            return Intrinsics.areEqual(this.availableLimit, creditLimitExceededWarning.availableLimit) && Intrinsics.areEqual(this.cartTotal, creditLimitExceededWarning.cartTotal);
        }

        public final int hashCode() {
            return this.cartTotal.hashCode() + (this.availableLimit.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("CreditLimitExceededWarning(availableLimit=", this.availableLimit, ", cartTotal=", this.cartTotal, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.availableLimit);
            parcel.writeString(this.cartTotal);
        }
    }

    public final class LoanLimitReached implements CheckoutScreenType {
        public static final Parcelable.Creator<LoanLimitReached> CREATOR = new ErrorScreen.Creator(9);
        public final Money creditLimit;

        public LoanLimitReached(Money money) {
            this.creditLimit = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoanLimitReached) && Intrinsics.areEqual(this.creditLimit, ((LoanLimitReached) obj).creditLimit);
        }

        public final int hashCode() {
            Money money = this.creditLimit;
            if (money == null) {
                return 0;
            }
            return money.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.creditLimit, "LoanLimitReached(creditLimit=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.creditLimit, i);
        }
    }

    public final class LoanLimitReachedError implements CheckoutScreenType {
        public static final Parcelable.Creator<LoanLimitReachedError> CREATOR = new ErrorScreen.Creator(10);
        public final Money creditLimit;

        public LoanLimitReachedError(Money money) {
            this.creditLimit = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoanLimitReachedError) && Intrinsics.areEqual(this.creditLimit, ((LoanLimitReachedError) obj).creditLimit);
        }

        public final int hashCode() {
            Money money = this.creditLimit;
            if (money == null) {
                return 0;
            }
            return money.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.creditLimit, "LoanLimitReachedError(creditLimit=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.creditLimit, i);
        }
    }

    public final class MinimumSpendRestrictedWarning implements CheckoutScreenType {
        public static final Parcelable.Creator<MinimumSpendRestrictedWarning> CREATOR = new ErrorScreen.Creator(11);
        public final String cartMinimum;
        public final String cartTotal;

        public MinimumSpendRestrictedWarning(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.cartMinimum = str;
            this.cartTotal = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MinimumSpendRestrictedWarning)) {
                return false;
            }
            MinimumSpendRestrictedWarning minimumSpendRestrictedWarning = (MinimumSpendRestrictedWarning) obj;
            return Intrinsics.areEqual(this.cartMinimum, minimumSpendRestrictedWarning.cartMinimum) && Intrinsics.areEqual(this.cartTotal, minimumSpendRestrictedWarning.cartTotal);
        }

        public final int hashCode() {
            return this.cartTotal.hashCode() + (this.cartMinimum.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("MinimumSpendRestrictedWarning(cartMinimum=", this.cartMinimum, ", cartTotal=", this.cartTotal, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.cartMinimum);
            parcel.writeString(this.cartTotal);
        }
    }

    public final class NonEmptyCartWarning implements CheckoutScreenType {
        public static final NonEmptyCartWarning INSTANCE = new NonEmptyCartWarning();
        public static final Parcelable.Creator<NonEmptyCartWarning> CREATOR = new ErrorScreen.Creator(12);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NonEmptyCartWarning);
        }

        public final int hashCode() {
            return 451031797;
        }

        public final String toString() {
            return "NonEmptyCartWarning";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class OneTimeCardContext implements CheckoutScreenType {
        public static final Parcelable.Creator<OneTimeCardContext> CREATOR = new ErrorScreen.Creator(13);
        public final String availableLimit;
        public final String merchantName;

        public OneTimeCardContext(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.availableLimit = str;
            this.merchantName = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OneTimeCardContext)) {
                return false;
            }
            OneTimeCardContext oneTimeCardContext = (OneTimeCardContext) obj;
            return Intrinsics.areEqual(this.availableLimit, oneTimeCardContext.availableLimit) && Intrinsics.areEqual(this.merchantName, oneTimeCardContext.merchantName);
        }

        public final int hashCode() {
            return this.merchantName.hashCode() + (this.availableLimit.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("OneTimeCardContext(availableLimit=", this.availableLimit, ", merchantName=", this.merchantName, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.availableLimit);
            parcel.writeString(this.merchantName);
        }
    }

    public final class ReviewPlan implements CheckoutScreenType {
        public static final Parcelable.Creator<ReviewPlan> CREATOR = new ErrorScreen.Creator(14);
        public final String availableLimit;
        public final String merchantName;

        public ReviewPlan(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.availableLimit = str;
            this.merchantName = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewPlan)) {
                return false;
            }
            ReviewPlan reviewPlan = (ReviewPlan) obj;
            return Intrinsics.areEqual(this.availableLimit, reviewPlan.availableLimit) && Intrinsics.areEqual(this.merchantName, reviewPlan.merchantName);
        }

        public final int hashCode() {
            return this.merchantName.hashCode() + (this.availableLimit.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ReviewPlan(availableLimit=", this.availableLimit, ", merchantName=", this.merchantName, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.availableLimit);
            parcel.writeString(this.merchantName);
        }
    }

    public final class SpendingLimitReached implements CheckoutScreenType {
        public static final SpendingLimitReached INSTANCE = new SpendingLimitReached();
        public static final Parcelable.Creator<SpendingLimitReached> CREATOR = new ErrorScreen.Creator(15);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SpendingLimitReached);
        }

        public final int hashCode() {
            return 2145483490;
        }

        public final String toString() {
            return "SpendingLimitReached";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class SpendingLimitReachedError implements CheckoutScreenType {
        public static final SpendingLimitReachedError INSTANCE = new SpendingLimitReachedError();
        public static final Parcelable.Creator<SpendingLimitReachedError> CREATOR = new ErrorScreen.Creator(16);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SpendingLimitReachedError);
        }

        public final int hashCode() {
            return -106699706;
        }

        public final String toString() {
            return "SpendingLimitReachedError";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
