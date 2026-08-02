package com.squareup.cash.crypto.address;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.composable.adapter.ViewStateId;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StablecoinWithdrawalOption implements Parcelable {
    public static final Parcelable.Creator<StablecoinWithdrawalOption> CREATOR = new ViewStateId.Creator(14);
    public final Money amount;
    public final String gasFee;
    public final Money gasFeeInFiat;
    public final StablecoinNetwork network;

    public StablecoinWithdrawalOption(StablecoinNetwork stablecoinNetwork, Money money, String str, Money money2) {
        stablecoinNetwork.getClass();
        this.network = stablecoinNetwork;
        this.amount = money;
        this.gasFee = str;
        this.gasFeeInFiat = money2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinWithdrawalOption)) {
            return false;
        }
        StablecoinWithdrawalOption stablecoinWithdrawalOption = (StablecoinWithdrawalOption) obj;
        return Intrinsics.areEqual(this.network, stablecoinWithdrawalOption.network) && Intrinsics.areEqual(this.amount, stablecoinWithdrawalOption.amount) && Intrinsics.areEqual(this.gasFee, stablecoinWithdrawalOption.gasFee) && Intrinsics.areEqual(this.gasFeeInFiat, stablecoinWithdrawalOption.gasFeeInFiat);
    }

    public final int hashCode() {
        int hashCode = this.network.hashCode() * 31;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.gasFee;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Money money2 = this.gasFeeInFiat;
        return hashCode3 + (money2 != null ? money2.hashCode() : 0);
    }

    public final String toString() {
        return "StablecoinWithdrawalOption(network=" + this.network + ", amount=" + this.amount + ", gasFee=" + this.gasFee + ", gasFeeInFiat=" + this.gasFeeInFiat + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.network.writeToParcel(parcel, i);
        parcel.writeParcelable(this.amount, i);
        parcel.writeString(this.gasFee);
        parcel.writeParcelable(this.gasFeeInFiat, i);
    }
}
