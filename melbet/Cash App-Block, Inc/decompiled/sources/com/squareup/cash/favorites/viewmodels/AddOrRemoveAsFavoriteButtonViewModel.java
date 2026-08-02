package com.squareup.cash.favorites.viewmodels;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AddOrRemoveAsFavoriteButtonViewModel {
    public final Color accentColor;
    public final String customerId;
    public final FavoriteState favoriteState;
    public final Character monogram;
    public final String name;
    public final Image photo;

    public AddOrRemoveAsFavoriteButtonViewModel(String str, String str2, Color color, Image image, Character ch, FavoriteState favoriteState) {
        str.getClass();
        this.customerId = str;
        this.name = str2;
        this.accentColor = color;
        this.photo = image;
        this.monogram = ch;
        this.favoriteState = favoriteState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddOrRemoveAsFavoriteButtonViewModel)) {
            return false;
        }
        AddOrRemoveAsFavoriteButtonViewModel addOrRemoveAsFavoriteButtonViewModel = (AddOrRemoveAsFavoriteButtonViewModel) obj;
        return Intrinsics.areEqual(this.customerId, addOrRemoveAsFavoriteButtonViewModel.customerId) && this.name.equals(addOrRemoveAsFavoriteButtonViewModel.name) && Intrinsics.areEqual(this.accentColor, addOrRemoveAsFavoriteButtonViewModel.accentColor) && Intrinsics.areEqual(this.photo, addOrRemoveAsFavoriteButtonViewModel.photo) && Intrinsics.areEqual(this.monogram, addOrRemoveAsFavoriteButtonViewModel.monogram) && this.favoriteState == addOrRemoveAsFavoriteButtonViewModel.favoriteState;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerId.hashCode() * 31, 31, this.name);
        Color color = this.accentColor;
        int hashCode = (m + (color == null ? 0 : color.hashCode())) * 31;
        Image image = this.photo;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Character ch = this.monogram;
        return this.favoriteState.hashCode() + ((hashCode2 + (ch != null ? ch.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddOrRemoveAsFavoriteButtonViewModel(customerId=", this.customerId, ", name=", this.name, ", accentColor=");
        m.append(this.accentColor);
        m.append(", photo=");
        m.append(this.photo);
        m.append(", monogram=");
        m.append(this.monogram);
        m.append(", favoriteState=");
        m.append(this.favoriteState);
        m.append(")");
        return m.toString();
    }
}
