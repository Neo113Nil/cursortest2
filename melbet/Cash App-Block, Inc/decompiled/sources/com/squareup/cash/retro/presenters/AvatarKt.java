package com.squareup.cash.retro.presenters;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;

/* loaded from: classes5.dex */
public abstract class AvatarKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiAvatar.BadgeShape.values().length];
            try {
                iArr[UiAvatar.BadgeShape.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AvatarBadgeViewModel extractAvatarBadgeViewModel(UiAvatar uiAvatar, ColorModel colorModel) {
        Icons icons;
        String str;
        uiAvatar.getClass();
        Icon icon = uiAvatar.badge_icon;
        if (icon == null || (str = icon.arcade_id) == null) {
            icons = null;
        } else {
            Icons.Companion.getClass();
            icons = zzd.get(str);
        }
        Image image = uiAvatar.badge_image;
        if (icons != null) {
            return new AvatarBadgeViewModel.IconToken(icons);
        }
        if (image == null) {
            return null;
        }
        UiAvatar.BadgeShape badgeShape = uiAvatar.badge_shape;
        return (badgeShape == null ? -1 : WhenMappings.$EnumSwitchMapping$0[badgeShape.ordinal()]) == 1 ? new AvatarBadgeViewModel.CardUrl(image) : new AvatarBadgeViewModel.IconUrl(image, colorModel);
    }
}
