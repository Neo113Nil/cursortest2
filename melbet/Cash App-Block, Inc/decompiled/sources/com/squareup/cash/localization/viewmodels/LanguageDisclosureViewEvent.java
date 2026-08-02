package com.squareup.cash.localization.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface LanguageDisclosureViewEvent {

    public final class Accept implements LanguageDisclosureViewEvent {
        public static final Accept INSTANCE = new Accept();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Accept);
        }

        public final int hashCode() {
            return 1714442818;
        }

        public final String toString() {
            return "Accept";
        }
    }

    public final class Close implements LanguageDisclosureViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1328041602;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class OpenLocaleSettings implements LanguageDisclosureViewEvent {
        public static final OpenLocaleSettings INSTANCE = new OpenLocaleSettings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenLocaleSettings);
        }

        public final int hashCode() {
            return -1200229439;
        }

        public final String toString() {
            return "OpenLocaleSettings";
        }
    }
}
