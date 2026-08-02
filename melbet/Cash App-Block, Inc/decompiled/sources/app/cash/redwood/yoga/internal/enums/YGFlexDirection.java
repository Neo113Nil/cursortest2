package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGFlexDirection {
    public static final /* synthetic */ YGFlexDirection[] $VALUES;
    public static final YGFlexDirection YGFlexDirectionColumn;
    public static final YGFlexDirection YGFlexDirectionColumnReverse;
    public static final YGFlexDirection YGFlexDirectionRow;
    public static final YGFlexDirection YGFlexDirectionRowReverse;

    static {
        YGFlexDirection yGFlexDirection = new YGFlexDirection("YGFlexDirectionColumn", 0);
        YGFlexDirectionColumn = yGFlexDirection;
        YGFlexDirection yGFlexDirection2 = new YGFlexDirection("YGFlexDirectionColumnReverse", 1);
        YGFlexDirectionColumnReverse = yGFlexDirection2;
        YGFlexDirection yGFlexDirection3 = new YGFlexDirection("YGFlexDirectionRow", 2);
        YGFlexDirectionRow = yGFlexDirection3;
        YGFlexDirection yGFlexDirection4 = new YGFlexDirection("YGFlexDirectionRowReverse", 3);
        YGFlexDirectionRowReverse = yGFlexDirection4;
        $VALUES = new YGFlexDirection[]{yGFlexDirection, yGFlexDirection2, yGFlexDirection3, yGFlexDirection4};
    }

    public static YGFlexDirection valueOf(String str) {
        return (YGFlexDirection) Enum.valueOf(YGFlexDirection.class, str);
    }

    public static YGFlexDirection[] values() {
        return (YGFlexDirection[]) $VALUES.clone();
    }
}
