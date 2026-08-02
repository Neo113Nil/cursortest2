package com.squareup.cash.investing.viewmodels;

/* loaded from: classes6.dex */
public abstract class SectionMoreInfoViewEvent {

    public final class CloseClick extends SectionMoreInfoViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 1463979621;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class UrlTextClick extends SectionMoreInfoViewEvent {
        public static final UrlTextClick INSTANCE = new UrlTextClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UrlTextClick);
        }

        public final int hashCode() {
            return -959824287;
        }

        public final String toString() {
            return "UrlTextClick";
        }
    }
}
