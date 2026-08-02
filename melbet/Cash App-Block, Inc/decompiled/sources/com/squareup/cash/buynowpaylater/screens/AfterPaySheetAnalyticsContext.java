package com.squareup.cash.buynowpaylater.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AfterPaySheetAnalyticsContext implements Parcelable {

    public final class AvailableCredit extends AfterPaySheetAnalyticsContext {
        public static final AvailableCredit INSTANCE = new AvailableCredit();
        public static final Parcelable.Creator<AvailableCredit> CREATOR = new BorrowLimitHub.Creator(13);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AvailableCredit);
        }

        public final int hashCode() {
            return -1715412415;
        }

        public final String toString() {
            return "AvailableCredit";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class ManageOrderInAfterPayAnalytics extends AfterPaySheetAnalyticsContext {
        public static final Parcelable.Creator<ManageOrderInAfterPayAnalytics> CREATOR = new BorrowLimitHub.Creator(14);
        public final String orderId;

        public ManageOrderInAfterPayAnalytics(String str) {
            str.getClass();
            this.orderId = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManageOrderInAfterPayAnalytics) && Intrinsics.areEqual(this.orderId, ((ManageOrderInAfterPayAnalytics) obj).orderId);
        }

        public final int hashCode() {
            return this.orderId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ManageOrderInAfterPayAnalytics(orderId=", this.orderId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.orderId);
        }
    }

    public final class PaymentDetails extends AfterPaySheetAnalyticsContext {
        public static final Parcelable.Creator<PaymentDetails> CREATOR = new BorrowLimitHub.Creator(15);
        public final String orderId;
        public final ScheduledPaymentStatus paymentStatus;

        public PaymentDetails(String str, ScheduledPaymentStatus scheduledPaymentStatus) {
            str.getClass();
            scheduledPaymentStatus.getClass();
            this.orderId = str;
            this.paymentStatus = scheduledPaymentStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentDetails)) {
                return false;
            }
            PaymentDetails paymentDetails = (PaymentDetails) obj;
            return Intrinsics.areEqual(this.orderId, paymentDetails.orderId) && this.paymentStatus == paymentDetails.paymentStatus;
        }

        public final int hashCode() {
            return this.paymentStatus.hashCode() + (this.orderId.hashCode() * 31);
        }

        public final String toString() {
            return "PaymentDetails(orderId=" + this.orderId + ", paymentStatus=" + this.paymentStatus + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.orderId);
            parcel.writeString(this.paymentStatus.name());
        }
    }

    public final class TotalOwed extends AfterPaySheetAnalyticsContext {
        public static final TotalOwed INSTANCE = new TotalOwed();
        public static final Parcelable.Creator<TotalOwed> CREATOR = new BorrowLimitHub.Creator(16);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TotalOwed);
        }

        public final int hashCode() {
            return -2029286326;
        }

        public final String toString() {
            return "TotalOwed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
