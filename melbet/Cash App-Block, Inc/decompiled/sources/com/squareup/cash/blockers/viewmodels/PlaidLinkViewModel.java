package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.plaid.api.PlaidLinkParams;

/* loaded from: classes4.dex */
public interface PlaidLinkViewModel {

    public final class Loading implements PlaidLinkViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1729471636;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements PlaidLinkViewModel {
        public final PlaidLinkParams params;

        public Ready(PlaidLinkParams plaidLinkParams) {
            this.params = plaidLinkParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && this.params.equals(((Ready) obj).params);
        }

        public final int hashCode() {
            return this.params.linkToken.hashCode();
        }

        public final String toString() {
            return "Ready(params=" + this.params + ")";
        }
    }
}
