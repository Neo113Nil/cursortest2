package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.franklin.api.RetailerMapBlocker;

/* loaded from: classes.dex */
public final class AtmWithdrawalExplainerScreen implements AtmExplainerScreen {
    public static final Parcelable.Creator<AtmWithdrawalExplainerScreen> CREATOR = new Creator();
    public final BlockersData blockersData;
    public final RetailerMapBlocker.ExplainerScreen explainerScreen;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AtmWithdrawalExplainerScreen((RetailerMapBlocker.ExplainerScreen) parcel.readParcelable(AtmWithdrawalExplainerScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(AtmWithdrawalExplainerScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmWithdrawalExplainerScreen[i];
        }
    }

    public AtmWithdrawalExplainerScreen(RetailerMapBlocker.ExplainerScreen explainerScreen, BlockersData blockersData) {
        explainerScreen.getClass();
        blockersData.getClass();
        this.explainerScreen = explainerScreen;
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
        parcel.writeParcelable(this.explainerScreen, i);
        parcel.writeParcelable(this.blockersData, i);
    }
}
