package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGDisplay {
    public static final /* synthetic */ YGDisplay[] $VALUES;
    public static final YGDisplay YGDisplayNone;

    /* JADX INFO: Fake field, exist only in values array */
    YGDisplay EF0;

    static {
        YGDisplay yGDisplay = new YGDisplay("YGDisplayFlex", 0);
        YGDisplay yGDisplay2 = new YGDisplay("YGDisplayNone", 1);
        YGDisplayNone = yGDisplay2;
        $VALUES = new YGDisplay[]{yGDisplay, yGDisplay2};
    }

    public static YGDisplay valueOf(String str) {
        return (YGDisplay) Enum.valueOf(YGDisplay.class, str);
    }

    public static YGDisplay[] values() {
        return (YGDisplay[]) $VALUES.clone();
    }
}
