package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TypographyKeyTokens {
    public static final /* synthetic */ TypographyKeyTokens[] $VALUES;
    public static final TypographyKeyTokens BodyLarge;
    public static final TypographyKeyTokens BodySmall;
    public static final TypographyKeyTokens HeadlineLarge;
    public static final TypographyKeyTokens LabelLarge;

    static {
        TypographyKeyTokens typographyKeyTokens = new TypographyKeyTokens("BodyLarge", 0);
        BodyLarge = typographyKeyTokens;
        TypographyKeyTokens typographyKeyTokens2 = new TypographyKeyTokens("BodyMedium", 1);
        TypographyKeyTokens typographyKeyTokens3 = new TypographyKeyTokens("BodySmall", 2);
        BodySmall = typographyKeyTokens3;
        TypographyKeyTokens typographyKeyTokens4 = new TypographyKeyTokens("DisplayLarge", 3);
        TypographyKeyTokens typographyKeyTokens5 = new TypographyKeyTokens("DisplayMedium", 4);
        TypographyKeyTokens typographyKeyTokens6 = new TypographyKeyTokens("DisplaySmall", 5);
        TypographyKeyTokens typographyKeyTokens7 = new TypographyKeyTokens("HeadlineLarge", 6);
        HeadlineLarge = typographyKeyTokens7;
        TypographyKeyTokens typographyKeyTokens8 = new TypographyKeyTokens("HeadlineMedium", 7);
        TypographyKeyTokens typographyKeyTokens9 = new TypographyKeyTokens("HeadlineSmall", 8);
        TypographyKeyTokens typographyKeyTokens10 = new TypographyKeyTokens("LabelLarge", 9);
        LabelLarge = typographyKeyTokens10;
        $VALUES = new TypographyKeyTokens[]{typographyKeyTokens, typographyKeyTokens2, typographyKeyTokens3, typographyKeyTokens4, typographyKeyTokens5, typographyKeyTokens6, typographyKeyTokens7, typographyKeyTokens8, typographyKeyTokens9, typographyKeyTokens10, new TypographyKeyTokens("LabelMedium", 10), new TypographyKeyTokens("LabelSmall", 11), new TypographyKeyTokens("TitleLarge", 12), new TypographyKeyTokens("TitleMedium", 13), new TypographyKeyTokens("TitleSmall", 14), new TypographyKeyTokens("BodyLargeEmphasized", 15), new TypographyKeyTokens("BodyMediumEmphasized", 16), new TypographyKeyTokens("BodySmallEmphasized", 17), new TypographyKeyTokens("DisplayLargeEmphasized", 18), new TypographyKeyTokens("DisplayMediumEmphasized", 19), new TypographyKeyTokens("DisplaySmallEmphasized", 20), new TypographyKeyTokens("HeadlineLargeEmphasized", 21), new TypographyKeyTokens("HeadlineMediumEmphasized", 22), new TypographyKeyTokens("HeadlineSmallEmphasized", 23), new TypographyKeyTokens("LabelLargeEmphasized", 24), new TypographyKeyTokens("LabelMediumEmphasized", 25), new TypographyKeyTokens("LabelSmallEmphasized", 26), new TypographyKeyTokens("TitleLargeEmphasized", 27), new TypographyKeyTokens("TitleMediumEmphasized", 28), new TypographyKeyTokens("TitleSmallEmphasized", 29)};
    }

    public static TypographyKeyTokens valueOf(String str) {
        return (TypographyKeyTokens) Enum.valueOf(TypographyKeyTokens.class, str);
    }

    public static TypographyKeyTokens[] values() {
        return (TypographyKeyTokens[]) $VALUES.clone();
    }
}
