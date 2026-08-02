package com.squareup.cash.merchant.viewmodels;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.loadable.Loadable;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantProfileViewModel {
    public final Loadable content;
    public final NavigationIcon navigationIcon;
    public final ProfilePhoto photoOverlay;

    public final class ProfilePhoto {
        public final ColorModel accentColor;
        public final Image photo;
        public final Boolean shouldColorizeAvatar;

        public ProfilePhoto(Image image, ColorModel colorModel, Boolean bool) {
            image.getClass();
            this.photo = image;
            this.accentColor = colorModel;
            this.shouldColorizeAvatar = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfilePhoto)) {
                return false;
            }
            ProfilePhoto profilePhoto = (ProfilePhoto) obj;
            return Intrinsics.areEqual(this.photo, profilePhoto.photo) && Intrinsics.areEqual(this.accentColor, profilePhoto.accentColor) && this.shouldColorizeAvatar.equals(profilePhoto.shouldColorizeAvatar);
        }

        public final int hashCode() {
            int hashCode = this.photo.hashCode() * 31;
            ColorModel colorModel = this.accentColor;
            return this.shouldColorizeAvatar.hashCode() + ((hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfilePhoto(photo=");
            sb.append(this.photo);
            sb.append(", accentColor=");
            sb.append(this.accentColor);
            sb.append(", shouldColorizeAvatar=");
            return Thread$State$EnumUnboxingLocalUtility.m(sb, this.shouldColorizeAvatar, ")");
        }
    }

    public MerchantProfileViewModel(NavigationIcon navigationIcon, Loadable loadable, ProfilePhoto profilePhoto) {
        this.navigationIcon = navigationIcon;
        this.content = loadable;
        this.photoOverlay = profilePhoto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantProfileViewModel)) {
            return false;
        }
        MerchantProfileViewModel merchantProfileViewModel = (MerchantProfileViewModel) obj;
        return this.navigationIcon == merchantProfileViewModel.navigationIcon && this.content.equals(merchantProfileViewModel.content) && Intrinsics.areEqual(this.photoOverlay, merchantProfileViewModel.photoOverlay);
    }

    public final int hashCode() {
        int hashCode = (this.content.hashCode() + (this.navigationIcon.hashCode() * 31)) * 31;
        ProfilePhoto profilePhoto = this.photoOverlay;
        return hashCode + (profilePhoto == null ? 0 : profilePhoto.hashCode());
    }

    public final String toString() {
        return "MerchantProfileViewModel(navigationIcon=" + this.navigationIcon + ", content=" + this.content + ", photoOverlay=" + this.photoOverlay + ")";
    }
}
