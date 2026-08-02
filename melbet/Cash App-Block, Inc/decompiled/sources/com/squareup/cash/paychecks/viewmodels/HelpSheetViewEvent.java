package com.squareup.cash.paychecks.viewmodels;

/* loaded from: classes6.dex */
public interface HelpSheetViewEvent {

    public final class AdditionalHelp implements HelpSheetViewEvent {
        public static final AdditionalHelp INSTANCE = new AdditionalHelp();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AdditionalHelp);
        }

        public final int hashCode() {
            return -389660691;
        }

        public final String toString() {
            return "AdditionalHelp";
        }
    }

    public final class Dismiss implements HelpSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 476195397;
        }

        public final String toString() {
            return "Dismiss";
        }
    }
}
