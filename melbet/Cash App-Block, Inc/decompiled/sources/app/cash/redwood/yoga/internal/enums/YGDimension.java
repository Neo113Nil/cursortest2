package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGDimension {
    public static final /* synthetic */ YGDimension[] $VALUES;
    public static final YGDimension YGDimensionHeight;
    public static final YGDimension YGDimensionWidth;

    static {
        YGDimension yGDimension = new YGDimension("YGDimensionWidth", 0);
        YGDimensionWidth = yGDimension;
        YGDimension yGDimension2 = new YGDimension("YGDimensionHeight", 1);
        YGDimensionHeight = yGDimension2;
        $VALUES = new YGDimension[]{yGDimension, yGDimension2};
    }

    public static YGDimension valueOf(String str) {
        return (YGDimension) Enum.valueOf(YGDimension.class, str);
    }

    public static YGDimension[] values() {
        return (YGDimension[]) $VALUES.clone();
    }
}
