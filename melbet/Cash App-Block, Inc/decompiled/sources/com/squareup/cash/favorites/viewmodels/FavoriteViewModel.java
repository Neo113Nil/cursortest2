package com.squareup.cash.favorites.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.favorites.viewmodels.SectionViewModel;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FavoriteViewModel {
    public final Color accentColor;
    public final String customerId;
    public final boolean isBusiness;
    public final boolean isFavorited;
    public final boolean isRequestInFlight;
    public final boolean isVerified;
    public final Character monogram;
    public final Image photoImage;
    public final Recipient recipient;
    public final SectionViewModel.Type section;
    public final String subtitle;
    public final String title;

    public FavoriteViewModel(Recipient recipient, String str, String str2, String str3, Character ch, boolean z, boolean z2, boolean z3, boolean z4, Image image, Color color, SectionViewModel.Type type2) {
        this.recipient = recipient;
        this.customerId = str;
        this.title = str2;
        this.subtitle = str3;
        this.monogram = ch;
        this.isRequestInFlight = z;
        this.isFavorited = z2;
        this.isVerified = z3;
        this.isBusiness = z4;
        this.photoImage = image;
        this.accentColor = color;
        this.section = type2;
    }

    public static FavoriteViewModel copy$default(FavoriteViewModel favoriteViewModel, boolean z, boolean z2, int i) {
        Recipient recipient = favoriteViewModel.recipient;
        String str = favoriteViewModel.customerId;
        String str2 = favoriteViewModel.title;
        String str3 = favoriteViewModel.subtitle;
        Character ch = favoriteViewModel.monogram;
        if ((i & 64) != 0) {
            z2 = favoriteViewModel.isFavorited;
        }
        return new FavoriteViewModel(recipient, str, str2, str3, ch, z, z2, favoriteViewModel.isVerified, favoriteViewModel.isBusiness, favoriteViewModel.photoImage, favoriteViewModel.accentColor, favoriteViewModel.section);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteViewModel)) {
            return false;
        }
        FavoriteViewModel favoriteViewModel = (FavoriteViewModel) obj;
        return this.recipient.equals(favoriteViewModel.recipient) && this.customerId.equals(favoriteViewModel.customerId) && this.title.equals(favoriteViewModel.title) && this.subtitle.equals(favoriteViewModel.subtitle) && Intrinsics.areEqual(this.monogram, favoriteViewModel.monogram) && this.isRequestInFlight == favoriteViewModel.isRequestInFlight && this.isFavorited == favoriteViewModel.isFavorited && this.isVerified == favoriteViewModel.isVerified && this.isBusiness == favoriteViewModel.isBusiness && Intrinsics.areEqual(this.photoImage, favoriteViewModel.photoImage) && this.accentColor.equals(favoriteViewModel.accentColor) && this.section == favoriteViewModel.section;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recipient.hashCode() * 31, 31, this.customerId), 31, this.title), 31, this.subtitle);
        Character ch = this.monogram;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (ch == null ? 0 : ch.hashCode())) * 31, 31, this.isRequestInFlight), 31, this.isFavorited), 31, this.isVerified), 31, this.isBusiness);
        Image image = this.photoImage;
        return this.section.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.accentColor, (m2 + (image != null ? image.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteViewModel(recipient=");
        sb.append(this.recipient);
        sb.append(", customerId=");
        sb.append(this.customerId);
        sb.append(", title=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", monogram=");
        sb.append(this.monogram);
        sb.append(", isRequestInFlight=");
        sb.append(this.isRequestInFlight);
        sb.append(", isFavorited=");
        re$$ExternalSyntheticOutline0.m(sb, this.isFavorited, ", isVerified=", this.isVerified, ", isBusiness=");
        sb.append(this.isBusiness);
        sb.append(", photoImage=");
        sb.append(this.photoImage);
        sb.append(", accentColor=");
        sb.append(this.accentColor);
        sb.append(", section=");
        sb.append(this.section);
        sb.append(")");
        return sb.toString();
    }
}
