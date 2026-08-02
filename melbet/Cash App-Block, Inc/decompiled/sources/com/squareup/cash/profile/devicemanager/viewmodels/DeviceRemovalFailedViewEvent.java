package com.squareup.cash.profile.devicemanager.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes7.dex */
public interface DeviceRemovalFailedViewEvent {

    public final class Close implements DeviceRemovalFailedViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1165611491;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class TryAgain implements DeviceRemovalFailedViewEvent {
        public static final TryAgain INSTANCE = new TryAgain();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgain);
        }

        public final int hashCode() {
            return 911990816;
        }

        public final String toString() {
            return "TryAgain";
        }
    }
}
