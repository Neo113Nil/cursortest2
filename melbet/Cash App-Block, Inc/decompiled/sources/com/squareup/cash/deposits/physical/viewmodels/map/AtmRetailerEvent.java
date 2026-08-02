package com.squareup.cash.deposits.physical.viewmodels.map;

/* loaded from: classes6.dex */
public abstract class AtmRetailerEvent {

    public final class ExitClick extends AtmRetailerEvent {
        public static final ExitClick INSTANCE = new ExitClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitClick);
        }

        public final int hashCode() {
            return -1293981459;
        }

        public final String toString() {
            return "ExitClick";
        }
    }

    public final class HelpClick extends AtmRetailerEvent {
        public static final HelpClick INSTANCE = new HelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClick);
        }

        public final int hashCode() {
            return 1372958890;
        }

        public final String toString() {
            return "HelpClick";
        }
    }

    public final class SearchClick extends AtmRetailerEvent {
        public static final SearchClick INSTANCE = new SearchClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchClick);
        }

        public final int hashCode() {
            return -1649273373;
        }

        public final String toString() {
            return "SearchClick";
        }
    }
}
