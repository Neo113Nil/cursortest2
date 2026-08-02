package com.squareup.cash.shopping.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LogoImage {

    public final class AvatarModel implements LogoImage {
        public final ColorModel backgroundColor;
        public final Image badge;
        public final boolean colorizeAvatar;
        public final Integer height;
        public final HorizontalAlignment horizontalAlignment;
        public final Image image;

        public AvatarModel(Image image, HorizontalAlignment horizontalAlignment, Integer num, Image image2, boolean z, ColorModel.Accented accented) {
            image.getClass();
            this.image = image;
            this.horizontalAlignment = horizontalAlignment;
            this.height = num;
            this.badge = image2;
            this.colorizeAvatar = z;
            this.backgroundColor = accented;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvatarModel)) {
                return false;
            }
            AvatarModel avatarModel = (AvatarModel) obj;
            return Intrinsics.areEqual(this.image, avatarModel.image) && this.horizontalAlignment == avatarModel.horizontalAlignment && Intrinsics.areEqual(this.height, avatarModel.height) && Intrinsics.areEqual(this.badge, avatarModel.badge) && this.colorizeAvatar == avatarModel.colorizeAvatar && Intrinsics.areEqual(this.backgroundColor, avatarModel.backgroundColor);
        }

        @Override // com.squareup.cash.shopping.viewmodels.LogoImage
        public final Integer getHeight() {
            return this.height;
        }

        @Override // com.squareup.cash.shopping.viewmodels.LogoImage
        public final HorizontalAlignment getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        @Override // com.squareup.cash.shopping.viewmodels.LogoImage
        public final Image getImage() {
            return this.image;
        }

        public final int hashCode() {
            int hashCode = (this.horizontalAlignment.hashCode() + (this.image.hashCode() * 31)) * 31;
            Integer num = this.height;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Image image = this.badge;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.colorizeAvatar);
            ColorModel colorModel = this.backgroundColor;
            return m + (colorModel != null ? colorModel.hashCode() : 0);
        }

        public final String toString() {
            return "AvatarModel(image=" + this.image + ", horizontalAlignment=" + this.horizontalAlignment + ", height=" + this.height + ", badge=" + this.badge + ", colorizeAvatar=" + this.colorizeAvatar + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }

    public final class ImageModel implements LogoImage {
        public final Integer height;
        public final HorizontalAlignment horizontalAlignment;
        public final Image image;

        public ImageModel(Image image, HorizontalAlignment horizontalAlignment, Integer num) {
            image.getClass();
            this.image = image;
            this.horizontalAlignment = horizontalAlignment;
            this.height = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageModel)) {
                return false;
            }
            ImageModel imageModel = (ImageModel) obj;
            return Intrinsics.areEqual(this.image, imageModel.image) && this.horizontalAlignment == imageModel.horizontalAlignment && Intrinsics.areEqual(this.height, imageModel.height);
        }

        @Override // com.squareup.cash.shopping.viewmodels.LogoImage
        public final Integer getHeight() {
            return this.height;
        }

        @Override // com.squareup.cash.shopping.viewmodels.LogoImage
        public final HorizontalAlignment getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        @Override // com.squareup.cash.shopping.viewmodels.LogoImage
        public final Image getImage() {
            return this.image;
        }

        public final int hashCode() {
            int hashCode = (this.horizontalAlignment.hashCode() + (this.image.hashCode() * 31)) * 31;
            Integer num = this.height;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageModel(image=");
            sb.append(this.image);
            sb.append(", horizontalAlignment=");
            sb.append(this.horizontalAlignment);
            sb.append(", height=");
            return NavAction$$ExternalSyntheticOutline0.m(sb, this.height, ")");
        }
    }

    Integer getHeight();

    HorizontalAlignment getHorizontalAlignment();

    Image getImage();
}
