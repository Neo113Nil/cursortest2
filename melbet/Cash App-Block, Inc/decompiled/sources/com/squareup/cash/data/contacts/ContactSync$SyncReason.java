package com.squareup.cash.data.contacts;

/* loaded from: classes6.dex */
public interface ContactSync$SyncReason {

    public final class AppLaunch implements ContactSync$SyncReason {
        public static final AppLaunch INSTANCE = new AppLaunch();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppLaunch);
        }

        public final int hashCode() {
            return 1849447425;
        }

        public final String toString() {
            return "AppLaunch";
        }
    }

    public final class Refresh implements ContactSync$SyncReason {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return -2136307480;
        }

        public final String toString() {
            return "Refresh";
        }
    }
}
