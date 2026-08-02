package com.squareup.cash.crypto.common.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.composable.adapter.ViewStateId;
import com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface CryptoCommonScreens extends Screen {

    /* loaded from: classes6.dex */
    public final class BitcoinP2pConversionCustomPercentageScreen implements CryptoCommonScreens {
        public static final Parcelable.Creator<BitcoinP2pConversionCustomPercentageScreen> CREATOR = new ViewStateId.Creator(15);
        public final BlockersData blockersData;
        public final String header;
        public final long maxPercentageBps;
        public final long startingPercentageBps;
        public final String subtitle;

        public BitcoinP2pConversionCustomPercentageScreen(BlockersData blockersData, long j, long j2, String str, String str2) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.startingPercentageBps = j;
            this.maxPercentageBps = j2;
            this.header = str;
            this.subtitle = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitcoinP2pConversionCustomPercentageScreen)) {
                return false;
            }
            BitcoinP2pConversionCustomPercentageScreen bitcoinP2pConversionCustomPercentageScreen = (BitcoinP2pConversionCustomPercentageScreen) obj;
            return Intrinsics.areEqual(this.blockersData, bitcoinP2pConversionCustomPercentageScreen.blockersData) && this.startingPercentageBps == bitcoinP2pConversionCustomPercentageScreen.startingPercentageBps && this.maxPercentageBps == bitcoinP2pConversionCustomPercentageScreen.maxPercentageBps && Intrinsics.areEqual(this.header, bitcoinP2pConversionCustomPercentageScreen.header) && Intrinsics.areEqual(this.subtitle, bitcoinP2pConversionCustomPercentageScreen.subtitle);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.blockersData.hashCode() * 31, 31, this.startingPercentageBps), 31, this.maxPercentageBps), 31, this.header);
            String str = this.subtitle;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BitcoinP2pConversionCustomPercentageScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", startingPercentageBps=");
            sb.append(this.startingPercentageBps);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.maxPercentageBps, ", maxPercentageBps=", ", header=", sb);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.header, ", subtitle=", this.subtitle, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeLong(this.startingPercentageBps);
            parcel.writeLong(this.maxPercentageBps);
            parcel.writeString(this.header);
            parcel.writeString(this.subtitle);
        }
    }

    /* loaded from: classes6.dex */
    public final class BitcoinP2pConversionPercentageScreen implements CryptoCommonScreens, SingleInstanceScreen {
        public static final Parcelable.Creator<BitcoinP2pConversionPercentageScreen> CREATOR = new ViewStateId.Creator(16);
        public final BitcoinP2pConversionPercentageBlocker blocker;
        public final BlockersData blockersData;

        public BitcoinP2pConversionPercentageScreen(BlockersData blockersData, BitcoinP2pConversionPercentageBlocker bitcoinP2pConversionPercentageBlocker) {
            blockersData.getClass();
            bitcoinP2pConversionPercentageBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = bitcoinP2pConversionPercentageBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitcoinP2pConversionPercentageScreen)) {
                return false;
            }
            BitcoinP2pConversionPercentageScreen bitcoinP2pConversionPercentageScreen = (BitcoinP2pConversionPercentageScreen) obj;
            return Intrinsics.areEqual(this.blockersData, bitcoinP2pConversionPercentageScreen.blockersData) && Intrinsics.areEqual(this.blocker, bitcoinP2pConversionPercentageScreen.blocker);
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "BitcoinP2pConversionPercentageScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    /* loaded from: classes6.dex */
    public final class CryptoCommonInsufficientFunds implements CryptoCommonScreens {
        public static final Parcelable.Creator<CryptoCommonInsufficientFunds> CREATOR = new ViewStateId.Creator(17);

        /* renamed from: type, reason: collision with root package name */
        public final CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin f1117type;

        public CryptoCommonInsufficientFunds(CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin cryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin) {
            cryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin.getClass();
            this.f1117type = cryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CryptoCommonInsufficientFunds) && Intrinsics.areEqual(this.f1117type, ((CryptoCommonInsufficientFunds) obj).f1117type);
        }

        public final int hashCode() {
            this.f1117type.getClass();
            return 1780764623;
        }

        public final String toString() {
            return "CryptoCommonInsufficientFunds(type=" + this.f1117type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f1117type, i);
        }
    }
}
