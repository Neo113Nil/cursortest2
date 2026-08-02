package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGJustify {
    public static final /* synthetic */ YGJustify[] $VALUES;
    public static final YGJustify YGJustifyCenter;
    public static final YGJustify YGJustifyFlexEnd;
    public static final YGJustify YGJustifyFlexStart;
    public static final YGJustify YGJustifySpaceAround;
    public static final YGJustify YGJustifySpaceBetween;
    public static final YGJustify YGJustifySpaceEvenly;

    static {
        YGJustify yGJustify = new YGJustify("YGJustifyFlexStart", 0);
        YGJustifyFlexStart = yGJustify;
        YGJustify yGJustify2 = new YGJustify("YGJustifyCenter", 1);
        YGJustifyCenter = yGJustify2;
        YGJustify yGJustify3 = new YGJustify("YGJustifyFlexEnd", 2);
        YGJustifyFlexEnd = yGJustify3;
        YGJustify yGJustify4 = new YGJustify("YGJustifySpaceBetween", 3);
        YGJustifySpaceBetween = yGJustify4;
        YGJustify yGJustify5 = new YGJustify("YGJustifySpaceAround", 4);
        YGJustifySpaceAround = yGJustify5;
        YGJustify yGJustify6 = new YGJustify("YGJustifySpaceEvenly", 5);
        YGJustifySpaceEvenly = yGJustify6;
        $VALUES = new YGJustify[]{yGJustify, yGJustify2, yGJustify3, yGJustify4, yGJustify5, yGJustify6};
    }

    public static YGJustify valueOf(String str) {
        return (YGJustify) Enum.valueOf(YGJustify.class, str);
    }

    public static YGJustify[] values() {
        return (YGJustify[]) $VALUES.clone();
    }
}
