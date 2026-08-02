package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGMeasureMode {
    public static final /* synthetic */ YGMeasureMode[] $VALUES;
    public static final YGMeasureMode YGMeasureModeAtMost;
    public static final YGMeasureMode YGMeasureModeExactly;
    public static final YGMeasureMode YGMeasureModeUndefined;

    static {
        YGMeasureMode yGMeasureMode = new YGMeasureMode("YGMeasureModeUndefined", 0);
        YGMeasureModeUndefined = yGMeasureMode;
        YGMeasureMode yGMeasureMode2 = new YGMeasureMode("YGMeasureModeExactly", 1);
        YGMeasureModeExactly = yGMeasureMode2;
        YGMeasureMode yGMeasureMode3 = new YGMeasureMode("YGMeasureModeAtMost", 2);
        YGMeasureModeAtMost = yGMeasureMode3;
        $VALUES = new YGMeasureMode[]{yGMeasureMode, yGMeasureMode2, yGMeasureMode3};
    }

    public static YGMeasureMode valueOf(String str) {
        return (YGMeasureMode) Enum.valueOf(YGMeasureMode.class, str);
    }

    public static YGMeasureMode[] values() {
        return (YGMeasureMode[]) $VALUES.clone();
    }
}
