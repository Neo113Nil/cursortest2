package com.squareup.cash.phoneplans;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.WirelessProviderListBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class WirelessProviderListBlockerScreen implements BlockersScreens {
    public static final Parcelable.Creator<WirelessProviderListBlockerScreen> CREATOR = new PdfScreen.Creator(4);
    public final WirelessProviderListBlocker blocker;
    public final BlockersData blockersData;
    public final BlockerAction dismissAction;
    public final BlockerAction helpAction;
    public final BlockerAction retreatAction;

    public WirelessProviderListBlockerScreen(BlockersData blockersData, WirelessProviderListBlocker wirelessProviderListBlocker, BlockerAction blockerAction, BlockerAction blockerAction2, BlockerAction blockerAction3) {
        blockersData.getClass();
        wirelessProviderListBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = wirelessProviderListBlocker;
        this.retreatAction = blockerAction;
        this.dismissAction = blockerAction2;
        this.helpAction = blockerAction3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WirelessProviderListBlockerScreen)) {
            return false;
        }
        WirelessProviderListBlockerScreen wirelessProviderListBlockerScreen = (WirelessProviderListBlockerScreen) obj;
        return Intrinsics.areEqual(this.blockersData, wirelessProviderListBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, wirelessProviderListBlockerScreen.blocker) && Intrinsics.areEqual(this.retreatAction, wirelessProviderListBlockerScreen.retreatAction) && Intrinsics.areEqual(this.dismissAction, wirelessProviderListBlockerScreen.dismissAction) && Intrinsics.areEqual(this.helpAction, wirelessProviderListBlockerScreen.helpAction);
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
        int hashCode3 = (hashCode2 + (blockerAction2 == null ? 0 : blockerAction2.hashCode())) * 31;
        BlockerAction blockerAction3 = this.helpAction;
        return hashCode3 + (blockerAction3 != null ? blockerAction3.hashCode() : 0);
    }

    public final String toString() {
        return "WirelessProviderListBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", retreatAction=" + this.retreatAction + ", dismissAction=" + this.dismissAction + ", helpAction=" + this.helpAction + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
        parcel.writeParcelable(this.retreatAction, i);
        parcel.writeParcelable(this.dismissAction, i);
        parcel.writeParcelable(this.helpAction, i);
    }
}
