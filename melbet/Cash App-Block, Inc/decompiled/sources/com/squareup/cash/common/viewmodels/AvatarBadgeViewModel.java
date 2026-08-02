package com.squareup.cash.common.viewmodels;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AvatarBadgeViewModel {

    /* loaded from: classes5.dex */
    public final class CardUrl extends AvatarBadgeViewModel {
        public final Image image;

        public CardUrl(Image image) {
            image.getClass();
            this.image = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardUrl) && Intrinsics.areEqual(this.image, ((CardUrl) obj).image);
        }

        public final int hashCode() {
            return this.image.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "CardUrl(image=", ")");
        }
    }

    public final class IconRes extends AvatarBadgeViewModel {
        public final ColorModel backgroundColor;
        public final ColorFilter colorFilter;
        public final int resId;

        public IconRes(int i, ColorModel colorModel, ColorMatrixColorFilter colorMatrixColorFilter, int i2) {
            colorMatrixColorFilter = (i2 & 8) != 0 ? null : colorMatrixColorFilter;
            this.resId = i;
            this.backgroundColor = colorModel;
            this.colorFilter = colorMatrixColorFilter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconRes)) {
                return false;
            }
            IconRes iconRes = (IconRes) obj;
            return this.resId == iconRes.resId && Intrinsics.areEqual(this.backgroundColor, iconRes.backgroundColor) && Intrinsics.areEqual(this.colorFilter, iconRes.colorFilter);
        }

        public final int hashCode() {
            int hashCode = (this.backgroundColor.hashCode() + (Integer.hashCode(this.resId) * 31)) * 961;
            ColorFilter colorFilter = this.colorFilter;
            return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
        }

        public final String toString() {
            return "IconRes(resId=" + this.resId + ", backgroundColor=" + this.backgroundColor + ", tintColor=null, colorFilter=" + this.colorFilter + ")";
        }
    }

    /* loaded from: classes5.dex */
    public final class IconToken extends AvatarBadgeViewModel {
        public final Icons icon;

        public IconToken(Icons icons) {
            icons.getClass();
            this.icon = icons;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IconToken) && this.icon == ((IconToken) obj).icon;
        }

        public final int hashCode() {
            return this.icon.hashCode() * 31;
        }

        public final String toString() {
            return "IconToken(icon=" + this.icon + ", backgroundColor=null)";
        }
    }

    /* loaded from: classes5.dex */
    public final class IconUrl extends AvatarBadgeViewModel {
        public final ColorModel backgroundColor;
        public final Image image;

        public IconUrl(Image image, ColorModel colorModel) {
            image.getClass();
            this.image = image;
            this.backgroundColor = colorModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconUrl)) {
                return false;
            }
            IconUrl iconUrl = (IconUrl) obj;
            return Intrinsics.areEqual(this.image, iconUrl.image) && Intrinsics.areEqual(this.backgroundColor, iconUrl.backgroundColor);
        }

        public final int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            ColorModel colorModel = this.backgroundColor;
            return hashCode + (colorModel == null ? 0 : colorModel.hashCode());
        }

        public final String toString() {
            return "IconUrl(image=" + this.image + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }
}
