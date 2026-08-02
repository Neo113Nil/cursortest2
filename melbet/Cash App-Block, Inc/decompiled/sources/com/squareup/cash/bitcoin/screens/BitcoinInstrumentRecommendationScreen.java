package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinInstrumentRecommendationScreen extends BitcoinOverlay {
    public static final Parcelable.Creator<BitcoinInstrumentRecommendationScreen> CREATOR = new BitcoinHome.Creator(13);
    public final Screen exitScreen;
    public final BitcoinInstrumentRecommendationOption primaryOption;
    public final BitcoinInstrumentRecommendationOption secondaryOption;

    /* loaded from: classes5.dex */
    public interface BitcoinInstrumentRecommendationOption extends Parcelable {

        public final class ContinueBitcoinTransfer implements BitcoinInstrumentRecommendationOption {
            public static final Parcelable.Creator<ContinueBitcoinTransfer> CREATOR = new BitcoinHome.Creator(10);
            public final Instrument cashInInstrument;
            public final Money cashInInstrumentAmount;
            public final BitcoinExchangeType exchangeType;
            public final Screen exitScreen;
            public final Order.RecurringSchedule frequency;
            public final String sourceInstrumentToken;
            public final String targetInstrumentToken;

            public ContinueBitcoinTransfer(Screen screen, BitcoinExchangeType bitcoinExchangeType, String str, String str2, Instrument instrument, Money money, Order.RecurringSchedule recurringSchedule) {
                screen.getClass();
                bitcoinExchangeType.getClass();
                str.getClass();
                str2.getClass();
                this.exitScreen = screen;
                this.exchangeType = bitcoinExchangeType;
                this.sourceInstrumentToken = str;
                this.targetInstrumentToken = str2;
                this.cashInInstrument = instrument;
                this.cashInInstrumentAmount = money;
                this.frequency = recurringSchedule;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContinueBitcoinTransfer)) {
                    return false;
                }
                ContinueBitcoinTransfer continueBitcoinTransfer = (ContinueBitcoinTransfer) obj;
                return Intrinsics.areEqual(this.exitScreen, continueBitcoinTransfer.exitScreen) && Intrinsics.areEqual(this.exchangeType, continueBitcoinTransfer.exchangeType) && Intrinsics.areEqual(this.sourceInstrumentToken, continueBitcoinTransfer.sourceInstrumentToken) && Intrinsics.areEqual(this.targetInstrumentToken, continueBitcoinTransfer.targetInstrumentToken) && Intrinsics.areEqual(this.cashInInstrument, continueBitcoinTransfer.cashInInstrument) && Intrinsics.areEqual(this.cashInInstrumentAmount, continueBitcoinTransfer.cashInInstrumentAmount) && Intrinsics.areEqual(this.frequency, continueBitcoinTransfer.frequency);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.exchangeType.hashCode() + (this.exitScreen.hashCode() * 31)) * 31, 31, this.sourceInstrumentToken), 31, this.targetInstrumentToken);
                Instrument instrument = this.cashInInstrument;
                int hashCode = (m + (instrument == null ? 0 : instrument.hashCode())) * 31;
                Money money = this.cashInInstrumentAmount;
                int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
                Order.RecurringSchedule recurringSchedule = this.frequency;
                return hashCode2 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ContinueBitcoinTransfer(exitScreen=");
                sb.append(this.exitScreen);
                sb.append(", exchangeType=");
                sb.append(this.exchangeType);
                sb.append(", sourceInstrumentToken=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.sourceInstrumentToken, ", targetInstrumentToken=", this.targetInstrumentToken, ", cashInInstrument=");
                sb.append(this.cashInInstrument);
                sb.append(", cashInInstrumentAmount=");
                sb.append(this.cashInInstrumentAmount);
                sb.append(", frequency=");
                sb.append(this.frequency);
                sb.append(")");
                return sb.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.exitScreen, i);
                parcel.writeParcelable(this.exchangeType, i);
                parcel.writeString(this.sourceInstrumentToken);
                parcel.writeString(this.targetInstrumentToken);
                parcel.writeParcelable(this.cashInInstrument, i);
                parcel.writeParcelable(this.cashInInstrumentAmount, i);
                parcel.writeParcelable(this.frequency, i);
            }
        }

        public final class LinkBankAccount implements BitcoinInstrumentRecommendationOption {
            public static final Parcelable.Creator<LinkBankAccount> CREATOR = new BitcoinHome.Creator(11);
            public final Money amount;
            public final Screen exitScreen;
            public final String previousInstrumentToken;

            public LinkBankAccount(Screen screen, Money money, String str) {
                screen.getClass();
                money.getClass();
                this.exitScreen = screen;
                this.amount = money;
                this.previousInstrumentToken = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LinkBankAccount)) {
                    return false;
                }
                LinkBankAccount linkBankAccount = (LinkBankAccount) obj;
                return Intrinsics.areEqual(this.exitScreen, linkBankAccount.exitScreen) && Intrinsics.areEqual(this.amount, linkBankAccount.amount) && Intrinsics.areEqual(this.previousInstrumentToken, linkBankAccount.previousInstrumentToken);
            }

            public final int hashCode() {
                int m = NavAction$$ExternalSyntheticOutline0.m(this.amount, this.exitScreen.hashCode() * 31, 31);
                String str = this.previousInstrumentToken;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LinkBankAccount(exitScreen=");
                sb.append(this.exitScreen);
                sb.append(", amount=");
                sb.append(this.amount);
                sb.append(", previousInstrumentToken=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.previousInstrumentToken, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.exitScreen, i);
                parcel.writeParcelable(this.amount, i);
                parcel.writeString(this.previousInstrumentToken);
            }
        }

        public final class SwitchToBankAccount implements BitcoinInstrumentRecommendationOption {
            public static final Parcelable.Creator<SwitchToBankAccount> CREATOR = new BitcoinHome.Creator(12);
            public final Screen exitScreen;

            public SwitchToBankAccount(Screen screen) {
                screen.getClass();
                this.exitScreen = screen;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SwitchToBankAccount) && Intrinsics.areEqual(this.exitScreen, ((SwitchToBankAccount) obj).exitScreen);
            }

            public final int hashCode() {
                return this.exitScreen.hashCode();
            }

            public final String toString() {
                return re$$ExternalSyntheticOutline0.m(this.exitScreen, "SwitchToBankAccount(exitScreen=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.exitScreen, i);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinInstrumentRecommendationScreen(Screen screen, BitcoinInstrumentRecommendationOption bitcoinInstrumentRecommendationOption, BitcoinInstrumentRecommendationOption bitcoinInstrumentRecommendationOption2) {
        super(1);
        screen.getClass();
        bitcoinInstrumentRecommendationOption.getClass();
        bitcoinInstrumentRecommendationOption2.getClass();
        this.exitScreen = screen;
        this.primaryOption = bitcoinInstrumentRecommendationOption;
        this.secondaryOption = bitcoinInstrumentRecommendationOption2;
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
        if (!(obj instanceof BitcoinInstrumentRecommendationScreen)) {
            return false;
        }
        BitcoinInstrumentRecommendationScreen bitcoinInstrumentRecommendationScreen = (BitcoinInstrumentRecommendationScreen) obj;
        return Intrinsics.areEqual(this.exitScreen, bitcoinInstrumentRecommendationScreen.exitScreen) && Intrinsics.areEqual(this.primaryOption, bitcoinInstrumentRecommendationScreen.primaryOption) && Intrinsics.areEqual(this.secondaryOption, bitcoinInstrumentRecommendationScreen.secondaryOption);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.secondaryOption.hashCode() + ((this.primaryOption.hashCode() + (this.exitScreen.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BitcoinInstrumentRecommendationScreen(exitScreen=" + this.exitScreen + ", primaryOption=" + this.primaryOption + ", secondaryOption=" + this.secondaryOption + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeParcelable(this.primaryOption, i);
        parcel.writeParcelable(this.secondaryOption, i);
    }
}
