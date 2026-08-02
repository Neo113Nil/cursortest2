package com.squareup.cash.favorites.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FavoritePersonViewModel {
    public final Color accentColor;
    public final Icons badgeIcon;
    public final String customerId;
    public final boolean isBusiness;
    public final boolean isFavorite;
    public final boolean isRequestInFlight;
    public final boolean isVerified;
    public final String monogram;
    public final Image photoImage;
    public final Recipient recipient;
    public final String subtitle;
    public final String title;

    public FavoritePersonViewModel(Recipient recipient, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, Image image, Color color, Icons icons) {
        this.recipient = recipient;
        this.customerId = str;
        this.title = str2;
        this.subtitle = str3;
        this.monogram = str4;
        this.isRequestInFlight = z;
        this.isFavorite = z2;
        this.isVerified = z3;
        this.isBusiness = z4;
        this.photoImage = image;
        this.accentColor = color;
        this.badgeIcon = icons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoritePersonViewModel)) {
            return false;
        }
        FavoritePersonViewModel favoritePersonViewModel = (FavoritePersonViewModel) obj;
        return this.recipient.equals(favoritePersonViewModel.recipient) && this.customerId.equals(favoritePersonViewModel.customerId) && this.title.equals(favoritePersonViewModel.title) && this.subtitle.equals(favoritePersonViewModel.subtitle) && this.monogram.equals(favoritePersonViewModel.monogram) && this.isRequestInFlight == favoritePersonViewModel.isRequestInFlight && this.isFavorite == favoritePersonViewModel.isFavorite && this.isVerified == favoritePersonViewModel.isVerified && this.isBusiness == favoritePersonViewModel.isBusiness && Intrinsics.areEqual(this.photoImage, favoritePersonViewModel.photoImage) && Intrinsics.areEqual(this.accentColor, favoritePersonViewModel.accentColor) && this.badgeIcon == favoritePersonViewModel.badgeIcon;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recipient.hashCode() * 31, 31, this.customerId), 31, this.title), 31, this.subtitle), 31, this.monogram), 31, this.isRequestInFlight), 31, this.isFavorite), 31, this.isVerified), 31, this.isBusiness);
        Image image = this.photoImage;
        int hashCode = (m + (image == null ? 0 : image.hashCode())) * 31;
        Color color = this.accentColor;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        Icons icons = this.badgeIcon;
        return hashCode2 + (icons != null ? icons.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoritePersonViewModel(recipient=");
        sb.append(this.recipient);
        sb.append(", customerId=");
        sb.append(this.customerId);
        sb.append(", title=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", monogram=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.monogram, ", isRequestInFlight=", this.isRequestInFlight, ", isFavorite=");
        re$$ExternalSyntheticOutline0.m(sb, this.isFavorite, ", isVerified=", this.isVerified, ", isBusiness=");
        sb.append(this.isBusiness);
        sb.append(", photoImage=");
        sb.append(this.photoImage);
        sb.append(", accentColor=");
        sb.append(this.accentColor);
        sb.append(", badgeIcon=");
        sb.append(this.badgeIcon);
        sb.append(")");
        return sb.toString();
    }
}
