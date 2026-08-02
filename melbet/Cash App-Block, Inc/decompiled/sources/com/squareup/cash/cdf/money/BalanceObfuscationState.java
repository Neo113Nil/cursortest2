package com.squareup.cash.cdf.money;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BalanceObfuscationState {
    public static final /* synthetic */ BalanceObfuscationState[] $VALUES;
    public static final BalanceObfuscationState OBFUSCATED;
    public static final BalanceObfuscationState VISIBLE;

    static {
        BalanceObfuscationState balanceObfuscationState = new BalanceObfuscationState("VISIBLE", 0);
        VISIBLE = balanceObfuscationState;
        BalanceObfuscationState balanceObfuscationState2 = new BalanceObfuscationState("OBFUSCATED", 1);
        OBFUSCATED = balanceObfuscationState2;
        $VALUES = new BalanceObfuscationState[]{balanceObfuscationState, balanceObfuscationState2};
    }

    public static BalanceObfuscationState valueOf(String str) {
        return (BalanceObfuscationState) Enum.valueOf(BalanceObfuscationState.class, str);
    }

    public static BalanceObfuscationState[] values() {
        return (BalanceObfuscationState[]) $VALUES.clone();
    }
}
