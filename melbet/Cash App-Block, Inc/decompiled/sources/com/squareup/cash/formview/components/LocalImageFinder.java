package com.squareup.cash.formview.components;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.formview.components.LocalImageType;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPickerKt;
import com.squareup.cash.formview.components.arcade.ArcadeLocalImageIcon;
import com.squareup.cash.formview.components.arcade.ArcadeLocalImageIconKt;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.components.MooncakeLargeIconHelperKt;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class LocalImageFinder {
    public final ThemeInfo themeInfo;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.LocalImageElement.Icon.values().length];
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.INVESTING_ROUND_UPS_INTRO_ILLUSTRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CARD_CVV_LOCATION_HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CARD_MAILER_HERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormBlocker.Element.LocalImageElement.Icon.CHECK_DEPOSIT_ENDORSEMENT_HERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LocalImageFinder(Context context) {
        context.getClass();
        this.themeInfo = ThemeHelpersKt.themeInfo(context);
    }

    public final LocalImageType find(FormBlocker.Element.LocalImageElement localImageElement) {
        Object obj;
        ComposableLambdaImpl composableLambdaImpl;
        Icon icon = localImageElement.local_icon;
        if (icon != null) {
            icon.getClass();
            String str = icon.arcade_id;
            if (str != null) {
                Icons.Companion.getClass();
                Icons icons = zzd.get(str);
                if (icons != null) {
                    composableLambdaImpl = new ComposableLambdaImpl(new InfoSectionKt$$ExternalSyntheticLambda6(icons, 19), true, -1104783001);
                    return new LocalImageType.ArcadeComposable(composableLambdaImpl);
                }
            }
            composableLambdaImpl = ArcadeFormEmojiPickerKt.f423lambda$1317523209;
            return new LocalImageType.ArcadeComposable(composableLambdaImpl);
        }
        FormBlocker.Element.LocalImageElement.Icon icon2 = localImageElement.icon;
        icon2.getClass();
        switch (ArcadeLocalImageIconKt.WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()]) {
            case 1:
                obj = ArcadeLocalImageIcon.INSTANT;
                break;
            case 2:
                obj = ArcadeLocalImageIcon.FAILURE;
                break;
            case 3:
                obj = ArcadeLocalImageIcon.PENDING;
                break;
            case 4:
                obj = ArcadeLocalImageIcon.ACTION_REQUIRED;
                break;
            case 5:
                obj = ArcadeLocalImageIcon.SUCCESS;
                break;
            case 6:
                obj = ArcadeLocalImageIcon.LOCKED;
                break;
            case 7:
                obj = ArcadeLocalImageIcon.RECURRING;
                break;
            case 8:
                obj = ArcadeLocalImageIcon.BORROW;
                break;
            case 9:
                obj = ArcadeLocalImageIcon.DEPOSIT;
                break;
            case 10:
                obj = ArcadeLocalImageIcon.VERIFICATION;
                break;
            case 11:
                obj = ArcadeLocalImageIcon.VERIFYING;
                break;
            case 12:
                obj = ArcadeLocalImageIcon.VERIFICATION_FAILED;
                break;
            case 13:
                obj = ArcadeLocalImageIcon.DOCUMENT;
                break;
            case 14:
                obj = ArcadeLocalImageIcon.SCRIBBLE;
                break;
            case 15:
                obj = ArcadeLocalImageIcon.QR_CODE;
                break;
            case 16:
                obj = ArcadeLocalImageIcon.UNSUPPORTED;
                break;
            case 17:
                obj = ArcadeLocalImageIcon.CALENDAR;
                break;
            case 18:
                obj = ArcadeLocalImageIcon.CARD;
                break;
            case 19:
                obj = ArcadeLocalImageIcon.INVESTING_ROUND_UPS;
                break;
            case 20:
                obj = ArcadeLocalImageIcon.BANK;
                break;
            case 21:
                obj = ArcadeLocalImageIcon.SECURITY_WARNING;
                break;
            case 22:
                obj = ArcadeLocalImageIcon.ENVELOPE;
                break;
            case 23:
                obj = ArcadeLocalImageIcon.LOGOMARK;
                break;
            case 24:
                obj = ArcadeLocalImageIcon.CAMERA;
                break;
            case 25:
                obj = ArcadeLocalImageIcon.UNLOCK;
                break;
            case 26:
                obj = ArcadeLocalImageIcon.FAMILY;
                break;
            case 27:
                obj = ArcadeLocalImageIcon.PERSON;
                break;
            case 28:
                obj = ArcadeLocalImageIcon.INVESTING;
                break;
            case 29:
                obj = ArcadeLocalImageIcon.GOAL;
                break;
            case 30:
                obj = ArcadeLocalImageIcon.WIRE;
                break;
            case 31:
                obj = ArcadeLocalImageIcon.RECURRING_DOUBLE_ARROW;
                break;
            case 32:
                obj = ArcadeLocalImageIcon.GLOBE;
                break;
            case 33:
                obj = ArcadeLocalImageIcon.CARD_TOP_RIGHT_PLUS;
                break;
            case 34:
                obj = ArcadeLocalImageIcon.CARD_CHECKMARK;
                break;
            case 35:
                obj = ArcadeLocalImageIcon.CARD_EXPIRED;
                break;
            case 36:
                obj = ArcadeLocalImageIcon.LOCATION;
                break;
            case 37:
                obj = ArcadeLocalImageIcon.WARNING;
                break;
            case 38:
                obj = ArcadeLocalImageIcon.DECLINED;
                break;
            case 39:
                obj = ArcadeLocalImageIcon.ELIGIBILITY_WARNING;
                break;
            case 40:
                obj = ArcadeLocalImageIcon.LOCK_IN_SHIELD;
                break;
            case 41:
                obj = ArcadeLocalImageIcon.DASH;
                break;
            case 42:
                obj = ArcadeLocalImageIcon.GREEN_EXCLAMATION;
                break;
            case 43:
                obj = ArcadeLocalImageIcon.NOTE;
                break;
            case 44:
                obj = ArcadeLocalImageIcon.CLEAR;
                break;
            case 45:
                obj = ArcadeLocalImageIcon.SAVINGS;
                break;
            case 46:
                obj = ArcadeLocalImageIcon.BITCOIN;
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                obj = null;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        MooncakeLargeIcon.Icon mooncakeLargeIcon = MooncakeLargeIconHelperKt.toMooncakeLargeIcon(icon2);
        if (obj == ArcadeLocalImageIcon.UNSUPPORTED) {
            obj = mooncakeLargeIcon;
        }
        if (obj != null) {
            if (obj instanceof ArcadeLocalImageIcon) {
                return new LocalImageType.ArcadeIcon((ArcadeLocalImageIcon) obj);
            }
            if (obj instanceof MooncakeLargeIcon.Icon) {
                return new LocalImageType.MooncakeIcon((MooncakeLargeIcon.Icon) obj);
            }
            throw new IllegalArgumentException(icon2 + " type is not accepted: " + obj + ".");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()];
        if (i == 1) {
            return new LocalImageType.HeroImage(R.drawable.investing_roundups_hero, 6);
        }
        ThemeInfo themeInfo = this.themeInfo;
        if (i == 2) {
            int i2 = themeInfo.theme == Theme.MooncakeLight ? R.drawable.card_cvv_location_light : R.drawable.card_cvv_location_dark;
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_END;
            return new LocalImageType.HeroImage(i2, 4);
        }
        if (i == 3) {
            return new LocalImageType.HeroImage(themeInfo.theme == Theme.MooncakeLight ? R.drawable.card_mailer_qr_location_light : R.drawable.card_mailer_qr_location_dark, 6);
        }
        if (i == 4) {
            return new LocalImageType.HeroImage(R.drawable.form_hero_check_endorsement, ImageView.ScaleType.FIT_START, Integer.valueOf(themeInfo.colorPalette.icon));
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) icon2, (Object) " is not implemented. It should be implemented as something other than [LargeIcon].");
        return null;
    }
}
