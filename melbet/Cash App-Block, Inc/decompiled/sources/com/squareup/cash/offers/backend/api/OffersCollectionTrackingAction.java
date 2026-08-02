package com.squareup.cash.offers.backend.api;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class OffersCollectionTrackingAction {

    public final class EndCollectionTracking extends OffersCollectionTrackingAction {
        public static final EndCollectionTracking INSTANCE = new EndCollectionTracking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndCollectionTracking);
        }

        public final int hashCode() {
            return 681235895;
        }

        public final String toString() {
            return "EndCollectionTracking";
        }
    }

    public final class EndLoading extends OffersCollectionTrackingAction {
        public static final EndLoading INSTANCE = new EndLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndLoading);
        }

        public final int hashCode() {
            return -1582459846;
        }

        public final String toString() {
            return "EndLoading";
        }
    }

    public final class EndNetworking extends OffersCollectionTrackingAction {
        public static final EndNetworking INSTANCE = new EndNetworking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndNetworking);
        }

        public final int hashCode() {
            return 1908435766;
        }

        public final String toString() {
            return "EndNetworking";
        }
    }

    public final class StartCollectionTracking extends OffersCollectionTrackingAction {
        public static final StartCollectionTracking INSTANCE = new StartCollectionTracking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartCollectionTracking);
        }

        public final int hashCode() {
            return 1911388094;
        }

        public final String toString() {
            return "StartCollectionTracking";
        }
    }

    public final class StartLoading extends OffersCollectionTrackingAction {
        public final boolean isFullscreen;

        public StartLoading(boolean z) {
            this.isFullscreen = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartLoading) && this.isFullscreen == ((StartLoading) obj).isFullscreen;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isFullscreen);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("StartLoading(isFullscreen=", ")", this.isFullscreen);
        }
    }

    public final class StartNetworking extends OffersCollectionTrackingAction {
        public static final StartNetworking INSTANCE = new StartNetworking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartNetworking);
        }

        public final int hashCode() {
            return -1562573763;
        }

        public final String toString() {
            return "StartNetworking";
        }
    }
}
