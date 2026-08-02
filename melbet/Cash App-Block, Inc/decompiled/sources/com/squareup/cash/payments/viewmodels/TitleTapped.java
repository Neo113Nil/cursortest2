package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface TitleTapped extends Parcelable {

    public final class AmountTapped implements TitleTapped {
        public static final AmountTapped INSTANCE = new AmountTapped();
        public static final Parcelable.Creator<AmountTapped> CREATOR = new Size.Creator(26);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AmountTapped);
        }

        public final int hashCode() {
            return -723283746;
        }

        public final String toString() {
            return "AmountTapped";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class NoteTapped implements TitleTapped {
        public static final NoteTapped INSTANCE = new NoteTapped();
        public static final Parcelable.Creator<NoteTapped> CREATOR = new Size.Creator(27);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoteTapped);
        }

        public final int hashCode() {
            return 1678672760;
        }

        public final String toString() {
            return "NoteTapped";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class RecipientTapped implements TitleTapped {
        public static final Parcelable.Creator<RecipientTapped> CREATOR = new Size.Creator(28);
        public final RecipientViewModel recipient;

        public RecipientTapped(RecipientViewModel recipientViewModel) {
            recipientViewModel.getClass();
            this.recipient = recipientViewModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecipientTapped) && Intrinsics.areEqual(this.recipient, ((RecipientTapped) obj).recipient);
        }

        public final int hashCode() {
            return this.recipient.hashCode();
        }

        public final String toString() {
            return "RecipientTapped(recipient=" + this.recipient + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.recipient, i);
        }
    }
}
