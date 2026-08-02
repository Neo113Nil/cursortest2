package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.screens.Redacted;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PoolInvitePeopleResult implements Parcelable {
    public static final Parcelable.Creator<PoolInvitePeopleResult> CREATOR = new PdfScreen.Creator(9);
    public final Redacted added;
    public final Redacted removed;

    public PoolInvitePeopleResult(Redacted redacted, Redacted redacted2) {
        redacted.getClass();
        redacted2.getClass();
        this.added = redacted;
        this.removed = redacted2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolInvitePeopleResult)) {
            return false;
        }
        PoolInvitePeopleResult poolInvitePeopleResult = (PoolInvitePeopleResult) obj;
        return Intrinsics.areEqual(this.added, poolInvitePeopleResult.added) && Intrinsics.areEqual(this.removed, poolInvitePeopleResult.removed);
    }

    public final int hashCode() {
        return this.removed.hashCode() + (this.added.hashCode() * 31);
    }

    public final String toString() {
        return "PoolInvitePeopleResult(added=" + this.added + ", removed=" + this.removed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.added, i);
        parcel.writeParcelable(this.removed, i);
    }
}
