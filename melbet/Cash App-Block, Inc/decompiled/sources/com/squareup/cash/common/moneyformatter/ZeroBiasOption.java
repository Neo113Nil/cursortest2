package com.squareup.cash.common.moneyformatter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ZeroBiasOption {
    public static final /* synthetic */ ZeroBiasOption[] $VALUES;
    public static final ZeroBiasOption NONE;

    static {
        ZeroBiasOption zeroBiasOption = new ZeroBiasOption("NONE", 0);
        NONE = zeroBiasOption;
        $VALUES = new ZeroBiasOption[]{zeroBiasOption, new ZeroBiasOption("NEGATIVE", 1), new ZeroBiasOption("POSITIVE", 2)};
    }

    public static ZeroBiasOption valueOf(String str) {
        return (ZeroBiasOption) Enum.valueOf(ZeroBiasOption.class, str);
    }

    public static ZeroBiasOption[] values() {
        return (ZeroBiasOption[]) $VALUES.clone();
    }
}
