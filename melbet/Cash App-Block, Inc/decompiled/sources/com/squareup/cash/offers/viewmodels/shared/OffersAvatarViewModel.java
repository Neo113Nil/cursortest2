package com.squareup.cash.offers.viewmodels.shared;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersAvatarViewModel {
    public final Color backgroundColor;
    public final boolean colorizeImage;
    public final Character monogram;
    public final IconUrl url;

    public final class IconUrl {
        public final String dark;
        public final String light;

        public IconUrl(String str, String str2) {
            str.getClass();
            this.light = str;
            this.dark = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconUrl)) {
                return false;
            }
            IconUrl iconUrl = (IconUrl) obj;
            return Intrinsics.areEqual(this.light, iconUrl.light) && Intrinsics.areEqual(this.dark, iconUrl.dark);
        }

        public final int hashCode() {
            int hashCode = this.light.hashCode() * 31;
            String str = this.dark;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("IconUrl(light=", this.light, ", dark=", this.dark, ")");
        }
    }

    public OffersAvatarViewModel(IconUrl iconUrl, Character ch, Color color, boolean z) {
        this.url = iconUrl;
        this.monogram = ch;
        this.backgroundColor = color;
        this.colorizeImage = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersAvatarViewModel)) {
            return false;
        }
        OffersAvatarViewModel offersAvatarViewModel = (OffersAvatarViewModel) obj;
        return this.url.equals(offersAvatarViewModel.url) && Intrinsics.areEqual(this.monogram, offersAvatarViewModel.monogram) && Intrinsics.areEqual(this.backgroundColor, offersAvatarViewModel.backgroundColor) && this.colorizeImage == offersAvatarViewModel.colorizeImage;
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Character ch = this.monogram;
        int hashCode2 = (hashCode + (ch == null ? 0 : ch.hashCode())) * 31;
        Color color = this.backgroundColor;
        return Boolean.hashCode(this.colorizeImage) + ((hashCode2 + (color != null ? color.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OffersAvatarViewModel(url=" + this.url + ", monogram=" + this.monogram + ", backgroundColor=" + this.backgroundColor + ", colorizeImage=" + this.colorizeImage + ")";
    }
}
