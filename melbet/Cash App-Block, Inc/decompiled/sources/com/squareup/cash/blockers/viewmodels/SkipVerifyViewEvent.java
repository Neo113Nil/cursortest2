package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface SkipVerifyViewEvent {

    public final class Cancel implements SkipVerifyViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 817184071;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements SkipVerifyViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -36195949;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
