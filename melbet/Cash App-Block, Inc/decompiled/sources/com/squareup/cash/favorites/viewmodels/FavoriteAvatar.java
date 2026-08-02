package com.squareup.cash.favorites.viewmodels;

import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FavoriteAvatar {
    public final Color accentColor;
    public final Character monogram;
    public final String name;
    public final Image photoImage;
    public final Recipient recipient;

    public FavoriteAvatar(Recipient recipient, String str, Character ch, Image image, Color color) {
        this.recipient = recipient;
        this.name = str;
        this.monogram = ch;
        this.photoImage = image;
        this.accentColor = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteAvatar)) {
            return false;
        }
        FavoriteAvatar favoriteAvatar = (FavoriteAvatar) obj;
        return this.recipient.equals(favoriteAvatar.recipient) && this.name.equals(favoriteAvatar.name) && Intrinsics.areEqual(this.monogram, favoriteAvatar.monogram) && Intrinsics.areEqual(this.photoImage, favoriteAvatar.photoImage) && this.accentColor.equals(favoriteAvatar.accentColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recipient.hashCode() * 31, 31, this.name);
        Character ch = this.monogram;
        int hashCode = (m + (ch == null ? 0 : ch.hashCode())) * 31;
        Image image = this.photoImage;
        return this.accentColor.hashCode() + ((hashCode + (image != null ? image.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FavoriteAvatar(recipient=" + this.recipient + ", name=" + this.name + ", monogram=" + this.monogram + ", photoImage=" + this.photoImage + ", accentColor=" + this.accentColor + ")";
    }
}
