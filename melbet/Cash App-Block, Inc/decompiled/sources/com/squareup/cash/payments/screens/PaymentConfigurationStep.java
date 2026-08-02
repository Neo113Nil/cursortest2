package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.screens.NearbyPayer;

/* loaded from: classes6.dex */
public interface PaymentConfigurationStep extends Parcelable {

    public interface NavigableStep extends PaymentConfigurationStep {

        public final class RequestShareOption implements NavigableStep {
            public static final RequestShareOption INSTANCE = new RequestShareOption();
            public static final Parcelable.Creator<RequestShareOption> CREATOR = new NearbyPayer.Creator(9);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestShareOption);
            }

            public final int hashCode() {
                return 594111688;
            }

            public final String toString() {
                return "RequestShareOption";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class ReviewPayment implements NavigableStep {
            public static final ReviewPayment INSTANCE = new ReviewPayment();
            public static final Parcelable.Creator<ReviewPayment> CREATOR = new NearbyPayer.Creator(10);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ReviewPayment);
            }

            public final int hashCode() {
                return -1580879861;
            }

            public final String toString() {
                return "ReviewPayment";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class SelectRecipient implements NavigableStep {
            public static final SelectRecipient INSTANCE = new SelectRecipient();
            public static final Parcelable.Creator<SelectRecipient> CREATOR = new NearbyPayer.Creator(11);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SelectRecipient);
            }

            public final int hashCode() {
                return 1618238906;
            }

            public final String toString() {
                return "SelectRecipient";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }
}
