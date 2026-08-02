package com.squareup.cash.initialscreenloader.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public abstract class AppUpgradeViewEvent {

    public final class Close extends AppUpgradeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 518362658;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class OpenWebVersion extends AppUpgradeViewEvent {
        public static final OpenWebVersion INSTANCE = new OpenWebVersion();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenWebVersion);
        }

        public final int hashCode() {
            return -953530396;
        }

        public final String toString() {
            return "OpenWebVersion";
        }
    }

    public final class Upgrade extends AppUpgradeViewEvent {
        public static final Upgrade INSTANCE = new Upgrade();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Upgrade);
        }

        public final int hashCode() {
            return -1167396922;
        }

        public final String toString() {
            return "Upgrade";
        }
    }
}
