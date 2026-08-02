package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public abstract class QuickPayDetailsViewEvent {

    public final class ChangeOrientationClicked extends QuickPayDetailsViewEvent {
        public static final ChangeOrientationClicked INSTANCE = new ChangeOrientationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeOrientationClicked);
        }

        public final int hashCode() {
            return 1077024407;
        }

        public final String toString() {
            return "ChangeOrientationClicked";
        }
    }

    public final class CloseClicked extends QuickPayDetailsViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 84493727;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }
}
