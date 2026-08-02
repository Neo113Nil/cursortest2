package com.squareup.cash.moneybot.theme;

import androidx.collection.internal.Lock;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class MoneybotColorsKt {
    public static final long DarkCardBackground;
    public static final long DarkSuggestionPillGradientBase;
    public static final long LightHomeGradientEnd;
    public static final long LightHomeGradientStart;
    public static final long LightSuggestionCardBackground;
    public static final long LightSuggestionPillGradientBase;
    public static final long LightChatCardBackground = ColorKt.Color(4294506744L);
    public static final long LightHomeCardBackground = ColorKt.Color(BodyPartID.bodyIdMax);
    public static final long LightComposerBackground = ColorKt.Color(4294506744L);
    public static final long LightInChatPromptBackground = ColorKt.Color(4294506744L);

    static {
        int i = Color.$r8$clinit;
        LightHomeGradientStart = Color.White;
        LightHomeGradientEnd = ColorKt.Color(4293980400L);
        LightSuggestionCardBackground = ColorKt.Color(4293914607L);
        LightSuggestionPillGradientBase = ColorKt.Color(4293454056L);
        DarkCardBackground = ColorKt.Color(4279242768L);
        DarkSuggestionPillGradientBase = ColorKt.Color(4281545523L);
    }

    public static final MoneybotColors fromArcade(Colors colors) {
        colors.getClass();
        boolean z = colors.isLight;
        long j = DarkCardBackground;
        if (!z) {
            MoneybotColors.Card card = new MoneybotColors.Card(j);
            Colors.Semantic.Background background = colors.semantic.background;
            long j2 = background.standard;
            return new MoneybotColors(card, new MoneybotColors.Composer(j2), new MoneybotColors.Pill(j2), new MoneybotColors.Suggestion(j, DarkSuggestionPillGradientBase), new MoneybotColors.Canvas(background.f1047app, null, new MoneybotColors.Canvas.Glyph(Color.White)));
        }
        MoneybotColors.Card card2 = new MoneybotColors.Card(LightChatCardBackground);
        MoneybotColors.Composer composer = new MoneybotColors.Composer(LightComposerBackground);
        MoneybotColors.Pill pill = new MoneybotColors.Pill(LightInChatPromptBackground);
        MoneybotColors.Suggestion suggestion = new MoneybotColors.Suggestion(LightSuggestionCardBackground, LightSuggestionPillGradientBase);
        Color color = new Color(LightHomeGradientStart);
        long j3 = LightHomeGradientEnd;
        return new MoneybotColors(card2, composer, pill, suggestion, new MoneybotColors.Canvas(j3, Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{color, new Color(j3)})), new MoneybotColors.Canvas.Glyph(j)));
    }
}
