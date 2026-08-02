package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.screens.MainScreens;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class BitcoinExchangeFullScreen extends MainScreens implements InvestingScreens.HasFrequency {
    public static final Parcelable.Creator<BitcoinExchangeFullScreen> CREATOR = new BitcoinHome.Creator(8);
    public final BitcoinTransferScreen bitcoinTransferScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinExchangeFullScreen(BitcoinTransferScreen bitcoinTransferScreen) {
        super(1);
        bitcoinTransferScreen.getClass();
        this.bitcoinTransferScreen = bitcoinTransferScreen;
    }

    @Override // com.squareup.cash.investing.screen.keys.InvestingScreens.HasFrequency
    public final Screen copyWithFrequency(RecurringSchedule.Frequency frequency) {
        return new BitcoinExchangeFullScreen(BitcoinTransferScreen.copy$default(this.bitcoinTransferScreen, frequency, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC));
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
        return (obj instanceof BitcoinExchangeFullScreen) && Intrinsics.areEqual(this.bitcoinTransferScreen, ((BitcoinExchangeFullScreen) obj).bitcoinTransferScreen);
    }

    @Override // com.squareup.cash.investing.screen.keys.InvestingScreens.HasFrequency
    public final RecurringSchedule.Frequency getFrequency() {
        return this.bitcoinTransferScreen.frequency;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.bitcoinTransferScreen.hashCode();
    }

    public final String toString() {
        return "BitcoinExchangeFullScreen(bitcoinTransferScreen=" + this.bitcoinTransferScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.bitcoinTransferScreen.writeToParcel(parcel, i);
    }
}
