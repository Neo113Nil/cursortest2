package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.stripe.api.StripeLinkParams;

/* loaded from: classes4.dex */
public interface StripeLinkViewModel {

    public final class Loading implements StripeLinkViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1943060079;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements StripeLinkViewModel {
        public final StripeLinkParams params;

        public Ready(StripeLinkParams stripeLinkParams) {
            this.params = stripeLinkParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && this.params.equals(((Ready) obj).params);
        }

        public final int hashCode() {
            return this.params.hashCode();
        }

        public final String toString() {
            return "Ready(params=" + this.params + ")";
        }
    }
}
