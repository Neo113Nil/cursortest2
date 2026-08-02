package com.squareup.cash.directdeposit.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DirectDepositUpdateManualFormDetailsViewModel extends Parcelable {

    public final class Content implements DirectDepositUpdateManualFormDetailsViewModel {
        public static final Parcelable.Creator<Content> CREATOR = new Limit.Creator(23);
        public final boolean addSignature;
        public final String companyName;
        public final String name;
        public final String paycheckAmount;
        public final boolean submitEnabled;

        public Content(String str, String str2, String str3, boolean z, boolean z2) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.name = str;
            this.companyName = str2;
            this.paycheckAmount = str3;
            this.addSignature = z;
            this.submitEnabled = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.name, content.name) && Intrinsics.areEqual(this.companyName, content.companyName) && Intrinsics.areEqual(this.paycheckAmount, content.paycheckAmount) && this.addSignature == content.addSignature && this.submitEnabled == content.submitEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.submitEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.companyName), 31, this.paycheckAmount), 31, this.addSignature);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(name=", this.name, ", companyName=", this.companyName, ", paycheckAmount=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.paycheckAmount, ", addSignature=", this.addSignature, ", submitEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.submitEnabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.companyName);
            parcel.writeString(this.paycheckAmount);
            parcel.writeInt(this.addSignature ? 1 : 0);
            parcel.writeInt(this.submitEnabled ? 1 : 0);
        }
    }

    public final class Error implements DirectDepositUpdateManualFormDetailsViewModel {
        public static final Error INSTANCE = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new Limit.Creator(24);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1533729040;
        }

        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Loading implements DirectDepositUpdateManualFormDetailsViewModel {
        public static final Loading INSTANCE = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new Limit.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1739504060;
        }

        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
