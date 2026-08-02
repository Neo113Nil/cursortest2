package com.squareup.cash.appupdate.viewmodels;

/* loaded from: classes5.dex */
public interface AppUpdateDialogViewEvent {

    public final class Dismiss implements AppUpdateDialogViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1321751112;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class Update implements AppUpdateDialogViewEvent {
        public static final Update INSTANCE = new Update();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Update);
        }

        public final int hashCode() {
            return -1542870709;
        }

        public final String toString() {
            return "Update";
        }
    }
}
