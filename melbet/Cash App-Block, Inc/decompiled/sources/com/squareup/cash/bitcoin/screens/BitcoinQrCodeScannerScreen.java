package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.screens.MainScreens;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinQrCodeScannerScreen extends MainScreens {
    public static final Parcelable.Creator<BitcoinQrCodeScannerScreen> CREATOR = new BitcoinHome.Creator(25);
    public final Money amount;
    public final CryptoPaymentOrigin origin;
    public final boolean supportStablecoin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinQrCodeScannerScreen(CryptoPaymentOrigin cryptoPaymentOrigin, Money money, boolean z) {
        super(1);
        cryptoPaymentOrigin.getClass();
        this.origin = cryptoPaymentOrigin;
        this.amount = money;
        this.supportStablecoin = z;
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
        if (!(obj instanceof BitcoinQrCodeScannerScreen)) {
            return false;
        }
        BitcoinQrCodeScannerScreen bitcoinQrCodeScannerScreen = (BitcoinQrCodeScannerScreen) obj;
        return this.origin == bitcoinQrCodeScannerScreen.origin && Intrinsics.areEqual(this.amount, bitcoinQrCodeScannerScreen.amount) && this.supportStablecoin == bitcoinQrCodeScannerScreen.supportStablecoin;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        int hashCode = this.origin.hashCode() * 31;
        Money money = this.amount;
        return Boolean.hashCode(this.supportStablecoin) + ((hashCode + (money == null ? 0 : money.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinQrCodeScannerScreen(origin=");
        sb.append(this.origin);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", supportStablecoin=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.supportStablecoin, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.origin.name());
        parcel.writeParcelable(this.amount, i);
        parcel.writeInt(this.supportStablecoin ? 1 : 0);
    }
}
