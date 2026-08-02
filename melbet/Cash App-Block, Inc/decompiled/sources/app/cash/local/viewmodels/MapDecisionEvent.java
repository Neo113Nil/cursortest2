package app.cash.local.viewmodels;

/* loaded from: classes3.dex */
public interface MapDecisionEvent extends LocalOrderStatusViewEvent, LocalBrandProfileViewEvent {

    public final class Cancel implements MapDecisionEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -712627496;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class CopyAddress implements MapDecisionEvent {
        public static final CopyAddress INSTANCE = new CopyAddress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyAddress);
        }

        public final int hashCode() {
            return -1007602399;
        }

        public final String toString() {
            return "CopyAddress";
        }
    }

    public final class CopyPhone implements MapDecisionEvent {
        public static final CopyPhone INSTANCE = new CopyPhone();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyPhone);
        }

        public final int hashCode() {
            return 1152597467;
        }

        public final String toString() {
            return "CopyPhone";
        }
    }

    public final class OpenGoogleMap implements MapDecisionEvent {
        public static final OpenGoogleMap INSTANCE = new OpenGoogleMap();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenGoogleMap);
        }

        public final int hashCode() {
            return 18178843;
        }

        public final String toString() {
            return "OpenGoogleMap";
        }
    }
}
