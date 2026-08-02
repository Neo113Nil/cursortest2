package com.squareup.cash.blockers.actions.viewevents;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BlockerActionConfirmSheetResult$SubmitActionResult implements Parcelable {
    public static final Parcelable.Creator<BlockerActionConfirmSheetResult$SubmitActionResult> CREATOR = new MoveBitcoinScreen.Creator(20);
    public final BlockerAction blockerAction;

    public BlockerActionConfirmSheetResult$SubmitActionResult(BlockerAction blockerAction) {
        blockerAction.getClass();
        this.blockerAction = blockerAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockerActionConfirmSheetResult$SubmitActionResult) && Intrinsics.areEqual(this.blockerAction, ((BlockerActionConfirmSheetResult$SubmitActionResult) obj).blockerAction);
    }

    public final int hashCode() {
        return this.blockerAction.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m("SubmitActionResult(blockerAction=", this.blockerAction, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockerAction, i);
    }
}
