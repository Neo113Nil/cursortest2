package com.squareup.cash.cdf.globalsearch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TapTarget {
    public static final /* synthetic */ TapTarget[] $VALUES;
    public static final TapTarget INLINE_ACTION_PAY;
    public static final TapTarget RESULT_ROW;
    public static final TapTarget SEE_MORE;

    static {
        TapTarget tapTarget = new TapTarget("RESULT_ROW", 0);
        RESULT_ROW = tapTarget;
        TapTarget tapTarget2 = new TapTarget("SEE_MORE", 1);
        SEE_MORE = tapTarget2;
        TapTarget tapTarget3 = new TapTarget("INLINE_ACTION_PAY", 2);
        INLINE_ACTION_PAY = tapTarget3;
        $VALUES = new TapTarget[]{tapTarget, tapTarget2, tapTarget3};
    }

    public static TapTarget valueOf(String str) {
        return (TapTarget) Enum.valueOf(TapTarget.class, str);
    }

    public static TapTarget[] values() {
        return (TapTarget[]) $VALUES.clone();
    }
}
