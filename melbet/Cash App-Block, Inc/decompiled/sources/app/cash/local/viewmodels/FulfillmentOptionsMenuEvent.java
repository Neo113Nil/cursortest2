package app.cash.local.viewmodels;

/* loaded from: classes3.dex */
public interface FulfillmentOptionsMenuEvent extends LocalBrandProfileViewEvent {

    public final class ChangeLocation implements FulfillmentOptionsMenuEvent {
        public static final ChangeLocation INSTANCE = new ChangeLocation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeLocation);
        }

        public final int hashCode() {
            return 1776731718;
        }

        public final String toString() {
            return "ChangeLocation";
        }
    }

    public final class ChangeTableClicked implements FulfillmentOptionsMenuEvent {
        public static final ChangeTableClicked INSTANCE = new ChangeTableClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeTableClicked);
        }

        public final int hashCode() {
            return 2131500682;
        }

        public final String toString() {
            return "ChangeTableClicked";
        }
    }

    public final class FulfillAsapClicked implements FulfillmentOptionsMenuEvent {
        public static final FulfillAsapClicked INSTANCE = new FulfillAsapClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillAsapClicked);
        }

        public final int hashCode() {
            return 2110379687;
        }

        public final String toString() {
            return "FulfillAsapClicked";
        }
    }

    public final class GetDirections implements FulfillmentOptionsMenuEvent {
        public static final GetDirections INSTANCE = new GetDirections();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GetDirections);
        }

        public final int hashCode() {
            return 1871570409;
        }

        public final String toString() {
            return "GetDirections";
        }
    }

    public final class ScheduleOrderClicked implements FulfillmentOptionsMenuEvent {
        public static final ScheduleOrderClicked INSTANCE = new ScheduleOrderClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScheduleOrderClicked);
        }

        public final int hashCode() {
            return 410497841;
        }

        public final String toString() {
            return "ScheduleOrderClicked";
        }
    }
}
