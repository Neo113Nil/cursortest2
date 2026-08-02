package com.squareup.cash.bitcoin.presenters;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.viewmodels.keypad.BitcoinKeypadEvent;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatus;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class BitcoinKeypadStateStore$State {
    public final Money availableBalance;
    public final BitcoinDisplayUnits displayUnits;
    public final CryptoIdvStatus idvStatus;
    public final boolean ignoreIfNotReady;
    public final Money lightningDepositLimitUsd;
    public final Money minimumWithdrawalLimit;
    public final BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy rateStrategy;
    public final Money transferAmount;
    public final String transferRawAmount;
    public final boolean useRestrictedBalance;
    public final boolean useSendVerbInLimitMessages;
    public final Money valuePerBitcoin;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyCode.values().length];
            try {
                iArr[CurrencyCode.BTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BitcoinKeypadStateStore$State(Money money, Money money2, Money money3, BitcoinDisplayUnits bitcoinDisplayUnits, Money money4, Money money5, boolean z, int i) {
        this((i & 1) != 0 ? null : money, null, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? null : money3, (i & 16) != 0 ? null : bitcoinDisplayUnits, (i & 32) != 0 ? null : money4, (i & 64) != 0 ? null : money5, BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy.POLL, null, (i & 512) == 0, (i & 1024) != 0 ? false : z, true);
    }

    public static BitcoinKeypadStateStore$State copy$default(BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State, Money money, String str, Money money2, Money money3, BitcoinDisplayUnits bitcoinDisplayUnits, Money money4, Money money5, CryptoIdvStatus cryptoIdvStatus, boolean z, int i) {
        BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy rateStrategy = BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy.MOST_RECENT_VALUE;
        Money money6 = (i & 1) != 0 ? bitcoinKeypadStateStore$State.transferAmount : money;
        String str2 = (i & 2) != 0 ? bitcoinKeypadStateStore$State.transferRawAmount : str;
        Money money7 = (i & 4) != 0 ? bitcoinKeypadStateStore$State.valuePerBitcoin : money2;
        Money money8 = (i & 8) != 0 ? bitcoinKeypadStateStore$State.availableBalance : money3;
        BitcoinDisplayUnits bitcoinDisplayUnits2 = (i & 16) != 0 ? bitcoinKeypadStateStore$State.displayUnits : bitcoinDisplayUnits;
        Money money9 = (i & 32) != 0 ? bitcoinKeypadStateStore$State.minimumWithdrawalLimit : money4;
        Money money10 = (i & 64) != 0 ? bitcoinKeypadStateStore$State.lightningDepositLimitUsd : money5;
        if ((i & 128) != 0) {
            rateStrategy = bitcoinKeypadStateStore$State.rateStrategy;
        }
        BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy rateStrategy2 = rateStrategy;
        CryptoIdvStatus cryptoIdvStatus2 = (i & 256) != 0 ? bitcoinKeypadStateStore$State.idvStatus : cryptoIdvStatus;
        boolean z2 = bitcoinKeypadStateStore$State.ignoreIfNotReady;
        boolean z3 = bitcoinKeypadStateStore$State.useRestrictedBalance;
        boolean z4 = (i & 2048) != 0 ? bitcoinKeypadStateStore$State.useSendVerbInLimitMessages : z;
        bitcoinKeypadStateStore$State.getClass();
        rateStrategy2.getClass();
        return new BitcoinKeypadStateStore$State(money6, str2, money7, money8, bitcoinDisplayUnits2, money9, money10, rateStrategy2, cryptoIdvStatus2, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinKeypadStateStore$State)) {
            return false;
        }
        BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State = (BitcoinKeypadStateStore$State) obj;
        return Intrinsics.areEqual(this.transferAmount, bitcoinKeypadStateStore$State.transferAmount) && Intrinsics.areEqual(this.transferRawAmount, bitcoinKeypadStateStore$State.transferRawAmount) && Intrinsics.areEqual(this.valuePerBitcoin, bitcoinKeypadStateStore$State.valuePerBitcoin) && Intrinsics.areEqual(this.availableBalance, bitcoinKeypadStateStore$State.availableBalance) && this.displayUnits == bitcoinKeypadStateStore$State.displayUnits && Intrinsics.areEqual(this.minimumWithdrawalLimit, bitcoinKeypadStateStore$State.minimumWithdrawalLimit) && Intrinsics.areEqual(this.lightningDepositLimitUsd, bitcoinKeypadStateStore$State.lightningDepositLimitUsd) && this.rateStrategy == bitcoinKeypadStateStore$State.rateStrategy && this.idvStatus == bitcoinKeypadStateStore$State.idvStatus && this.ignoreIfNotReady == bitcoinKeypadStateStore$State.ignoreIfNotReady && this.useRestrictedBalance == bitcoinKeypadStateStore$State.useRestrictedBalance && this.useSendVerbInLimitMessages == bitcoinKeypadStateStore$State.useSendVerbInLimitMessages;
    }

    public final Money getBitcoinAmount() {
        Money money = this.transferAmount;
        money.getClass();
        CurrencyCode currencyCode = money.currency_code;
        currencyCode.getClass();
        return WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()] == 1 ? money : getConvertedAmount();
    }

    public final Money getConvertedAmount() {
        Money money = this.transferAmount;
        money.getClass();
        Money money2 = this.valuePerBitcoin;
        money2.getClass();
        return Moneys.convertBitcoinEquivalentAmount(money, money2);
    }

    public final int hashCode() {
        Money money = this.transferAmount;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        String str = this.transferRawAmount;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Money money2 = this.valuePerBitcoin;
        int hashCode3 = (hashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31;
        Money money3 = this.availableBalance;
        int hashCode4 = (hashCode3 + (money3 == null ? 0 : money3.hashCode())) * 31;
        BitcoinDisplayUnits bitcoinDisplayUnits = this.displayUnits;
        int hashCode5 = (hashCode4 + (bitcoinDisplayUnits == null ? 0 : bitcoinDisplayUnits.hashCode())) * 31;
        Money money4 = this.minimumWithdrawalLimit;
        int hashCode6 = (hashCode5 + (money4 == null ? 0 : money4.hashCode())) * 31;
        Money money5 = this.lightningDepositLimitUsd;
        int hashCode7 = (this.rateStrategy.hashCode() + ((hashCode6 + (money5 == null ? 0 : money5.hashCode())) * 31)) * 31;
        CryptoIdvStatus cryptoIdvStatus = this.idvStatus;
        return Boolean.hashCode(this.useSendVerbInLimitMessages) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (cryptoIdvStatus != null ? cryptoIdvStatus.hashCode() : 0)) * 31, 31, this.ignoreIfNotReady), 31, this.useRestrictedBalance);
    }

    public final boolean isReady() {
        Money money = this.transferAmount;
        return ((money != null ? money.currency_code : null) == null || this.availableBalance == null || this.displayUnits == null || this.valuePerBitcoin == null || this.lightningDepositLimitUsd == null || this.minimumWithdrawalLimit == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(transferAmount=");
        sb.append(this.transferAmount);
        sb.append(", transferRawAmount=");
        sb.append(this.transferRawAmount);
        sb.append(", valuePerBitcoin=");
        sb.append(this.valuePerBitcoin);
        sb.append(", availableBalance=");
        sb.append(this.availableBalance);
        sb.append(", displayUnits=");
        sb.append(this.displayUnits);
        sb.append(", minimumWithdrawalLimit=");
        sb.append(this.minimumWithdrawalLimit);
        sb.append(", lightningDepositLimitUsd=");
        sb.append(this.lightningDepositLimitUsd);
        sb.append(", rateStrategy=");
        sb.append(this.rateStrategy);
        sb.append(", idvStatus=");
        sb.append(this.idvStatus);
        sb.append(", ignoreIfNotReady=");
        sb.append(this.ignoreIfNotReady);
        sb.append(", useRestrictedBalance=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.useRestrictedBalance, ", useSendVerbInLimitMessages=", this.useSendVerbInLimitMessages, ")");
    }

    public BitcoinKeypadStateStore$State(Money money, String str, Money money2, Money money3, BitcoinDisplayUnits bitcoinDisplayUnits, Money money4, Money money5, BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy rateStrategy, CryptoIdvStatus cryptoIdvStatus, boolean z, boolean z2, boolean z3) {
        this.transferAmount = money;
        this.transferRawAmount = str;
        this.valuePerBitcoin = money2;
        this.availableBalance = money3;
        this.displayUnits = bitcoinDisplayUnits;
        this.minimumWithdrawalLimit = money4;
        this.lightningDepositLimitUsd = money5;
        this.rateStrategy = rateStrategy;
        this.idvStatus = cryptoIdvStatus;
        this.ignoreIfNotReady = z;
        this.useRestrictedBalance = z2;
        this.useSendVerbInLimitMessages = z3;
    }
}
