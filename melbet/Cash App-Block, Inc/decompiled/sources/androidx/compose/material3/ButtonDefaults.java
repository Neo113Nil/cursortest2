package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.BaselineButtonTokens;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.Color;

/* loaded from: classes3.dex */
public abstract class ButtonDefaults {
    public static final PaddingValuesImpl ContentPadding;
    public static final float IconSpacing;
    public static final float MinHeight;
    public static final float MinWidth;
    public static final PaddingValuesImpl TextButtonContentPadding;

    static {
        float f = BaselineButtonTokens.LeadingSpace;
        float f2 = BaselineButtonTokens.TrailingSpace;
        ShapeKeyTokens shapeKeyTokens = ButtonSmallTokens.ContainerShapeRound;
        ContentPadding = new PaddingValuesImpl(f, 8.0f, f2, 8.0f);
        SpacerKt.m296PaddingValuesa9UjIt4(16.0f, 8.0f, f2, 8.0f);
        TextButtonContentPadding = new PaddingValuesImpl(12.0f, 8.0f, 12.0f, 8.0f);
        SpacerKt.m296PaddingValuesa9UjIt4(12.0f, 8.0f, 16.0f, 8.0f);
        MinWidth = 58.0f;
        MinHeight = 40.0f;
        IconSpacing = ButtonSmallTokens.IconLabelSpace;
    }

    public static ButtonColors getDefaultTextButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors buttonColors = colorScheme.defaultTextButtonColorsCached;
        if (buttonColors != null) {
            return buttonColors;
        }
        long j = Color.Transparent;
        ButtonColors buttonColors2 = new ButtonColors(j, ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.Primary), j, Color.m675copywmQWz5c$default(TextButtonTokens.DisabledLabelOpacity, ColorSchemeKt.fromToken(colorScheme, TextButtonTokens.DisabledLabelColor), 14));
        colorScheme.defaultTextButtonColorsCached = buttonColors2;
        return buttonColors2;
    }

    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public static ButtonColors m518textButtonColorsro_MJ88(long j, Composer composer) {
        long j2 = Color.Unspecified;
        return getDefaultTextButtonColors$material3((ColorScheme) ((GapComposer) composer).consume(ColorSchemeKt.LocalColorScheme)).m517copyjRlVdoo(j2, j, j2, j2);
    }
}
