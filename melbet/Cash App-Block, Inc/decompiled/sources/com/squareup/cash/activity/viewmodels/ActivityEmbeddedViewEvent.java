package com.squareup.cash.activity.viewmodels;

/* loaded from: classes5.dex */
public interface ActivityEmbeddedViewEvent {

    public final class LoadMore implements ActivityEmbeddedViewEvent {
        public static final LoadMore INSTANCE = new LoadMore();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadMore);
        }

        public final int hashCode() {
            return 885770335;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    public final class Refresh implements ActivityEmbeddedViewEvent {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return 1470131031;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public final class ShowMoreClicked implements ActivityEmbeddedViewEvent {
        public static final ShowMoreClicked INSTANCE = new ShowMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowMoreClicked);
        }

        public final int hashCode() {
            return -734065583;
        }

        public final String toString() {
            return "ShowMoreClicked";
        }
    }
}
