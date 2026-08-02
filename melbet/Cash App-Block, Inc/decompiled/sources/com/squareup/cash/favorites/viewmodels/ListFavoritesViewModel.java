package com.squareup.cash.favorites.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ListFavoritesViewModel {
    public final List favorites;
    public final ToolbarViewModel toolbar;

    public ListFavoritesViewModel(ToolbarViewModel toolbarViewModel, List list) {
        list.getClass();
        this.toolbar = toolbarViewModel;
        this.favorites = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListFavoritesViewModel)) {
            return false;
        }
        ListFavoritesViewModel listFavoritesViewModel = (ListFavoritesViewModel) obj;
        return this.toolbar.equals(listFavoritesViewModel.toolbar) && Intrinsics.areEqual(this.favorites, listFavoritesViewModel.favorites);
    }

    public final int hashCode() {
        return this.favorites.hashCode() + (this.toolbar.title.hashCode() * 31);
    }

    public final String toString() {
        return "ListFavoritesViewModel(toolbar=" + this.toolbar + ", favorites=" + this.favorites + ")";
    }
}
