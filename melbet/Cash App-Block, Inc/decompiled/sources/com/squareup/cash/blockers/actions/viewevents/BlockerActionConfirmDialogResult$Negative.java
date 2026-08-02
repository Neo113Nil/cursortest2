package com.squareup.cash.blockers.actions.viewevents;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;

/* loaded from: classes5.dex */
public final class BlockerActionConfirmDialogResult$Negative implements Parcelable {
    public static final BlockerActionConfirmDialogResult$Negative INSTANCE = new BlockerActionConfirmDialogResult$Negative();
    public static final Parcelable.Creator<BlockerActionConfirmDialogResult$Negative> CREATOR = new MoveBitcoinScreen.Creator(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BlockerActionConfirmDialogResult$Negative);
    }

    public final int hashCode() {
        return 1354670546;
    }

    public final String toString() {
        return "Negative";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
