package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface PasscodeHelpViewEvent {

    public final class Cancel implements PasscodeHelpViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -130674866;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Forgot implements PasscodeHelpViewEvent {
        public static final Forgot INSTANCE = new Forgot();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Forgot);
        }

        public final int hashCode() {
            return -31734793;
        }

        public final String toString() {
            return "Forgot";
        }
    }
}
