package com.squareup.cash.moneybot.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;

/* loaded from: classes6.dex */
public interface SuggestionRowIcon {

    public final class Avatar implements SuggestionRowIcon {
        public final UiAvatar avatar;

        public Avatar(UiAvatar uiAvatar) {
            this.avatar = uiAvatar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Avatar) && this.avatar.equals(((Avatar) obj).avatar);
        }

        public final int hashCode() {
            return this.avatar.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
        }
    }

    public final class Image implements SuggestionRowIcon {
        public final com.squareup.protos.cash.ui.Image image;

        public Image(com.squareup.protos.cash.ui.Image image) {
            this.image = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && this.image.equals(((Image) obj).image);
        }

        public final int hashCode() {
            return this.image.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "Image(image=", ")");
        }
    }
}
