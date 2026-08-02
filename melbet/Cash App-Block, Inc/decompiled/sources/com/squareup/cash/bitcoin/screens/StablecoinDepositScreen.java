package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.screens.MainScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class StablecoinDepositScreen extends MainScreens {
    public static final Parcelable.Creator<StablecoinDepositScreen> CREATOR = new MoveBitcoinScreen.Creator(13);
    public final StablecoinDepositOption option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StablecoinDepositScreen(StablecoinDepositOption stablecoinDepositOption) {
        super(1);
        stablecoinDepositOption.getClass();
        this.option = stablecoinDepositOption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StablecoinDepositScreen) && Intrinsics.areEqual(this.option, ((StablecoinDepositScreen) obj).option);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.option.hashCode();
    }

    public final String toString() {
        return "StablecoinDepositScreen(option=" + this.option + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.option, i);
    }
}
