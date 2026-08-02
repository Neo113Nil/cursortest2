package com.squareup.cash.favorites.viewmodels;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FavoriteAddedViewModel {
    public final Color accentColor;
    public final String message;
    public final Character monogram;
    public final String name;
    public final Image photo;
    public final boolean showViewFavorites;

    public FavoriteAddedViewModel(String str, String str2, Image image, Color color, Character ch, boolean z) {
        str.getClass();
        this.name = str;
        this.message = str2;
        this.photo = image;
        this.accentColor = color;
        this.monogram = ch;
        this.showViewFavorites = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteAddedViewModel)) {
            return false;
        }
        FavoriteAddedViewModel favoriteAddedViewModel = (FavoriteAddedViewModel) obj;
        return Intrinsics.areEqual(this.name, favoriteAddedViewModel.name) && Intrinsics.areEqual(this.message, favoriteAddedViewModel.message) && Intrinsics.areEqual(this.photo, favoriteAddedViewModel.photo) && Intrinsics.areEqual(this.accentColor, favoriteAddedViewModel.accentColor) && Intrinsics.areEqual(this.monogram, favoriteAddedViewModel.monogram) && this.showViewFavorites == favoriteAddedViewModel.showViewFavorites;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.photo;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Color color = this.accentColor;
        int hashCode4 = (hashCode3 + (color == null ? 0 : color.hashCode())) * 31;
        Character ch = this.monogram;
        return Boolean.hashCode(this.showViewFavorites) + ((hashCode4 + (ch != null ? ch.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FavoriteAddedViewModel(name=", this.name, ", message=", this.message, ", photo=");
        m.append(this.photo);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(", monogram=");
        m.append(this.monogram);
        m.append(", showViewFavorites=");
        m.append(this.showViewFavorites);
        m.append(")");
        return m.toString();
    }
}
