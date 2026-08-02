package com.squareup.cash.instruments.viewmodels;

import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;

/* loaded from: classes6.dex */
public interface InstrumentSelectionBlockerViewEvent {

    public final class CloseClick implements InstrumentSelectionBlockerViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 1764232457;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class CtaClick implements InstrumentSelectionBlockerViewEvent {
        public static final CtaClick INSTANCE = new CtaClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClick);
        }

        public final int hashCode() {
            return -1620112847;
        }

        public final String toString() {
            return "CtaClick";
        }
    }

    public final class InstrumentOptionClick implements InstrumentSelectionBlockerViewEvent {
        public final InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex selectedInstrumentOptionIndex;

        public InstrumentOptionClick(InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex selectedInstrumentOptionIndex) {
            this.selectedInstrumentOptionIndex = selectedInstrumentOptionIndex;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InstrumentOptionClick) && this.selectedInstrumentOptionIndex.equals(((InstrumentOptionClick) obj).selectedInstrumentOptionIndex);
        }

        public final int hashCode() {
            return this.selectedInstrumentOptionIndex.hashCode();
        }

        public final String toString() {
            return "InstrumentOptionClick(selectedInstrumentOptionIndex=" + this.selectedInstrumentOptionIndex + ")";
        }
    }
}
