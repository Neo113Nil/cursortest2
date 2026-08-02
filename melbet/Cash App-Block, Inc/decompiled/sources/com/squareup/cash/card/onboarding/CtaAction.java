package com.squareup.cash.card.onboarding;

/* loaded from: classes6.dex */
public interface CtaAction {

    public final class Disabled implements CtaAction {
        public static final Disabled INSTANCE = new Disabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Disabled);
        }

        public final int hashCode() {
            return 2030986635;
        }

        public final String toString() {
            return "Disabled";
        }
    }

    public final class Notify implements CtaAction {
        public static final Notify INSTANCE = new Notify();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Notify);
        }

        public final int hashCode() {
            return 97335832;
        }

        public final String toString() {
            return "Notify";
        }
    }

    public final class Submit implements CtaAction {
        public static final Submit INSTANCE = new Submit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public final int hashCode() {
            return 245490407;
        }

        public final String toString() {
            return "Submit";
        }
    }
}
