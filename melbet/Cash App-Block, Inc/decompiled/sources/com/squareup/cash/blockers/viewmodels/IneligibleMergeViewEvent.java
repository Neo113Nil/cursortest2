package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface IneligibleMergeViewEvent {

    public final class Cancel implements IneligibleMergeViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -120358317;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements IneligibleMergeViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 964761095;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
