package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentSelectionLoadingScreen implements Screen, NeverInBackStackScreen {
    public static final Parcelable.Creator<InstrumentSelectionLoadingScreen> CREATOR = new Instrument.Creator(4);
    public final BlockersData blockersData;
    public final InstrumentSelectionParams instrumentSelectionParams;

    /* loaded from: classes6.dex */
    public interface InstrumentSelectionParams extends Parcelable {

        public final class AddMoney implements InstrumentSelectionParams, Parcelable {
            public static final Parcelable.Creator<AddMoney> CREATOR = new Instrument.Creator(5);
            public final Money amount;
            public final String instrumentToken;
            public final boolean startInKeypad;

            public AddMoney(Money money, String str, boolean z) {
                this.amount = money;
                this.instrumentToken = str;
                this.startInKeypad = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddMoney)) {
                    return false;
                }
                AddMoney addMoney = (AddMoney) obj;
                return Intrinsics.areEqual(this.amount, addMoney.amount) && Intrinsics.areEqual(this.instrumentToken, addMoney.instrumentToken) && this.startInKeypad == addMoney.startInKeypad;
            }

            public final int hashCode() {
                Money money = this.amount;
                int hashCode = (money == null ? 0 : money.hashCode()) * 31;
                String str = this.instrumentToken;
                return Boolean.hashCode(this.startInKeypad) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AddMoney(amount=");
                sb.append(this.amount);
                sb.append(", instrumentToken=");
                sb.append(this.instrumentToken);
                sb.append(", startInKeypad=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.startInKeypad, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.amount, i);
                parcel.writeString(this.instrumentToken);
                parcel.writeInt(this.startInKeypad ? 1 : 0);
            }
        }

        public final class BitcoinBuy implements InstrumentSelectionParams, Parcelable {
            public static final Parcelable.Creator<BitcoinBuy> CREATOR = new Instrument.Creator(6);
            public final boolean allowBankAccounts;
            public final Money amount;
            public final Money balanceAmount;
            public final String balanceToken;
            public final Money instrumentAmount;
            public final String instrumentToken;
            public final Money restrictedBalanceAmount;
            public final String restrictedBalanceToken;

            public BitcoinBuy(Money money, String str, Money money2, Money money3, String str2, Money money4, String str3, boolean z) {
                this.amount = money;
                this.instrumentToken = str;
                this.instrumentAmount = money2;
                this.balanceAmount = money3;
                this.balanceToken = str2;
                this.restrictedBalanceAmount = money4;
                this.restrictedBalanceToken = str3;
                this.allowBankAccounts = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BitcoinBuy)) {
                    return false;
                }
                BitcoinBuy bitcoinBuy = (BitcoinBuy) obj;
                return Intrinsics.areEqual(this.amount, bitcoinBuy.amount) && Intrinsics.areEqual(this.instrumentToken, bitcoinBuy.instrumentToken) && Intrinsics.areEqual(this.instrumentAmount, bitcoinBuy.instrumentAmount) && Intrinsics.areEqual(this.balanceAmount, bitcoinBuy.balanceAmount) && Intrinsics.areEqual(this.balanceToken, bitcoinBuy.balanceToken) && Intrinsics.areEqual(this.restrictedBalanceAmount, bitcoinBuy.restrictedBalanceAmount) && Intrinsics.areEqual(this.restrictedBalanceToken, bitcoinBuy.restrictedBalanceToken) && this.allowBankAccounts == bitcoinBuy.allowBankAccounts;
            }

            public final int hashCode() {
                Money money = this.amount;
                int hashCode = (money == null ? 0 : money.hashCode()) * 31;
                String str = this.instrumentToken;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Money money2 = this.instrumentAmount;
                int hashCode3 = (hashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31;
                Money money3 = this.balanceAmount;
                int hashCode4 = (hashCode3 + (money3 == null ? 0 : money3.hashCode())) * 31;
                String str2 = this.balanceToken;
                int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Money money4 = this.restrictedBalanceAmount;
                int hashCode6 = (hashCode5 + (money4 == null ? 0 : money4.hashCode())) * 31;
                String str3 = this.restrictedBalanceToken;
                return Boolean.hashCode(this.allowBankAccounts) + ((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("BitcoinBuy(amount=");
                sb.append(this.amount);
                sb.append(", instrumentToken=");
                sb.append(this.instrumentToken);
                sb.append(", instrumentAmount=");
                sb.append(this.instrumentAmount);
                sb.append(", balanceAmount=");
                sb.append(this.balanceAmount);
                sb.append(", balanceToken=");
                sb.append(this.balanceToken);
                sb.append(", restrictedBalanceAmount=");
                sb.append(this.restrictedBalanceAmount);
                sb.append(", restrictedBalanceToken=");
                return re$$ExternalSyntheticOutline0.m(sb, this.restrictedBalanceToken, ", allowBankAccounts=", this.allowBankAccounts, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.amount, i);
                parcel.writeString(this.instrumentToken);
                parcel.writeParcelable(this.instrumentAmount, i);
                parcel.writeParcelable(this.balanceAmount, i);
                parcel.writeString(this.balanceToken);
                parcel.writeParcelable(this.restrictedBalanceAmount, i);
                parcel.writeString(this.restrictedBalanceToken);
                parcel.writeInt(this.allowBankAccounts ? 1 : 0);
            }
        }

        public final class Withdraw implements InstrumentSelectionParams, Parcelable {
            public static final Parcelable.Creator<Withdraw> CREATOR = new Instrument.Creator(7);
            public final Money amount;
            public final DepositPreference depositPreference;
            public final String instrumentToken;

            public Withdraw(Money money, String str, DepositPreference depositPreference) {
                this.amount = money;
                this.instrumentToken = str;
                this.depositPreference = depositPreference;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Withdraw)) {
                    return false;
                }
                Withdraw withdraw = (Withdraw) obj;
                return Intrinsics.areEqual(this.amount, withdraw.amount) && Intrinsics.areEqual(this.instrumentToken, withdraw.instrumentToken) && this.depositPreference == withdraw.depositPreference;
            }

            public final int hashCode() {
                Money money = this.amount;
                int hashCode = (money == null ? 0 : money.hashCode()) * 31;
                String str = this.instrumentToken;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                DepositPreference depositPreference = this.depositPreference;
                return hashCode2 + (depositPreference != null ? depositPreference.hashCode() : 0);
            }

            public final String toString() {
                return "Withdraw(amount=" + this.amount + ", instrumentToken=" + this.instrumentToken + ", depositPreference=" + this.depositPreference + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.amount, i);
                parcel.writeString(this.instrumentToken);
                DepositPreference depositPreference = this.depositPreference;
                if (depositPreference == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(depositPreference.name());
                }
            }
        }
    }

    public InstrumentSelectionLoadingScreen(BlockersData blockersData, InstrumentSelectionParams instrumentSelectionParams) {
        blockersData.getClass();
        instrumentSelectionParams.getClass();
        this.blockersData = blockersData;
        this.instrumentSelectionParams = instrumentSelectionParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionLoadingScreen)) {
            return false;
        }
        InstrumentSelectionLoadingScreen instrumentSelectionLoadingScreen = (InstrumentSelectionLoadingScreen) obj;
        return Intrinsics.areEqual(this.blockersData, instrumentSelectionLoadingScreen.blockersData) && Intrinsics.areEqual(this.instrumentSelectionParams, instrumentSelectionLoadingScreen.instrumentSelectionParams);
    }

    public final int hashCode() {
        return this.instrumentSelectionParams.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "InstrumentSelectionLoadingScreen(blockersData=" + this.blockersData + ", instrumentSelectionParams=" + this.instrumentSelectionParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.instrumentSelectionParams, i);
    }
}
