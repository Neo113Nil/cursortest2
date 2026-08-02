package com.squareup.cash.account.settings.viewmodels;

/* loaded from: classes7.dex */
public interface ConfirmReplaceInfoViewEvent {

    public final class Cancel implements ConfirmReplaceInfoViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1782324004;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class ConfirmReplace implements ConfirmReplaceInfoViewEvent {
        public static final ConfirmReplace INSTANCE = new ConfirmReplace();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmReplace);
        }

        public final int hashCode() {
            return 1952284726;
        }

        public final String toString() {
            return "ConfirmReplace";
        }
    }
}
