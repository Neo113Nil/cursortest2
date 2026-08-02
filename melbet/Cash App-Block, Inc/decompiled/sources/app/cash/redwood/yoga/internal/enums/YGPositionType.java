package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGPositionType {
    public static final /* synthetic */ YGPositionType[] $VALUES;
    public static final YGPositionType YGPositionTypeAbsolute;

    /* JADX INFO: Fake field, exist only in values array */
    YGPositionType EF0;

    static {
        YGPositionType yGPositionType = new YGPositionType("YGPositionTypeStatic", 0);
        YGPositionType yGPositionType2 = new YGPositionType("YGPositionTypeRelative", 1);
        YGPositionType yGPositionType3 = new YGPositionType("YGPositionTypeAbsolute", 2);
        YGPositionTypeAbsolute = yGPositionType3;
        $VALUES = new YGPositionType[]{yGPositionType, yGPositionType2, yGPositionType3};
    }

    public static YGPositionType valueOf(String str) {
        return (YGPositionType) Enum.valueOf(YGPositionType.class, str);
    }

    public static YGPositionType[] values() {
        return (YGPositionType[]) $VALUES.clone();
    }
}
