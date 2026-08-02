package com.squareup.cash.instruments.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InstrumentSelectionViewEvent {

    public final class Close implements InstrumentSelectionViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1383537509;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class SelectInstrument implements InstrumentSelectionViewEvent {
        public final SelectPaymentInstrumentViewModel.PaymentInstrument instrument;

        public SelectInstrument(SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument) {
            paymentInstrument.getClass();
            this.instrument = paymentInstrument;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectInstrument) && Intrinsics.areEqual(this.instrument, ((SelectInstrument) obj).instrument);
        }

        public final int hashCode() {
            return this.instrument.hashCode();
        }

        public final String toString() {
            return "SelectInstrument(instrument=" + this.instrument + ")";
        }
    }

    public final class Submit implements InstrumentSelectionViewEvent {
        public static final Submit INSTANCE = new Submit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public final int hashCode() {
            return 405975115;
        }

        public final String toString() {
            return "Submit";
        }
    }
}
