package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaperMoneyDepositMapScreen implements BlockersScreens, Screen {
    public static final Parcelable.Creator<PaperMoneyDepositMapScreen> CREATOR = new Recipient.Creator(20);
    public final BlockersData blockersData;
    public final PaperCashDepositBlocker paperCashDepositBlocker;

    public PaperMoneyDepositMapScreen(PaperCashDepositBlocker paperCashDepositBlocker, BlockersData blockersData) {
        paperCashDepositBlocker.getClass();
        blockersData.getClass();
        this.paperCashDepositBlocker = paperCashDepositBlocker;
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
        if (!(obj instanceof PaperMoneyDepositMapScreen)) {
            return false;
        }
        PaperMoneyDepositMapScreen paperMoneyDepositMapScreen = (PaperMoneyDepositMapScreen) obj;
        return Intrinsics.areEqual(this.paperCashDepositBlocker, paperMoneyDepositMapScreen.paperCashDepositBlocker) && Intrinsics.areEqual(this.blockersData, paperMoneyDepositMapScreen.blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blockersData.hashCode() + (this.paperCashDepositBlocker.hashCode() * 31);
    }

    public final String toString() {
        return "PaperMoneyDepositMapScreen(paperCashDepositBlocker=" + this.paperCashDepositBlocker + ", blockersData=" + this.blockersData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.paperCashDepositBlocker, i);
        parcel.writeParcelable(this.blockersData, i);
    }
}
