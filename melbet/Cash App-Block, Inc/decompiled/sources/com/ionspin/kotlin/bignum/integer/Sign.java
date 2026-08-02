package com.ionspin.kotlin.bignum.integer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Sign {
    public static final /* synthetic */ Sign[] $VALUES;
    public static final Sign NEGATIVE;
    public static final Sign POSITIVE;
    public static final Sign ZERO;

    static {
        Sign sign = new Sign("POSITIVE", 0);
        POSITIVE = sign;
        Sign sign2 = new Sign("NEGATIVE", 1);
        NEGATIVE = sign2;
        Sign sign3 = new Sign("ZERO", 2);
        ZERO = sign3;
        $VALUES = new Sign[]{sign, sign2, sign3};
    }

    public static Sign valueOf(String str) {
        return (Sign) Enum.valueOf(Sign.class, str);
    }

    public static Sign[] values() {
        return (Sign[]) $VALUES.clone();
    }
}
