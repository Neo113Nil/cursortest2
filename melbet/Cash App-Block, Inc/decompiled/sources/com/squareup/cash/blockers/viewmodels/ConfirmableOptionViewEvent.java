package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public abstract class ConfirmableOptionViewEvent {

    public final class Cancel extends ConfirmableOptionViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -364109594;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm extends ConfirmableOptionViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 1998406100;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
