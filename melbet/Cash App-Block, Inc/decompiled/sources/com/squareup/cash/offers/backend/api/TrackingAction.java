package com.squareup.cash.offers.backend.api;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface TrackingAction {

    public final class EndApi implements TrackingAction {
        public static final EndApi INSTANCE = new EndApi();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndApi);
        }

        public final int hashCode() {
            return -792055123;
        }

        public final String toString() {
            return "EndApi";
        }
    }

    public final class EndDb implements TrackingAction {
        public static final EndDb INSTANCE = new EndDb();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndDb);
        }

        public final int hashCode() {
            return 667186571;
        }

        public final String toString() {
            return "EndDb";
        }
    }

    public final class EndMapping implements TrackingAction {
        public static final EndMapping INSTANCE = new EndMapping();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndMapping);
        }

        public final int hashCode() {
            return -2018488351;
        }

        public final String toString() {
            return "EndMapping";
        }
    }

    public final class EndTracking implements TrackingAction {
        public static final EndTracking INSTANCE = new EndTracking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndTracking);
        }

        public final int hashCode() {
            return -1367553532;
        }

        public final String toString() {
            return "EndTracking";
        }
    }

    public final class StartApi implements TrackingAction {
        public static final StartApi INSTANCE = new StartApi();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartApi);
        }

        public final int hashCode() {
            return -1336716730;
        }

        public final String toString() {
            return "StartApi";
        }
    }

    public final class StartDb implements TrackingAction {
        public static final StartDb INSTANCE = new StartDb();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartDb);
        }

        public final int hashCode() {
            return 926711506;
        }

        public final String toString() {
            return "StartDb";
        }
    }

    public final class StartMapping implements TrackingAction {
        public static final StartMapping INSTANCE = new StartMapping();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartMapping);
        }

        public final int hashCode() {
            return 939391738;
        }

        public final String toString() {
            return "StartMapping";
        }
    }

    public final class StartTracking implements TrackingAction {
        public final Set filterToken;

        public StartTracking(Set set) {
            set.getClass();
            this.filterToken = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartTracking) && Intrinsics.areEqual(this.filterToken, ((StartTracking) obj).filterToken);
        }

        public final int hashCode() {
            return this.filterToken.hashCode();
        }

        public final String toString() {
            return "StartTracking(filterToken=" + this.filterToken + ")";
        }
    }

    public final class TerminateTracking implements TrackingAction {
        public static final TerminateTracking INSTANCE = new TerminateTracking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TerminateTracking);
        }

        public final int hashCode() {
            return -1515760630;
        }

        public final String toString() {
            return "TerminateTracking";
        }
    }
}
