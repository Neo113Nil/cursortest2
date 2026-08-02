package com.squareup.cash.cdf.sponsoredaccount;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ToggleValue {
    public static final /* synthetic */ ToggleValue[] $VALUES;
    public static final ToggleValue Disabled;
    public static final ToggleValue Enabled;

    static {
        ToggleValue toggleValue = new ToggleValue("Enabled", 0);
        Enabled = toggleValue;
        ToggleValue toggleValue2 = new ToggleValue("Disabled", 1);
        Disabled = toggleValue2;
        $VALUES = new ToggleValue[]{toggleValue, toggleValue2};
    }

    public static ToggleValue valueOf(String str) {
        return (ToggleValue) Enum.valueOf(ToggleValue.class, str);
    }

    public static ToggleValue[] values() {
        return (ToggleValue[]) $VALUES.clone();
    }
}
