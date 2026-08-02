package com.squareup.cash.card.onboarding;

import android.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class CardPillThemesKt {
    public static final long DARK_TEXT_COLOR = ColorKt.Color(Color.parseColor("#1E1E1E"));
    public static final long PINK_THEME_PILL_COLOR = ColorKt.Color(Color.parseColor("#F10084"));
    public static final long GLOW_THEME_PILL_COLOR = ColorKt.Color(Color.parseColor("#C8FA01"));
    public static final long GLITTER_THEME_PILL_COLOR = ColorKt.Color(Color.parseColor("#1B777A"));
    public static final long CHAMELEON_THEME_PILL_COLOR = ColorKt.Color(Color.parseColor("#FCC797"));
    public static final long BLACK_PVC_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#494949"));
    public static final long BLACK_METAL_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#4B4B4B"));
    public static final long METAL_OIL_SLICK_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#F1C6A1"));
    public static final long GLITTER_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#0E5658"));
    public static final long GLOW_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#D1F24B"));
    public static final long MOOD_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#444542"));
    public static final long PINK_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#DB087B"));
    public static final long WHITE_PVC_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#EAECEC"));
    public static final long TORTOISE_FALLBACK_COLOR = ColorKt.Color(Color.parseColor("#2C2825"));
    public static final long HAZE_DARK_COLOR = ColorKt.Color(4280624421L);
    public static final long HAZE_ULTRA_THIN_DARK_BACKGROUND_COLOR = ColorKt.Color(4288453788L);
    public static final long HAZE_ULTRA_THIN_LIGHT_BACKGROUND_COLOR = ColorKt.Color(4279045389L);
    public static final long HAZE_ULTRA_THIN_LIGHT_FOREGROUND_COLOR = ColorKt.Color(4290756543L);
    public static final long BRAT_THEME_PILL_COLOR = ColorKt.Color(4285836544L);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardTheme.Identifier.values().length];
            try {
                iArr[CardTheme.Identifier.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTheme.Identifier.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTheme.Identifier.HOOD_BY_AIR_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardTheme.Identifier.GLOW_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardTheme.Identifier.HUNDRED_THIEVES_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardTheme.Identifier.METAL_OIL_SLICK_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardTheme.Identifier.METAL_BLACK_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CardTheme.Identifier.SHANTELL_MARTIN_ID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CardTheme.Identifier.SLIMEGUY_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CardTheme.Identifier.DREAM_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CardTheme.Identifier.MOOD_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CardTheme.Identifier.PINK_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CardTheme.Identifier.HOLO_ID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CardTheme.Identifier.GLITTER_ID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CardTheme.Identifier.TORTOISE_ID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CardTheme.Identifier.TAP_DEVICE_TRIAL_ID.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CardTheme.Identifier.BRAT_ID.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CardPillTheme toCardPillTheme(CardTheme.Identifier identifier) {
        switch (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) {
            case -1:
                return CardPillTheme.BLACK_PVC;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                return CardPillTheme.BLACK_PVC;
            case 2:
                return CardPillTheme.WHITE_PVC;
            case 3:
                return CardPillTheme.HOOD_BY_AIR;
            case 4:
                return CardPillTheme.GLOW;
            case 5:
                return CardPillTheme.HUNDRED_THIEVES;
            case 6:
                return CardPillTheme.METAL_OIL_SLICK;
            case 7:
                return CardPillTheme.BLACK_METAL;
            case 8:
                return CardPillTheme.SHANTELL_MARTIN;
            case 9:
                return CardPillTheme.SLIME;
            case 10:
                return CardPillTheme.DREAM;
            case 11:
                return CardPillTheme.MOOD;
            case 12:
                return CardPillTheme.PINK;
            case 13:
                return CardPillTheme.HOLO;
            case 14:
                return CardPillTheme.GLITTER;
            case 15:
                return CardPillTheme.TORTOISE;
            case 16:
                return CardPillTheme.TAP_DEVICE_TRIAL;
            case 17:
                return CardPillTheme.BRAT;
        }
    }
}
