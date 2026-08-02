package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class IabMetadata implements Parcelable {

    public final class AffiliateBoostMetadata extends IabMetadata {
        public static final Parcelable.Creator<AffiliateBoostMetadata> CREATOR = new AutofillQuestion.Creator(7);
        public final String boostToken;
        public final RewardAmount rewardAmount;

        public AffiliateBoostMetadata(RewardAmount rewardAmount, String str) {
            rewardAmount.getClass();
            str.getClass();
            this.rewardAmount = rewardAmount;
            this.boostToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AffiliateBoostMetadata)) {
                return false;
            }
            AffiliateBoostMetadata affiliateBoostMetadata = (AffiliateBoostMetadata) obj;
            return Intrinsics.areEqual(this.rewardAmount, affiliateBoostMetadata.rewardAmount) && Intrinsics.areEqual(this.boostToken, affiliateBoostMetadata.boostToken);
        }

        public final int hashCode() {
            return this.boostToken.hashCode() + (this.rewardAmount.hashCode() * 31);
        }

        public final String toString() {
            return "AffiliateBoostMetadata(rewardAmount=" + this.rewardAmount + ", boostToken=" + this.boostToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.rewardAmount, i);
            parcel.writeString(this.boostToken);
        }
    }

    public final class AfterpayMetadata extends IabMetadata {
        public static final Parcelable.Creator<AfterpayMetadata> CREATOR = new AutofillQuestion.Creator(8);
        public final int installmentsNumber;

        public AfterpayMetadata(int i) {
            this.installmentsNumber = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AfterpayMetadata) && this.installmentsNumber == ((AfterpayMetadata) obj).installmentsNumber;
        }

        public final int hashCode() {
            return Integer.hashCode(this.installmentsNumber);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.installmentsNumber, "AfterpayMetadata(installmentsNumber=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.installmentsNumber);
        }
    }

    public final class CashPayMetadata extends IabMetadata {
        public static final Parcelable.Creator<CashPayMetadata> CREATOR = new AutofillQuestion.Creator(9);
        public final RewardAmount rewardAmount;

        public CashPayMetadata(RewardAmount rewardAmount) {
            rewardAmount.getClass();
            this.rewardAmount = rewardAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CashPayMetadata) && Intrinsics.areEqual(this.rewardAmount, ((CashPayMetadata) obj).rewardAmount);
        }

        public final int hashCode() {
            return this.rewardAmount.hashCode();
        }

        public final String toString() {
            return "CashPayMetadata(rewardAmount=" + this.rewardAmount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.rewardAmount, i);
        }
    }

    public final class SUPMetadata extends IabMetadata {
        public static final Parcelable.Creator<SUPMetadata> CREATOR = new AutofillQuestion.Creator(10);
        public final String checkoutFlowEndResultData;
        public final String supToken;

        public SUPMetadata(String str, String str2) {
            this.supToken = str;
            this.checkoutFlowEndResultData = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SUPMetadata)) {
                return false;
            }
            SUPMetadata sUPMetadata = (SUPMetadata) obj;
            return Intrinsics.areEqual(this.supToken, sUPMetadata.supToken) && Intrinsics.areEqual(this.checkoutFlowEndResultData, sUPMetadata.checkoutFlowEndResultData);
        }

        public final int hashCode() {
            String str = this.supToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.checkoutFlowEndResultData;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SUPMetadata(supToken=", this.supToken, ", checkoutFlowEndResultData=", this.checkoutFlowEndResultData, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.supToken);
            parcel.writeString(this.checkoutFlowEndResultData);
        }
    }
}
