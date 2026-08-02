package com.squareup.cash.profile.viewmodels;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.favorites.viewmodels.AddOrRemoveAsFavoriteButtonViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ProfileViewModel {

    public final class Loaded extends ProfileViewModel {
        public final NotificationCompat body;
        public final ProfileHeader header;
        public final ProfilePhoto photoOverlay;

        public final class ProfileHeader {
            public final FavoriteAction favoriteAction;
            public final ProfileHeaderViewModel headerViewModel;
            public final NavigationIcon navigationIcon;
            public final ActionButton primaryButton;
            public final ActionButton secondaryButton;
            public final boolean showPayRequestButtons;

            public final class ActionButton {
                public final String text;

                public ActionButton(String str) {
                    str.getClass();
                    this.text = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ActionButton) && Intrinsics.areEqual(this.text, ((ActionButton) obj).text);
                }

                public final int hashCode() {
                    return this.text.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionButton(text=", this.text, ")");
                }
            }

            public final class FavoriteAction {
                public final AddOrRemoveAsFavoriteButtonViewModel addOrRemoveAsFavoriteButtonViewModel;

                public FavoriteAction(AddOrRemoveAsFavoriteButtonViewModel addOrRemoveAsFavoriteButtonViewModel) {
                    this.addOrRemoveAsFavoriteButtonViewModel = addOrRemoveAsFavoriteButtonViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FavoriteAction) && this.addOrRemoveAsFavoriteButtonViewModel.equals(((FavoriteAction) obj).addOrRemoveAsFavoriteButtonViewModel);
                }

                public final int hashCode() {
                    return this.addOrRemoveAsFavoriteButtonViewModel.hashCode();
                }

                public final String toString() {
                    return "FavoriteAction(addOrRemoveAsFavoriteButtonViewModel=" + this.addOrRemoveAsFavoriteButtonViewModel + ")";
                }
            }

            public ProfileHeader(NavigationIcon navigationIcon, FavoriteAction favoriteAction, ProfileHeaderViewModel profileHeaderViewModel, ActionButton actionButton, ActionButton actionButton2, boolean z) {
                profileHeaderViewModel.getClass();
                this.navigationIcon = navigationIcon;
                this.favoriteAction = favoriteAction;
                this.headerViewModel = profileHeaderViewModel;
                this.primaryButton = actionButton;
                this.secondaryButton = actionButton2;
                this.showPayRequestButtons = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ProfileHeader)) {
                    return false;
                }
                ProfileHeader profileHeader = (ProfileHeader) obj;
                return this.navigationIcon == profileHeader.navigationIcon && Intrinsics.areEqual(this.favoriteAction, profileHeader.favoriteAction) && Intrinsics.areEqual(this.headerViewModel, profileHeader.headerViewModel) && Intrinsics.areEqual(this.primaryButton, profileHeader.primaryButton) && Intrinsics.areEqual(this.secondaryButton, profileHeader.secondaryButton) && this.showPayRequestButtons == profileHeader.showPayRequestButtons;
            }

            public final int hashCode() {
                int hashCode = this.navigationIcon.hashCode() * 31;
                FavoriteAction favoriteAction = this.favoriteAction;
                int hashCode2 = (this.headerViewModel.hashCode() + ((hashCode + (favoriteAction == null ? 0 : favoriteAction.addOrRemoveAsFavoriteButtonViewModel.hashCode())) * 31)) * 31;
                ActionButton actionButton = this.primaryButton;
                int hashCode3 = (hashCode2 + (actionButton == null ? 0 : actionButton.text.hashCode())) * 31;
                ActionButton actionButton2 = this.secondaryButton;
                return Boolean.hashCode(this.showPayRequestButtons) + ((hashCode3 + (actionButton2 != null ? actionButton2.text.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "ProfileHeader(navigationIcon=" + this.navigationIcon + ", favoriteAction=" + this.favoriteAction + ", headerViewModel=" + this.headerViewModel + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", showPayRequestButtons=" + this.showPayRequestButtons + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class ProfilePhoto {
            public final Color accentColor;
            public final Image photo;
            public final Boolean shouldColorizeAvatar;

            public ProfilePhoto(Image image, Color color, Boolean bool) {
                this.photo = image;
                this.accentColor = color;
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
                return this.photo.equals(profilePhoto.photo) && Intrinsics.areEqual(this.accentColor, profilePhoto.accentColor) && Intrinsics.areEqual(this.shouldColorizeAvatar, profilePhoto.shouldColorizeAvatar);
            }

            public final int hashCode() {
                int hashCode = this.photo.hashCode() * 31;
                Color color = this.accentColor;
                int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
                Boolean bool = this.shouldColorizeAvatar;
                return hashCode2 + (bool != null ? bool.hashCode() : 0);
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

        public Loaded(ProfileHeader profileHeader, NotificationCompat notificationCompat, ProfilePhoto profilePhoto) {
            notificationCompat.getClass();
            this.header = profileHeader;
            this.body = notificationCompat;
            this.photoOverlay = profilePhoto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.header, loaded.header) && Intrinsics.areEqual(this.body, loaded.body) && Intrinsics.areEqual(this.photoOverlay, loaded.photoOverlay);
        }

        public final int hashCode() {
            int hashCode = (this.body.hashCode() + (this.header.hashCode() * 31)) * 31;
            ProfilePhoto profilePhoto = this.photoOverlay;
            return hashCode + (profilePhoto == null ? 0 : profilePhoto.hashCode());
        }

        public final String toString() {
            return "Loaded(header=" + this.header + ", body=" + this.body + ", photoOverlay=" + this.photoOverlay + ")";
        }
    }

    public final class Loading extends ProfileViewModel {
        public final boolean show;

        public Loading(boolean z) {
            this.show = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.show == ((Loading) obj).show;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.show);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Loading(show=", ")", this.show);
        }
    }
}
