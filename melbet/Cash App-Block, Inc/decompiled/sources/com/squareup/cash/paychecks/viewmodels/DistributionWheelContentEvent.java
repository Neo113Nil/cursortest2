package com.squareup.cash.paychecks.viewmodels;

/* loaded from: classes6.dex */
public interface DistributionWheelContentEvent {

    public final class HeroAmountTapped implements DistributionWheelContentEvent {
        public static final HeroAmountTapped INSTANCE = new HeroAmountTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HeroAmountTapped);
        }

        public final int hashCode() {
            return 1664913094;
        }

        public final String toString() {
            return "HeroAmountTapped";
        }
    }

    public final class InfoButtonTapped implements DistributionWheelContentEvent {
        public static final InfoButtonTapped INSTANCE = new InfoButtonTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InfoButtonTapped);
        }

        public final int hashCode() {
            return -509771564;
        }

        public final String toString() {
            return "InfoButtonTapped";
        }
    }
}
