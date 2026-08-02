package com.squareup.cash.pools.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface StartPoolViewModel extends Parcelable {

    public final class Amount implements StartPoolViewModel {
        public static final Parcelable.Creator<Amount> CREATOR = new PdfScreen.Creator(18);
        public final Money amount;
        public final String errorMessage;

        public Amount(Money money, String str) {
            this.amount = money;
            this.errorMessage = str;
        }

        public static Amount copy$default(Amount amount, Money money, String str, int i) {
            if ((i & 1) != 0) {
                money = amount.amount;
            }
            if ((i & 2) != 0) {
                str = amount.errorMessage;
            }
            return new Amount(money, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.areEqual(this.amount, amount.amount) && Intrinsics.areEqual(this.errorMessage, amount.errorMessage);
        }

        public final int hashCode() {
            Money money = this.amount;
            int hashCode = (money == null ? 0 : money.hashCode()) * 31;
            String str = this.errorMessage;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Amount(amount=" + this.amount + ", errorMessage=" + this.errorMessage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.errorMessage);
        }
    }

    public final class Error implements StartPoolViewModel {
        public static final Parcelable.Creator<Error> CREATOR = new PdfScreen.Creator(19);
        public final String body;
        public final String title;

        public Error(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.body = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.body, error.body);
        }

        public final int hashCode() {
            return this.body.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Error(title=", this.title, ", body=", this.body, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.body);
        }
    }

    public final class Name implements StartPoolViewModel {
        public static final Parcelable.Creator<Name> CREATOR = new PdfScreen.Creator(20);
        public final Money amount;
        public final String formattedAmount;
        public final String name;

        public Name(Money money, String str, String str2) {
            money.getClass();
            str.getClass();
            str2.getClass();
            this.amount = money;
            this.formattedAmount = str;
            this.name = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Name)) {
                return false;
            }
            Name name = (Name) obj;
            return Intrinsics.areEqual(this.amount, name.amount) && Intrinsics.areEqual(this.formattedAmount, name.formattedAmount) && Intrinsics.areEqual(this.name, name.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.formattedAmount);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Name(amount=");
            sb.append(this.amount);
            sb.append(", formattedAmount=");
            sb.append(this.formattedAmount);
            sb.append(", name=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.name, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.formattedAmount);
            parcel.writeString(this.name);
        }
    }

    public final class Submit implements StartPoolViewModel {
        public static final Parcelable.Creator<Submit> CREATOR = new PdfScreen.Creator(21);
        public final Money amount;
        public final String name;

        public Submit(Money money, String str) {
            money.getClass();
            str.getClass();
            this.amount = money;
            this.name = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) obj;
            return Intrinsics.areEqual(this.amount, submit.amount) && Intrinsics.areEqual(this.name, submit.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + (this.amount.hashCode() * 31);
        }

        public final String toString() {
            return "Submit(amount=" + this.amount + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.name);
        }
    }

    public final class Success implements StartPoolViewModel {
        public static final Success INSTANCE = new Success();
        public static final Parcelable.Creator<Success> CREATOR = new PdfScreen.Creator(22);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -522530543;
        }

        public final String toString() {
            return "Success";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
