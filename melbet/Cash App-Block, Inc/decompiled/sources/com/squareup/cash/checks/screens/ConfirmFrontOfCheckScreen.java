package com.squareup.cash.checks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ConfirmFrontOfCheckScreen implements BlockersScreens.ChildBlockersScreens {
    public static final Parcelable.Creator<ConfirmFrontOfCheckScreen> CREATOR = new RoutingParams.Creator(1);
    public final BlockersData blockersData;
    public final CheckDepositBlocker checkDepositBlocker;

    public ConfirmFrontOfCheckScreen(BlockersData blockersData, CheckDepositBlocker checkDepositBlocker) {
        blockersData.getClass();
        checkDepositBlocker.getClass();
        this.blockersData = blockersData;
        this.checkDepositBlocker = checkDepositBlocker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmFrontOfCheckScreen)) {
            return false;
        }
        ConfirmFrontOfCheckScreen confirmFrontOfCheckScreen = (ConfirmFrontOfCheckScreen) obj;
        return Intrinsics.areEqual(this.blockersData, confirmFrontOfCheckScreen.blockersData) && Intrinsics.areEqual(this.checkDepositBlocker, confirmFrontOfCheckScreen.checkDepositBlocker);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.checkDepositBlocker.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmFrontOfCheckScreen(blockersData=" + this.blockersData + ", checkDepositBlocker=" + this.checkDepositBlocker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.checkDepositBlocker, i);
    }
}
