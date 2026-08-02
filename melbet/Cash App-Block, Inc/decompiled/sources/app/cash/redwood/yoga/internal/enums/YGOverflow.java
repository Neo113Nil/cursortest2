package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGOverflow {
    public static final /* synthetic */ YGOverflow[] $VALUES;
    public static final YGOverflow YGOverflowScroll;

    /* JADX INFO: Fake field, exist only in values array */
    YGOverflow EF0;

    static {
        YGOverflow yGOverflow = new YGOverflow("YGOverflowVisible", 0);
        YGOverflow yGOverflow2 = new YGOverflow("YGOverflowHidden", 1);
        YGOverflow yGOverflow3 = new YGOverflow("YGOverflowScroll", 2);
        YGOverflowScroll = yGOverflow3;
        $VALUES = new YGOverflow[]{yGOverflow, yGOverflow2, yGOverflow3};
    }

    public static YGOverflow valueOf(String str) {
        return (YGOverflow) Enum.valueOf(YGOverflow.class, str);
    }

    public static YGOverflow[] values() {
        return (YGOverflow[]) $VALUES.clone();
    }
}
