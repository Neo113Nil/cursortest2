package com.squareup.cash.cashapppay.settings.viewmodels;

/* loaded from: classes6.dex */
public abstract class UnlinkResultViewEvent {

    public final class CloseClicked extends UnlinkResultViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 1724124334;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class CtaClicked extends UnlinkResultViewEvent {
        public static final CtaClicked INSTANCE = new CtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClicked);
        }

        public final int hashCode() {
            return 1463810390;
        }

        public final String toString() {
            return "CtaClicked";
        }
    }
}
