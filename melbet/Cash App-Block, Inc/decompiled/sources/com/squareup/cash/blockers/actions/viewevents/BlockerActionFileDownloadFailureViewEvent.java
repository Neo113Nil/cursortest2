package com.squareup.cash.blockers.actions.viewevents;

/* loaded from: classes4.dex */
public interface BlockerActionFileDownloadFailureViewEvent {

    public final class NegativeClick implements BlockerActionFileDownloadFailureViewEvent {
        public static final NegativeClick INSTANCE = new NegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeClick);
        }

        public final int hashCode() {
            return -410621336;
        }

        public final String toString() {
            return "NegativeClick";
        }
    }

    public final class PositiveClick implements BlockerActionFileDownloadFailureViewEvent {
        public static final PositiveClick INSTANCE = new PositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveClick);
        }

        public final int hashCode() {
            return -1367288028;
        }

        public final String toString() {
            return "PositiveClick";
        }
    }
}
