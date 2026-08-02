package com.squareup.cash.favorites.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class FavoritesListWidgetViewModel {
    public final ArrayList favorites;

    public FavoritesListWidgetViewModel(ArrayList arrayList) {
        this.favorites = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FavoritesListWidgetViewModel) && this.favorites.equals(((FavoritesListWidgetViewModel) obj).favorites);
    }

    public final int hashCode() {
        return this.favorites.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("FavoritesListWidgetViewModel(favorites=", ")", this.favorites);
    }
}
