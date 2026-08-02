package com.squareup.cash.qrcodes.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.recipients.data.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashtagQrScanResult implements Parcelable {
    public static final Parcelable.Creator<CashtagQrScanResult> CREATOR = new Recipient.Creator(1);
    public final com.squareup.cash.db.contacts.Recipient recipient;

    public CashtagQrScanResult(com.squareup.cash.db.contacts.Recipient recipient) {
        recipient.getClass();
        this.recipient = recipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashtagQrScanResult) && Intrinsics.areEqual(this.recipient, ((CashtagQrScanResult) obj).recipient);
    }

    public final int hashCode() {
        return this.recipient.hashCode();
    }

    public final String toString() {
        return "CashtagQrScanResult(recipient=" + this.recipient + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.recipient, i);
    }
}
