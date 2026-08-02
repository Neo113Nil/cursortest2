package com.squareup.cash.family.requestsponsorship.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.recipients.data.Recipient;

/* loaded from: classes6.dex */
public interface SelectContactMethodViewEvent {

    public final class Close implements SelectContactMethodViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -19734070;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Select implements SelectContactMethodViewEvent {
        public final Recipient sponsor;

        public Select(Recipient recipient) {
            this.sponsor = recipient;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Select) && this.sponsor.equals(((Select) obj).sponsor);
        }

        public final int hashCode() {
            return this.sponsor.hashCode();
        }

        public final String toString() {
            return "Select(sponsor=" + this.sponsor + ")";
        }
    }
}
