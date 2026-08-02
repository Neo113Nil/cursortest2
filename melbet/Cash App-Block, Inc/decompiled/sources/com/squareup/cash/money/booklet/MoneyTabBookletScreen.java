package com.squareup.cash.money.booklet;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.protos.franklin.api.MoneyTabBookletBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MoneyTabBookletScreen implements BlockersScreens {
    public static final Parcelable.Creator<MoneyTabBookletScreen> CREATOR = new LimitsScreen.Creator(14);
    public final MoneyTabBookletBlocker blocker;
    public final BlockersData blockersData;

    public MoneyTabBookletScreen(BlockersData blockersData, MoneyTabBookletBlocker moneyTabBookletBlocker) {
        blockersData.getClass();
        moneyTabBookletBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = moneyTabBookletBlocker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTabBookletScreen)) {
            return false;
        }
        MoneyTabBookletScreen moneyTabBookletScreen = (MoneyTabBookletScreen) obj;
        return Intrinsics.areEqual(this.blockersData, moneyTabBookletScreen.blockersData) && Intrinsics.areEqual(this.blocker, moneyTabBookletScreen.blocker);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "MoneyTabBookletScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
    }
}
