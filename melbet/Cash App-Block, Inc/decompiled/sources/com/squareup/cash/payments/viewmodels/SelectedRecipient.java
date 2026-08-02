package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectedRecipient implements Parcelable {
    public static final Parcelable.Creator<SelectedRecipient> CREATOR = new Size.Creator(21);
    public final Redacted displayName;
    public final Redacted recipient;

    public SelectedRecipient(RedactedParcelable redactedParcelable) {
        this(redactedParcelable, new RedactedString(((Recipient) redactedParcelable.value).displayName));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedRecipient)) {
            return false;
        }
        SelectedRecipient selectedRecipient = (SelectedRecipient) obj;
        return Intrinsics.areEqual(this.recipient, selectedRecipient.recipient) && Intrinsics.areEqual(this.displayName, selectedRecipient.displayName);
    }

    public final int hashCode() {
        return this.displayName.hashCode() + (this.recipient.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedRecipient(recipient=" + this.recipient + ", displayName=" + this.displayName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.recipient, i);
        parcel.writeParcelable(this.displayName, i);
    }

    public SelectedRecipient(Redacted redacted, Redacted redacted2) {
        redacted.getClass();
        redacted2.getClass();
        this.recipient = redacted;
        this.displayName = redacted2;
    }
}
