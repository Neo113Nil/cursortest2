package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGAlign {
    public static final /* synthetic */ YGAlign[] $VALUES;
    public static final YGAlign YGAlignAuto;
    public static final YGAlign YGAlignBaseline;
    public static final YGAlign YGAlignCenter;
    public static final YGAlign YGAlignFlexEnd;
    public static final YGAlign YGAlignFlexStart;
    public static final YGAlign YGAlignStretch;

    static {
        YGAlign yGAlign = new YGAlign("YGAlignAuto", 0);
        YGAlignAuto = yGAlign;
        YGAlign yGAlign2 = new YGAlign("YGAlignFlexStart", 1);
        YGAlignFlexStart = yGAlign2;
        YGAlign yGAlign3 = new YGAlign("YGAlignCenter", 2);
        YGAlignCenter = yGAlign3;
        YGAlign yGAlign4 = new YGAlign("YGAlignFlexEnd", 3);
        YGAlignFlexEnd = yGAlign4;
        YGAlign yGAlign5 = new YGAlign("YGAlignStretch", 4);
        YGAlignStretch = yGAlign5;
        YGAlign yGAlign6 = new YGAlign("YGAlignBaseline", 5);
        YGAlignBaseline = yGAlign6;
        $VALUES = new YGAlign[]{yGAlign, yGAlign2, yGAlign3, yGAlign4, yGAlign5, yGAlign6, new YGAlign("YGAlignSpaceBetween", 6), new YGAlign("YGAlignSpaceAround", 7)};
    }

    public static YGAlign valueOf(String str) {
        return (YGAlign) Enum.valueOf(YGAlign.class, str);
    }

    public static YGAlign[] values() {
        return (YGAlign[]) $VALUES.clone();
    }
}
