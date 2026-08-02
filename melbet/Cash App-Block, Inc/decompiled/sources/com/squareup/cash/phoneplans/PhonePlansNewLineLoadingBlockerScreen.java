package com.squareup.cash.phoneplans;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.PhonePlanNewLineLoadingBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PhonePlansNewLineLoadingBlockerScreen implements BlockersScreens {
    public static final Parcelable.Creator<PhonePlansNewLineLoadingBlockerScreen> CREATOR = new PdfScreen.Creator(3);
    public final PhonePlanNewLineLoadingBlocker blocker;
    public final BlockersData blockersData;
    public final BlockerAction dismissAction;
    public final BlockerAction retreatAction;

    public PhonePlansNewLineLoadingBlockerScreen(BlockersData blockersData, PhonePlanNewLineLoadingBlocker phonePlanNewLineLoadingBlocker, BlockerAction blockerAction, BlockerAction blockerAction2) {
        blockersData.getClass();
        phonePlanNewLineLoadingBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = phonePlanNewLineLoadingBlocker;
        this.retreatAction = blockerAction;
        this.dismissAction = blockerAction2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonePlansNewLineLoadingBlockerScreen)) {
            return false;
        }
        PhonePlansNewLineLoadingBlockerScreen phonePlansNewLineLoadingBlockerScreen = (PhonePlansNewLineLoadingBlockerScreen) obj;
        return Intrinsics.areEqual(this.blockersData, phonePlansNewLineLoadingBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, phonePlansNewLineLoadingBlockerScreen.blocker) && Intrinsics.areEqual(this.retreatAction, phonePlansNewLineLoadingBlockerScreen.retreatAction) && Intrinsics.areEqual(this.dismissAction, phonePlansNewLineLoadingBlockerScreen.dismissAction);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockerAction getDismissAction() {
        return this.dismissAction;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockerAction getRetreatAction() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = (this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
        BlockerAction blockerAction = this.retreatAction;
        int hashCode2 = (hashCode + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
        BlockerAction blockerAction2 = this.dismissAction;
        return hashCode2 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
    }

    public final String toString() {
        return "PhonePlansNewLineLoadingBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", retreatAction=" + this.retreatAction + ", dismissAction=" + this.dismissAction + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
        parcel.writeParcelable(this.retreatAction, i);
        parcel.writeParcelable(this.dismissAction, i);
    }
}
