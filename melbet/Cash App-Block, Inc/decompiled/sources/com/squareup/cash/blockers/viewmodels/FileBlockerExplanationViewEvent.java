package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface FileBlockerExplanationViewEvent {

    public final class Cancel implements FileBlockerExplanationViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -470872886;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements FileBlockerExplanationViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -1311255952;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
