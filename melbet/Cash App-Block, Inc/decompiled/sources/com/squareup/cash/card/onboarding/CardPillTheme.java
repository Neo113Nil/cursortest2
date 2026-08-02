package com.squareup.cash.card.onboarding;

import androidx.compose.ui.graphics.Color;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BLACK_PVC' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class CardPillTheme {
    public static final /* synthetic */ CardPillTheme[] $VALUES;
    public static final CardPillTheme BLACK_METAL;
    public static final CardPillTheme BLACK_PVC;
    public static final CardPillTheme BRAT;
    public static final CardPillTheme DREAM;
    public static final CardPillTheme GLITTER;
    public static final CardPillTheme GLOW;
    public static final CardPillTheme HOLO;
    public static final CardPillTheme HOOD_BY_AIR;
    public static final CardPillTheme HUNDRED_THIEVES;
    public static final CardPillTheme METAL_OIL_SLICK;
    public static final CardPillTheme MOOD;
    public static final CardPillTheme PINK;
    public static final CardPillTheme SHANTELL_MARTIN;
    public static final CardPillTheme SLIME;
    public static final CardPillTheme TAP_DEVICE_TRIAL;
    public static final CardPillTheme TORTOISE;
    public static final CardPillTheme WHITE_PVC;
    public final Color fallbackColor;
    public final boolean isDark;
    public final Color scrimColorLayer;
    public final long textColor;

    static {
        long j = Color.White;
        CardPillTheme cardPillTheme = new CardPillTheme("BLACK_PVC", 0, j, true, new Color(Color.m675copywmQWz5c$default(0.03f, j, 14)), new Color(CardPillThemesKt.BLACK_PVC_FALLBACK_COLOR));
        BLACK_PVC = cardPillTheme;
        CardPillTheme cardPillTheme2 = new CardPillTheme("BLACK_METAL", 1, j, true, new Color(Color.m675copywmQWz5c$default(0.05f, j, 14)), new Color(CardPillThemesKt.BLACK_METAL_FALLBACK_COLOR));
        BLACK_METAL = cardPillTheme2;
        long j2 = Color.Black;
        boolean z = false;
        CardPillTheme cardPillTheme3 = new CardPillTheme("METAL_OIL_SLICK", 2, j2, false, new Color(Color.m675copywmQWz5c$default(0.2f, CardPillThemesKt.CHAMELEON_THEME_PILL_COLOR, 14)), new Color(CardPillThemesKt.METAL_OIL_SLICK_FALLBACK_COLOR));
        METAL_OIL_SLICK = cardPillTheme3;
        CardPillTheme cardPillTheme4 = new CardPillTheme("DREAM", 3, j, true, null, null, 12);
        DREAM = cardPillTheme4;
        CardPillTheme cardPillTheme5 = new CardPillTheme("GLITTER", 4, j, true, new Color(Color.m675copywmQWz5c$default(0.35f, CardPillThemesKt.GLITTER_THEME_PILL_COLOR, 14)), new Color(CardPillThemesKt.GLITTER_FALLBACK_COLOR));
        GLITTER = cardPillTheme5;
        CardPillTheme cardPillTheme6 = new CardPillTheme("GLOW", 5, j2, false, new Color(Color.m675copywmQWz5c$default(0.2f, CardPillThemesKt.GLOW_THEME_PILL_COLOR, 14)), new Color(CardPillThemesKt.GLOW_FALLBACK_COLOR));
        GLOW = cardPillTheme6;
        long j3 = CardPillThemesKt.DARK_TEXT_COLOR;
        Color color = null;
        CardPillTheme cardPillTheme7 = new CardPillTheme("HOOD_BY_AIR", 6, j3, z, new Color(Color.m675copywmQWz5c$default(0.04f, j2, 14)), color, 8);
        HOOD_BY_AIR = cardPillTheme7;
        CardPillTheme cardPillTheme8 = new CardPillTheme("HOLO", 7, j2, z, null, color, 12);
        HOLO = cardPillTheme8;
        CardPillTheme cardPillTheme9 = new CardPillTheme("MOOD", 8, j, true, new Color(Color.m675copywmQWz5c$default(0.03f, j, 14)), new Color(CardPillThemesKt.MOOD_FALLBACK_COLOR));
        MOOD = cardPillTheme9;
        CardPillTheme cardPillTheme10 = new CardPillTheme("PINK", 9, j, true, new Color(Color.m675copywmQWz5c$default(0.8f, CardPillThemesKt.PINK_THEME_PILL_COLOR, 14)), new Color(CardPillThemesKt.PINK_FALLBACK_COLOR));
        PINK = cardPillTheme10;
        CardPillTheme cardPillTheme11 = new CardPillTheme("BRAT", 10, j2, z, new Color(Color.m675copywmQWz5c$default(0.8f, CardPillThemesKt.BRAT_THEME_PILL_COLOR, 14)), color, 8);
        BRAT = cardPillTheme11;
        Color color2 = null;
        int i = 12;
        Color color3 = null;
        CardPillTheme cardPillTheme12 = new CardPillTheme("SHANTELL_MARTIN", 11, j, true, color3, color2, i);
        SHANTELL_MARTIN = cardPillTheme12;
        Color color4 = null;
        CardPillTheme cardPillTheme13 = new CardPillTheme("SLIME", 12, j3, z, color4, color, 12);
        SLIME = cardPillTheme13;
        CardPillTheme cardPillTheme14 = new CardPillTheme("WHITE_PVC", 13, j2, z, color4, new Color(CardPillThemesKt.WHITE_PVC_FALLBACK_COLOR), 4);
        WHITE_PVC = cardPillTheme14;
        CardPillTheme cardPillTheme15 = new CardPillTheme("HUNDRED_THIEVES", 14, j, false, color3, color2, i);
        HUNDRED_THIEVES = cardPillTheme15;
        CardPillTheme cardPillTheme16 = new CardPillTheme("GOLD", 15, j3, z, color4, null, 12);
        CardPillTheme cardPillTheme17 = new CardPillTheme("TORTOISE", 16, j, true, new Color(Color.m675copywmQWz5c$default(0.1f, j2, 14)), new Color(CardPillThemesKt.TORTOISE_FALLBACK_COLOR));
        TORTOISE = cardPillTheme17;
        CardPillTheme cardPillTheme18 = new CardPillTheme("TAP_DEVICE_TRIAL", 17, j, true, null, null, i);
        TAP_DEVICE_TRIAL = cardPillTheme18;
        $VALUES = new CardPillTheme[]{cardPillTheme, cardPillTheme2, cardPillTheme3, cardPillTheme4, cardPillTheme5, cardPillTheme6, cardPillTheme7, cardPillTheme8, cardPillTheme9, cardPillTheme10, cardPillTheme11, cardPillTheme12, cardPillTheme13, cardPillTheme14, cardPillTheme15, cardPillTheme16, cardPillTheme17, cardPillTheme18};
    }

    public /* synthetic */ CardPillTheme(String str, int i, long j, boolean z, Color color, Color color2, int i2) {
        this(str, i, j, z, (i2 & 4) != 0 ? null : color, (i2 & 8) != 0 ? null : color2);
    }

    public static CardPillTheme valueOf(String str) {
        return (CardPillTheme) Enum.valueOf(CardPillTheme.class, str);
    }

    public static CardPillTheme[] values() {
        return (CardPillTheme[]) $VALUES.clone();
    }

    public CardPillTheme(String str, int i, long j, boolean z, Color color, Color color2) {
        this.textColor = j;
        this.isDark = z;
        this.scrimColorLayer = color;
        this.fallbackColor = color2;
    }
}
