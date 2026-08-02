package com.squareup.cash.blockers.viewmodels;

import com.squareup.protos.franklin.api.HelpItem;

/* loaded from: classes4.dex */
public abstract class VerifyContactsViewEvent {

    public final class AccessDenied extends VerifyContactsViewEvent {
        public static final AccessDenied INSTANCE = new AccessDenied();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AccessDenied);
        }

        public final int hashCode() {
            return 497242944;
        }

        public final String toString() {
            return "AccessDenied";
        }
    }

    public final class Dismiss extends VerifyContactsViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1426059465;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class HelpClick extends VerifyContactsViewEvent {
        public static final HelpClick INSTANCE = new HelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClick);
        }

        public final int hashCode() {
            return 1460408646;
        }

        public final String toString() {
            return "HelpClick";
        }
    }

    public final class HelpItemClick extends VerifyContactsViewEvent {
        public final HelpItem item;

        public HelpItemClick(HelpItem helpItem) {
            helpItem.getClass();
            this.item = helpItem;
        }
    }

    public final class OSBack extends VerifyContactsViewEvent {
        public static final OSBack INSTANCE = new OSBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OSBack);
        }

        public final int hashCode() {
            return -215055700;
        }

        public final String toString() {
            return "OSBack";
        }
    }

    public final class Retreat extends VerifyContactsViewEvent {
        public static final Retreat INSTANCE = new Retreat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retreat);
        }

        public final int hashCode() {
            return 852760582;
        }

        public final String toString() {
            return "Retreat";
        }
    }

    public final class Submit extends VerifyContactsViewEvent {
        public static final Submit INSTANCE = new Submit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public final int hashCode() {
            return -68174343;
        }

        public final String toString() {
            return "Submit";
        }
    }
}
