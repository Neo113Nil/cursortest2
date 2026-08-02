package com.squareup.cash.favorites.viewmodels;

/* loaded from: classes6.dex */
public abstract class FavoriteAddedViewEvent {

    public final class CloseClicked extends FavoriteAddedViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 940109590;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class ViewFavoritesClicked extends FavoriteAddedViewEvent {
        public static final ViewFavoritesClicked INSTANCE = new ViewFavoritesClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewFavoritesClicked);
        }

        public final int hashCode() {
            return -1104664676;
        }

        public final String toString() {
            return "ViewFavoritesClicked";
        }
    }
}
