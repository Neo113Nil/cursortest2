package com.squareup.cash.family.familyhub.viewmodels;

/* loaded from: classes6.dex */
public interface ControlDisablingConfirmationViewEvent {

    public final class Cancel implements ControlDisablingConfirmationViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 1305154010;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements ControlDisablingConfirmationViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -2088997024;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
