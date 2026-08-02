package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface ConfirmHelpViewEvent {

    public final class Cancel implements ConfirmHelpViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 1297771736;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements ConfirmHelpViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 1977119778;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
