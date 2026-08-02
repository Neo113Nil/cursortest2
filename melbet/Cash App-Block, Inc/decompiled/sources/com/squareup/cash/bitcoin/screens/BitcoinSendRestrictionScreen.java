package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinSendRestrictionScreen extends BitcoinOverlay {
    public static final Parcelable.Creator<BitcoinSendRestrictionScreen> CREATOR = new BitcoinHome.Creator(28);
    public final Money amount;
    public final Screen exitScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinSendRestrictionScreen(Money money, Screen screen) {
        super(1);
        screen.getClass();
        this.amount = money;
        this.exitScreen = screen;
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
        if (!(obj instanceof BitcoinSendRestrictionScreen)) {
            return false;
        }
        BitcoinSendRestrictionScreen bitcoinSendRestrictionScreen = (BitcoinSendRestrictionScreen) obj;
        return Intrinsics.areEqual(this.amount, bitcoinSendRestrictionScreen.amount) && Intrinsics.areEqual(this.exitScreen, bitcoinSendRestrictionScreen.exitScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        Money money = this.amount;
        return this.exitScreen.hashCode() + ((money == null ? 0 : money.hashCode()) * 31);
    }

    public final String toString() {
        return "BitcoinSendRestrictionScreen(amount=" + this.amount + ", exitScreen=" + this.exitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.amount, i);
        parcel.writeParcelable(this.exitScreen, i);
    }
}
