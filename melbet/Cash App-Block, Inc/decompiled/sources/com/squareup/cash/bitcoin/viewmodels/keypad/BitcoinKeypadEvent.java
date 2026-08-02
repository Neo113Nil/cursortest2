package com.squareup.cash.bitcoin.viewmodels.keypad;

import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class BitcoinKeypadEvent {

    public final class AmountChanged extends BitcoinKeypadEvent {
        public final String rawAmount;

        public AmountChanged(String str) {
            this.rawAmount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountChanged) && this.rawAmount.equals(((AmountChanged) obj).rawAmount);
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountChanged(rawAmount=", this.rawAmount, ")");
        }
    }

    public final class SetMaxAmount extends BitcoinKeypadEvent {
        public static final SetMaxAmount INSTANCE = new SetMaxAmount();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetMaxAmount);
        }

        public final int hashCode() {
            return -1657929213;
        }

        public final String toString() {
            return "SetMaxAmount";
        }
    }

    public final class SwitchCurrency extends BitcoinKeypadEvent {
        public final BitcoinAmountEntrySource source;

        public SwitchCurrency(BitcoinAmountEntrySource bitcoinAmountEntrySource) {
            this.source = bitcoinAmountEntrySource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SwitchCurrency) && this.source == ((SwitchCurrency) obj).source;
        }

        public final int hashCode() {
            return this.source.hashCode();
        }

        public final String toString() {
            return "SwitchCurrency(source=" + this.source + ")";
        }
    }

    public final class Transfer extends BitcoinKeypadEvent {
        public final CryptoPaymentOrigin origin;

        public Transfer(CryptoPaymentOrigin cryptoPaymentOrigin) {
            cryptoPaymentOrigin.getClass();
            this.origin = cryptoPaymentOrigin;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Transfer) && this.origin == ((Transfer) obj).origin;
        }

        public final int hashCode() {
            return this.origin.hashCode() * 31;
        }

        public final String toString() {
            return "Transfer(origin=" + this.origin + ", externalId=null)";
        }
    }

    public final class UpdateRateStrategy extends BitcoinKeypadEvent {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class RateStrategy {
            public static final /* synthetic */ RateStrategy[] $VALUES;
            public static final RateStrategy MOST_RECENT_VALUE;
            public static final RateStrategy POLL;

            /* JADX INFO: Fake field, exist only in values array */
            RateStrategy EF0;

            static {
                RateStrategy rateStrategy = new RateStrategy("DISABLED", 0);
                RateStrategy rateStrategy2 = new RateStrategy("POLL", 1);
                POLL = rateStrategy2;
                RateStrategy rateStrategy3 = new RateStrategy("MOST_RECENT_VALUE", 2);
                MOST_RECENT_VALUE = rateStrategy3;
                $VALUES = new RateStrategy[]{rateStrategy, rateStrategy2, rateStrategy3};
            }

            public static RateStrategy valueOf(String str) {
                return (RateStrategy) Enum.valueOf(RateStrategy.class, str);
            }

            public static RateStrategy[] values() {
                return (RateStrategy[]) $VALUES.clone();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateRateStrategy)) {
                return false;
            }
            RateStrategy rateStrategy = RateStrategy.POLL;
            return true;
        }

        public final int hashCode() {
            return RateStrategy.MOST_RECENT_VALUE.hashCode();
        }

        public final String toString() {
            return "UpdateRateStrategy(strategy=" + RateStrategy.MOST_RECENT_VALUE + ")";
        }
    }
}
