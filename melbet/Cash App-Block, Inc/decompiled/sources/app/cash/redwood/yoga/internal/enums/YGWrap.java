package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGWrap {
    public static final /* synthetic */ YGWrap[] $VALUES;
    public static final YGWrap YGWrapNoWrap;
    public static final YGWrap YGWrapWrapReverse;

    static {
        YGWrap yGWrap = new YGWrap("YGWrapNoWrap", 0);
        YGWrapNoWrap = yGWrap;
        YGWrap yGWrap2 = new YGWrap("YGWrapWrap", 1);
        YGWrap yGWrap3 = new YGWrap("YGWrapWrapReverse", 2);
        YGWrapWrapReverse = yGWrap3;
        $VALUES = new YGWrap[]{yGWrap, yGWrap2, yGWrap3};
    }

    public static YGWrap valueOf(String str) {
        return (YGWrap) Enum.valueOf(YGWrap.class, str);
    }

    public static YGWrap[] values() {
        return (YGWrap[]) $VALUES.clone();
    }
}
