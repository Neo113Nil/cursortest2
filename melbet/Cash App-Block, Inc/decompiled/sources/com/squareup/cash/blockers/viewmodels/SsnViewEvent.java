package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.protos.franklin.api.HelpItem;

/* loaded from: classes4.dex */
public abstract class SsnViewEvent {

    public final class Help extends SsnViewEvent {
        public static final Help INSTANCE = new Help();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Help);
        }

        public final int hashCode() {
            return 1812152908;
        }

        public final String toString() {
            return "Help";
        }
    }

    public final class HelpItemClick extends SsnViewEvent {
        public final HelpItem item;

        public HelpItemClick(HelpItem helpItem) {
            helpItem.getClass();
            this.item = helpItem;
        }
    }

    public final class InputExtraDigit extends SsnViewEvent {
        public static final InputExtraDigit INSTANCE = new InputExtraDigit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InputExtraDigit);
        }

        public final int hashCode() {
            return 1580025468;
        }

        public final String toString() {
            return "InputExtraDigit";
        }
    }

    /* loaded from: classes5.dex */
    public final class Next extends SsnViewEvent {
        public final SignalsContext signalsContext;
        public final String ssn;

        public Next(String str, SignalsContext signalsContext) {
            this.ssn = str;
            this.signalsContext = signalsContext;
        }
    }
}
