package com.squareup.cash.onboarding.check;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IntegrityCheckFactory$Type {
    public static final /* synthetic */ IntegrityCheckFactory$Type[] $VALUES;
    public static final IntegrityCheckFactory$Type APP_LOCK;
    public static final IntegrityCheckFactory$Type MARKET_CAPABILITIES;
    public static final IntegrityCheckFactory$Type PROFILE;
    public static final IntegrityCheckFactory$Type TABS;

    static {
        IntegrityCheckFactory$Type integrityCheckFactory$Type = new IntegrityCheckFactory$Type("PROFILE", 0);
        PROFILE = integrityCheckFactory$Type;
        IntegrityCheckFactory$Type integrityCheckFactory$Type2 = new IntegrityCheckFactory$Type("MARKET_CAPABILITIES", 1);
        MARKET_CAPABILITIES = integrityCheckFactory$Type2;
        IntegrityCheckFactory$Type integrityCheckFactory$Type3 = new IntegrityCheckFactory$Type("APP_LOCK", 2);
        APP_LOCK = integrityCheckFactory$Type3;
        IntegrityCheckFactory$Type integrityCheckFactory$Type4 = new IntegrityCheckFactory$Type("TABS", 3);
        TABS = integrityCheckFactory$Type4;
        $VALUES = new IntegrityCheckFactory$Type[]{integrityCheckFactory$Type, integrityCheckFactory$Type2, integrityCheckFactory$Type3, integrityCheckFactory$Type4};
    }

    public static IntegrityCheckFactory$Type valueOf(String str) {
        return (IntegrityCheckFactory$Type) Enum.valueOf(IntegrityCheckFactory$Type.class, str);
    }

    public static IntegrityCheckFactory$Type[] values() {
        return (IntegrityCheckFactory$Type[]) $VALUES.clone();
    }
}
