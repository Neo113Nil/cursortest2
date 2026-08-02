package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface AuthorizeGooglePayViewModel {

    public final class Loaded implements AuthorizeGooglePayViewModel {
        public static final Loaded INSTANCE = new Loaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loaded);
        }

        public final int hashCode() {
            return -507657647;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    public final class Loading implements AuthorizeGooglePayViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1442486384;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
