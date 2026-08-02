package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGDirection {
    public static final /* synthetic */ YGDirection[] $VALUES;
    public static final YGDirection YGDirectionInherit;
    public static final YGDirection YGDirectionLTR;
    public static final YGDirection YGDirectionRTL;

    static {
        YGDirection yGDirection = new YGDirection("YGDirectionInherit", 0);
        YGDirectionInherit = yGDirection;
        YGDirection yGDirection2 = new YGDirection("YGDirectionLTR", 1);
        YGDirectionLTR = yGDirection2;
        YGDirection yGDirection3 = new YGDirection("YGDirectionRTL", 2);
        YGDirectionRTL = yGDirection3;
        $VALUES = new YGDirection[]{yGDirection, yGDirection2, yGDirection3};
    }

    public static YGDirection valueOf(String str) {
        return (YGDirection) Enum.valueOf(YGDirection.class, str);
    }

    public static YGDirection[] values() {
        return (YGDirection[]) $VALUES.clone();
    }
}
