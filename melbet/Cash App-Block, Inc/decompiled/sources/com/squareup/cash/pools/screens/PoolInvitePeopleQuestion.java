package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.screens.Redacted;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PoolInvitePeopleQuestion implements Question {
    public static final Parcelable.Creator<PoolInvitePeopleQuestion> CREATOR = new PdfScreen.Creator(8);
    public final Redacted currentlyAddedCustomersIds;

    public PoolInvitePeopleQuestion(Redacted redacted) {
        redacted.getClass();
        this.currentlyAddedCustomersIds = redacted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoolInvitePeopleQuestion) && Intrinsics.areEqual(this.currentlyAddedCustomersIds, ((PoolInvitePeopleQuestion) obj).currentlyAddedCustomersIds);
    }

    public final int hashCode() {
        return this.currentlyAddedCustomersIds.hashCode();
    }

    public final String toString() {
        return "PoolInvitePeopleQuestion(currentlyAddedCustomersIds=" + this.currentlyAddedCustomersIds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.currentlyAddedCustomersIds, i);
    }
}
