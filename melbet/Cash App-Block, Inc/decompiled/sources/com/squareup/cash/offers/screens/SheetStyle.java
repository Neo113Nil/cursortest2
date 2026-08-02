package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.nearby.viewmodels.ListSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SheetStyle extends Parcelable {

    public final class AffiliateSheet implements SheetStyle {
        public static final Parcelable.Creator<AffiliateSheet> CREATOR = new ListSection.Creator(17);
        public final String discountAmount;

        public AffiliateSheet(String str) {
            str.getClass();
            this.discountAmount = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AffiliateSheet) && Intrinsics.areEqual(this.discountAmount, ((AffiliateSheet) obj).discountAmount);
        }

        public final int hashCode() {
            return this.discountAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AffiliateSheet(discountAmount=", this.discountAmount, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.discountAmount);
        }
    }

    public final class AfterPaySheet implements SheetStyle {
        public static final AfterPaySheet INSTANCE = new AfterPaySheet();
        public static final Parcelable.Creator<AfterPaySheet> CREATOR = new ListSection.Creator(18);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AfterPaySheet);
        }

        public final int hashCode() {
            return 1542217603;
        }

        public final String toString() {
            return "AfterPaySheet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class IncentiveSheet implements SheetStyle {
        public static final Parcelable.Creator<IncentiveSheet> CREATOR = new ListSection.Creator(19);
        public final String discountAmount;

        public IncentiveSheet(String str) {
            str.getClass();
            this.discountAmount = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncentiveSheet) && Intrinsics.areEqual(this.discountAmount, ((IncentiveSheet) obj).discountAmount);
        }

        public final int hashCode() {
            return this.discountAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IncentiveSheet(discountAmount=", this.discountAmount, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.discountAmount);
        }
    }

    public final class SUPSheet implements SheetStyle {
        public static final SUPSheet INSTANCE = new SUPSheet();
        public static final Parcelable.Creator<SUPSheet> CREATOR = new ListSection.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SUPSheet);
        }

        public final int hashCode() {
            return -53767743;
        }

        public final String toString() {
            return "SUPSheet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
