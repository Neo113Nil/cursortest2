package com.squareup.cash.checks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ConfirmBackOfCheckScreen implements BlockersScreens.ChildBlockersScreens {
    public static final Parcelable.Creator<ConfirmBackOfCheckScreen> CREATOR = new CheckCaptureQuestion.Creator(29);
    public final BlockersData blockersData;
    public final CheckDepositBlocker checkDepositBlocker;

    public ConfirmBackOfCheckScreen(BlockersData blockersData, CheckDepositBlocker checkDepositBlocker) {
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
        if (!(obj instanceof ConfirmBackOfCheckScreen)) {
            return false;
        }
        ConfirmBackOfCheckScreen confirmBackOfCheckScreen = (ConfirmBackOfCheckScreen) obj;
        return Intrinsics.areEqual(this.blockersData, confirmBackOfCheckScreen.blockersData) && Intrinsics.areEqual(this.checkDepositBlocker, confirmBackOfCheckScreen.checkDepositBlocker);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.checkDepositBlocker.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmBackOfCheckScreen(blockersData=" + this.blockersData + ", checkDepositBlocker=" + this.checkDepositBlocker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.checkDepositBlocker, i);
    }
}
