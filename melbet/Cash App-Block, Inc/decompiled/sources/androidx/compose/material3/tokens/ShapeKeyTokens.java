package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ShapeKeyTokens {
    public static final /* synthetic */ ShapeKeyTokens[] $VALUES;
    public static final ShapeKeyTokens CornerExtraLarge;
    public static final ShapeKeyTokens CornerExtraSmall;
    public static final ShapeKeyTokens CornerFull;
    public static final ShapeKeyTokens CornerLarge;
    public static final ShapeKeyTokens CornerSmall;

    /* JADX INFO: Fake field, exist only in values array */
    ShapeKeyTokens EF0;

    static {
        ShapeKeyTokens shapeKeyTokens = new ShapeKeyTokens("CornerExtraExtraLarge", 0);
        ShapeKeyTokens shapeKeyTokens2 = new ShapeKeyTokens("CornerExtraLarge", 1);
        CornerExtraLarge = shapeKeyTokens2;
        ShapeKeyTokens shapeKeyTokens3 = new ShapeKeyTokens("CornerExtraLargeIncreased", 2);
        ShapeKeyTokens shapeKeyTokens4 = new ShapeKeyTokens("CornerExtraLargeTop", 3);
        ShapeKeyTokens shapeKeyTokens5 = new ShapeKeyTokens("CornerExtraSmall", 4);
        CornerExtraSmall = shapeKeyTokens5;
        ShapeKeyTokens shapeKeyTokens6 = new ShapeKeyTokens("CornerExtraSmallTop", 5);
        ShapeKeyTokens shapeKeyTokens7 = new ShapeKeyTokens("CornerFull", 6);
        CornerFull = shapeKeyTokens7;
        ShapeKeyTokens shapeKeyTokens8 = new ShapeKeyTokens("CornerLarge", 7);
        CornerLarge = shapeKeyTokens8;
        ShapeKeyTokens shapeKeyTokens9 = new ShapeKeyTokens("CornerLargeEnd", 8);
        ShapeKeyTokens shapeKeyTokens10 = new ShapeKeyTokens("CornerLargeIncreased", 9);
        ShapeKeyTokens shapeKeyTokens11 = new ShapeKeyTokens("CornerLargeStart", 10);
        ShapeKeyTokens shapeKeyTokens12 = new ShapeKeyTokens("CornerLargeTop", 11);
        ShapeKeyTokens shapeKeyTokens13 = new ShapeKeyTokens("CornerMedium", 12);
        ShapeKeyTokens shapeKeyTokens14 = new ShapeKeyTokens("CornerNone", 13);
        ShapeKeyTokens shapeKeyTokens15 = new ShapeKeyTokens("CornerSmall", 14);
        CornerSmall = shapeKeyTokens15;
        $VALUES = new ShapeKeyTokens[]{shapeKeyTokens, shapeKeyTokens2, shapeKeyTokens3, shapeKeyTokens4, shapeKeyTokens5, shapeKeyTokens6, shapeKeyTokens7, shapeKeyTokens8, shapeKeyTokens9, shapeKeyTokens10, shapeKeyTokens11, shapeKeyTokens12, shapeKeyTokens13, shapeKeyTokens14, shapeKeyTokens15};
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) $VALUES.clone();
    }
}
