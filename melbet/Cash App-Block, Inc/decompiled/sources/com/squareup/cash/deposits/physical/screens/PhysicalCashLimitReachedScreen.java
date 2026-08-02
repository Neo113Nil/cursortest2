package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PhysicalCashLimitReachedScreen implements BlockersScreens.ChildBlockersScreens, Screen, DialogScreen {
    public static final Parcelable.Creator<PhysicalCashLimitReachedScreen> CREATOR = new Creator();
    public final BlockersData blockersData;
    public final PaperCashDepositBlocker.LimitsReachedDialog limitReachedDialog;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PhysicalCashLimitReachedScreen((PaperCashDepositBlocker.LimitsReachedDialog) parcel.readParcelable(PhysicalCashLimitReachedScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(PhysicalCashLimitReachedScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhysicalCashLimitReachedScreen[i];
        }
    }

    public PhysicalCashLimitReachedScreen(PaperCashDepositBlocker.LimitsReachedDialog limitsReachedDialog, BlockersData blockersData) {
        limitsReachedDialog.getClass();
        blockersData.getClass();
        this.limitReachedDialog = limitsReachedDialog;
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhysicalCashLimitReachedScreen)) {
            return false;
        }
        PhysicalCashLimitReachedScreen physicalCashLimitReachedScreen = (PhysicalCashLimitReachedScreen) obj;
        return Intrinsics.areEqual(this.limitReachedDialog, physicalCashLimitReachedScreen.limitReachedDialog) && Intrinsics.areEqual(this.blockersData, physicalCashLimitReachedScreen.blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blockersData.hashCode() + (this.limitReachedDialog.hashCode() * 31);
    }

    public final String toString() {
        return "PhysicalCashLimitReachedScreen(limitReachedDialog=" + this.limitReachedDialog + ", blockersData=" + this.blockersData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.limitReachedDialog, i);
        parcel.writeParcelable(this.blockersData, i);
    }
}
