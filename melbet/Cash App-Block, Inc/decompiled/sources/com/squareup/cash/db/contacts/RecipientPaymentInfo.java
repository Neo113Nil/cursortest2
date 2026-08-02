package com.squareup.cash.db.contacts;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.db.contacts.Recipient;

/* loaded from: classes6.dex */
public final class RecipientPaymentInfo implements Parcelable {
    public static final Parcelable.Creator<RecipientPaymentInfo> CREATOR = new Recipient.Creator(10);
    public final long creditCardFeeBps;
    public final boolean isBusinessCustomer;

    public RecipientPaymentInfo(long j, boolean z) {
        this.creditCardFeeBps = j;
        this.isBusinessCustomer = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientPaymentInfo)) {
            return false;
        }
        RecipientPaymentInfo recipientPaymentInfo = (RecipientPaymentInfo) obj;
        return this.creditCardFeeBps == recipientPaymentInfo.creditCardFeeBps && this.isBusinessCustomer == recipientPaymentInfo.isBusinessCustomer;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isBusinessCustomer) + (Long.hashCode(this.creditCardFeeBps) * 31);
    }

    public final String toString() {
        return "RecipientPaymentInfo(creditCardFeeBps=" + this.creditCardFeeBps + ", isBusinessCustomer=" + this.isBusinessCustomer + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.creditCardFeeBps);
        parcel.writeInt(this.isBusinessCustomer ? 1 : 0);
    }
}
