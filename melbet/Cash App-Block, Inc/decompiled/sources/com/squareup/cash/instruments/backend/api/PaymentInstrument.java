package com.squareup.cash.instruments.backend.api;

import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaymentInstrument {

    public final class BalancePaymentInstrument implements PaymentInstrument {
        public final BalanceSnapshot balanceSnapshot;

        public BalancePaymentInstrument(BalanceSnapshot balanceSnapshot) {
            balanceSnapshot.getClass();
            this.balanceSnapshot = balanceSnapshot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BalancePaymentInstrument) && Intrinsics.areEqual(this.balanceSnapshot, ((BalancePaymentInstrument) obj).balanceSnapshot);
        }

        public final int hashCode() {
            return this.balanceSnapshot.hashCode();
        }

        public final String toString() {
            return "BalancePaymentInstrument(balanceSnapshot=" + this.balanceSnapshot + ")";
        }
    }

    public final class ExternalPaymentInstrument implements PaymentInstrument {
        public final Instrument instrument;

        public ExternalPaymentInstrument(Instrument instrument) {
            this.instrument = instrument;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExternalPaymentInstrument) && this.instrument.equals(((ExternalPaymentInstrument) obj).instrument);
        }

        public final int hashCode() {
            return this.instrument.hashCode();
        }

        public final String toString() {
            return "ExternalPaymentInstrument(instrument=" + this.instrument + ")";
        }
    }
}
