package com.squareup.cash.bitcoin.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class MoveBitcoinEvent {

    public final class AmountChanged extends MoveBitcoinEvent {
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

    public final class ClosePressed extends MoveBitcoinEvent {
        public static final ClosePressed INSTANCE = new ClosePressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClosePressed);
        }

        public final int hashCode() {
            return 210464174;
        }

        public final String toString() {
            return "ClosePressed";
        }
    }

    public final class MaxSend extends MoveBitcoinEvent {
        public static final MaxSend INSTANCE = new MaxSend();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MaxSend);
        }

        public final int hashCode() {
            return -69348888;
        }

        public final String toString() {
            return "MaxSend";
        }
    }

    public final class ScanQrCode extends MoveBitcoinEvent {
        public static final ScanQrCode INSTANCE = new ScanQrCode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScanQrCode);
        }

        public final int hashCode() {
            return -104406993;
        }

        public final String toString() {
            return "ScanQrCode";
        }
    }

    public final class SwitchCurrency extends MoveBitcoinEvent {
        public static final SwitchCurrency INSTANCE = new SwitchCurrency();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwitchCurrency);
        }

        public final int hashCode() {
            return 331394313;
        }

        public final String toString() {
            return "SwitchCurrency";
        }
    }

    public final class Withdraw extends MoveBitcoinEvent {
        public static final Withdraw INSTANCE = new Withdraw();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Withdraw);
        }

        public final int hashCode() {
            return 808332206;
        }

        public final String toString() {
            return "Withdraw";
        }
    }
}
