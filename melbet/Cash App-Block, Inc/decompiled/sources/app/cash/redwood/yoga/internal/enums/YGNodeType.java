package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGNodeType {
    public static final /* synthetic */ YGNodeType[] $VALUES;
    public static final YGNodeType YGNodeTypeText;

    /* JADX INFO: Fake field, exist only in values array */
    YGNodeType EF0;

    static {
        YGNodeType yGNodeType = new YGNodeType("YGNodeTypeDefault", 0);
        YGNodeType yGNodeType2 = new YGNodeType("YGNodeTypeText", 1);
        YGNodeTypeText = yGNodeType2;
        $VALUES = new YGNodeType[]{yGNodeType, yGNodeType2};
    }

    public static YGNodeType valueOf(String str) {
        return (YGNodeType) Enum.valueOf(YGNodeType.class, str);
    }

    public static YGNodeType[] values() {
        return (YGNodeType[]) $VALUES.clone();
    }
}
