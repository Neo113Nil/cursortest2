package com.squareup.cash.bitcoin.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class BitcoinAmountViewEvent {

    public final class AddNote extends BitcoinAmountViewEvent {
        public static final AddNote INSTANCE = new AddNote();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddNote);
        }

        public final int hashCode() {
            return 346218817;
        }

        public final String toString() {
            return "AddNote";
        }
    }

    public final class AmountChanged extends BitcoinAmountViewEvent {
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

    public final class BackPressed extends BitcoinAmountViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -686849207;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class ConfirmPressed extends BitcoinAmountViewEvent {
        public static final ConfirmPressed INSTANCE = new ConfirmPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmPressed);
        }

        public final int hashCode() {
            return 209755252;
        }

        public final String toString() {
            return "ConfirmPressed";
        }
    }

    public final class SwitchCurrency extends BitcoinAmountViewEvent {
        public static final SwitchCurrency INSTANCE = new SwitchCurrency();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwitchCurrency);
        }

        public final int hashCode() {
            return -1289752937;
        }

        public final String toString() {
            return "SwitchCurrency";
        }
    }
}
