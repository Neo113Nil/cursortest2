package com.squareup.cash.core.navigationcontainer.models;

/* loaded from: classes.dex */
public interface MainScreensViewModel$TabTreatment {

    /* loaded from: classes6.dex */
    public final class Floating implements MainScreensViewModel$TabTreatment {
        public static final Floating INSTANCE = new Floating();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Floating);
        }

        public final int hashCode() {
            return 1224346399;
        }

        public final String toString() {
            return "Floating";
        }
    }

    /* loaded from: classes6.dex */
    public final class Hidden implements MainScreensViewModel$TabTreatment {
        public static final Hidden INSTANCE = new Hidden();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public final int hashCode() {
            return -1254059261;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public final class Inline implements MainScreensViewModel$TabTreatment {
        public static final Inline INSTANCE = new Inline();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Inline);
        }

        public final int hashCode() {
            return -1220569102;
        }

        public final String toString() {
            return "Inline";
        }
    }

    /* loaded from: classes6.dex */
    public final class LiteFab implements MainScreensViewModel$TabTreatment {
        public static final LiteFab INSTANCE = new LiteFab();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LiteFab);
        }

        public final int hashCode() {
            return -951307968;
        }

        public final String toString() {
            return "LiteFab";
        }
    }
}
