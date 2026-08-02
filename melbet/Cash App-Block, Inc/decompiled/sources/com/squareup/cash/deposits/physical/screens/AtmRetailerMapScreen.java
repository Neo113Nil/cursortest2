package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.franklin.api.RetailerMapBlocker;

/* loaded from: classes.dex */
public final class AtmRetailerMapScreen implements BlockersScreens {
    public static final Parcelable.Creator<AtmRetailerMapScreen> CREATOR = new Recipient.Creator(15);
    public final RetailerMapBlocker atmWithdrawalBlocker;
    public final BlockersData blockersData;

    public AtmRetailerMapScreen(RetailerMapBlocker retailerMapBlocker, BlockersData blockersData) {
        retailerMapBlocker.getClass();
        blockersData.getClass();
        this.atmWithdrawalBlocker = retailerMapBlocker;
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.atmWithdrawalBlocker, i);
        parcel.writeParcelable(this.blockersData, i);
    }
}
