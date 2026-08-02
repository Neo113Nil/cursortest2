package com.squareup.cash.activity.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.GrpcStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes5.dex */
public final class PaymentHistoryAvatarFactory {
    public final AndroidStringManager stringManager;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentHistoryData.OverlayIcon.values().length];
            try {
                iArr[PaymentHistoryData.OverlayIcon.RECURRING_OVERLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentHistoryData.OverlayIcon.LOYALTY_OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentHistoryData.OverlayIcon.LINKED_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentHistoryData.OverlayIcon.ROUND_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentHistoryData.OverlayIcon.INSTANT_PAY_LIGHTNING_BOLT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentHistoryData.OverlayIcon.PAYMENT_PLAN_OVERLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentHistoryData.IconOverlayShape.values().length];
            try {
                iArr2[PaymentHistoryData.IconOverlayShape.CARD_SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaymentHistoryData.IconOverlayShape.CIRCULAR_BADGE_SHAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public PaymentHistoryAvatarFactory(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    public static StackedAvatarViewModel.Avatar createAvatarModel(Avatar avatar, String str, Character ch) {
        StackedAvatarViewModel.Avatar avatarModel = StackedAvatarViewModelKt.toAvatarModel(avatar);
        if (ch == null) {
            ch = avatarModel.character;
        }
        if (str == null) {
            str = avatarModel.contentDescription;
        }
        return StackedAvatarViewModel.Avatar.copy$default(avatarModel, ch, str, 131065);
    }

    public static AvatarBadgeViewModel getAvatarBadge(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        Icons icons;
        formattedPaymentHistoryActivityItem.getClass();
        PaymentHistoryData paymentHistoryData = formattedPaymentHistoryActivityItem.getPaymentHistoryData();
        PaymentHistoryData.OverlayIcon overlayIcon = paymentHistoryData.avatar_overlay_icon;
        switch (overlayIcon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[overlayIcon.ordinal()]) {
            case 1:
                icons = Icons.RecurringAutomatic16;
                break;
            case 2:
                icons = Icons.Favorite16;
                break;
            case 3:
                icons = Icons.BankLinked16;
                break;
            case 4:
                icons = Icons.RoundUps16;
                break;
            case 5:
                icons = Icons.Instant16;
                break;
            case 6:
                icons = Icons.PayInFour16;
                break;
            default:
                icons = null;
                break;
        }
        if (icons != null) {
            return new AvatarBadgeViewModel.IconToken(icons);
        }
        String str = paymentHistoryData.avatar_overlay_icon_url;
        Image image = str != null ? new Image(str, paymentHistoryData.dark_theme_avatar_overlay_icon_url, 4) : null;
        if (image != null) {
            PaymentHistoryData.IconOverlayShape iconOverlayShape = paymentHistoryData.icon_overlay_shape;
            int i = iconOverlayShape != null ? WhenMappings.$EnumSwitchMapping$1[iconOverlayShape.ordinal()] : -1;
            if (i == 1) {
                return new AvatarBadgeViewModel.CardUrl(image);
            }
            if (i == 2) {
                return new AvatarBadgeViewModel.IconUrl(image, null);
            }
        }
        return null;
    }

    public final StackedAvatarViewModel getAvatarViewModel(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        String str;
        Image image;
        formattedPaymentHistoryActivityItem.getClass();
        PaymentHistoryData paymentHistoryData = formattedPaymentHistoryActivityItem.getPaymentHistoryData();
        PaymentHistoryData.StackedAvatars stackedAvatars = paymentHistoryData.stacked_avatars;
        if (stackedAvatars != null) {
            if (!stackedAvatars.avatars.isEmpty()) {
                List take = CollectionsKt.take(stackedAvatars.avatars, 2);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                Iterator it = take.iterator();
                while (it.hasNext()) {
                    arrayList.add(createAvatarModel((Avatar) it.next(), null, null));
                }
                int size = arrayList.size();
                if (size == 1) {
                    return new StackedAvatarViewModel.Single((StackedAvatarViewModel.Avatar) arrayList.get(0));
                }
                if (size == 2) {
                    return new StackedAvatarViewModel.Duo((StackedAvatarViewModel.Avatar) arrayList.get(0), (StackedAvatarViewModel.Avatar) arrayList.get(1));
                }
                a$$ExternalSyntheticBUOutline0.m$1("We shouldn't have more than 2 avatar here.");
                return null;
            }
            if (!stackedAvatars.images.isEmpty()) {
                List<Image> take2 = CollectionsKt.take(stackedAvatars.images, 2);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take2, 10));
                for (Image image2 : take2) {
                    arrayList2.add(new StackedAvatarViewModel.Avatar(null, null, null, new Image(image2.light_url, image2.dark_url, 4), null, null, null, null, false, false, null, false, null, null, 131063));
                }
                int size2 = arrayList2.size();
                if (size2 == 1) {
                    return new StackedAvatarViewModel.Single((StackedAvatarViewModel.Avatar) arrayList2.get(0));
                }
                if (size2 == 2) {
                    return new StackedAvatarViewModel.Duo((StackedAvatarViewModel.Avatar) arrayList2.get(0), (StackedAvatarViewModel.Avatar) arrayList2.get(1));
                }
                a$$ExternalSyntheticBUOutline0.m$1("We shouldn't have more than 2 avatar here.");
                return null;
            }
        }
        String str2 = paymentHistoryData.primary_label;
        AndroidStringManager androidStringManager = this.stringManager;
        if (str2 == null || str2.length() == 0) {
            str = androidStringManager.get(R.string.activity_avatar_content_description);
        } else {
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str = new MessageFormat(resources.getString(R.string.activity_avatar_content_description_for)).format(new Object[]{str2});
            str.getClass();
        }
        String str3 = str;
        String str4 = paymentHistoryData.primary_label;
        StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar(null, str4 != null ? GrpcStatus.Companion.monogram(str4) : null, str3, null, null, null, null, null, false, false, null, false, null, null, 131065);
        String str5 = paymentHistoryData.avatar_overlay_icon_url;
        if (str5 != null) {
            String str6 = paymentHistoryData.dark_theme_avatar_overlay_icon_url;
            if (str6 == null) {
                str6 = str5;
            }
            image = new Image(str5, str6, 4);
        } else {
            image = null;
        }
        if (image != null && paymentHistoryData.icon_overlay_shape != PaymentHistoryData.IconOverlayShape.CIRCULAR_BADGE_SHAPE) {
            StackedAvatarViewModel.Avatar avatar2 = new StackedAvatarViewModel.Avatar(null, null, null, image, null, null, null, null, false, false, null, false, null, null, 131063);
            Avatar avatar3 = paymentHistoryData.avatar;
            if (avatar3 != null) {
                String str7 = paymentHistoryData.primary_label;
                avatar = createAvatarModel(avatar3, str3, str7 != null ? GrpcStatus.Companion.monogram(str7) : null);
            }
            return new StackedAvatarViewModel.Duo(avatar2, avatar);
        }
        UiAvatar uiAvatar = paymentHistoryData.ui_avatar;
        if (uiAvatar != null) {
            return StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar);
        }
        Avatar avatar4 = paymentHistoryData.avatar;
        if (avatar4 == null) {
            return new StackedAvatarViewModel.Single(avatar);
        }
        String str8 = paymentHistoryData.primary_label;
        return new StackedAvatarViewModel.Single(createAvatarModel(avatar4, str3, str8 != null ? GrpcStatus.Companion.monogram(str8) : null));
    }
}
