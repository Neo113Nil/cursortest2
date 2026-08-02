package androidx.compose.material3.tokens;

/* loaded from: classes3.dex */
public abstract class SliderTokens {
    public static final ColorSchemeKeyTokens ActiveTrackColor;
    public static final ColorSchemeKeyTokens DisabledActiveTrackColor;
    public static final float DisabledActiveTrackOpacity;
    public static final ColorSchemeKeyTokens DisabledHandleColor;
    public static final float DisabledHandleOpacity;
    public static final ColorSchemeKeyTokens DisabledInactiveTrackColor;
    public static final float DisabledInactiveTrackOpacity;
    public static final ColorSchemeKeyTokens HandleColor;
    public static final float HandleHeight;
    public static final ShapeKeyTokens HandleShape;
    public static final float HandleWidth;
    public static final ColorSchemeKeyTokens InactiveTrackColor;
    public static final float InactiveTrackHeight;
    public static final float StopIndicatorSize;

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerExtraLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveTrackColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledActiveTrackColor = colorSchemeKeyTokens2;
        DisabledActiveTrackOpacity = 0.38f;
        DisabledHandleColor = colorSchemeKeyTokens2;
        DisabledHandleOpacity = 0.38f;
        DisabledInactiveTrackColor = colorSchemeKeyTokens2;
        DisabledInactiveTrackOpacity = 0.12f;
        HandleColor = colorSchemeKeyTokens;
        HandleHeight = 44.0f;
        HandleShape = ShapeKeyTokens.CornerFull;
        HandleWidth = 4.0f;
        InactiveTrackColor = ColorSchemeKeyTokens.SecondaryContainer;
        InactiveTrackHeight = 16.0f;
        StopIndicatorSize = 4.0f;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
    }
}
