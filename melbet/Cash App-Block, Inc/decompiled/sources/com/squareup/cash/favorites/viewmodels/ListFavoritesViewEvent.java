package com.squareup.cash.favorites.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class ListFavoritesViewEvent {

    public final class AddMoreFavorites extends ListFavoritesViewEvent {
        public static final AddMoreFavorites INSTANCE = new AddMoreFavorites();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddMoreFavorites);
        }

        public final int hashCode() {
            return 499996221;
        }

        public final String toString() {
            return "AddMoreFavorites";
        }
    }

    public final class BackClicked extends ListFavoritesViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -887016220;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class FavoriteClicked extends ListFavoritesViewEvent {
        public final String customerId;

        public FavoriteClicked(String str) {
            this.customerId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoriteClicked) && this.customerId.equals(((FavoriteClicked) obj).customerId);
        }

        public final int hashCode() {
            return this.customerId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FavoriteClicked(customerId=", this.customerId, ")");
        }
    }

    public final class ListRowClicked extends ListFavoritesViewEvent {
        public final FavoritePersonViewModel favorite;

        public ListRowClicked(FavoritePersonViewModel favoritePersonViewModel) {
            favoritePersonViewModel.getClass();
            this.favorite = favoritePersonViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ListRowClicked) && Intrinsics.areEqual(this.favorite, ((ListRowClicked) obj).favorite);
        }

        public final int hashCode() {
            return this.favorite.hashCode();
        }

        public final String toString() {
            return "ListRowClicked(favorite=" + this.favorite + ")";
        }
    }
}
