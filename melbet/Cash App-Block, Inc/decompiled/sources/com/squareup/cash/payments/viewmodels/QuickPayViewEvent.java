package com.squareup.cash.payments.viewmodels;

import app.cash.broadway.screen.Screen;
import com.knotapi.knot.utilities.Constants;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class QuickPayViewEvent {

    public final class AmountEntered extends QuickPayViewEvent {
        public final String amount;

        public AmountEntered(String str) {
            this.amount = str;
        }
    }

    public final class Close extends QuickPayViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1081853548;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class NoteEntered extends QuickPayViewEvent {
        public final String note;

        public NoteEntered(String str) {
            this.note = str;
        }
    }

    public final class OnDialogResult extends QuickPayViewEvent {
        public final Object result;
        public final Screen screenArgs;

        public OnDialogResult(Screen screen, Object obj) {
            this.screenArgs = screen;
            this.result = obj;
        }
    }

    public final class OpenDetails extends QuickPayViewEvent {
        public static final OpenDetails INSTANCE = new OpenDetails();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenDetails);
        }

        public final int hashCode() {
            return -1076374732;
        }

        public final String toString() {
            return "OpenDetails";
        }
    }

    public final class PersonalizePaymentClick extends QuickPayViewEvent {
        public static final PersonalizePaymentClick INSTANCE = new PersonalizePaymentClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PersonalizePaymentClick);
        }

        public final int hashCode() {
            return 900613362;
        }

        public final String toString() {
            return "PersonalizePaymentClick";
        }
    }

    public final class PrimaryButtonClick extends QuickPayViewEvent {
        public final List lastGesturesSignal;

        public PrimaryButtonClick(List list) {
            list.getClass();
            this.lastGesturesSignal = list;
        }
    }

    public final class SelectInstrumentClick extends QuickPayViewEvent {
        public static final SelectInstrumentClick INSTANCE = new SelectInstrumentClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectInstrumentClick);
        }

        public final int hashCode() {
            return 1869732065;
        }

        public final String toString() {
            return "SelectInstrumentClick";
        }
    }
}
