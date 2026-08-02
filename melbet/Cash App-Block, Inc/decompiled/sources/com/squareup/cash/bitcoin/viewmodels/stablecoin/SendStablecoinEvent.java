package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class SendStablecoinEvent {

    public final class AmountChanged extends SendStablecoinEvent {
        public final long amountCents;
        public final String rawAmount;

        public AmountChanged(long j, String str) {
            this.amountCents = j;
            this.rawAmount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmountChanged)) {
                return false;
            }
            AmountChanged amountChanged = (AmountChanged) obj;
            return this.amountCents == amountChanged.amountCents && this.rawAmount.equals(amountChanged.rawAmount);
        }

        public final int hashCode() {
            return this.rawAmount.hashCode() + (Long.hashCode(this.amountCents) * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("AmountChanged(amountCents=", this.amountCents, ", rawAmount=", this.rawAmount);
            m.append(")");
            return m.toString();
        }
    }

    public final class ClosePressed extends SendStablecoinEvent {
        public static final ClosePressed INSTANCE = new ClosePressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClosePressed);
        }

        public final int hashCode() {
            return 2016285751;
        }

        public final String toString() {
            return "ClosePressed";
        }
    }

    public final class PercentageSelected extends SendStablecoinEvent {
        public final float percentage;

        public PercentageSelected(float f) {
            this.percentage = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PercentageSelected) && Float.compare(this.percentage, ((PercentageSelected) obj).percentage) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.percentage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.percentage, "PercentageSelected(percentage=", ")");
        }
    }

    public final class ScanQrCode extends SendStablecoinEvent {
        public static final ScanQrCode INSTANCE = new ScanQrCode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScanQrCode);
        }

        public final int hashCode() {
            return 1908643064;
        }

        public final String toString() {
            return "ScanQrCode";
        }
    }

    public final class Withdraw extends SendStablecoinEvent {
        public static final Withdraw INSTANCE = new Withdraw();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Withdraw);
        }

        public final int hashCode() {
            return -1808564553;
        }

        public final String toString() {
            return "Withdraw";
        }
    }
}
