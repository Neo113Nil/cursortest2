package com.squareup.cash.qrcodes.viewmodels;

/* loaded from: classes7.dex */
public interface CashQrShortcutsOnboardingViewEvent {

    public final class AddTile implements CashQrShortcutsOnboardingViewEvent {
        public static final AddTile INSTANCE = new AddTile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddTile);
        }

        public final int hashCode() {
            return 1811129350;
        }

        public final String toString() {
            return "AddTile";
        }
    }

    public final class AddWidget implements CashQrShortcutsOnboardingViewEvent {
        public static final AddWidget INSTANCE = new AddWidget();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddWidget);
        }

        public final int hashCode() {
            return 1119204764;
        }

        public final String toString() {
            return "AddWidget";
        }
    }

    public final class Dismiss implements CashQrShortcutsOnboardingViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 336416673;
        }

        public final String toString() {
            return "Dismiss";
        }
    }
}
