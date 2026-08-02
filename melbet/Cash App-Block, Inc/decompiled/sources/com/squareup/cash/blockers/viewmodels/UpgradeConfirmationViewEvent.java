package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface UpgradeConfirmationViewEvent {

    public final class NegativeClick implements UpgradeConfirmationViewEvent {
        public static final NegativeClick INSTANCE = new NegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeClick);
        }

        public final int hashCode() {
            return -1099054619;
        }

        public final String toString() {
            return "NegativeClick";
        }
    }

    public final class PositiveClick implements UpgradeConfirmationViewEvent {
        public static final PositiveClick INSTANCE = new PositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveClick);
        }

        public final int hashCode() {
            return -2055721311;
        }

        public final String toString() {
            return "PositiveClick";
        }
    }
}
