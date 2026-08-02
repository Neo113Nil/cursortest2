package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.screens.AccentedScreen;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinPeriodSelectionScreen extends BitcoinSheets implements AccentedScreen {
    public static final Parcelable.Creator<BitcoinPeriodSelectionScreen> CREATOR = new BitcoinHome.Creator(24);
    public final ColorModel accentColor;
    public final String balanceToken;
    public final CurrencyCode currencyCode;
    public final BitcoinTransferScreen.OrderType.CustomOrder customOrder;
    public final BitcoinExchangeType exchangeType;
    public final Screen exitScreen;
    public final Screen prevScreenBottomSheet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinPeriodSelectionScreen(ColorModel colorModel, BitcoinTransferScreen.OrderType.CustomOrder customOrder, BitcoinExchangeType bitcoinExchangeType, String str, Screen screen, Screen screen2, CurrencyCode currencyCode) {
        super(1);
        colorModel.getClass();
        customOrder.getClass();
        bitcoinExchangeType.getClass();
        str.getClass();
        screen.getClass();
        screen2.getClass();
        this.accentColor = colorModel;
        this.customOrder = customOrder;
        this.exchangeType = bitcoinExchangeType;
        this.balanceToken = str;
        this.prevScreenBottomSheet = screen;
        this.exitScreen = screen2;
        this.currencyCode = currencyCode;
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
        if (!(obj instanceof BitcoinPeriodSelectionScreen)) {
            return false;
        }
        BitcoinPeriodSelectionScreen bitcoinPeriodSelectionScreen = (BitcoinPeriodSelectionScreen) obj;
        return Intrinsics.areEqual(this.accentColor, bitcoinPeriodSelectionScreen.accentColor) && Intrinsics.areEqual(this.customOrder, bitcoinPeriodSelectionScreen.customOrder) && Intrinsics.areEqual(this.exchangeType, bitcoinPeriodSelectionScreen.exchangeType) && Intrinsics.areEqual(this.balanceToken, bitcoinPeriodSelectionScreen.balanceToken) && Intrinsics.areEqual(this.prevScreenBottomSheet, bitcoinPeriodSelectionScreen.prevScreenBottomSheet) && Intrinsics.areEqual(this.exitScreen, bitcoinPeriodSelectionScreen.exitScreen) && this.currencyCode == bitcoinPeriodSelectionScreen.currencyCode;
    }

    @Override // com.squareup.cash.screens.AccentedScreen
    public final ColorModel getAccentColor() {
        return this.accentColor;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, BalanceFeedKt$$ExternalSyntheticOutline0.m(this.prevScreenBottomSheet, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.exchangeType.hashCode() + ((this.customOrder.hashCode() + (this.accentColor.hashCode() * 31)) * 31)) * 31, 31, this.balanceToken), 31), 31);
        CurrencyCode currencyCode = this.currencyCode;
        return m + (currencyCode == null ? 0 : currencyCode.hashCode());
    }

    public final String toString() {
        return "BitcoinPeriodSelectionScreen(accentColor=" + this.accentColor + ", customOrder=" + this.customOrder + ", exchangeType=" + this.exchangeType + ", balanceToken=" + this.balanceToken + ", prevScreenBottomSheet=" + this.prevScreenBottomSheet + ", exitScreen=" + this.exitScreen + ", currencyCode=" + this.currencyCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.accentColor, i);
        this.customOrder.writeToParcel(parcel, i);
        parcel.writeParcelable(this.exchangeType, i);
        parcel.writeString(this.balanceToken);
        parcel.writeParcelable(this.prevScreenBottomSheet, i);
        parcel.writeParcelable(this.exitScreen, i);
        CurrencyCode currencyCode = this.currencyCode;
        if (currencyCode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(currencyCode.name());
        }
    }
}
