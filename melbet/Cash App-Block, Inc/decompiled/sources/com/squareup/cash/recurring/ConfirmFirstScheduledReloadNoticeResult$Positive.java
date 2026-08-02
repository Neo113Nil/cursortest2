package com.squareup.cash.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.recipients.data.Recipient;

/* loaded from: classes7.dex */
public final class ConfirmFirstScheduledReloadNoticeResult$Positive implements Parcelable {
    public static final ConfirmFirstScheduledReloadNoticeResult$Positive INSTANCE = new ConfirmFirstScheduledReloadNoticeResult$Positive();
    public static final Parcelable.Creator<ConfirmFirstScheduledReloadNoticeResult$Positive> CREATOR = new Recipient.Creator(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ConfirmFirstScheduledReloadNoticeResult$Positive);
    }

    public final int hashCode() {
        return 67303615;
    }

    public final String toString() {
        return "Positive";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
