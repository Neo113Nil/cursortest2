package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface CameraErrorViewEvent {

    public final class Cancel implements CameraErrorViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -914740070;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Retry implements CameraErrorViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 1785585800;
        }

        public final String toString() {
            return "Retry";
        }
    }
}
