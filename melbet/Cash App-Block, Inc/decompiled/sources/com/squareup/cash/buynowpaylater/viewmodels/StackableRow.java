package com.squareup.cash.buynowpaylater.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class StackableRow implements Parcelable {

    public final class PaymentStatusIcon extends StackableRow {
        public static final Parcelable.Creator<PaymentStatusIcon> CREATOR = new BorrowLimitHub.Creator(21);
        public final ScheduledPaymentStatus paymentStatus;

        public PaymentStatusIcon(ScheduledPaymentStatus scheduledPaymentStatus) {
            scheduledPaymentStatus.getClass();
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
            return (obj instanceof PaymentStatusIcon) && this.paymentStatus == ((PaymentStatusIcon) obj).paymentStatus;
        }

        public final int hashCode() {
            return this.paymentStatus.hashCode();
        }

        public final String toString() {
            return "PaymentStatusIcon(paymentStatus=" + this.paymentStatus + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.paymentStatus.name());
        }
    }

    public final class RowItem extends StackableRow {
        public static final Parcelable.Creator<RowItem> CREATOR = new BorrowLimitHub.Creator(22);
        public final TextModel detail;
        public final TextModel title;

        public RowItem(TextModel textModel, TextModel textModel2) {
            this.title = textModel;
            this.detail = textModel2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowItem)) {
                return false;
            }
            RowItem rowItem = (RowItem) obj;
            return Intrinsics.areEqual(this.title, rowItem.title) && Intrinsics.areEqual(this.detail, rowItem.detail);
        }

        public final int hashCode() {
            TextModel textModel = this.title;
            int hashCode = (textModel == null ? 0 : textModel.hashCode()) * 31;
            TextModel textModel2 = this.detail;
            return hashCode + (textModel2 != null ? textModel2.hashCode() : 0);
        }

        public final String toString() {
            return "RowItem(title=" + this.title + ", detail=" + this.detail + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            TextModel textModel = this.title;
            if (textModel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textModel.writeToParcel(parcel, i);
            }
            TextModel textModel2 = this.detail;
            if (textModel2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textModel2.writeToParcel(parcel, i);
            }
        }
    }

    public final class Text extends StackableRow {
        public static final Parcelable.Creator<Text> CREATOR = new BorrowLimitHub.Creator(23);
        public final TextModel text;

        public Text(TextModel textModel) {
            textModel.getClass();
            this.text = textModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.areEqual(this.text, ((Text) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return "Text(text=" + this.text + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.text.writeToParcel(parcel, i);
        }
    }
}
