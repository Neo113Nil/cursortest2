package app.cash.redwood.yoga.internal.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YGUnit {
    public static final /* synthetic */ YGUnit[] $VALUES;
    public static final YGUnit YGUnitAuto;
    public static final YGUnit YGUnitPercent;
    public static final YGUnit YGUnitPoint;
    public static final YGUnit YGUnitUndefined;

    static {
        YGUnit yGUnit = new YGUnit("YGUnitUndefined", 0);
        YGUnitUndefined = yGUnit;
        YGUnit yGUnit2 = new YGUnit("YGUnitPoint", 1);
        YGUnitPoint = yGUnit2;
        YGUnit yGUnit3 = new YGUnit("YGUnitPercent", 2);
        YGUnitPercent = yGUnit3;
        YGUnit yGUnit4 = new YGUnit("YGUnitAuto", 3);
        YGUnitAuto = yGUnit4;
        $VALUES = new YGUnit[]{yGUnit, yGUnit2, yGUnit3, yGUnit4};
    }

    public static YGUnit valueOf(String str) {
        return (YGUnit) Enum.valueOf(YGUnit.class, str);
    }

    public static YGUnit[] values() {
        return (YGUnit[]) $VALUES.clone();
    }
}
