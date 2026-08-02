package com.squareup.cash.favorites.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FavoritesMessageViewModel {
    public final String message;
    public final String title;

    public FavoritesMessageViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoritesMessageViewModel)) {
            return false;
        }
        FavoritesMessageViewModel favoritesMessageViewModel = (FavoritesMessageViewModel) obj;
        return Intrinsics.areEqual(this.title, favoritesMessageViewModel.title) && Intrinsics.areEqual(this.message, favoritesMessageViewModel.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("FavoritesMessageViewModel(title=", this.title, ", message=", this.message, ")");
    }
}
