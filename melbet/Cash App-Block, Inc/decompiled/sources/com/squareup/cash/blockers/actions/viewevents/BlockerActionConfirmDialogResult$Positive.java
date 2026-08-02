package com.squareup.cash.blockers.actions.viewevents;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;

/* loaded from: classes5.dex */
public final class BlockerActionConfirmDialogResult$Positive implements Parcelable {
    public static final BlockerActionConfirmDialogResult$Positive INSTANCE = new BlockerActionConfirmDialogResult$Positive();
    public static final Parcelable.Creator<BlockerActionConfirmDialogResult$Positive> CREATOR = new MoveBitcoinScreen.Creator(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BlockerActionConfirmDialogResult$Positive);
    }

    public final int hashCode() {
        return 1181364118;
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
