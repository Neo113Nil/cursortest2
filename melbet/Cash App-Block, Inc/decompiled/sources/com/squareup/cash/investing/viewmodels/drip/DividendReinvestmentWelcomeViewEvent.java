package com.squareup.cash.investing.viewmodels.drip;

/* loaded from: classes6.dex */
public abstract class DividendReinvestmentWelcomeViewEvent {

    public final class CloseClicked extends DividendReinvestmentWelcomeViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -591957752;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class CtaClicked extends DividendReinvestmentWelcomeViewEvent {
        public static final CtaClicked INSTANCE = new CtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClicked);
        }

        public final int hashCode() {
            return -1886082000;
        }

        public final String toString() {
            return "CtaClicked";
        }
    }

    public final class LearnMoreClicked extends DividendReinvestmentWelcomeViewEvent {
        public static final LearnMoreClicked INSTANCE = new LearnMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LearnMoreClicked);
        }

        public final int hashCode() {
            return -735665241;
        }

        public final String toString() {
            return "LearnMoreClicked";
        }
    }
}
