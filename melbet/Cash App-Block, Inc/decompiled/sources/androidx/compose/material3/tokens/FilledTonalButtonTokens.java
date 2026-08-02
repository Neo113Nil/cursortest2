package androidx.compose.material3.tokens;

/* loaded from: classes3.dex */
public abstract class FilledTonalButtonTokens {
    public static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
    public static final ColorSchemeKeyTokens DisabledContainerColor;
    public static final ColorSchemeKeyTokens DisabledLabelTextColor;
    public static final float HoverContainerElevation;
    public static final ColorSchemeKeyTokens LabelTextColor;

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerExtraLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledContainerColor = colorSchemeKeyTokens;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        HoverContainerElevation = 1.0f;
        LabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
    }
}
