package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.screens.MainScreens;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinDepositsScreen extends MainScreens {
    public static final Parcelable.Creator<BitcoinDepositsScreen> CREATOR = new BitcoinHome.Creator(6);
    public final Money bitcoinAmount;
    public final CryptoPaymentOrigin origin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinDepositsScreen(CryptoPaymentOrigin cryptoPaymentOrigin, Money money) {
        super(1);
        cryptoPaymentOrigin.getClass();
        money.getClass();
        this.origin = cryptoPaymentOrigin;
        this.bitcoinAmount = money;
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
        if (!(obj instanceof BitcoinDepositsScreen)) {
            return false;
        }
        BitcoinDepositsScreen bitcoinDepositsScreen = (BitcoinDepositsScreen) obj;
        return this.origin == bitcoinDepositsScreen.origin && Intrinsics.areEqual(this.bitcoinAmount, bitcoinDepositsScreen.bitcoinAmount);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.bitcoinAmount.hashCode() + (this.origin.hashCode() * 31);
    }

    public final String toString() {
        return "BitcoinDepositsScreen(origin=" + this.origin + ", bitcoinAmount=" + this.bitcoinAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.origin.name());
        parcel.writeParcelable(this.bitcoinAmount, i);
    }
}
