package com.squareup.cash.pools.viewmodels;

/* loaded from: classes6.dex */
public interface PoolMoreOptionsBottomSheetViewEvent {

    /* loaded from: classes7.dex */
    public final class ClosePool implements PoolMoreOptionsBottomSheetViewEvent {
        public static final ClosePool INSTANCE = new ClosePool();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClosePool);
        }

        public final int hashCode() {
            return 281703838;
        }

        public final String toString() {
            return "ClosePool";
        }
    }

    public final class Dismiss implements PoolMoreOptionsBottomSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -133116812;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* loaded from: classes7.dex */
    public final class LeavePool implements PoolMoreOptionsBottomSheetViewEvent {
        public static final LeavePool INSTANCE = new LeavePool();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LeavePool);
        }

        public final int hashCode() {
            return -1869517091;
        }

        public final String toString() {
            return "LeavePool";
        }
    }

    public final class ShowParticipants implements PoolMoreOptionsBottomSheetViewEvent {
        public static final ShowParticipants INSTANCE = new ShowParticipants();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowParticipants);
        }

        public final int hashCode() {
            return -991428461;
        }

        public final String toString() {
            return "ShowParticipants";
        }
    }
}
